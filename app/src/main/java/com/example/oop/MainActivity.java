package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Robot robot;
    private Wizard wizard;
    private TextView console;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = this.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show();
        robot = new Robot("R2D2",  100, 50);
        wizard = new Wizard("Strange", 100, 50);
        console = findViewById(R.id.console);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "destroyed", Toast.LENGTH_SHORT).show();
    }

    public void click1(View view) {
        GameHelper.attackAction(wizard, robot, console);
    }

}
