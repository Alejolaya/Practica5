package com.example.alejolaya.practica5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.alejolaya.practica5.dummy.DummyContent;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


/**
 * An activity representing a list of Parches. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link ParcheDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link ParcheListFragment} and the item details
 * (if present) is a {@link ParcheDetailFragment}.
 * <p/>
 * This activity also implements the required
 * {@link ParcheListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class ParcheListActivity extends FragmentActivity
        implements ParcheListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parche_list);
        if (savedInstanceState==null) {


            /**
             * agregar valores desde un recurso
             */
            /**
             * Hoteles
             */
            String hotel1[] = getResources().getStringArray(R.array.hotel1);
            String hotel2[] = getResources().getStringArray(R.array.hotel2);
            String hotel3[] = getResources().getStringArray(R.array.hotel3);
            /**
             * Cines
             */
            String cine1[] = getResources().getStringArray(R.array.cine1);
            String cine2[] = getResources().getStringArray(R.array.cine2);
            String cine3[] = getResources().getStringArray(R.array.cine3);
            /**
             * Teatro
             */
            String teatro1[] = getResources().getStringArray(R.array.teatro1);
            String teatro2[] = getResources().getStringArray(R.array.teatro2);
            String teatro3[] = getResources().getStringArray(R.array.teatro3);
            /**
             * restaurantes
             */
            String rest1[] = getResources().getStringArray(R.array.rest1);
            String rest2[] = getResources().getStringArray(R.array.rest2);
            String rest3[] = getResources().getStringArray(R.array.rest3);
            /**
             * Discotecas
             */
            String bar1[]=getResources().getStringArray(R.array.bar1);
            String bar2[]=getResources().getStringArray(R.array.bar2);
            String bar3[]=getResources().getStringArray(R.array.bar3);
            /**
             *los elementos guardados en el strings.xml se cargan al dummyContent
             */

            //"posicion","Titulo","Descripción","Direccion"."Telefono","URL","Facebook","Latitud","Longitud",(int)"imagen"
            //hoteles
            DummyContent.addItem(new DummyContent.DummyItem("1", hotel1[0], hotel1[1], hotel1[2], hotel1[3], hotel1[4], hotel1[5], Double.parseDouble(hotel1[6]), Double.parseDouble(hotel1[7]), R.drawable.hotelcasakiwi));
            DummyContent.addItem(new DummyContent.DummyItem("2", hotel2[0], hotel2[1], hotel2[2], hotel2[3], hotel2[4], hotel2[5], Double.parseDouble(hotel2[6]), Double.parseDouble(hotel2[7]), R.drawable.hotelovejanegra));
            DummyContent.addItem(new DummyContent.DummyItem("3", hotel3[0], hotel3[1], hotel3[2], hotel3[3], hotel3[4], hotel3[5], Double.parseDouble(hotel3[6]), Double.parseDouble(hotel3[7]), R.drawable.hotellahabanavieja));
//restaurantes
            DummyContent.addItem(new DummyContent.DummyItem("4", rest1[0], rest1[1], rest1[2], rest1[3], rest1[4], rest1[5], Double.parseDouble(rest1[6]), Double.parseDouble(rest1[7]), R.drawable.rest1hatoviejo));
            DummyContent.addItem(new DummyContent.DummyItem("5", rest2[0], rest2[1], rest2[2], rest2[3], rest2[4], rest2[5], Double.parseDouble(rest2[6]), Double.parseDouble(rest2[7]), R.drawable.rest3mondongos));
            DummyContent.addItem(new DummyContent.DummyItem("6", rest3[0], rest3[1], rest3[2], rest3[3], rest3[4], rest3[5], Double.parseDouble(rest3[6]), Double.parseDouble(rest3[7]), R.drawable.rest2jyc));
            //Cines
            DummyContent.addItem(new DummyContent.DummyItem("7", cine1[0], cine1[1], cine1[2], cine1[3], cine1[4], cine1[5], Double.parseDouble(cine1[6]), Double.parseDouble(cine1[7]), R.drawable.procinal));
            DummyContent.addItem(new DummyContent.DummyItem("8", cine2[0], cine2[1], cine2[2], cine2[3], cine2[4], cine2[5], Double.parseDouble(cine2[6]), Double.parseDouble(cine2[7]), R.drawable.cinecolombia));
            DummyContent.addItem(new DummyContent.DummyItem("9", cine3[0], cine3[1], cine3[2], cine3[3], cine3[4], cine3[5], Double.parseDouble(cine3[6]), Double.parseDouble(cine3[7]), R.drawable.royalfilms));
            //Teatro
            DummyContent.addItem(new DummyContent.DummyItem("10", teatro1[0], teatro1[1], teatro1[2], teatro1[3], teatro1[4], teatro1[5], Double.parseDouble(teatro1[6]), Double.parseDouble(teatro1[7]), R.drawable.teatro2metropolitano_grande));
            DummyContent.addItem(new DummyContent.DummyItem("11", teatro2[0], teatro2[1], teatro2[2], teatro2[3], teatro2[4], teatro2[5], Double.parseDouble(teatro2[6]), Double.parseDouble(teatro2[7]), R.drawable.teatro1logopequeo_teatro));
            DummyContent.addItem(new DummyContent.DummyItem("12", teatro3[0], teatro3[1], teatro3[2], teatro3[3], teatro3[4], teatro3[5], Double.parseDouble(teatro3[6]), Double.parseDouble(teatro3[7]), R.drawable.logo_matacandelas));
            //Discotecas
            DummyContent.addItem(new DummyContent.DummyItem("13", bar1[0], bar1[1], bar1[2], bar1[3], bar1[4], bar1[5], Double.parseDouble(bar1[6]), Double.parseDouble(bar1[7]), R.drawable.barblue));
            DummyContent.addItem(new DummyContent.DummyItem("14", bar2[0], bar2[1], bar2[2], bar2[3], bar2[4], bar2[5], Double.parseDouble(bar2[6]), Double.parseDouble(bar2[7]), R.drawable.bar3cordilleras));
            DummyContent.addItem(new DummyContent.DummyItem("15", bar3[0], bar3[1], bar3[2], bar3[3], bar3[4], bar3[5], Double.parseDouble(bar3[6]), Double.parseDouble(bar3[7]), R.drawable.bareltibiri));
        }
        if (findViewById(R.id.parche_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((ParcheListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.parche_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * Callback method from {@link ParcheListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(ParcheDetailFragment.ARG_ITEM_ID, id);
            ParcheDetailFragment fragment = new ParcheDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.parche_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, ParcheDetailActivity.class);
            detailIntent.putExtra(ParcheDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "ParcheList Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.alejolaya.practica5/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "ParcheList Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.alejolaya.practica5/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
