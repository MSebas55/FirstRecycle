package com.MSebas55.FirstRecycle;



import android.content.Context;

import android.graphics.Color;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.TextView;



import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;



import org.w3c.dom.Text;



import java.util.ArrayList;



public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<String> listaDivisas;
    private TextView ultimaSeleccion;
    private int posicionUltimaSeleccion;



    Adaptador(Context context, ArrayList<String> listaDivisas) {

        this.listaDivisas = listaDivisas;

        this.inflater = LayoutInflater.from(context);

        posicionUltimaSeleccion = -1;

    }



    @NonNull

    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.row, parent, false);

        return new ViewHolder(view);

    }



    @Override

    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {

        String divisa = listaDivisas.get(position);

        holder.divisa.setText(divisa);



        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                TextView divisa = v.findViewById(R.id.divisa);

                if (divisa == ultimaSeleccion){

                    posicionUltimaSeleccion = -1;

                    ultimaSeleccion = null;

                    divisa.setBackgroundColor(Color.WHITE);

                } else {

                    if(ultimaSeleccion!=null) ultimaSeleccion.setBackgroundColor(Color.WHITE);

                    divisa.setBackgroundColor(Color.BLUE);

                    posicionUltimaSeleccion = position;

                    ultimaSeleccion = divisa;

                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return listaDivisas.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView divisa;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            divisa = itemView.findViewById(R.id.divisa);
        }
    }

    public int getPosicionUltimaSeleccion() {
        return this.posicionUltimaSeleccion;
    }
}