package de.asschth.wasserstand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Für ActivityChange
    private Button changeActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Debuggt meine App
        Log.d("LOG", "This is a log message");

        //Für ActivityChange
        changeActivity2 = (Button) findViewById(R.id.changeActivity2);
        changeActivity2.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }

            public void changeActivity2(){
                openActivity2();
            }
        });


    }

    //Button neu "Activity2"
    public void openActivity2(){
       Intent intent = new Intent(this, Activity2.class);
       startActivity(intent);
    }

    //Button alt "Klick mich!"
    public void toastMessage(View view) {
        Toast.makeText(MainActivity.this,"Klicke auf Activity 2!", Toast.LENGTH_LONG).show();
    }

}