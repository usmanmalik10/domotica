package com.example.domotica;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread t=new Thread()
        {
            public void run()
            {
                try {
                    sleep(1000*3);
                    finish();
                    Intent cv=new Intent(splash.this,login.class);
                    startActivity(cv);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}

