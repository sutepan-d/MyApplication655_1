package com.example.myapplication655;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Toast;
        import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    MyReceiver obj;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj = new MyReceiver(MainActivity.this);

    }
    public void Start(View view) {
        Log.i("inform", "Start is started");
        Intent intent = new Intent(this, MyReceiver.class);
        startActivity(intent);
    }
}

