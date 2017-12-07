package nyc.c4q.loopactivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
    }
    class MyTask extends AsyncTask<Integer, Integer, Integer> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... integers) {

            int count = 0;
            try {

                while (integers[0] < 100000) {

                    count++;
                    //publishProcess();
                }
            } catch (Exception e) {

            }

            return count;
        }

        @Override
        protected void onProgressUpdate (Integer...values){
            textView.setText("Loops completed:" + values);

            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute (Integer integer){
            super.onPostExecute(integer);
            textView.setText("Loops completed:" + integer);

            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);

        }



    }
}
