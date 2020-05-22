package com.example.myapplication655;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.telephony.TelephonyManager;
import android.util.Log;

import java.util.Objects;

public class CallReceiver extends BroadcastReceiver {
    MediaPlayer mediaPlayer;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("inform", "onReceive is started");
        if ((intent.getAction()).equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
        }
        if ((intent.getAction()).equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            mediaPlayer.stop();
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
