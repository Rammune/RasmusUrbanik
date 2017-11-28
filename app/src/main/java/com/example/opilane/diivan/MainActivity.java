package com.example.opilane.diivan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button diivan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diivan = (Button) findViewById(R.id.Link);
        diivan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://soundcloud.com/";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
            public void pildid(View view) {
                Intent intent = new Intent(MainActivity.this, PildidActivity.class);
                startActivity(intent);
    }

    public void NUPP(View view) {
    }
}
