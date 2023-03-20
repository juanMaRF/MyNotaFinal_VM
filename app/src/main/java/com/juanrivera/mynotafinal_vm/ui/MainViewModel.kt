package com.juanrivera.mynotafinal_vm.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val resultado:MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }

    fun def(nota1:Double, nota2:Double, nota3:Double, nota4:Double){
        resultado.value = (nota1 * 0.6) + (nota2 * 0.07) + (nota3 * 0.08) + (nota4 * 0.25)
    }
}