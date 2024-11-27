package com.example.kulapro

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kulapro.pages.Homepage
import com.example.kulapro.pages.LoginPage
import com.example.kulapro.pages.RegisterPage

@Composable
fun KulaProNavigation (modifier: Modifier = Modifier, authViewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder =  {
        composable("login"){
            LoginPage(modifier, navController,authViewModel)
        }
        composable("register"){
            RegisterPage(modifier, navController,authViewModel)
        }
        composable("home"){
            Homepage(modifier, navController,authViewModel)
        }
    })

}