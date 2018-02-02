package de.asschth.wasserstand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button b = (Button) findViewById(R.id.welcheidauchimmerduvergiebst);

        Log.d("LOG", "This is a log message");
    }
}
