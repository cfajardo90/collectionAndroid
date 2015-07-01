package com.example.mobilelab3.mundo.hola.collection2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private ListView listView;
    private String colores[];
    private ListAdapter listAdapterColores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtener el objecto de listView
        listView = (ListView) findViewById(R.id.listColores);
        colores = getResources().getStringArray(R.array.colores);
        //
        listAdapterColores = new ArrayAdapter<String>(this,
                                                android.R.layout.simple_list_item_1, colores);
        listView.setAdapter(listAdapterColores);
    }

}
