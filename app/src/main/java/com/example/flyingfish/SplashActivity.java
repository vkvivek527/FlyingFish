package com.example.flyingfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Thread thread=new Thread()
        {
            @Override
            public void run()
            {
                super.run();
                try
                {
                    sleep(2000);
                }
                catch (Exception e)
                {
                 e.printStackTrace();
                }
                finally
                {
                    Intent mainIntent=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(mainIntent);
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
