package com.example.enrique.cpr;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by Enrique on 3/5/2017.
 */

public class consciente extends AppCompatActivity implements View.OnClickListener{
    Button back;
    Button menu;
    Button calor;
    Button quemaduras;
    Button atragamiento;
    Button hemorragia;
    Button herida;
    Button envenenamiento;
    Button fractura;
    Button golpes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consciente);
        back = (Button) findViewById(R.id.back);
        menu = (Button) findViewById(R.id.menu);
        calor = (Button) findViewById(R.id.golpecalor);
        quemaduras = (Button) findViewById(R.id.fuego);
        atragamiento = (Button) findViewById(R.id.atraga);
        hemorragia = (Button) findViewById(R.id.hemo);
        herida = (Button) findViewById(R.id.herida);
        envenenamiento = (Button) findViewById(R.id.veneno);
        fractura = (Button) findViewById(R.id.fractura);
        golpes = (Button) findViewById(R.id.golpes);
        back.setOnClickListener(this);
        menu.setOnClickListener(this);
        calor.setOnClickListener(this);
        quemaduras.setOnClickListener(this);
        atragamiento.setOnClickListener(this);
        hemorragia.setOnClickListener(this);
        herida.setOnClickListener(this);
        envenenamiento.setOnClickListener(this);
        fractura.setOnClickListener(this);
        golpes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == back.getId()){
           /* Intent intent = new Intent(this, socs.class);
            startActivity(intent);*/
            finish();
        }
        else if (id == menu.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else if (id == calor.getId()) {
            //obtener informacion
        }
        else if (id == quemaduras.getId()) {
            //obtener informacion
        }
        else if (id == atragamiento.getId()) {
            //obtener informacion
        }
        else  if (id == hemorragia.getId()) {
            //obtener informacion
        }
        else  if (id == herida.getId()) {
            //obtener informacion
        }
        else if (id == envenenamiento.getId()) {
            //obtener informacion
        }
        else if (id == fractura.getId()) {
            //obtener informacion
        }
        else if (id == golpes.getId()) {
            //obtener informacion
        }

    }
}
