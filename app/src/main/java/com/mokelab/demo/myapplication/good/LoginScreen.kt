package com.mokelab.demo.myapplication.good

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun LoginScreen(viewModel: LoginViewModel, back: () -> Unit) {
    val token by viewModel.token.collectAsState("")

    LaunchedEffect(key1 = token) {
        if (token.isNotEmpty()) {
            back()
            return@LaunchedEffect
        }
    }

    Button(onClick = { viewModel.login() }) {
        Text("Login")
    }
}