package com.example.perkins.br_dynamicregistered;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    BR_Dynamic myBRDynamic;
    IntentFilter myFilter;
    private static final String MY_ACTION = "BR_DYNAMIC_ACTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBRDynamic = new BR_Dynamic();
        myFilter = new IntentFilter(MY_ACTION);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(myBRDynamic);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(myBRDynamic, myFilter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doClick(View view) {
        Intent myIntent = new Intent();
        myIntent.setAction(MY_ACTION);
        sendBroadcast(myIntent);
    }
}
