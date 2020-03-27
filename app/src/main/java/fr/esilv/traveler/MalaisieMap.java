package fr.esilv.traveler;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MalaisieMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaisie_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng kualalumpur = new LatLng(3, 101);
        LatLng nusapenida = new LatLng(-8, 115);
        LatLng gili = new LatLng(-8, 116);
        LatLng lombok = new LatLng(-8, 117);
        mMap.addMarker(new MarkerOptions().position(kualalumpur).title("Kuala Lumpur"));
        mMap.addMarker(new MarkerOptions().position(nusapenida).title("Nusa penida"));
        mMap.addMarker(new MarkerOptions().position(gili).title("Gili"));
        mMap.addMarker(new MarkerOptions().position(lombok).title("Lombok"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kualalumpur));
    }
}
