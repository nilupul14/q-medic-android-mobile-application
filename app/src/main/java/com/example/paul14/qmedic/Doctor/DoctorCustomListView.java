package com.example.paul14.qmedic.Doctor;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paul14.qmedic.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DoctorCustomListView extends ArrayAdapter<String>{

    private static final String TAG = "DoctorCustomListView";

    private Activity activity;
    private JSONArray doctorList;
    private JSONObject list;

    public DoctorCustomListView(Activity activity, JSONArray list, ArrayList data) {
        super(activity, R.layout.doctor_listview,data);

        this.doctorList = list;
        this.activity = activity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View ree = convertView;
        ViewHolder viewHolder;

        list = new JSONObject();

        if(ree == null){
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            ree = layoutInflater.inflate(R.layout.doctor_listview, null, true);
            viewHolder = new ViewHolder(ree);
            ree.setTag(viewHolder);


        }
        else {
            viewHolder = (ViewHolder) ree.getTag();
        }

        Log.d(TAG, "getView: inside viewholder");

        try {
            list = doctorList.getJSONObject(position);
            Log.d(TAG, "getView: insidetry catch");
            Log.d(TAG, "getView: object: "+ list);
        } catch (JSONException e) {
            e.printStackTrace();
        }

//        viewHolder.ivw.setImageResource(imgid[position]);
        try {
            viewHolder.tvw1.setText(list.getString("name"));
            Log.d(TAG, "getView: name: "+ list.getString("name"));
            viewHolder.tvw2.setText(list.getString("desc"));
            viewHolder.tvw3.setText(list.getString("address"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

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
