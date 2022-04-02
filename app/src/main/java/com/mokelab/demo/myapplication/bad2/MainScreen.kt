package com.mokelab.demo.myapplication.bad2

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun MainScreen(viewModel: MainViewModel, next: () -> Unit) {
    val token by viewModel.token.collectAsState()

    LaunchedEffect(key1 = token) {
        if (token.isEmpty()) {
            next()
            return@LaunchedEffect
        }
    }

    if (token.isEmpty() || token == "loading") {
        return
    }

    Text("Welcome!")
}