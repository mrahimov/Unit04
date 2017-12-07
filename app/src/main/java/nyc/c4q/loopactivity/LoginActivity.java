package nyc.c4q.loopactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    static final String PREF_KEY = "shared";
    EditText emailEditText;
    EditText passwordEditText;
    CheckBox checkBox;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.login_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emailEditText != null && passwordEditText != null) {
                    if (emailEditText.getText().toString().equals("user@aol.com") &&
                            passwordEditText.getText().toString().equals("password1234")) {
                        Intent intent = new Intent(LoginActivity.this, ListActivity.class);
                        intent.putExtra("email", emailEditText.getText().toString());
                        intent.putExtra("password", passwordEditText.getText().toString());
                        startActivity(intent);

                    }
                }
                if(checkBox.isChecked()) {

                    String email = emailEditText.getText().toString();
                    String password = passwordEditText.getText().toString();

                    SharedPreferences.Editor editor = getSharedPreferences(PREF_KEY, MODE_PRIVATE).edit();
                    editor.putString(email, "No email defined");
                    editor.putString(password, "No password defined");
                    editor.apply();
                }

            }
        });
    }
}
