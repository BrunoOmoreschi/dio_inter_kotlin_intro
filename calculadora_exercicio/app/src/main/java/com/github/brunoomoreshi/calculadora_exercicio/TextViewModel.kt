package com.github.brunoomoreshi.calculadora_exercicio

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    var text = MutableLiveData<String>()
}