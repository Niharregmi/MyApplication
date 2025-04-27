package com.example.firstkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

class DashboardDesign : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold { innerPadding->
                DesignHeader(innerPadding)
            }
        }
    }

}

@Composable
fun DesignHeader(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(Color.Green),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(15.dp),
            horizontalArrangement = Arrangement.End

        ) {

            Button(onClick = {
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green
                )
            )
            {
                Image(
                    painter = painterResource(R.drawable.babal),
                    contentDescription = "Profile",

                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(30.dp)
                        .clip(RoundedCornerShape(30.dp))
                )
            }

        }
        Row {
            Column (
                modifier = Modifier.padding(
                        horizontal = 10.dp,
                        vertical = 15.dp))
            {
                Text(text = "Card",
                    style =  TextStyle(
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold)
                )
                Text(text = "Simple and easy to use app",
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color.White
                    )
                )
            }
        }


        Spacer(modifier = Modifier.height(40.dp))

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
        ) {

            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),


                    ) { Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Image(
                        painter = painterResource(R.drawable.book),

                        contentDescription = null, contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(RoundedCornerShape(50.dp))
                            .padding(20.dp)

                    )
                    Text(text = "Text",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(text = "so this is the text",
                        modifier = Modifier.alpha(0.6f),
                        style = TextStyle(
                            fontSize = 10.sp,
                        )
                    )           }
                }

                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            painter = painterResource(R.drawable.address),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Address",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Address",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f)
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            painter = painterResource(R.drawable.character),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Character",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Character",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            // Image ko namm rakhda jaile lower case ma hunu parxa
                            painter = painterResource(R.drawable.atm),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Bank Card",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the Bank Card",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }

            // 5th Row
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Card(
                    modifier = Modifier.height(160.dp).weight(1f)
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            // Image ko namm rakhda jaile lower case ma hunu parxa
                            painter = painterResource(R.drawable.password),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Password",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the password ",
                            Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }}
                Spacer(modifier = Modifier.width(20.dp))


                Card(
                    modifier = Modifier.height(160.dp).weight(1f),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(
                            painter = painterResource(R.drawable.logistic),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .clip(RoundedCornerShape(50.dp))
                                .padding(20.dp)

                        )
                        Text(text = "Logistic",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(text = "so this is the logistic ",
                            modifier = Modifier.alpha(0.6f),
                            style = TextStyle(
                                fontSize = 10.sp,
                            )
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row  {
                Card(
                    modifier = Modifier.height(70.dp).weight(1f),
                ){
                    Row (
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, top = 15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            painter = painterResource(R.drawable.settings),

                            contentDescription = null, contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clip(RoundedCornerShape(50.dp))


                        )

                        Column {
                            Text(text = "Setting",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold

                                )
                            )
                            Text(text = "So this is the setting  ",
                                modifier = Modifier.alpha(0.6f),
                                style = TextStyle(
                                    fontSize = 10.sp,)
                            )
                        }

                    }
                }
            }

        }

    }
}


@Preview
@Composable
fun PreviewDesign(){
    DesignHeader(innerPadding = PaddingValues(0.dp))
}