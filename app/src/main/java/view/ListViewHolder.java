package view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.loopactivity.R;

/**
 * Created by muridjonrahimov on 12/6/17.
 */

public class ListViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public ListViewHolder(View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.itemview_textview);
    }
}
