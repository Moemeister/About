package com.moesystems.about;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    //Button sendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*

        sendBtn = (Button)findViewById(R.id.btn_share);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri pictureUri = Uri.parse("android:resource://com.moesystems.about/drawable/"+R.drawable.yo);

                Intent sendIntent =  new Intent();

                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("image/*");
                sendIntent.putExtra(Intent.EXTRA_STREAM, pictureUri);

                sendIntent.putExtra(Intent.EXTRA_TEXT,((TextView)findViewById(R.id.name)).getText().toString() +" "+
                        ((TextView)findViewById(R.id.fb_name)).getText().toString() +" "+
                        ((TextView)findViewById(R.id.git_user)).getText().toString() +" "+
                        ((TextView)findViewById(R.id.phone)).getText().toString() +" " +
                        ((TextView)findViewById(R.id.mail)).getText().toString());


                if (sendIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent);
                }


            }
        });*/


    }
    public void share(View v){
        Uri pictureUri = Uri.parse("android.resource://" + getPackageName() + "/drawable/" + R.drawable.yo);

        Intent sendIntent =  new Intent();

        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.setType("image/*");
        sendIntent.putExtra(Intent.EXTRA_STREAM, pictureUri);

        sendIntent.putExtra(Intent.EXTRA_TEXT,"Name: "+((TextView)findViewById(R.id.name)).getText().toString()+"\nFacebook: "+
                ((TextView)findViewById(R.id.fb_name)).getText().toString() +"\nGithub: "+
                ((TextView)findViewById(R.id.git_user)).getText().toString() +"\nPhone: "+
                ((TextView)findViewById(R.id.phone)).getText().toString() +"\nE-mail: " +
                ((TextView)findViewById(R.id.mail)).getText().toString());

        if(sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }


    }
}
