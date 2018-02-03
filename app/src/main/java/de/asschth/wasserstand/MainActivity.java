package de.asschth.wasserstand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LOG", "This is a log message");

        Button b = (Button) findViewById(R.id.knopf);

        public void klick() {
            Toast.makeText(MainActivity.this,"Hallo", Toast.LENGTH_LONG).show();
        }

    }
    }