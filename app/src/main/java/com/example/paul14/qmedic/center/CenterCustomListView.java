package com.example.paul14.qmedic.center;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paul14.qmedic.R;


public class CenterCustomListView extends ArrayAdapter<String> {

    private String [] centername;
    private String [] tpno;
    private String [] address;
    private Integer [] imgid;
    private Activity context;

    public CenterCustomListView(Activity context, String[] centername, String[] tpno, String[] address, Integer[] imgid ) {
        super(context, R.layout.center_listview,centername);

        this.centername = centername;
        this.tpno = tpno;
        this.address = address;
        this.imgid = imgid;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View ree = convertView;
        CenterCustomListView.ViewHolder viewHolder = null;
        if(ree == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            ree = layoutInflater.inflate(R.layout.center_listview, null, true);
            viewHolder = new ViewHolder(ree);
            ree.setTag(viewHolder);
        }
        else {
            viewHolder = (CenterCustomListView.ViewHolder) ree.getTag();
        }

        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(centername[position]);
        viewHolder.tvw2.setText(tpno[position]);
        viewHolder.tvw3.setText(address[position]);
        return ree;
    }

    class ViewHolder
    {
        TextView tvw1;
        TextView tvw2;
        TextView tvw3;
        ImageView ivw;

        ViewHolder(View v){
            tvw1 = v.findViewById(R.id.tvcentername);
            tvw2 = v.findViewById(R.id.tvtelephonenumber);
            tvw3 = v.findViewById(R.id.tvaddress);
            ivw = v.findViewById(R.id.imageView);
        }
    }
}
