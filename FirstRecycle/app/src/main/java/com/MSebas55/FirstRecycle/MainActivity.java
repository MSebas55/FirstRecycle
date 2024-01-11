package com.MSebas55.FirstRecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> nombreDivisas = new ArrayList<>();
    private ArrayList<Double> tipoDivisas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setNombreDivisas() {
        nombreDivisas.add("USD");
        nombreDivisas.add("GBP");
        nombreDivisas.add("JPY");
        nombreDivisas.add("AUD");
    }

    public void setTipoDivisas() {
        tipoDivisas.add(0.9123);
        tipoDivisas.add(1.1622);
        tipoDivisas.add(0.0063);
        tipoDivisas.add(0.6120);
    }
}