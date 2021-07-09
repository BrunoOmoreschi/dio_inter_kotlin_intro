package com.github.brunoomoreshi.calculadora_exercicio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


//Data class é um formato de dados q vamos usar para guardar as expressões
//VERIFICAR SE A LISTA ESTÁ SENDO ATUALIZADA NA VIS. DO LAYOUT!! MutableLiveData<String>() PODE SER NECESÁRIO
data class expressaoEresultado (
    //O que vai na lista que será apresentada
    //Vamos apresentar a expressão digitada pelo usuario, note q como tem sinais de operações será armazenada como uma string
    val expressao : String,
    //Vamos apresentar o resultado da conta, possivel em branco pq pode dar erro.
    val resultado : Int?
    )

class ContasAdapter (
    //Conectando o dataclass
    val itens: List<expressaoEresultado>
        ) : Adapter<ContasAdapter.ViewHolder>() {
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView){
        fun bindView(item: expressaoEresultado){
            val tvOldExpress = itemView.findViewById<TextView>(R.id.tvOldExpress)
            val tvOldRes = itemView.findViewById<TextView>(R.id.tvOldRes)
            tvOldExpress.text = (item.expressao)
            tvOldRes.text = (item.resultado).toString()
        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.listaderesultados, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]
        holder.bindView(item)
    }
    //Só serve para contar...
    override fun getItemCount() = itens.count()
}