package fr.esilv.traveler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView oman;
    ImageView usa;
    ImageView malaisie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.oman = findViewById(R.id.oman);
        oman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(getApplicationContext(), omanactivity.class);
                startActivity(activity);
                //finish();

            }
        });

        this.usa = findViewById(R.id.usa);
        usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent activities = new Intent(getApplicationContext(), usaactivity.class);
                startActivity(activities);
                //finish();

            }
        });

        this.malaisie = findViewById(R.id.malaisie);
        malaisie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent activityy = new Intent(getApplicationContext(), malaisieactivity.class);
                startActivity(activityy);
                //finish();

            }
        });







    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menutraveler, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.mapgeneral:
                Intent mapactiv = new Intent(getApplicationContext(), GeneralMap.class);
                startActivity(mapactiv);
        }
        return super.onOptionsItemSelected(item);
    }

}


