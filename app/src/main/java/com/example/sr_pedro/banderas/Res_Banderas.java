package com.example.sr_pedro.banderas;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Res_Banderas extends AppCompatActivity {

    public int cont = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res__banderas);
        Bundle b = getIntent().getExtras();

        Button CHECKTBLES;
        ImageView FotoIdioma;
        EditText año,fundador,sobrenombre;
        TextView Titulo,url;
        CHECKTBLES = (Button)findViewById(R.id.btncheck);
        FotoIdioma = (ImageView)findViewById(R.id.imagebandera);
        año=(EditText)findViewById(R.id.txtAño);
        fundador=(EditText)findViewById(R.id.txtFundador);
        sobrenombre=(EditText)findViewById(R.id.txtSnom );
        url=(TextView)findViewById(R.id.txturl);
        Titulo=(TextView)findViewById(R.id.txttitulo);
        String  [] TablaBanderas={
                "british",
                "Argentina",
                "Canada",
                "Pakistan",
                "Russia",
                "Chile",
                "Japo",
                "Tailandia"
        } ;

        switch (b.getString("bandera")){
            case "british":

                //Rellenamos los campos por su bandera textView
                año.setText("1802");
                fundador.setText("El Reino Unido");
                sobrenombre.setText("Union Flag o Union Jack");
                Titulo.setText("Bandera del Reino Unido");
                //Rellenamos el campo de la foto
                FotoIdioma.setImageResource(R.drawable.british);
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View view){
                    //creamos el objeto intent y le decomos la URL a la que queremos ir
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_del_Reino_Unido"));

                    //iniciamos el Intent
                    startActivity(i);
                }

            });
                break;
            case "Argentina":
                //Rellenamos los campos por la bandera textView
                año.setText("1812");
                fundador.setText("Manuel Belgrano");
                sobrenombre.setText("Sol del mayo");
                Titulo.setText("Bandera del Argentina");
                //ponemos la foto con un onclick
                FotoIdioma.setImageResource(R.drawable.argentina);
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view){
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_la_Argentina"));

                        //iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
            case "Canada":
                //Rellenamos los campos por la bandera textView
                año.setText("1965");
                fundador.setText("Leseter B. Pearson");
                sobrenombre.setText("La hoja de arce");
                Titulo.setText("Bandera de Canada");
                //ponemos la foto con un onclick
                FotoIdioma.setImageResource(R.drawable.canada);
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view){
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Canadá"));

                        //iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
            case "Pakistan":
                //Rellenamos los campos por la bandera textView
                año.setText("1947");
                fundador.setText("Amir-ud-Din Khidwai");
                sobrenombre.setText("bandera verde con la media luna");
                Titulo.setText("Bandera de Pakistán");
                //ponemos la foto con un onclick
                FotoIdioma.setImageResource(R.drawable.paki );
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view){
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Pakistán"));

                        //iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
            case "Russia":
                //Rellenamos los campos por la bandera textView
                año.setText("1993");
                fundador.setText("Federación de Rusia");
                sobrenombre.setText("Los colores de la revolución");
                Titulo.setText("Bandera de Rusia");
                //ponemos la foto con un onclick
                FotoIdioma.setImageResource(R.drawable.russia  );
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view){
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Rusia#Construcci.C3.B3n_de_la_bandera"));

                        //iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
            case "Chile":
                //Rellenamos los campos por la bandera textView
                año.setText("1817");
                fundador.setText("Jose Ignacio Zenteno");
                sobrenombre.setText("Estrella solitaria");
                Titulo.setText("Bandera de Chile");
                //ponemos la foto con un onclick
                FotoIdioma.setImageResource(R.drawable.chile  );
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view){
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Chile"));

                        //iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
            case "Japo":
                //Rellenamos los campos por la bandera textView
                año.setText("1870");
                fundador.setText("Meji 3");
                sobrenombre.setText("Hinomaru (disco solar)");
                Titulo.setText("Bandera de Japón");
                //ponemos la foto con un onclick
                FotoIdioma.setImageResource(R.drawable.japo  );
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view){
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Jap%C3%B3n#Dise.C3.B1o"));

                        //iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
            case "Tailandia":
                //Rellenamos los campos por la bandera textView
                año.setText("1917");
                fundador.setText("Gobierno de Tailandia");
                sobrenombre.setText("Thong Trairong");
                Titulo.setText("Bandera de Tailandia");
                //ponemos la foto con un onclick
                FotoIdioma.setImageResource(R.drawable.tailandia  );
                //aHORA el link nos dara problemas si no metemos el onClick
                url.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view){
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Tailandia"));

                        //iniciamos el Intent
                        startActivity(i);
                    }
                });
                break;
            case "Juego":
                if (cont==0 ){
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.tailandia  );
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view){
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Tailandia"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });
                    cont=cont+1;
                    break;
                }
                if (cont==1 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.japo);
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Jap%C3%B3n#Dise.C3.B1o"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });

                    cont = cont + 1;
                    break;
                }
                if (cont==8 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.japo);
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Jap%C3%B3n#Dise.C3.B1o"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });

                    cont = cont + 1;
                    break;
                }
                if (cont==2 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.chile  );
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view){
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Chile"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });

                    cont = cont + 1;
                    break;
                }
                if (cont==3 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.russia  );
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view){
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Rusia#Construcci.C3.B3n_de_la_bandera"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });

                    cont = cont + 1;
                    break;
                }


                if (cont==4 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.paki );
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view){
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Pakistán"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });

                    cont = cont + 1;
                    break;
                }
                if (cont==5 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.canada);
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view){
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_Canadá"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });
                    cont = cont + 1;
                    break;
                }
                if (cont==6 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //ponemos la foto con un onclick
                    FotoIdioma.setImageResource(R.drawable.argentina);
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view){
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_de_la_Argentina"));

                            //iniciamos el Intent
                            startActivity(i);
                        }
                    });

                    cont = cont + 1;
                    break;
                }
                if (cont==7 ) {
                    //Dejamos los textos vacio para que los llene
                    año.setText("");
                    fundador.setText("");
                    sobrenombre.setText("");
                    Titulo.setText("Rellena los textos vacios:");
                    //Rellenamos el campo de la foto
                    FotoIdioma.setImageResource(R.drawable.british);
                    //aHORA el link nos dara problemas si no metemos el onClick
                    url.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View view){
                            //creamos el objeto intent y le decomos la URL a la que queremos ir
                            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Bandera_del_Reino_Unido"));

                            //iniciamos el Intent
                            startActivity(i);
                        }

                    });
                    cont = 0;
                    break;
                }




        }
    }

            //aqui es jodido pork kiero enviarle el count asi me va cambiando la imagen y el resultado.
        public void btnCheckJoc(View v){
            Bundle b =new Bundle ();
            String bandera;
            bandera="bandera";
            b.putString("bandera",bandera.toString());
            enviar(b);
            /*cont=Integer.parseInt("cont");
            b.putInt("cont",cont) ;
            enviar(b);*/
        }
    public void enviar(Bundle b){
        Intent intencio = new Intent(Res_Banderas.this,BANDERAS.class );
        intencio.putExtras(b);
        startActivity(intencio);
    }

}



