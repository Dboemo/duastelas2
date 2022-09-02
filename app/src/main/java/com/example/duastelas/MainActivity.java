package com.example.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button bttela2;

EditText usuario,senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=(EditText)findViewById(R.id.edtusr) ;
        senha=(EditText) findViewById(R.id.edtsenha);
        bttela2=(Button) findViewById(R.id.btlogin);
        bttela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abretela2();
            }
        });

    }

    private void abretela2() {
        Intent intent = new Intent(this,tela2.class);
        intent.putExtra("usuario",usuario.getText().toString());
        intent.putExtra("senha",senha.getText().toString());
        startActivity(intent);
        finish();
    }


}