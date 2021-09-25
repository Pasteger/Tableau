package com.example.tableau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer SCPPoint=0;
    Integer GOCPoint=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        resetUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("SCPPoint", SCPPoint);
        outState.putInt("GOCPoint", GOCPoint);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("SCPPoint")) {
            SCPPoint = savedInstanceState.getInt("SCPPoint");
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("GOCPoint")) {
            GOCPoint = savedInstanceState.getInt("GOCPoint");
        }
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.SCPPoints)).setText(SCPPoint.toString());
        ((TextView) findViewById(R.id.GOCPoints)).setText(GOCPoint.toString());
    }

    public void addPointSCP(View view){
        TextView textViewSCP = findViewById(R.id.SCPPoints);
        SCPPoint++;
        textViewSCP.setText(SCPPoint.toString());
    }

    public void addPointGOC(View view){
        TextView textViewGOC = findViewById(R.id.GOCPoints);
        GOCPoint++;
        textViewGOC.setText(GOCPoint.toString());
    }

    public void reset(View view){
        TextView textViewSCP = findViewById(R.id.SCPPoints);
        TextView textViewGOC = findViewById(R.id.GOCPoints);
        SCPPoint=0;
        GOCPoint=0;
        textViewSCP.setText(SCPPoint.toString());
        textViewGOC.setText(GOCPoint.toString());
    }
}
