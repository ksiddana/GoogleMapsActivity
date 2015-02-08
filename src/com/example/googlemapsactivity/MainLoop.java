package com.example.googlemapsactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;

public class MainLoop extends Activity {
	private final LatLng LOCATION_SF = new LatLng(37.7833, -122.4167);
	private final LatLng LOCATION_LA = new LatLng(34.0500, -118.2500);
	
	private GoogleMap map;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_loop);
		
		map  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick_CurrentLocation(View v) {
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SF, 1);
		map.animateCamera(update);
	}
	
	public void onClick_SF(View v) {
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SF, 5);
		map.animateCamera(update);
	}
	
	public void onClick_LA(View v) {
		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_LA, 10);
		map.animateCamera(update);
	}
	

} //end of MainActivity

