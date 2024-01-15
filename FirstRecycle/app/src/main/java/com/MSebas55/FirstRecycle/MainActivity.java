package com.MSebas55.FirstRecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> nombresDivisas = new ArrayList<>();
    private ArrayList<Double> tiposDivisas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setNombresDivisas();
        setTiposDivisas();

        RecyclerView rwDivisas = findViewById(R.id.recycleview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rwDivisas.setLayoutManager(linearLayoutManager);
    }

    public void setNombresDivisas() {

        nombresDivisas.add("USD");

        nombresDivisas.add("GBP");

        nombresDivisas.add("JPY");

        nombresDivisas.add("AUD");

        nombresDivisas.add("INR");

        nombresDivisas.add("CNY");

        nombresDivisas.add("MXN");

        nombresDivisas.add("CHF");

    }

    public void setTiposDivisas() {

        tiposDivisas.add(1.0977);

        tiposDivisas.add(0.8601);

        tiposDivisas.add(159.6059);

        tiposDivisas.add(1.6345);

        tiposDivisas.add(90.7);

        tiposDivisas.add(7.8451);

        tiposDivisas.add(18.4931);

        tiposDivisas.add(0.9350);

    }
}