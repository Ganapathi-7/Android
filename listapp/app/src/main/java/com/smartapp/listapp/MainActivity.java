package com.smartapp.listapp;

import static android.content.ContentValues.TAG;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.smartapp.listapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;  // Declare the binding variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.textView.setText("Hello Ganapathi!");
    }


    @Override
    protected void onStart() {
        super.onStart();
        // Logging onStart
        Log.d("TAG", "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Logging onResume
        Log.d("TAG", "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Logging onPause
        Log.d("TAG", "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Logging onStop
        Log.d("TAG", "onStop() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Logging onRestart
        Log.d("TAG", "onRestart() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Logging onDestroy
        Log.d("TAG", "onDestroy() called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Saving state before the activity is destroyed
        Log.d("TAG", "onSaveInstanceState() called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restoring state after activity is recreated
        Log.d("TAG", "onRestoreInstanceState() called");
    }


}
