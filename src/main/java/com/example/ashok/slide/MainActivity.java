package com.example.ashok.slide;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends TabActivity
{
    String[] nameArray = {"Aestro", "Blender", "Cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "IceCream Sandwich", "JelliBean", "KitKat", "Lollipop", "MarshMallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost=(TabHost)findViewById(android.R.id.tabhost);
        TabHost.TabSpec tabSpec=tabHost.newTabSpec("tab 1");
        tabSpec.setIndicator("Tab 1");
        Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
        tabSpec.setContent(intent);
        tabHost.addTab(tabSpec);

        TabHost.TabSpec tabSpec1=tabHost.newTabSpec("tab 2");
        tabSpec1.setIndicator("Tab 2");
        Intent inent=new Intent(getApplicationContext(),ContactActivity.class);
        tabSpec1.setContent(inent);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2=tabHost.newTabSpec("tab 3");
        tabSpec2.setIndicator("Tab 3");
        Intent in=new Intent(getApplicationContext(),AboutActivity.class);
        tabSpec2.setContent(in);
        tabHost.addTab(tabSpec2);

        tabHost.setCurrentTab(0);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener()
        {
            @Override
            public void onTabChanged(String tabId)
            {
                Toast.makeText(getApplicationContext(), tabId, Toast.LENGTH_SHORT).show();
            }
        });

        SlidingDrawer simpleSlidingDrawer = (SlidingDrawer) findViewById(R.id.simpleSlidingDrawer); // initiate the SlidingDrawer
        final Button handleButton = (Button) findViewById(R.id.handle); // inititate a Button which is used for handling the content of SlidingDrawer
        ListView simpleListView = (ListView) findViewById(R.id.simpleListView); // initiate the ListView that is used for content of Sl.idingDrawer
        // adapter for the list view
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_listitem,R.id.name,nameArray);

        simpleListView.setAdapter(arrayAdapter);

        simpleSlidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener()
        {
            @Override
            public void onDrawerOpened()
            {
                handleButton.setText("Close");
            }
        });

        simpleSlidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener()
        {
            @Override
            public void onDrawerClosed()
            {
                // change the handle button text
                handleButton.setText("Open");
            }
        });
    }
}

