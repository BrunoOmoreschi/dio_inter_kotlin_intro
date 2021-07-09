package com.github.brunoomoreshi.calculadora_exercicio

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class txLiveData : ViewModel() {
    var text = MutableLiveData<String>()
}