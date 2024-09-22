package com.tinku.lifecycleawarecomponent

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Toast.makeText(this, "Ow - onCreate", Toast.LENGTH_LONG).show()

    }
}