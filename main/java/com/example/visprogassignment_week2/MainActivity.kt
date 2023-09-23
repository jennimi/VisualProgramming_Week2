package com.example.visprogassignment_week2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogassignment_week2.ui.theme.VisProgAssignment_Week2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProgAssignment_Week2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DetailProductView()
                }
            }
        }
    }
}

val poppins = FontFamily(
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_semibold, FontWeight.SemiBold)
)

@Composable
fun DetailProduct() {
    Column {
        Header(
            image1 = painterResource(id = R.drawable.arrowback),
            text = "Krabby Patty",
            image2 = painterResource(id = R.drawable.menu)
        )
        Image (
            painter = painterResource(id = R.drawable.burger),
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterHorizontally),
            contentDescription = "Image Compose"
        )
        Box (
            modifier = Modifier
                .size(10.dp)
                .background(Color(0xFF273443), shape = RoundedCornerShape(16.dp))
                .clip(CircleShape)
                .align(Alignment.CenterHorizontally)
        ) {}
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = Color(0xFF273443),
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
                )
        ) {
            Column {
                Text (
                    text = "King Box Cheesy Beef Burger",
                    fontSize = 22.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    modifier = Modifier.padding(20.dp)
                )
                Row (
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image (
                        painter = painterResource(id = R.drawable.star),
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .size(30.dp),
                        contentDescription = "Star"
                    )
                    Text (
                        text = "5.0",
                        fontSize = 17.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        modifier = Modifier.padding(start = 10.dp)
                    )

                    Text (
                        text = "(684 Reviews)",
                        fontSize = 15.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
                Text (
                    text = "Cheesy Beef Burger + 1 pc Ayam Crispy + Nasi + Coke Regular, + Spider-Verse Toys : Brooklyn Sky Scrapper + Super Float Coke",
                    fontSize = 20.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    modifier = Modifier.padding(start = 20.dp, top = 10.dp)
                )
                Text (
                    text = "Read More...",
                    fontSize = 20.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    modifier = Modifier.padding(start = 20.dp),
                    style = TextStyle(
                        textDecoration = TextDecoration.Underline
                    )
                )
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, top = 70.dp, end = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text (
                        text = "Rp. 40,909",
                        fontSize = 25.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .padding(5.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text (
                            text = "Add to Cart",
                            fontSize = 23.sp,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Header(image1: Painter, text: String, image2: Painter) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = image1,
            modifier = Modifier.padding(20.dp),
            contentDescription = "Back Arrow"
        )
        Text(
            text = text,
            fontSize = 25.sp,
            fontFamily = poppins,
            fontWeight = FontWeight.SemiBold
        )
        Image(
            painter = image2,
            modifier = Modifier.padding(20.dp),
            contentDescription = "Menu"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailProductView() {
    VisProgAssignment_Week2Theme {
        DetailProduct()
    }
}