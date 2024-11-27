package com.example.kulapro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.kulapro.ui.theme.KulaProTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val authViewModel : AuthViewModel by viewModels()
        setContent {
            KulaProTheme {
                Scaffold (modifier = Modifier.fillMaxSize()) {
                        innerpadding ->
                    KulaProNavigation(authViewModel = authViewModel, modifier = Modifier.padding(innerpadding))

                }

            }
        }
    }
}


