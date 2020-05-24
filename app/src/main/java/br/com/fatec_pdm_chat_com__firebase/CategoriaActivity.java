package br.com.fatec_pdm_chat_com__firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
    }

    public void  iniciaChat(String categoria){
        Intent intent = new Intent(this, ChatActivity.class);
        intent.putExtra("categoria", categoria);
        startActivity(intent);
    }

    public void botaoCinema (View view){
       iniciaChat("cinema");
    }

    public void botaoNovidades (View view){
        iniciaChat("novidades");
    }

    public void botaoTecnologia (View view){
        iniciaChat("tecnologia");
    }

    public void botaoEconomia (View view){
        iniciaChat("economia");
    }
}
