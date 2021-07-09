package com.github.brunoomoreshi.calculadora_exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewModel = (ViewModelProvider(this ).get(TextViewModel::class.java))
        val contas = listOf<Float?>()
        //
        var tvDigitados = findViewById<TextView>(R.id.tvDigitados)

        if (contas.isEmpty()){
            tvDigitados.text = tvDigitados.hint
        }



        //val listaContaAtual :Float? = []

        //Sequencia dos botões numéricos, eles são armazenados assim que clicados

        val btZero = findViewById<Button>(R.id.btZero)
        btZero.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btZero.text

        }
        val btOne = findViewById<Button>(R.id.bt1)
        btOne.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btOne.text
        }
        val btTwo = findViewById<Button>(R.id.bt2)
        btTwo.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btTwo.text
        }
        val btThree = findViewById<Button>(R.id.bt3)
        btThree.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btThree.text
        }
        val btFour = findViewById<Button>(R.id.bt4)
        btFour.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btFour.text
        }
        val btFive = findViewById<Button>(R.id.bt5)
        btFive.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btFive.text
        }
        val btSix = findViewById<Button>(R.id.bt6)
        btSix.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btSix.text
        }
        val btSeven = findViewById<Button>(R.id.bt7)
        btSeven.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btSeven.text
        }
        val btEight = findViewById<Button>(R.id.bt8)
        btEight.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btEight.text
        }
        val btNine = findViewById<Button>(R.id.bt9)
        btNine.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btNine.text
        }

        //Sequencia dos botões de operações, também são armazenados quando clicados

        //Botões que alteram a lista
        val btDeleter = findViewById<Button>(R.id.btDel)
        btDeleter.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btDeleter.text
        }
        val btAns = findViewById<Button>(R.id.btExp)
        btAns.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btAns.text
        }

        //Operações:
        val btSoma = findViewById<Button>(R.id.btPlus)
        btSoma.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btSoma.text
        }
        val btSubtrator = findViewById<Button>(R.id.btMinus)
        btSubtrator.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btSubtrator.text
        }
        val btDivisor = findViewById<Button>(R.id.btDivide)
        btDivisor.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btDivisor.text
        }
        val btMultpl = findViewById<Button>(R.id.btTimes)
        btMultpl.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            tvDigitados.text = btMultpl.text
        }

    }
}


//Texto dica para começo de calculos: @string/tvDigitados_txt

