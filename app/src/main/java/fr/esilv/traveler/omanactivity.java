package fr.esilv.traveler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class omanactivity extends AppCompatActivity {

    ImageView mapoman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omanactivity);

        this.mapoman = findViewById(R.id.mapoman);
        mapoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View mapoview) {
                Intent mapo = new Intent(getApplicationContext(), OmanMap.class);
                startActivity(mapo);

            }
        });


    }






   //MENU

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menutraveler, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.back:
                System.out.println("TEST");
                finish();
                return true;
            case R.id.mapgeneral:
                Intent mapactiv = new Intent(getApplicationContext(), GeneralMap.class);
                startActivity(mapactiv);
        }
        return super.onOptionsItemSelected(item);
    }

}

