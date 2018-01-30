package io.github.stewilondanga.alphabet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by stewart on 1/30/18.
 */

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mletters;
    public AlphabetAdapter (Context context, String [] letters) {
        this.mContext = context;
        this.mletters = letters;
    }

    @Override
    public int getCount() {
        return mletters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null) {
            //get layout from xml file
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
                // pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);
            //set values into views
            letterView.setText("A"); // using dummy data for now
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }



}
