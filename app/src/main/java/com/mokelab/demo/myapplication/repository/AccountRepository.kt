package com.mokelab.demo.myapplication.repository

import kotlinx.coroutines.flow.MutableStateFlow

class AccountRepository {
    companion object {
        val token = MutableStateFlow("")
    }
}