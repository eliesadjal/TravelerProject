package fr.esilv.traveler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class malaisieactivity extends AppCompatActivity {

    ImageView mapmalaise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaisieactivity);

        this.mapmalaise = findViewById(R.id.mapmalaise);
        mapmalaise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View mapmview) {
                    Intent mapm = new Intent(getApplicationContext(), MalaisieMap.class);
                    startActivity(mapm);
            }
        });

    }


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