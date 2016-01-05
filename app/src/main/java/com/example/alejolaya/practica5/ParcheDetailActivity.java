package com.example.alejolaya.practica5;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * An activity representing a single Parche detail screen. This
 * activity is only used on handset devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link ParcheListActivity}.
 * <p/>
 * This activity is mostly just a 'shell' activity containing nothing
 * more than a {@link ParcheDetailFragment}.
 */
public class ParcheDetailActivity extends FragmentActivity {
    public ParcheDetailActivity() {

    }

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parche_detail);
        String hotel1[]=getResources().getStringArray(R.array.hotel1);
        String hotel2[]=getResources().getStringArray(R.array.hotel2);
        String hotel3[]=getResources().getStringArray(R.array.hotel3);
        setUpMapIfNeeded();
        // Show the Up button in the action bar.
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(ParcheDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(ParcheDetailFragment.ARG_ITEM_ID));
            ParcheDetailFragment fragment = new ParcheDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.parche_detail_container, fragment)
                    .commit();
        }

//-------------------------mapas
       /*setContentView(R.layout.activity_parche_detail);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);*/

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            NavUtils.navigateUpTo(this, new Intent(this, ParcheListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
//--------------------------mapas

    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }
    private void setUpMap() {

        mMap.addMarker(new MarkerOptions().position(new LatLng(0,0)).title("Marker"));
    }

    public void   setMarker(LatLng position,String title,String info,float opacity,float dimension1,float dimension2,int icon){
        mMap.addMarker(new MarkerOptions()
                        .position(position)
                        .title(title)
                        .snippet(info)
                        .alpha(opacity)
                        .anchor(dimension1, dimension2)
                //.icon(BitmapDescriptorFactory.fromResource(icon))

        );
    }


}
