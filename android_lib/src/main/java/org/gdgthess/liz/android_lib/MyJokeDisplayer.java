package org.gdgthess.liz.android_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyJokeDisplayer extends AppCompatActivity {

    TextView joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_joke_displayer);

        joke = (TextView) findViewById(R.id.theJoke);
        joke.setText(getIntent().getExtras().getString("joke"));
    }
}
