package com.jeanpierrepachecoavila.proyecto_android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;


public class LlenarFormulario extends Activity {
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private String respuesta5;
    private String respuesta6;
    private String respuesta7;
    private String respuesta8;
    private String respuesta9;
    private String respuesta10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llenar_formulario);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_llenar_formulario, menu);
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

    public void radioButtonPressed(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.arrebatado:
                if (checked)
                    respuesta1 = "arrebatado";
                break;
            case R.id.flexible:
                if (checked)
                    respuesta1 = "flexible";
                break;
            case R.id.tranquilo:
                if (checked)
                    respuesta1 = "tranquilo";
                break;
            case R.id.dificil:
                if (checked)
                    respuesta1 = "dificil";
                break;
        }

    }

    public void verificaFormulario(View view){

        EditText respuesta = (EditText)findViewById(R.id.Respuesta);
        respuesta2 = respuesta.getText().toString();
        Spinner tiempoLibre = (Spinner) findViewById(R.id.tiempo_libre);
        respuesta3 = tiempoLibre.getSelectedItem().toString();
        Spinner alimento_mascota = (Spinner) findViewById(R.id.inversion_alimento);
        respuesta4 = alimento_mascota.getSelectedItem().toString();
        Spinner hasTenidoM = (Spinner) findViewById(R.id.desp1);
        respuesta5 = hasTenidoM.getSelectedItem().toString();
        Spinner tienesM = (Spinner) findViewById(R.id.desp2);
        respuesta6 = tienesM.getSelectedItem().toString();
        Spinner cuantasPersonas = (Spinner) findViewById(R.id.cuantas_personas);
        respuesta7 = cuantasPersonas.getSelectedItem().toString();
        Spinner ingresos = (Spinner) findViewById(R.id.ingresos);
        respuesta8 = ingresos.getSelectedItem().toString();
        Spinner tiposMascotas = (Spinner) findViewById(R.id.tiposMascotas);
        respuesta9 = tiposMascotas.getSelectedItem().toString();

        if(respuesta1.isEmpty()){
            /*
            Context context = getApplicationContext();
            CharSequence text = "Contesta todas las preguntas!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            */
        }
        /*
        if(respuesta2.equals("")){

        }
        if(respuesta3.equals("")){

        }
        if(respuesta4.equals("")){

        }
        if(respuesta5.equals("")){

        }
        if(respuesta6.equals("")){

        }
        if(respuesta7.equals("")){

        }
        if(respuesta8.equals("")){

        }
        if(respuesta9.equals("")){

        }
        */
        Intent myintent = new Intent(this, FormularioTerminado.class);
        this.startActivity(myintent);
    }

    public void lanza(View view){
        Intent myintent = new Intent(this, FormularioTerminado.class);
        this.startActivity(myintent);
    }
}
