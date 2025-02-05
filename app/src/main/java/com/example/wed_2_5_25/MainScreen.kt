package com.example.wed_2_5_25

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier) {

    //var text = ""
    var text by rememberSaveable { mutableStateOf("") }

    Column(modifier) {
        Text(
            text = "I love Android!",
            fontSize = 40.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Android is fun!",
            fontSize = 30.sp,
            color = Color.Red,
            fontStyle = FontStyle.Italic
        )


        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter Message") }
        )

        Button(onClick = {
            println("Show Message Button Pressed !!!")
            println(text)
        })
        {
            Text("Show Message")
        }


    }

}

