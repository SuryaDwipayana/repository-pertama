package com.example.suryadwipayana.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lifecycle" , "onCreate");

        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdashboard = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(intentdashboard);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle" , "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle" , "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle" , "onDestroy");
    }
}
