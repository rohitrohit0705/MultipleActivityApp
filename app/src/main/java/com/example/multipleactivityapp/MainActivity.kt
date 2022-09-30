package com.example.multipleactivityapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyGridScope
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multipleactivityapp.ui.theme.MultipleActivityAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleActivityAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProductDesign()
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProductDesign() {
    val productList = arrayListOf(
        Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        ), Product(
            1,
            R.drawable.ic_launcher_background,
            88,
            "Android"
        )


    )
    Design(list = productList)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Design(list: ArrayList<Product>) {
    Column {
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            content = {
                items(list.size) { index ->
                    val product = list[index]
                    SingleProductDesign(product)
                }
            }
        )
    }
}