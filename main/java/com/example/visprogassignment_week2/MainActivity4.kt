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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogassignment_week2.ui.theme.VisProgAssignment_Week2Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisProgAssignment_Week2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileView()
                }
            }
        }
    }
}

@Composable
fun ProfileAgainAgain() {
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(0.25f)
                .fillMaxWidth()
                .background(color = Color(0xFF1019CE))
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrowbackwhite),
                    modifier = Modifier.padding(20.dp),
                    contentDescription = "Back Arrow"
                )
                Text(
                    text = "Profile",
                    fontSize = 23.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Image(
                    painter = painterResource(id = R.drawable.penwhite),
                    modifier = Modifier.padding(20.dp),
                    contentDescription = "Edit Button"
                )
            }
            Row (
                modifier = Modifier
                    .padding(start = 50.dp, end = 50.dp, top = 20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Karyna Budi S",
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "College Student",
                        fontSize = 15.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }
                Image (
                    painter = painterResource(id = R.drawable.karynasquare),
                    modifier = Modifier
                        .size(90.dp)
                        .clip(CircleShape),
                    contentDescription = "Profile Photo"
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(16.dp),
                        ambientColor = Color.LightGray
                    )
            ) {
                Column (
                    modifier = Modifier
                        .padding(20.dp)
                        .background(Color.White)
                    // for some reason it won't be fully white? i can't fix it for the life of me :(
                ) {
                    Text(
                        text = "Personal Data",
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Gray)
                    ) {}
                    Spacer(modifier = Modifier.height(20.dp))
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            DetailData(
                                detailtext = "NIM",
                                datatext = "0706012210016"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            DetailData(
                                detailtext = "Occupation",
                                datatext = "Student"
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Column {
                            DetailData(
                                detailtext = "Date of Birth",
                                datatext = "1 June 2004"
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            DetailData(
                                detailtext = "Marital Status",
                                datatext = "Not Married"
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    DetailData(
                        detailtext = "Email",
                        datatext = "ksanjaya04@student.ciputra.ac.id"
                    )
                }
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp)
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(16.dp),
                        ambientColor = Color.Gray
                    )
            ) {
                Column (
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Expertise",
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Gray)
                    ) {}
                    Spacer(modifier = Modifier.height(10.dp))
                    DetailExpertise(
                        image = painterResource(id = R.drawable.karynasquare),
                        text = "Delulu"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    DetailExpertise(
                        image = painterResource(id = R.drawable.karynasquare),
                        text = "Overthinking literally everything"
                    )
                }
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 20.dp)
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .shadow(
                        elevation = 2.dp,
                        shape = RoundedCornerShape(16.dp),
                        ambientColor = Color.Gray
                    )
            ) {
                Column (
                    modifier = Modifier
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Send a Message",
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Gray)
                    ) {}
                    Spacer(modifier = Modifier.height(20.dp))
                    Column (
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box (
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(1.dp, Color.Gray, shape = RoundedCornerShape(20.dp))
                        ) {
                            Text (
                                text = "Write a Message",
                                fontSize = 13.sp,
                                fontFamily = poppins,
                                fontWeight = FontWeight.Normal,
                                color = Color.Gray,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Box (
                            modifier = Modifier
                                .background(Color(0xFF1019CE), shape = RoundedCornerShape(20.dp))
                                .padding(start = 20.dp, end = 20.dp)
                        ) {
                            Text (
                                text = "Send",
                                fontSize = 16.sp,
                                fontFamily = poppins,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(10.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DetailExpertise(image:Painter, text:String) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(top = 10.dp, start = 15.dp)
    ) {
        Image (
            painter = image,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            contentDescription = "Kinda lazy to find square photos"
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text (
            text = text,
            fontSize = 14.sp,
            fontFamily = poppins,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun DetailData(detailtext:String, datatext:String) {
    Column {
        Text (
            text = detailtext,
            fontSize = 14.sp,
            fontFamily = poppins,
            fontWeight = FontWeight.Normal
        )
        Text (
            text = datatext,
            fontSize = 15.sp,
            fontFamily = poppins,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = "spec: width=1080px ,height=2800px")
@Composable
fun ProfileView() {
    VisProgAssignment_Week2Theme {
        ProfileAgainAgain()
    }
}