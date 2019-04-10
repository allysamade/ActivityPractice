package com.allysa.latihanactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnClose, btnOpen, btnOpenIg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose = (Button) findViewById(R.id.btnClose);
        btnOpen = (Button) findViewById(R.id.btnOpen);
        btnOpenIg = (Button) findViewById(R.id.btnOpenIg);

        btnClose.setOnClickListener(this);
        btnOpen.setOnClickListener(this);
        btnOpenIg.setOnClickListener(this);

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast.makeText(this, "Activity: onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Activity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnOpen:
                // buka activity browser
                Intent petanikodeActivity = new Intent(Intent.ACTION_VIEW);
                petanikodeActivity.setData(Uri.parse("http://ask.fm/allysasalsa"));
                startActivity(petanikodeActivity);
                break;
            case R.id.btnOpenIg:
                // buka activity browser
                Intent instagramActivity = new Intent(Intent.ACTION_VIEW);
                instagramActivity.setData(Uri.parse("http://Instagram.com"));
                startActivity(instagramActivity);
                break;
            case R.id.btnClose:
                finish();
                break;
        }
    }
}
