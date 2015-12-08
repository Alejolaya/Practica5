package com.example.alejolaya.practica5.dummy;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;

import com.example.alejolaya.practica5.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.alejolaya.practica5.R.array.hotel1;


/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class  DummyContent {
    /**
     * Array String with all information.
     */


    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

   /* static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Cine", "http://procinal.com/home.php", R.drawable.acuamanlogo));
        addItem(new DummyItem("2", "Teatro" , "http://www.pequenoteatro.com/web/", android.R.drawable.btn_star));
        addItem(new DummyItem("3", "Restaurante" , "http://hatoviejo.com/",android.R.drawable.btn_star));
        addItem(new DummyItem("4", "Rumba" , "http://www.fondadulcejesusmio.com/", android.R.drawable.btn_star));
        addItem(new DummyItem("5", "Sitios turisticos" , "http://www.medellinparati.com/sitio.php?id=19", android.R.drawable.btn_star));
    }*/



    public static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    //"posicion","Titulo","Descripción","Direccion"."Telefono","URL","Facebook","Latitud","Longitud",(int)"imagen"
    public static class DummyItem {
        public String id;
        public String item_name;
        public String item_descrip;
        public String item_direccion;
        public String item_phone;
        public String item_url;
        public String item_fb;
        public double item_ltd;
        public double item_lgtd;
        public int image;

        public DummyItem(String id, String item_name,String item_descrip,String item_direccion,String item_phone,String url,String item_fb,double item_ltd,double item_lgtd,int image) {
            this.id = id;
            this.item_name = item_name;
            this.item_descrip=item_descrip;
            this.item_direccion=item_direccion;
            this.item_phone=item_phone;
            this.item_url = url;
            this.item_fb=item_fb;
            this.item_ltd=item_ltd;
            this.item_lgtd=item_lgtd;
            this.image=image;

        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}
