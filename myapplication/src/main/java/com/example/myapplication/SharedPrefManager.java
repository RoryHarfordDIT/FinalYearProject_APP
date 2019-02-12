package com.example.myapplication;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;



public class SharedPrefManager {

    public SharedPrefManager(){

    }

    public static boolean saveUsername(String email, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefsEditor = prefs.edit();
        prefsEditor.putString(Constants.KEY_USERNAME, email);
        prefsEditor.apply();
        return true;
    }

    public static String getUsername(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(Constants.KEY_USERNAME, null);
    }


}
