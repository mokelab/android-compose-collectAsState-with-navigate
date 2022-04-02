package com.mokelab.demo.myapplication.bad2

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Bad2() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            val viewModel = viewModel<MainViewModel>()
            MainScreen(viewModel = viewModel) {
                navController.navigate("login")
            }
        }
        composable("login") {
            val viewModel = viewModel<LoginViewModel>()
            LoginScreen(viewModel = viewModel) {
                navController.popBackStack()
            }
        }
    }

}

