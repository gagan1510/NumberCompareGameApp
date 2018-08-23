package com.firstapp.ruffer.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int pts;
    private int rand1, rand2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pts = 0;
        pickRandomNumbers();
    }

    private void pickRandomNumbers(){
        Random randy  = new Random();
        int rand2 = randy.nextInt(10);
        int rand1 = randy.nextInt(10);
        Button butt = (Button) findViewById(R.id.button);
        butt.setText(Integer.toString(rand1));
        butt = (Button) findViewById(R.id.button2);
        butt.setText(Integer.toString(rand2));
    }

    public void leftButtonClick(View view) {
        if (rand1 >= rand2) {
            pts++;
        }
        else {
            pts--;
        }
        TextView ptsView = (TextView) findViewById(R.id.pointView);
        ptsView.setText("Point: " + pts);
        pickRandomNumbers();
    }

    public void rightButtonClick(View view) {
        if (rand1 <= rand2) {
            pts++;
        }
        else {
            pts--;
        }
        TextView ptsView = (TextView) findViewById(R.id.pointView);
        ptsView.setText("Point: " + pts);
        pickRandomNumbers();
    }
}
