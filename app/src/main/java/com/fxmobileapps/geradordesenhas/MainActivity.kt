package com.fxmobileapps.geradordesenhas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fxmobileapps.geradordesenhas.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding
    private val alfabeto = arrayOf(
        "A","B","C","D","E","F",
        "G","H","I","J","K","L",
        "M","N","O","P","Q","R",
        "S","T","U","V","W","X",
        "Y","Z"
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btgerarsenha.setOnClickListener()
        {
            val letraAleatoria1=alfabeto.random()
            val letraAleatoria2=alfabeto.random()
            val letraAleatoria3=alfabeto.random()
            val numeroAleatorio= Random.nextInt(1000..9999)

            binding.txtSenha.text ="$letraAleatoria1$letraAleatoria2$letraAleatoria3-$numeroAleatorio"
        }
        binding.btapagarsenha.setOnClickListener()
        {
            val letraAleatoria1=" "
            val letraAleatoria2=" "
            val letraAleatoria3=" "
            val numeroAleatorio=" "

            binding.txtSenha.text ="$letraAleatoria1$letraAleatoria2$letraAleatoria3$numeroAleatorio"
        }

    }
}