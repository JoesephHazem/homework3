package com.example.myapplicationuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundlestring cities={"duhaok" , "Erbil" , " karkouk" ," mousl" };
        savedInstanceState) {
        super.onCreate();
        setContentView(R.layout.activity_main);
         ArrayAdapter adapter= new ArrayAdapter<String>(mainActivity: this,R.layout.list_view,click);
Listview list = (listview) findviewbyid(R.id.mobile_list);

}

 public abstract class MyasyncTasks extends AsyncTask<string,string,string>{
 }



 @override
 protected void onPreExecute() f super. onPreExecute ();
    ProgressDialog progressDialog = new ProgressDialog( context: MainActivity.this);
progressDialog.setMessage ("resulats");
progressDialog.setCancelable (false);
progressDialog. show();
    progressDialog.dismiss);
}
