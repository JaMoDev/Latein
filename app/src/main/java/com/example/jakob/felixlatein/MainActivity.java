package com.example.jakob.felixlatein;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lv1;
    public ArrayAdapter<String> lv1a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv1 = (ListView)findViewById(R.id.listview1);
        String[] lektionen = {"Lektion 2", "Lektion 3", "Lektion 4", "Lektion 5", "Lektion 6", "Lektion 7", "Lektion 8", "Lektion 9", "Lektion 10",
                "Lektion 11", "Lektion 12", "Lektion 13", "Lektion 14", "Lektion 15", "Lektion 16", "Lektion 17", "Lektion 18", "Lektion 20", "Lektion 21", "Lektion 22",
                "Lektion 23", "Lektion 24", "Lektion 25", "Lektion 26", "Lektion 27", "Lektion 28", "Lektion 29", "Lektion 30", "Lektion 31", "Lektion 32", "Lektion 33",
                "Lektion 34", "Lektion 35", "Lektion 36", "Lektion 37", "Lektion 38", "Lektion 39", "Lektion 40", "Lektion 41", "Lektion 42", "Lektion 43", "Lektion 44",
                "Lektion 45", "Lektion 46", "Lektion 47", "Lektion 48", "Lektion 49", "Lektion 50", "Lektion 51", "Lektion 52", "Lektion 53", "Lektion 54", "Lektion 55",
                "Lektion 56", "Lektion 57", "Lektion 58", "Lektion 59", "Lektion 60", "Lektion 61", "Lektion 62", "Lektion 63"};

        lv1a = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lektionen);
        lv1.setAdapter(lv1a);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0) {
                    Intent myintent = new Intent(view.getContext(),lektion2.class);
                    startActivityForResult(myintent, 0);
                }

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.close:
                finish();
                System.exit(0);


        }
        return super.onOptionsItemSelected(item);
    }
}


