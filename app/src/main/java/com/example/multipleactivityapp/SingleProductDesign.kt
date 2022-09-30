package com.example.multipleactivityapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//
//@Preview(showBackground = true,
////showSystemUi = true
//)
@Composable
fun SingleProductDesign(product: Product) {
//    val product = Product(
//        1,
//        R.drawable.ic_launcher_background,
//        88,
//        "Android"
//    )

    Column {
        Card(modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .size(150.dp, 200.dp)) {
            Column {
                Image(
                    painter = painterResource(
                        id = product.productImage
                    ),
                    contentDescription = "productImage",
                    modifier = Modifier
                        .size(130.dp, 150.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding( top = 20.dp)

                )
                Text(text = product.productName,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center)
                Text(text = product.productPrice.toString(),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center)

            }


        }
    }

}