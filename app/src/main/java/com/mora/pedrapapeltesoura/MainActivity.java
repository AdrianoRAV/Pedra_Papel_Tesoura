package com.mora.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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
             System.out.println("Você Perdeu Otário!");

         }else if (
                 (opcaoApp == "Tesoura" && opcaoSelecionada == "Tesoura") ||  (opcaoApp == "Papel" && opcaoSelecionada == "Papel") || (opcaoApp == "Pedra" && opcaoSelecionada == "Pedra")
         )
         {
             System.out.println("Empataram !");

         }else{
             System.out.println("Você ganhou na sorte!");

         }

            // System.out.println("O item clicado foi " + opcaoApp);
    }


}
