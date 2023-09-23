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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogassignment_week2.ui.theme.VisProgAssignment_Week2Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProgAssignment_Week2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RegisterView()
                }
            }
        }
    }
}

@Composable
fun RegisterAgain() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFD7DCE0))
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.arrowback),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            contentDescription = "Back Arrow"
        )
        Column (
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image (
                painter = painterResource(id = R.drawable.svtlogo),
                modifier = Modifier
                    .size(150.dp)
                    .padding(bottom = 20.dp),
                contentDescription = "Back Arrow",
            )
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = Color(0xFF232122),
                    shape = RoundedCornerShape(topStart = 90.dp, topEnd = 90.dp)
                )
        ) {
            Text (
                text = "Create New Account",
                fontSize = 20.sp,
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                textAlign = TextAlign.Center
            )
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(topStart = 90.dp, topEnd = 90.dp)
                    )
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 120.dp, end = 120.dp, top = 20.dp)
                        .fillMaxWidth()
                ) {
                    Image (
                        painter = painterResource(id = R.drawable.facebooklogo),
                        modifier = Modifier
                            .size(50.dp)
                            .padding(10.dp),
                        contentDescription = "Facebook Logo",
                    )
                    Image (
                        painter = painterResource(id = R.drawable.twitterlogo),
                        modifier = Modifier
                            .size(50.dp)
                            .padding(10.dp),
                        contentDescription = "Twitter Logo",
                    )
                    Image (
                        painter = painterResource(id = R.drawable.googlelogo),
                        modifier = Modifier
                            .size(50.dp)
                            .padding(10.dp),
                        contentDescription = "Google Logo",
                    )
                }
                Text (
                    text = "or use your email account",
                    fontSize = 16.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Medium,
                    color = Color.DarkGray,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )
                Column (
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text (
                        text = "Name",
                        fontSize = 16.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, Color.Gray, shape = RoundedCornerShape(16.dp))
                            .background(Color.White)
                    ) {
                        Text (
                            text = "Ex: Jane Doe",
                            fontSize = 16.sp,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp),
                        )
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text (
                        text = "Email",
                        fontSize = 16.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Box (
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, Color.Gray, shape = RoundedCornerShape(16.dp))
                            .background(Color.White)

                    ) {
                        Text (
                            text = "Ex: janedoe@example.com",
                            fontSize = 16.sp,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp),
                        )
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text (
                        text = "Password",
                        fontSize = 16.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, Color.Gray, shape = RoundedCornerShape(16.dp))
                            .background(Color.White),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text (
                            text = "Enter Password",
                            fontSize = 16.sp,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray,
                            modifier = Modifier
                                .padding(15.dp),
                        )
                        Image (
                            painter = painterResource(id = R.drawable.visibility),
                            modifier = Modifier.padding(10.dp),
                            contentDescription = "Haha"
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column (
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box (
                        modifier = Modifier
                            .background(Color.Black, shape = RoundedCornerShape(20.dp))
                    ) {
                        Text (
                            text = "Register",
                            fontSize = 20.sp,
                            fontFamily = poppins,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            modifier = Modifier
                                .padding(start = 30.dp, end = 30.dp, top = 10.dp, bottom = 10.dp)
                        )
                    }
                    Text (
                        text = "Already have an Account?",
                        fontSize = 16.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Normal,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .padding(top = 15.dp)
                    )
                    Text (
                        text = "Login Here",
                        fontSize = 18.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.DarkGray,
                        modifier = Modifier
                            .padding(5.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = "spec: width=1080px ,height=2400px")
@Composable
fun RegisterView() {
    VisProgAssignment_Week2Theme {
        RegisterAgain()
    }
}