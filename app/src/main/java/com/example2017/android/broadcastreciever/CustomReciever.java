package com.example2017.android.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReciever extends BroadcastReceiver {
    String intentAction =null;
    public CustomReciever() {




    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String intentAction=intent.getAction();
        switch (intentAction){

            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context, "Power connected", Toast.LENGTH_SHORT).show();
                break;

            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "Power disconnected", Toast.LENGTH_SHORT).show();
                break;

        }



    }



}
