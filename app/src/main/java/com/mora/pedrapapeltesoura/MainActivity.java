package com.mora.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void SelecionadoPedra(View view){


        this.opcaoSelecionada("Pedra");

    }
    public  void SelecionadoPapel(View view){

        this.opcaoSelecionada("Papel");

    }
    public  void SelecionadoTesoura(View view){

        this.opcaoSelecionada("Tesoura");

    }

     public  void opcaoSelecionada(String opcaoSelecionada){

        System.out.println("O item clicado foi " + opcaoSelecionada);

     }
}
