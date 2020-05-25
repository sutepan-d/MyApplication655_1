package com.example.myapplication655;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Toast;
        import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("inform", "onCreate is started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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
}

