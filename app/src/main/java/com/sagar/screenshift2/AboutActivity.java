package com.sagar.screenshift2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button websiteButton = (Button) findViewById(R.id.website);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://aravindsagar.github.io/ScreenShift/"));
                startActivity(browserIntent);
            }
        });
        TextView heading = (TextView) findViewById(R.id.heading);
        heading.setText(String.format(getString(R.string.about_header), BuildConfig.VERSION_NAME));
    }
}
