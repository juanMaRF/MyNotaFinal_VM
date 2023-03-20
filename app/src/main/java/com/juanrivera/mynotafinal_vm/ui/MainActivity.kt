package com.juanrivera.mynotafinal_vm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.juanrivera.mynotafinal_vm.R
import com.juanrivera.mynotafinal_vm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private var nota1:Double = 0.0
    private var nota2:Double = 0.0
    private var nota3:Double = 0.0
    private var nota4:Double = 0.0
    private var definitiva:Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {

        val screenSplash = installSplashScreen()

        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        mainBinding.calcuButton.setOnClickListener {
            nota1 = mainBinding.sesentaNoteEditText.text.toString().toDouble()
            nota2 = mainBinding.sieteNoteEditText.text.toString().toDouble()
            nota3 = mainBinding.ochoNoteEditText.text.toString().toDouble()
            nota4 = mainBinding.twentyfiveNoteEditText.text.toString().toDouble()

            nota1 = nota1 * 0.6
            nota2 = nota2 * 0.07
            nota3 = nota3 * 0.08
            nota4 = nota4 * 0.25

            definitiva = nota1 + nota2 + nota3 + nota4
            mainBinding.definitivaTextview.text = definitiva.toString()
        }

        setContentView(mainBinding.root)
        screenSplash.setKeepOnScreenCondition { false }
    }
}