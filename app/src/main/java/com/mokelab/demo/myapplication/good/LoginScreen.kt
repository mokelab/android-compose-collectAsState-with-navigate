package com.mokelab.demo.myapplication.good

import android.util.Log
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import kotlinx.coroutines.flow.collect

@Composable
fun LoginScreen(viewModel: LoginViewModel, back: () -> Unit) {
    Log.d("Debug", "LoginScreen compose")
    LaunchedEffect(Unit) {
        viewModel.token.collect { token ->
            Log.d("Debug", "LoginScreen collect token=$token")
            if (token.isNotEmpty()) {
                Log.d("Debug", "LoginScreen back()")
                back()
            }
        }
    }

    Button(onClick = { viewModel.login() }) {
        Text("Login")
    }
}