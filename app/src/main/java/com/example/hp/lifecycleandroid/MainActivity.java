package com.example.hp.lifecycleandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Oncreate()event",Toast.LENGTH_LONG).show();
        }
    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart()event",Toast.LENGTH_LONG).show();

    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"OnResume()event",Toast.LENGTH_LONG).show();
    }
    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"OnPause()event",Toast.LENGTH_SHORT).show();

    }
    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop()event",Toast.LENGTH_SHORT).show();

    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy()event",Toast.LENGTH_SHORT).show();

    }
       @Override
    public void onRestart() {
        super.onRestart();
        Toast.makeText(this,"OnRestart()event",Toast.LENGTH_SHORT).show();

    
    }  
    }


