package com.example.nuno.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /*Declarar variaveis para os componentes da calculadora*/
    TextView result;
    EditText number1, number2;
    Button add, subtract, divide, multiply;


    /*Declarar uma nova variavel para o calculo
    * float porque nao sera sempre um numero inteiro*/

    float result_num;
    int num1, num2; /*Converter os inputs para nr inteiro*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Referencia as variaveis dos componentes da calculadora
         * Basicamente o que este comando faz é que o resultado
         * é igual a procurar view por ID. Ou seja procura a view
         * do ID que é o --- (R.id.result) e vai referenciar
         * o que quer que receba no TextView.
         * O mesmo é valido para as restantes variaveis.
         * */
        result = (TextView) findViewById(R.id.result);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);

        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        /*Funcao somar*/

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number1.getText().toString()); /*So assim consigo obter o numero para EditText 1*/
                num2 = Integer.parseInt(number2.getText().toString()); /*Por outras palavras obtemos o Integer.parseInt do (number1.getText()
                                                                         e transformamu-lo numa string.*/
                result_num = num1 + num2;
                result.setText (String.valueOf(result_num));
            }
        });

        /*Funcao subtrair*/

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number1.getText().toString()); /*So assim consigo obter o numero para EditText 1*/
                num2 = Integer.parseInt(number2.getText().toString()); /*Por outras palavras obtemos o Integer.parseInt do (number1.getText()
                                                                         e transformamo-lo numa string.*/
                result_num = num1 - num2;
                result.setText (String.valueOf(result_num));
            }
        });

        /*Funcao multiplicar*/

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number1.getText().toString()); /*So assim consigo obter o numero para EditText 1*/
                num2 = Integer.parseInt(number2.getText().toString()); /*Por outras palavras obtemos o Integer.parseInt do (number1.getText()
                                                                         e transformamu-lo numa string.*/
                result_num = num1 * num2;
                result.setText (String.valueOf(result_num));
            }
        });

        /*Funcao dividir*/

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(number1.getText().toString()); /*So assim consigo obter o numero para EditText 1*/
                num2 = Integer.parseInt(number2.getText().toString()); /*Por outras palavras obtemos o Integer.parseInt do (number1.getText()
                                                                         e transformamo-lo numa string.*/
                result_num = num1 / num2;
                result.setText (String.valueOf(result_num));
            }
        });


    }
}
