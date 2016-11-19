package com.example.sr_pedro.banderas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BANDERAS extends AppCompatActivity {
    //creamos el bundle (armario)
    Bundle b =new Bundle ();
    String bandera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banderas);
        ImageButton BTCHI,BTARG,BTRUSS,BTCAN,BTTAI,BTJAPO,BTRU;
//relaciona el objeto o botton con el layout.
        BTCHI = (ImageButton)findViewById(R.id.btchi);
        BTARG = (ImageButton) findViewById(R.id.btArg);
        BTRUSS =(ImageButton)findViewById(R.id.btrussi);
        BTCAN =(ImageButton)findViewById(R.id.btCana);
        BTTAI =(ImageButton)findViewById(R.id.bttai );
        BTJAPO =(ImageButton)findViewById(R.id.btjapo);
        BTRU =(ImageButton)findViewById(R.id.btbritish);



    }
    public void btnBritish(View v){
        bandera="british";
       b.putString("bandera",bandera.toString());
        enviar(b);

    }
    public void btnArgentina(View v){
        bandera="Argentina";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void btnCanada(View v){
        bandera="Canada";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void btnPaki(View v){
        bandera="Pakistan";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void btnRuss(View v){
        bandera="Russia";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void btnChile(View v){
        bandera="Chile";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void btnJapo(View v){
        bandera="Japo";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void btnTai(View v){
        bandera="Tailandia";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void btnJoc (View v){
    bandera="Juego";
        b.putString("bandera",bandera.toString());
        enviar(b);
    }
    public void enviar(Bundle b){
        Intent intencio = new Intent(BANDERAS.this,Res_Banderas.class );
        intencio.putExtras(b);
        startActivity(intencio);
    }
}
