package com.mokelab.demo.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mokelab.demo.myapplication.bad.Bad
import com.mokelab.demo.myapplication.bad2.Bad2
import com.mokelab.demo.myapplication.good.Good
import com.mokelab.demo.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // Bad()
                // Bad2()
                Good()
            }
        }
    }
}
