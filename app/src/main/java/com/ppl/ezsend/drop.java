package com.ppl.ezsend;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class drop extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop);
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
        LatLng sydney = new LatLng(-6.9827887, 110.4070402);
        LatLng mranggentina = new LatLng(-6.993750, 110.308901);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Udinus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.addMarker(new MarkerOptions().position(mranggentina).title("Marker in Mranggentina"));
        LatLng outlet1 = new LatLng(-6.9814102 , 110.4117289);
        mMap.addMarker(new MarkerOptions().position(outlet1).title("Marker Outlet 1"));

        LatLng outlet2 = new LatLng(-6.982935 , 110.4117579);
        mMap.addMarker(new MarkerOptions().position(outlet2).title("Marker Outlet 2"));

        LatLng outlet3 = new LatLng(-6.9860065 , 110.4050186);
        mMap.addMarker(new MarkerOptions().position(outlet3).title("Marker Outlet 3"));

        LatLng outlet4 = new LatLng(-6.9808126 , 110.4090153);
        mMap.addMarker(new MarkerOptions().position(outlet4).title("Marker Outlet 4"));

        LatLng outlet5 = new LatLng(-6.9880392  ,110.4075447);
        mMap.addMarker(new MarkerOptions().position(outlet5).title("Marker Outlet 5"));

        LatLng outlet6 = new LatLng(-6.986882 , 110.411289);
        mMap.addMarker(new MarkerOptions().position(outlet6).title("Marker Outlet 6"));

        LatLng outlet7 = new LatLng(-6.9838667 , 110.4091569);
        mMap.addMarker(new MarkerOptions().position(outlet7).title("Marker Outlet 7"));

        LatLng outlet8 = new LatLng(-6.9847353 , 110.4075239);
        mMap.addMarker(new MarkerOptions().position(outlet8).title("Marker Outlet 8"));

        LatLng outlet9 = new LatLng(-6.985004 , 110.4041497);
        mMap.addMarker(new MarkerOptions().position(outlet9).title("Marker Outlet 9"));

        LatLng outlet10 = new LatLng(-6.9859084 , 110.4070728);
        mMap.addMarker(new MarkerOptions().position(outlet10).title("Marker Outlet 10"));

        LatLng outlet11 = new LatLng(-6.9859084 , 110.4070728);
        mMap.addMarker(new MarkerOptions().position(outlet11).title("Marker Outlet 11"));

        LatLng outlet12 = new LatLng(-6.9834637 , 110.4052143);
        mMap.addMarker(new MarkerOptions().position(outlet12).title("Marker Outlet 12"));

        LatLng outlet13 = new LatLng(-6.9868934 , 110.4077675);
        mMap.addMarker(new MarkerOptions().position(outlet13).title("Marker Outlet 13"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(outlet7, 16));
    }
}
