package com.project.ridewithme;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends Activity implements OnInfoWindowClickListener{
    
	private String title;
	private String snippet;
	private String result;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_activity);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng pebbleBeach = new LatLng(36.5908, -121.9460);
        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(pebbleBeach, 13));
        map.addMarker(new MarkerOptions()
                .title("Jill - Click to Join")
                .snippet("Pebble Beach to Monterey")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(pebbleBeach));
        
        LatLng monterey = new LatLng(36.600, -121.90000);
        map.addMarker(new MarkerOptions()
        		.title("Marco - Click to Join")
        		.snippet("Monterey to Moss Landing")
        		.icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
        		.position(monterey));
        
        LatLng santaCruz = new LatLng(36.9720, -122.0263);
        map.addMarker(new MarkerOptions()
        		.title("Bob - Click to Join")
        		.snippet("Santa Cruz to Seaside")
        		.icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
        		.position(santaCruz));
        
        LatLng salinas = new LatLng(36.6778, -121.6556);
        map.addMarker(new MarkerOptions()
        		.title("Dan - Click to Join")
        		.snippet("Salinas to Santa Cruz")
        		.icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
        		.position(salinas));
        map.setOnInfoWindowClickListener(this);
        
	}
	
		public void onInfoWindowClick(Marker marker) {
			title = marker.getTitle();
			snippet = marker.getSnippet();
			result = title + " " + snippet;
			Intent intent = new Intent(getBaseContext(), MyCarpoolActivity.class);
			intent.putExtra("result", result);
			startActivity(intent);
		}

}