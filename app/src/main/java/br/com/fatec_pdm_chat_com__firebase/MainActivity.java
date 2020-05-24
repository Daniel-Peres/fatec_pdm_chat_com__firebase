package br.com.fatec_pdm_chat_com__firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText loginEditText;
    private EditText senhaEditText;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginEditText = findViewById(R.id.loginEditText);
        senhaEditText = findViewById(R.id.senhaEditText);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void irParaCadastro (View view){
        Intent intent = new Intent(this, NovoUsuarioActivity.class);
        startActivity(intent);
        }
    public void fazerLogin (View view){
        String login = loginEditText.getText().toString();
        String senha = senhaEditText.getText().toString();

        firebaseAuth.signInWithEmailAndPassword(
                login,
                senha
        ).addOnSuccessListener((result) -> {
            Toast.makeText(
                    this,
                    getString(R.string.login_sucesso),
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, CategoriaActivity.class);
            startActivity(intent);

        }).addOnFailureListener((error) -> {
            Toast.makeText(
                    this,
                    getString(R.string.login_falhou),
                    Toast.LENGTH_LONG).show();
        });
    }
}

