package com.github.brunoomoreshi.calculadora_exercicio

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variavel para o jetpack
        //Terminar de implementar!!
        //val txLiveData = (ViewModelProvider(this ).get(txLiveData::class.java))

            //Encapsulamento do texto do campo de digitação em uma variavel
            var tvDigitados = findViewById<TextView>(R.id.tvDigitados)

            //Variavel que guarda o que está sendo digitado para ser operado.
            var digitado = arrayListOf<String?>()
            tvDigitados.text = digitado.toString()
            Log.d (digitado.toString(),tvDigitados.toString() )

        //CRIAR FUN Q SEJA CHAMADA EM CADA BOTÃO PARA ATUALIZAR A LISTA, LISTONCLICK É QUE ESTÁ MANDANDO O TEXTO PARA A TELA
        //CLICA, CHAMA A FUN, ATUALIZA A LISTA DO QUE FOI DIG, E CHAMA ESSE RESULTADO PARA A TELA
        //BOTÃO DE CALCULAR: FUN LE A LISTA, VERIF. SE TEM */ SE SIM CRIA UMA LISTA COM OS AFRENTE E APOS E CALC CADA UM, E TROCA NA LISTA, SE NÃO, PEGA OS ELE. 2A2 E FAZ +-


                //Encapsulamento da lista em um variavel
                val rvLista = findViewById<RecyclerView>(R.id.rvLista)
                //Chamado do adapter da recycler view (ContasAdapter.kt)

                rvLista.layoutManager = LinearLayoutManager(this)

                //Sample data
                val exp1 = expressaoEresultado ("1+1",2)
                val exp2 = expressaoEresultado ("1*1",1)
                val exp3 = expressaoEresultado ("1/1",1)

                //Variavel que encapsula as expressões (Array com data class definido)
                //Carrega o Sample data, mas conf. o usuario vai fazendo contas vamos atualizando
                val listaContas = listOf(exp1,exp2,exp3)
                //Manda a lista de items para o adapter
                rvLista.adapter = ContasAdapter(listaContas)



        //Só pra ficar charmoso dá a dica de que deve ser digitado algo para ser calculado.
        if (digitado.isEmpty()){
            tvDigitados.text = tvDigitados.hint
        }

        //Sequencia dos botões numéricos, eles são armazenados assim que clicados

        val btZero = findViewById<Button>(R.id.btZero)
        btZero.setOnClickListener {
            //to implement
            //Linha de teste: Envia o valor do botão para a area de digitação
            val nada = btZero.text
            digitado.add(nada.toString())
            //tvDigitados.text = btZero.text
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

