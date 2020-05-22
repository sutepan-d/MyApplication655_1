package com.example.myapplication655;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MyReceiver extends BroadcastReceiver {

    Toast toast = makeText(getApplicationContext(), "Да", Toast.LENGTH_SHORT);
    Toast toast1 = makeText(getApplicationContext(), "Нет", Toast.LENGTH_SHORT);
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("inform", "onReceive is started");
        if ((intent.getAction()).equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            toast.show();
        }
        if ((intent.getAction()).equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            toast1.show();
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
