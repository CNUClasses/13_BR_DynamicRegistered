package com.example.perkins.br_dynamicregistered;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Perkins on 11/4/2015.
 */
public class BR_Dynamic extends BroadcastReceiver{
    private static final String TAG = "BR_DYNAMIC";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "BR_Dynamic: broadcast received");
        Toast.makeText(context,"IN BR_Dynamic",Toast.LENGTH_LONG).show();
    }
}
