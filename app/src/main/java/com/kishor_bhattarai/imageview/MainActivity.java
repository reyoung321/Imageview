package com.kishor_bhattarai.imageview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
RadioButton radio1 , radio2;
ImageView image;
Button Closebutton;
AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                radio1=findViewById(R.id.radioButton2);
                radio2=findViewById(R.id.radioButton3);
                image=findViewById(R.id.imgview);
builder = new AlertDialog.Builder(this);
                radio1.setOnClickListener(this);
                radio2.setOnClickListener(this);

    }
    public void dialoagbox(final int dbfun)
    {
        builder.setMessage("Close??")

                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        image.setImageResource(dbfun);
                    }

                }).setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.radioButton2:
dialoagbox(R.drawable.img1);
                break;
                    case R.id.radioButton3:
                    dialoagbox(R.drawable.img2);
                        break;
                }

        }
    }


