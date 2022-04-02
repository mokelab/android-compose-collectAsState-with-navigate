package com.mokelab.demo.myapplication.good

import android.util.Log
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import kotlinx.coroutines.flow.collect

@Composable
fun MainScreen(viewModel: MainViewModel, next: () -> Unit) {
    val token by viewModel.token.collectAsState("loading")
    Log.d("Debug", "MainScreen compose token=$token")

    LaunchedEffect(Unit) {
        viewModel.token.collect { token ->
            Log.d("Debug", "MainScreen collect token=$token")
            if (token.isEmpty()) {
                Log.d("Debug", "MainScreen next()")
                next()
            }
        }
    }

    if (token.isEmpty() || token == "loading") {
        return
    }

    Text("Welcome!")
}