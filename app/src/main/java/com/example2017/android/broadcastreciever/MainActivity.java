package com.example2017.android.broadcastreciever;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
mybroadcast receiver;
    PackageManager mPackageManager;
    ComponentName mComponentName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     // make instace of BroadcastReceiver class
       receiver=new mybroadcast();
// register recier is imoprtant
       registerReceiver(receiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


//        mComponentName=new ComponentName(this,CustomReciever.class);
  //      mPackageManager=getPackageManager();

    //    sendCustomBroadcast();
    }

    private void sendCustomBroadcast() {

        Intent	customBroadcastIntent	=	new	Intent(Intent.ACTION_POWER_CONNECTED);
        LocalBroadcastManager.getInstance(this).sendBroadcast(customBroadcastIntent);
    }


    @Override
    protected void onStart() {
      //  registerReceiver(receiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

        /*
        mPackageManager.setComponentEnabledSetting
                (mComponentName,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                        PackageManager.DONT_KILL_APP);

*/
        super.onStart();
    }


    @Override
    protected void onStop() {
        // we close the receiver
        unregisterReceiver(receiver);

        /*
        mPackageManager.setComponentEnabledSetting
                (mComponentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                        PackageManager.DONT_KILL_APP);
        */
        super.onStop();
    }

}
