package com.mjjang.myapplication

import LayoutsCodelab
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mjjang.myapplication.ui.theme.MyApplicationTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                LayoutsCodelab()
            }
        }
    }
}

@Preview
@Composable
fun LayoutsCodelabPreview() {
    MyApplicationTheme {
        LayoutsCodelab()
    }
}