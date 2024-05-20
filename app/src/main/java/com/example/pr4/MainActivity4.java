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

import com.example.pr4.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView view = new TextView(this);
        Intent intent = getIntent();
        String name = intent.getStringExtra("key2");
        view.setText(name );
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT ,
                ViewGroup.LayoutParams.WRAP_CONTENT ,
                Gravity.CENTER
        );
        setContentView(view , params);

    }
}
