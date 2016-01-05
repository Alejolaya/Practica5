package com.example.alejolaya.practica5;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alejolaya.practica5.dummy.DummyContent;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A fragment representing a single Parche detail screen.
 * This fragment is either contained in a {@link ParcheListActivity}
 * in two-pane mode (on tablets) or a {@link ParcheDetailActivity}
 * on handsets.
 */
public class ParcheDetailFragment extends Fragment  {
    /**
     * Mapa
     */
    MapView mMapView;
    private GoogleMap mMap;


    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ParcheDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_parche_detail, container, false);
        mMapView= (MapView) rootView.findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume();
        try{

            MapsInitializer.initialize(getActivity().getApplicationContext());
        }catch (Exception e) {
            e.printStackTrace();
        }

        mMap= mMapView.getMap();


        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            //((TextView) rootView.findViewById(R.id.parche_detail)).setText(mItem.content);
            //((WebView) rootView.findViewById(R.id.pagina_detail)).loadUrl(mItem.url);

            ((ImageView)rootView.findViewById(R.id.ivDetail)).setImageResource(mItem.image);
            ((TextView)rootView.findViewById(R.id.tv_Item_name)).setText(mItem.item_name);
            ((TextView)rootView.findViewById(R.id.tv_Item_descrip)).setText(mItem.item_descrip);
            ((TextView)rootView.findViewById(R.id.tv_Item_direccion)).setText(mItem.item_direccion);
            ((TextView)rootView.findViewById(R.id.tv_Item_telefono)).setText(mItem.item_phone);
            ((TextView)rootView.findViewById(R.id.tv_Item_url)).setText(mItem.item_url);
            ((TextView)rootView.findViewById(R.id.tv_Item_fb)).setText(mItem.item_fb);
            MarkerOptions marca= new MarkerOptions().position(new LatLng(mItem.item_ltd,mItem.item_lgtd)).title(mItem.item_name);
            mMap.addMarker(marca);
            CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(mItem.item_ltd,mItem.item_lgtd)).zoom(15).build();
            mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            mMap.setMyLocationEnabled(true);

           // ParcheDetailActivity mapa =new ParcheDetailActivity();
          //  mapa.setMarker(new LatLng(mItem.item_ltd, mItem.item_lgtd), "UdeA", "Alma Mater", 0.9F, 0.1F, 0.1F, R.drawable.acuamanlogo);




        }

        return rootView;
    }
}
