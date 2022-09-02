package com.example.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tela2 extends AppCompatActivity {
Button btretorna;
TextView usrtxt,senhatxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        btretorna=(Button) findViewById(R.id.btretorna);
        usrtxt=(TextView)findViewById(R.id.usuariotxt) ;
        senhatxt=(TextView)findViewById(R.id.senhatxt) ;
        Intent intent = getIntent();
        usrtxt.setText(intent.getStringExtra("usuario"));
        senhatxt.setText(intent.getStringExtra("senha"));
        btretorna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               retornatelaprincipal();
            }
        });
    }

    private void retornatelaprincipal() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}