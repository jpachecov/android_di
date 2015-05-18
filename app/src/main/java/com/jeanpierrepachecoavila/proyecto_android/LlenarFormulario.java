package com.jeanpierrepachecoavila.proyecto_android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;


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
}
