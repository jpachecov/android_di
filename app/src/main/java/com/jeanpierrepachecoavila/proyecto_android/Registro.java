package com.jeanpierrepachecoavila.proyecto_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Registro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void registraNuevo(View view){
        EditText e1 = (EditText)(findViewById(R.id.nombre));
        EditText e2 = (EditText)(findViewById(R.id.correo));
        EditText e3 = (EditText)(findViewById(R.id.usuario));
        EditText e4 = (EditText)(findViewById(R.id.contrasena));
        String nombre = e1.getText().toString();
        String correo = e2.getText().toString();
        String usuario = e3.getText().toString();
        String contra = e4.getText().toString();

        if(!esUsuarioValido(usuario)){
            //Lanza error y return
        }
        if(!esCorreoValido(correo)){
            //Lanza error y return
        }
        // Iniciamos la actividad del perfil de usario
        Intent myintent = new Intent(this,PerfilAdmin.class);
        myintent.putExtra("usuario",usuario);
        this.startActivity(myintent);

    }

    public boolean esCorreoValido(String correo){
        return true;
    }
    public boolean esUsuarioValido(String user){
        return true;
    }
}
