package com.jeanpierrepachecoavila.proyecto_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
        Intent myintent = new Intent(this, Registro.class);
        this.startActivity(myintent);
    }

    public void verificaUsuario(View view){
        EditText e = (EditText) (findViewById(R.id.usuario));
        String usuario = e.toString();
        EditText c = (EditText) (findViewById(R.id.contraseña));
        String contra = c.toString();

        if(usuario.equals("")) {
            return;
        }
        if(contra.equals("")){
            return;
        }

        if(esAdmin(usuario)){

        } else {
            Intent myintent = new Intent(this, LlenarFormulario.class);
            myintent.putExtra("usuario",usuario);
            myintent.putExtra("contras",contra);
            this.startActivity(myintent);
        }
    }

    public Boolean esAdmin(String user){
        return false;
    }
}
