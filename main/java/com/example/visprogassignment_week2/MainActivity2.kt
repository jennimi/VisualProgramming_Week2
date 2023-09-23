package com.example.visprogassignment_week2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogassignment_week2.ui.theme.VisProgAssignment_Week2Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProgAssignment_Week2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListProductView()
                }
            }
        }
    }
}

@Composable
fun ListProduct() {
    Column {
        Header (
            image1 = painterResource(id = R.drawable.arrowback),
            text = "Your Cart",
            image2 = painterResource(id = R.drawable.menu)
        )

        ProductItem (
            imageBurger = R.drawable.burger1,
            smalltitle = "Krabby Patty",
            bigtitle = "Plant Based Whopper",
            desc = "Rate- \uD83D\uDC68\u200D\uD83C\uDF73 Spicy Level-5/10",
            price = "Rp. 12.000",
            quantity = "8"
        )

        ProductItem (
            imageBurger = R.drawable.burger2,
            smalltitle = "Krabby Patty",
            bigtitle = "Extra Spicy Chicken Burger",
            desc = "Rate- \uD83C\uDF36️ Spicy Level-10/10",
            price = "Rp. 36.000",
            quantity = "5"
        )

        ProductItem (
            imageBurger = R.drawable.burger3,
            smalltitle = "Krabby Patty",
            bigtitle = "BBQ Beef Rasher",
            desc = "Rate- \uD83D\uDC4D️ Spicy Level-7/10",
            price = "Rp. 30.000",
            quantity = "2"
        )

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 10.dp), // Set bottom padding to 0.dp
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text (
                    text = "Delivery Charges",
                    fontSize = 15.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )
                Text (
                    text = "Free Delivery",
                    fontSize = 15.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(
                        textDecoration = TextDecoration.Underline
                    ),
                    color = Color.DarkGray
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.Gray)
            ) {

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text (
                    text = "Total Amount",
                    fontSize = 15.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )
                Text (
                    text = "Rp. 78.000",
                    fontSize = 15.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    color = Color.DarkGray
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.Gray)
            ) {

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .border(1.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                        .background(Color.White)
                ) {
                    Text (
                        text = "Rp. 78.000",
                        fontSize = 18.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 10.dp)
                    )
                }
                Box(
                    modifier = Modifier
                        .background(Color.Black, shape = RoundedCornerShape(16.dp))

                ) {
                    Text (
                        text = "Continue",
                        fontSize = 18.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(start = 50.dp, top = 10.dp, end = 50.dp, bottom = 10.dp)
                    )
                }
            }

        }



    }
}

@Composable
fun ProductItem (
    imageBurger: Int,
    smalltitle: String,
    bigtitle: String,
    desc: String,
    price: String,
    quantity: String
) {
    Column (
        modifier = Modifier
            .padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 0.dp)
    ) {
        Row(
        ) {
            Image(
                painter = painterResource(id = imageBurger),
                contentDescription = "Image Burger",
                modifier = Modifier
                    .size(140.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
                    .fillMaxSize()
                    .aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column() {
                Text(
                    text = smalltitle,
                    fontSize = 12.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal
                )
                Text(
                    text = bigtitle,
                    fontSize = 16.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = desc,
                    fontSize = 11.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = price,
                    fontSize = 11.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.SemiBold
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.plus),
                            modifier = Modifier.size(12.dp),
                            contentDescription = "Image Compose"
                        )
                        Text(
                            text = quantity,
                            fontSize = 13.sp,
                            fontFamily = poppins,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(3.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.remove),
                            modifier = Modifier.size(12.dp),
                            contentDescription = "Image Compose"
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.cancel),
                        modifier = Modifier.size(18.dp),
                        contentDescription = "Image Compose"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.Gray)
        ) {

        }
    }

}


@Composable
fun Menu() {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListProductView() {
    VisProgAssignment_Week2Theme {
        ListProduct()
    }
}