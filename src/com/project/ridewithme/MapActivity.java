package com.project.ridewithme;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_activity);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng pebbleBeach = new LatLng(36.5908, 121.9460);
        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(pebbleBeach, 13));
        map.addMarker(new MarkerOptions()
                .title("Jill")
                .snippet("Pebble Beach to Monterey")
                .position(pebbleBeach));
        
        LatLng monterey = new LatLng(36.600, 121.90000);
        map.addMarker(new MarkerOptions()
        		.title("Marco")
        		.snippet("Monterey to Moss Landing")
        		.position(monterey));
        
        LatLng santaCruz = new LatLng(36.9720, 122.0263);
        map.addMarker(new MarkerOptions()
        		.title("Bob")
        		.snippet("Santa Cruz to Seaside")
        		.position(santaCruz));
        
        LatLng salinas = new LatLng(36.6778, 121.6556);
        map.addMarker(new MarkerOptions()
        		.title("Dan")
        		.snippet("Monterey to Moss Landing")
        		.position(salinas));
    }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

} 