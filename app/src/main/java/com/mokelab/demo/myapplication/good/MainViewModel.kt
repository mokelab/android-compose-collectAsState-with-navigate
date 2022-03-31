package com.mokelab.demo.myapplication.good

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mokelab.demo.myapplication.repository.AccountRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val token = MutableStateFlow("loading")

    init {
        viewModelScope.launch {
            AccountRepository.token.collect {
                this@MainViewModel.token.value = it
            }
        }
    }
}