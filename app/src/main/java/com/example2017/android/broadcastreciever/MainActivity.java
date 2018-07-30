package com.example2017.android.broadcastreciever;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
mybroadcast receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     // make instace of BroadcastReceiver class
        receiver=new mybroadcast();
// register recier is imoprtant
        registerReceiver(receiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


    }


    @Override
    protected void onStart() {
        registerReceiver(receiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        super.onStart();
    }


    @Override
    protected void onStop() {
        // we close the receiver
        unregisterReceiver(receiver);
        super.onStop();
    }

}
