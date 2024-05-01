package org.example;

import java.time.LocalTime;
import java.util.ArrayList;

public class Destino
{
    private ArrayList<Parada> paradas;

    public LocalTime calcularDemoraEntre(Parada parada1, Parada parada2){
        //Implementacion Con API
        LocalTime loQueDevuelveLaAPI = 0;
        return loQueDevuelveLaAPI;
    }

    public LocalTime calcularDemora(){
        LocalTime tiempoTotal = 0;

        for (int i = 0; i < paradas.size(); i++){
            tiempoTotal += calcularDemoraEntre(paradas[i], paradas[i+1]);
            tiempoTotal += paradas[i].demoraTiempo();
        }

        return tiempoTotal;
    }
}