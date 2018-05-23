package com.example.sabuj.freelancer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sabuj on 21-May-18.
 */

public class CustomAdapterSpinnerCountry extends BaseAdapter {

    Context context;
    int flags[];
    String[] countryNames;
    LayoutInflater inflter;

    public CustomAdapterSpinnerCountry(Context applicationContext, int[] flags, String[] countryNames) {
        this.context = applicationContext;
        this.flags = flags;
        this.countryNames = countryNames;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items, null);
        ImageView icon = (ImageView) view.findViewById(R.id.custom_spinner_iv_country);
        TextView names = (TextView) view.findViewById(R.id.custom_spinner_tv_code);
        icon.setImageResource(flags[i]);
        names.setText(countryNames[i]);
        return view;
    }

}
