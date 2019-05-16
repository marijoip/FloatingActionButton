package com.example.floatingactionbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

//Floating Action Button con menú

public class MainActivity extends AppCompatActivity {

    private FABToolbarLayout morph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}