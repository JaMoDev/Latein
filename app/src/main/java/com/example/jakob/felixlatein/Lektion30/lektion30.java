package com.example.jakob.felixlatein.Lektion30;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.jakob.felixlatein.R;
import com.example.jakob.felixlatein.SectionsPageAdapter;

public class lektion30 extends AppCompatActivity {
    private ViewPager viewPager;
    private Toolbar toolbar;
    private SectionsPageAdapter SectionsPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lektion30);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Lektion 30");
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        viewPager = (ViewPager)findViewById(R.id.container);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        SectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setupViewPager(final ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new lektion30de(), "Deutsch");
        adapter.addFragment(new lektion30lat(), "Latein");
        adapter.addFragment(new lektion30voc(), "Vokabeln");
        viewPager.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }



}
