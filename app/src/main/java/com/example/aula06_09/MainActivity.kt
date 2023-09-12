package com.example.aula06_09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula06_09.ui.theme.Aula0609Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula0609Theme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.coringao),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(16.dp),
        )

        Button(
            onClick = { message = "Debug: Esta é uma mensagem de debug." },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black, // Cor de fundo preta
                contentColor = Color.White // Cor do texto branca
            )
        ) {
            Text(text = "Debug")
        }

        Button(
            onClick = { message = "Info: Esta é uma mensagem de informações." },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black, // Cor de fundo preta
                contentColor = Color.White // Cor do texto branca
            )
        ) {
            Text(text = "Info")
        }

        Button(
            onClick = { message = "Warning: Esta é uma mensagem de aviso." },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Black, // Cor de fundo preta
                contentColor = Color.White // Cor do texto branca
            )
        ) {
            Text(text = "Warning")
            Surface() {
                
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = message,
            color = Color.Black,
            style = MaterialTheme.typography.body1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Aula0609Theme {
        MainScreen()
    }
}