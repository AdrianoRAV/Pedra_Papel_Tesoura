package com.mora.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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
        String[] opcao = {"Pedra","Papel","Tesoura"};
        int numero = new Random().nextInt(3); //  0 1 2
         String opcaoApp = opcao [numero];


         ImageView imageResultado = findViewById(R.id.imagemResultado);
         TextView textResultado = findViewById(R.id.textResultado);

         switch (opcaoApp) {


             case "Pedra":
                 imageResultado.setImageResource(R.drawable.pedra);
                 break;

             case "Papel":
                 imageResultado.setImageResource(R.drawable.papel);
                 break;

             case "Tesoura":
                 imageResultado.setImageResource(R.drawable.tesoura);
                 break;


         }
         if (
                         (opcaoApp == "Tesoura" && opcaoSelecionada == "Papel") ||
                         (opcaoApp == "Papel" && opcaoSelecionada == "Pedra") ||
                         (opcaoApp == "Pedra" && opcaoSelecionada == "Tesoura")
         )

         {
             textResultado.setText("Você Perdeu");
             //System.out.println("Você Perdeu Otário!");

         }else if (
                 (opcaoApp == "Tesoura" && opcaoSelecionada == "Tesoura") ||  (opcaoApp == "Papel" && opcaoSelecionada == "Papel") || (opcaoApp == "Pedra" && opcaoSelecionada == "Pedra")
         )
         {
             textResultado.setText("Empataram !");

         }else{
             textResultado.setText("Você Ganhou!");

         }

            // System.out.println("O item clicado foi " + opcaoApp);
            }

}
