package com.example.enriqueramirez.calculadora;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import android.widget.TextView;

public class MainActivity extends Activity {
    Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,
            btnOcho,btnNueve,btnCero,btnSuma, btnResta, btnMultiplicacion,
            btnDivision,btnIgual,btnClean;
    TextView Resultado;
    double resultado;
    String operador, mostrar, reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.Uno);
        btnDos = (Button)findViewById(R.id.Dos);
        btnTres = (Button)findViewById(R.id.Tres);
        btnCuatro = (Button)findViewById(R.id.Cuatro);
        btnCinco = (Button)findViewById(R.id.Cinco);
        btnSeis = (Button)findViewById(R.id.Seis);
        btnSiete = (Button)findViewById(R.id.Siete);
        btnOcho = (Button)findViewById(R.id.Ocho);
        btnNueve = (Button)findViewById(R.id.Nueve);
        btnCero = (Button)findViewById(R.id.Cero);
        btnDivision = (Button)findViewById(R.id.Division);
        btnSuma = (Button)findViewById(R.id.Suma);
        btnResta = (Button)findViewById(R.id.Resta);
        btnMultiplicacion = (Button)findViewById(R.id.Multiplicacion);
        btnIgual = (Button)findViewById(R.id.Igual);
        Resultado = (TextView)findViewById(R.id.Etiqueta);
        btnClean = (Button)findViewById(R.id.Clean);

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"1";
                Resultado.setText(mostrar);
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"2";
                Resultado.setText(mostrar);
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"3";
                Resultado.setText(mostrar);
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"4";
                Resultado.setText(mostrar);
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"5";
                Resultado.setText(mostrar);
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"6";
                Resultado.setText(mostrar);
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"7";
                Resultado.setText(mostrar);
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"8";
                Resultado.setText(mostrar);
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"9";
                Resultado.setText(mostrar);
            }
        });
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar+"0";
                Resultado.setText(mostrar);
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });
        btnClean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";

            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";

                if (operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }

                if (operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });
    }
}
