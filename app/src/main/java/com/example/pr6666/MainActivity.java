package com.example.pr6666;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.jetbrains.annotations.Nullable;

public class MainActivity extends AppCompatActivity {

    Button camerabtn, gallerybtn;

    ImageView profile_iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile_iv = findViewById(R.id.profile_iv);
        camerabtn = findViewById(R.id.camera_btn);
        gallerybtn = findViewById(R.id.gallery_btn);

        camerabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraintent, 22);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 22 && resultCode == RESULT_OK){
            Bitmap avatar = (Bitmap) data.getExtras().get("data");
            profile_iv.setImageBitmap(avatar);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}