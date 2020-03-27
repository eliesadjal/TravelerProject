package fr.esilv.traveler;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class UsaMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa_map);
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
        LatLng losangeles = new LatLng(34, -118);
        LatLng sanfrancisco = new LatLng(37, -122);
        LatLng grandcanyon = new LatLng(36, -112);
        LatLng lasvegas = new LatLng(36, -115);
        mMap.addMarker(new MarkerOptions().position(losangeles).title("Los Angeles"));
        mMap.addMarker(new MarkerOptions().position(sanfrancisco).title("San Francisco"));
        mMap.addMarker(new MarkerOptions().position(grandcanyon).title("Grand Canyon"));
        mMap.addMarker(new MarkerOptions().position(lasvegas).title("Las Vegas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lasvegas));
    }
}
