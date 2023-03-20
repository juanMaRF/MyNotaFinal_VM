package com.juanrivera.mynotafinal_vm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.juanrivera.mynotafinal_vm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

        val screenSplash = installSplashScreen()

        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        var defObserver = Observer<Double>{
            mainBinding.definitivaTextview.text = it.toString()
        }

        mainViewModel.resultado.observe(this,defObserver)

        mainBinding.calcuButton.setOnClickListener {
            mainViewModel.def(mainBinding.sesentaNoteEditText.text.toString().toDouble(),mainBinding.sieteNoteEditText.text.toString().toDouble(),
                mainBinding.ochoNoteEditText.text.toString().toDouble(),mainBinding.twentyfiveNoteEditText.text.toString().toDouble())
        }

        setContentView(mainBinding.root)
        screenSplash.setKeepOnScreenCondition { false }
    }
}