package com.example.claseunoandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    val helloTextView = findViewById<TextView>(R.id.texto_identificador);
    helloTextView.setText("EAEAEAEA");
}

}
