package com.example.personal.q_gamebasket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ulang, ulang2;
    int awal = 0;
    int awal2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ulang = (TextView) findViewById(R.id.id_isia);
        ulang2 = (TextView) findViewById(R.id.id_isib);
    }

//    tombol reset
    public void reset(View view) {
        awal = 0;
        ulang.setText(Integer.toString(awal));
        ulang2.setText(Integer.toString(awal));
    }

    public void c_btna1(View view) {
        awal = awal + 1;
        ulang.setText(Integer.toString(awal));
    }

    public void c_btna2(View view) {
        awal = awal + 2;
        ulang.setText(Integer.toString(awal));
    }

    public void c_btna3(View view) {
        awal = awal + 3;
        ulang.setText(Integer.toString(awal));
    }

    public void c_btnb1(View view) {
        awal2 = awal2 + 1;
        ulang2.setText(Integer.toString(awal2));
    }

    public void c_btnb2(View view) {
        awal2 = awal2 + 2;
        ulang2.setText(Integer.toString(awal2));
    }

    public void c_btnb3(View view) {
        awal2 = awal2 + 3;
        ulang2.setText(Integer.toString(awal2));
    }
}
