package com.example.jakob.felixlatein;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jakob.felixlatein.Lektion10.lektion10;
import com.example.jakob.felixlatein.Lektion11.lektion11;
import com.example.jakob.felixlatein.Lektion12.lektion12;
import com.example.jakob.felixlatein.Lektion13.lektion13;
import com.example.jakob.felixlatein.Lektion14.lektion14;
import com.example.jakob.felixlatein.Lektion15.lektion15;
import com.example.jakob.felixlatein.Lektion16.lektion16;
import com.example.jakob.felixlatein.Lektion17.lektion17;
import com.example.jakob.felixlatein.Lektion18.lektion18;
import com.example.jakob.felixlatein.Lektion19.lektion19;
import com.example.jakob.felixlatein.Lektion2.lektion2;
import com.example.jakob.felixlatein.Lektion20.lektion20;
import com.example.jakob.felixlatein.Lektion21.lektion21;
import com.example.jakob.felixlatein.Lektion22.lektion22;
import com.example.jakob.felixlatein.Lektion23.lektion23;
import com.example.jakob.felixlatein.Lektion24.lektion24;
import com.example.jakob.felixlatein.Lektion25.lektion25;
import com.example.jakob.felixlatein.Lektion26.lektion26;
import com.example.jakob.felixlatein.Lektion27.lektion27;
import com.example.jakob.felixlatein.Lektion28.lektion28;
import com.example.jakob.felixlatein.Lektion29.lektion29;
import com.example.jakob.felixlatein.Lektion3.lektion3;
import com.example.jakob.felixlatein.Lektion30.lektion30;
import com.example.jakob.felixlatein.Lektion31.lektion31;
import com.example.jakob.felixlatein.Lektion32.lektion32;
import com.example.jakob.felixlatein.Lektion33.lektion33;
import com.example.jakob.felixlatein.Lektion34.lektion34;
import com.example.jakob.felixlatein.Lektion35.lektion35;
import com.example.jakob.felixlatein.Lektion36.lektion36;
import com.example.jakob.felixlatein.Lektion37.lektion37;
import com.example.jakob.felixlatein.Lektion38.lektion38;
import com.example.jakob.felixlatein.Lektion39.lektion39;
import com.example.jakob.felixlatein.Lektion4.lektion4;
import com.example.jakob.felixlatein.Lektion40.lektion40;
import com.example.jakob.felixlatein.Lektion41.lektion41;
import com.example.jakob.felixlatein.Lektion42.lektion42;
import com.example.jakob.felixlatein.Lektion6.lektion6;
import com.example.jakob.felixlatein.Lektion7.lektion7;
import com.example.jakob.felixlatein.Lektion8.lektion8;
import com.example.jakob.felixlatein.Lektion9.lektion9;

public class MainActivity extends AppCompatActivity {
    private ListView lv1;
    public ArrayAdapter<String> lv1a;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder adv1 = new AlertDialog.Builder(MainActivity.this);
        adv1.setTitle("Nicht Verfügbar");
        adv1.setMessage("Diese Lektion wird mit den kommenden Updates hinzugefügt.");
        adv1.setNegativeButton("OK", null);
        AlertDialog alertDialog = adv1.create();

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
                if (i==1) {
                    Intent myintent = new Intent(view.getContext(),lektion3.class);
                    startActivityForResult(myintent, 1);
                }
                if (i==2) {
                    Intent myintent = new Intent(view.getContext(),lektion4.class);
                    startActivityForResult(myintent, 2);
                }
                if (i==3) {
                    Intent myintent = new Intent(view.getContext(), lektion5.class);
                    startActivityForResult(myintent, 3);
                }
                if (i==4) {
                    Intent myintent = new Intent(view.getContext(), lektion6.class);
                    startActivityForResult(myintent, 4);
                }
                if (i==5) {
                    Intent myintent = new Intent(view.getContext(), lektion7.class);
                    startActivityForResult(myintent, 5);
                }
                if (i==6) {
                    Intent myintent = new Intent(view.getContext(), lektion8.class);
                    startActivityForResult(myintent, 6);
                }
                if (i==7) {
                    Intent myintent = new Intent(view.getContext(), lektion9.class);
                    startActivityForResult(myintent, 7);
                }
                if (i==8) {
                    Intent myintent = new Intent(view.getContext(), lektion10.class);
                    startActivityForResult(myintent, 8);
                }
                if (i==9) {
                    Intent myintent = new Intent(view.getContext(), lektion11.class);
                    startActivityForResult(myintent, 9);
                }
                if (i==10) {
                    Intent myintent = new Intent(view.getContext(), lektion12.class);
                    startActivityForResult(myintent, 10);
                }
                if (i==11) {
                    Intent myintent = new Intent(view.getContext(), lektion13.class);
                    startActivityForResult(myintent, 11);
                }
                if (i==12) {
                    Intent myintent = new Intent(view.getContext(), lektion14.class);
                    startActivityForResult(myintent, 12);
                }
                if (i==13) {
                    Intent myintent = new Intent(view.getContext(), lektion15.class);
                    startActivityForResult(myintent, 13);
                }
                if (i==14) {
                    Intent myintent = new Intent(view.getContext(), lektion16.class);
                    startActivityForResult(myintent, 14);
                }
                if (i==15) {
                    Intent myintent = new Intent(view.getContext(), lektion17.class);
                    startActivityForResult(myintent, 15);
                }
                if (i==16) {
                    Intent myintent = new Intent(view.getContext(), lektion18.class);
                    startActivityForResult(myintent, 16);
                }
                if (i==17) {
                    Intent myintent = new Intent(view.getContext(), lektion19.class);
                    startActivityForResult(myintent, 17);
                }
                if (i==18) {
                    Intent myintent = new Intent(view.getContext(), lektion20.class);
                    startActivityForResult(myintent, 18);
                }
                if (i==19) {
                    Intent myintent = new Intent(view.getContext(), lektion21.class);
                    startActivityForResult(myintent, 19);
                }
                if (i==20) {
                    Intent myintent = new Intent(view.getContext(), lektion22.class);
                    startActivityForResult(myintent, 20);
                }
                if (i==21) {
                    Intent myintent = new Intent(view.getContext(), lektion23.class);
                    startActivityForResult(myintent, 21);
                }
                if (i==22) {
                    Intent myintent = new Intent(view.getContext(), lektion24.class);
                    startActivityForResult(myintent, 22);
                }
                if (i==23) {
                    Intent myintent = new Intent(view.getContext(), lektion25.class);
                    startActivityForResult(myintent, 23);
                }
                if (i==24) {
                    Intent myintent = new Intent(view.getContext(), lektion26.class);
                    startActivityForResult(myintent, 24);
                }
                if (i==25) {
                    Intent myintent = new Intent(view.getContext(), lektion27.class);
                    startActivityForResult(myintent, 25);
                }
                if (i==26) {
                    Intent myintent = new Intent(view.getContext(), lektion28.class);
                    startActivityForResult(myintent, 26);
                }
                if (i==27) {
                    Intent myintent = new Intent(view.getContext(), lektion29.class);
                    startActivityForResult(myintent, 27);
                }
                if (i==28) {
                    Intent myintent = new Intent(view.getContext(), lektion30.class);
                    startActivityForResult(myintent, 28);
                }
                if (i==29) {
                    Intent myintent = new Intent(view.getContext(), lektion31.class);
                    startActivityForResult(myintent, 29);
                }
                if (i==30) {
                    Intent myintent = new Intent(view.getContext(), lektion32.class);
                    startActivityForResult(myintent, 30);
                }
                if (i==31) {
                    Intent myintent = new Intent(view.getContext(), lektion33.class);
                    startActivityForResult(myintent, 31);
                }
                if (i==32) {
                    Intent myintent = new Intent(view.getContext(), lektion34.class);
                    startActivityForResult(myintent, 32);
                }
                if (i==33) {
                    Intent myintent = new Intent(view.getContext(), lektion35.class);
                    startActivityForResult(myintent, 33);
                }
                if (i==34) {
                    Intent myintent = new Intent(view.getContext(), lektion36.class);
                    startActivityForResult(myintent, 34);
                }
                if (i==35) {
                    Intent myintent = new Intent(view.getContext(), lektion37.class);
                    startActivityForResult(myintent, 35);
                }
                if (i==36) {
                    Intent myintent = new Intent(view.getContext(), lektion38.class);
                    startActivityForResult(myintent, 36);
                }
                if (i==37) {
                    Intent myintent = new Intent(view.getContext(), lektion39.class);
                    startActivityForResult(myintent, 37);
                }
                if (i==37) {
                    Intent myintent = new Intent(view.getContext(), lektion40.class);
                    startActivityForResult(myintent, 37);
                }
                if (i==38) {
                    Intent myintent = new Intent(view.getContext(), lektion41.class);
                    startActivityForResult(myintent, 38);
                }
                if (i==39) {
                    Intent myintent = new Intent(view.getContext(), lektion42.class);
                    startActivityForResult(myintent, 39);
                }
                if (i==40) {
                    adv1.show();
                }
                if (i==41) {
                    adv1.show();
                }
                if (i==42) {
                    adv1.show();
                }
                if (i==43) {
                    adv1.show();
                }
                if (i==44) {
                    adv1.show();
                }
                if (i==45) {
                    adv1.show();
                }
                if (i==46) {
                    adv1.show();
                }
                if (i==47) {
                    adv1.show();
                }
                if (i==48) {
                    adv1.show();
                }
                if (i==49) {
                    adv1.show();
                }
                if (i==50) {
                    adv1.show();
                }
                if (i==51) {
                    adv1.show();
                }
                if (i==52) {
                    adv1.show();
                }
                if (i==53) {
                    adv1.show();
                }
                if (i==54) {
                    adv1.show();
                }
                if (i==55) {
                    adv1.show();
                }
                if (i==56) {
                    adv1.show();
                }
                if (i==57) {
                    adv1.show();
                }
                if (i==58) {
                    adv1.show();
                }
                if (i==59) {
                    adv1.show();
                }
                if (i==60) {
                    adv1.show();
                }
                if (i==61) {
                    adv1.show();
                }
                if (i==62) {
                    adv1.show();
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

            case R.id.impressum:
                final AlertDialog.Builder adv2 = new AlertDialog.Builder(MainActivity.this);
                adv2.setTitle("Impressum");
                adv2.setMessage("Entwickler:                                             Jakob Röhl, Moritz Hödtke                                            Kontakt: jamoedev@gmail.com");
                adv2.setNegativeButton("Schliessen", null);
                AlertDialog alertDialog1 = adv2.create();
                adv2.show();




        }
        return super.onOptionsItemSelected(item);
    }
//tejfgjkfhghflghrlhgolrgolhesjrgtjhbojhdfgolrg
}


