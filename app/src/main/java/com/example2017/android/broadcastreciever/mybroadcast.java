package com.example2017.android.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by M7moud on 30-Jul-18.
 */
public class mybroadcast extends BroadcastReceiver {
    float batteryPct;
    @Override
    public void onReceive(Context context, Intent intent) {

        String state=intent.getStringExtra(TelephonyManager.EXTRA_STATE);

        if (state == null) {

            // out going calls
            String number=intent.getStringExtra(intent.EXTRA_PHONE_NUMBER);
            Toast.makeText(context,String.valueOf(number), Toast.LENGTH_SHORT).show();
        }
        else {

            String number=intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
            Toast.makeText(context,String.valueOf(number), Toast.LENGTH_SHORT).show();



    }}





    }





