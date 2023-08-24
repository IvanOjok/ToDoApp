package com.ivanojok.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


//        Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//        finish()
//        }, 3500)

        val scope = CoroutineScope(Dispatchers.Main)

        scope.launch {
            delay(3500)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }


    }
}