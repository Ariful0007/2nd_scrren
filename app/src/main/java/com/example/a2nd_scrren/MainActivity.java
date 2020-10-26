package com.example.a2nd_scrren;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler=new Handler();
        progressDialog=new ProgressDialog(this);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                progressDialog.setTitle("Loading...");
                progressDialog.setMessage("loading..");
                progressDialog.show();;

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                progressDialog.dismiss();

            }
        },2500);

    }
}