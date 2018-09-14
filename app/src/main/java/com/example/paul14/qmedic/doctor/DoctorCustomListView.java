package com.example.paul14.qmedic.doctor;

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

public class DoctorCustomListView extends ArrayAdapter<String>{

    private String [] doctorname;
    private String [] desc;
    private String [] center;
    private Integer [] imgid;
    private Activity context;

    public DoctorCustomListView( Activity context, String[] doctorname, String[] desc, String[] center, Integer[] imgid) {
        super(context, R.layout.doctor_listview ,doctorname );

        this.doctorname = doctorname;
        this.desc = desc;
        this.center = center;
        this.imgid = imgid;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View ree = convertView;
        ViewHolder viewHolder = null;
        if(ree == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            ree = layoutInflater.inflate(R.layout.doctor_listview, null, true);
            viewHolder = new ViewHolder(ree);
            ree.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) ree.getTag();
        }

        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(doctorname[position]);
        viewHolder.tvw2.setText(desc[position]);
        viewHolder.tvw3.setText(center[position]);
        return ree;
    }

    class ViewHolder
    {
        TextView tvw1;
        TextView tvw2;
        TextView tvw3;
        ImageView ivw;

        ViewHolder(View v){
            tvw1 = v.findViewById(R.id.tvdoctorname);
            tvw2 = v.findViewById(R.id.tvdescription);
            tvw3 = v.findViewById(R.id.tvmedicalcenter);
            ivw = v.findViewById(R.id.imageView);
        }
    }
}
