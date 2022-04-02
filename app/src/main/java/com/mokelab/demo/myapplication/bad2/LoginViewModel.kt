package com.mokelab.demo.myapplication.bad2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mokelab.demo.myapplication.repository.AccountRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {
    val token: Flow<String> = AccountRepository.token

    fun login() {
        viewModelScope.launch {
            // update datastore
            AccountRepository.token.value = "OK"
        }
    }
}