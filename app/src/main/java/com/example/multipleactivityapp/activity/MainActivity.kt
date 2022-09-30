package com.example.multipleactivityapp.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multipleactivityapp.R
import com.example.multipleactivityapp.SingleProductDesign
import com.example.multipleactivityapp.module.Product
import com.example.multipleactivityapp.ui.theme.MultipleActivityAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleActivityAppTheme {

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
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        ), Product(
            1,
            R.drawable.shoe_product_1,
            250,
            "Adibas"
        )


    )
    Design(list = productList)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Design(list: ArrayList<Product>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
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
