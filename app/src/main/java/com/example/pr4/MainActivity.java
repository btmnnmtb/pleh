package com.example.pr4;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MaterialButton button = new MaterialButton(this);
        button.setText("Кнопка ");
        button.setOnClickListener(v -> System.out.println("КНопка нажата"));
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT ,
                FrameLayout.LayoutParams.WRAP_CONTENT ,
                Gravity.CENTER

        );

        TextView text = new TextView(this ) ;
        text.setText("texts ");
        GridLayout layout = new GridLayout(this);
        layout.setOrientation(GridLayout.VERTICAL);

        layout.setColumnCount(2);
        layout.addView(text);
        layout.addView(button);

        setContentView(layout);

        MaterialButton button1 = new MaterialButton(this);
        button1.setText("Группа 1 ");
        MaterialButton button2 = new MaterialButton(this);
        button2.setText("Группа 2  ");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("key","Группа-1");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main33.class);
                intent.putExtra("key1","Группа-2");
                startActivity(intent);
            }
        });
        MaterialButton button3 = new MaterialButton(this);
        button3.setText("Группа 3  ");
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                intent.putExtra("key2","Группа-3");
                startActivity(intent);
            }
        });

        LinearLayout layout1 = new LinearLayout(this);

        layout1.setOrientation(LinearLayout.VERTICAL);
        layout1.setGravity(Gravity.CENTER);


        layout.setColumnCount(3);
        layout1.addView(button1);
        layout1.addView(button2);
        layout1.addView(button3);


        setContentView(layout1);

        }
    }
