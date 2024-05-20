package com.example.pr4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pr4.databinding.ActivityMain33Binding;

public class Main33 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain33Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView view = new TextView(this);
        Intent intent = getIntent();
        String name = intent.getStringExtra("key1");
        view.setText(name );
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT ,
                ViewGroup.LayoutParams.WRAP_CONTENT ,
                Gravity.CENTER
        );
        setContentView(view , params);


    }
}