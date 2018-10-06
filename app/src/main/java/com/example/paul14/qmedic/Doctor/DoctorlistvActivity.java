package com.example.paul14.qmedic.Doctor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.paul14.qmedic.Constants;
import com.example.paul14.qmedic.R;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class DoctorlistvActivity extends AppCompatActivity {

    private static final String TAG = "DoctorlistvActivity";

    private String finalResponse;
    private Activity mActivity;

    private ListView lst;

//    private String[] doctorname = {"Jhone Doy", "Paul Sank", "Alex Watson", "Robin Peterson", "Leesa Vaniz", "Jazz Peter", "Justine Beber "};
//    private String[] desc = {"Geriatric Medicine Specialists", "Family Physicians", "Emergency Medicine Specialists", "Gastroenterologists ", "Colon and Rectal Surgeons", "Dermatologists ", "Geriatric Medicine Specialists "};
//    private String[] center = {"Geriatric Medicine Specialists", "Family Physicians", "Emergency Medicine Specialists", "Gastroenterologists ", "Colon and Rectal Surgeons", "Dermatologists ", "Geriatric Medicine Specialists "};
//    private Integer[] imgid = {R.drawable.profile01, R.drawable.mg1, R.drawable.mg4, R.drawable.mg3, R.drawable.mg2, R.drawable.mg6, R.drawable.mg3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorlistv);

        lst = findViewById(R.id.dlistview);
        mActivity= DoctorlistvActivity.this;

        DoctorListAsyncTask doctorListAsyncTask= new DoctorListAsyncTask();
        doctorListAsyncTask.execute();

//        //only pass arraylist
//        DoctorCustomListView customListview = new DoctorCustomListView(this, doctorname, desc, center, imgid);
//        lst.setAdapter((customListview));

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(DoctorlistvActivity.this,DoctorProfile.class);
                i.putExtra("position",position);
                startActivity(i);
            }
        });
    }


    @SuppressLint("StaticFieldLeak")
    private class DoctorListAsyncTask extends AsyncTask<String,Void,JSONArray> {


        private JSONArray data;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected JSONArray doInBackground(String... strings) {

//            String url = Constants.getAllDoctors;
//
//            OkHttpClient client = new OkHttpClient();
//
//            Request request = new Request.Builder()
//                        .url(url)
//                        .build();
//
//            Response response = null;
//            try {
//                response = client.newCall(request).execute();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                finalResponse =  response.body().string();
//                JSONObject jsonObject = new JSONObject(finalResponse);
//                data = jsonObject.getJSONArray("data");
//
//                Log.d(TAG, "doInBackground: response: " + finalResponse);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }


//            return data;
            return getDummyData();
        }

        private JSONArray getDummyData() {

            String json = null;
            try {
                InputStream is = getResources().openRawResource(
                        getResources().getIdentifier("doctorlist",
                                "raw", getPackageName()));
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                json = new String(buffer, "UTF-8");


                JSONObject jsonObject = new JSONObject(json);
                data = jsonObject.getJSONArray("data");
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Log.d(TAG, "getDummyData: " + data);

            return data;
        }

        @Override
        protected void onPostExecute(JSONArray resultList) {

            Log.d(TAG, "onPostExecute: list: "+ resultList);

            Log.d(TAG, "onPostExecute: inside onPostExecute");

            ArrayList<String> listdata = new ArrayList<>();

            if (resultList != null) {
                for (int i=0;i<resultList.length();i++){

                    JSONObject jsonObject= null;
                    try {
                        jsonObject = resultList.getJSONObject(i);
                        listdata.add(jsonObject.getString("name"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            //only pass arraylist
            DoctorCustomListView customListview = new DoctorCustomListView(mActivity,resultList,listdata);
            lst.setAdapter((customListview));
        }
    }

}
