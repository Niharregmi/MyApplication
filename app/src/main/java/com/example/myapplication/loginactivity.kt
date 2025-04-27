package com.example.myapplication

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class loginactivity : ComponentActivity(){
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //This is the base (Scaffold)
            Scaffold { innerpadding ->
                LoginHeader(innerpadding)
                // Innerpadding le chai top ra bottom ma space kaam ho

                //Modifier is a decoration property
                //fillMaxSize, fillmaxheight, fillmaxwidth
                //is auto for every size of mobile phone

                Column (
                    modifier = Modifier
                        .padding(innerpadding)
                        .fillMaxSize()
                        .background(color = Color.Red)
                ){
                }
            }
        }
    }
}

@Composable
fun LoginHeader(innerpadding: PaddingValues) {

    Column(
        modifier = Modifier
            .padding(innerpadding)
            .fillMaxSize()
            .background(color = Color.White)
    ) {


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            //method 1
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,

                tint = Color.Black,

                modifier = Modifier.height(30.dp).width(30.dp),
            )

            Text(
                text = "Ishowspeed",
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,//Bold chai fontweight ma hunxa
                    fontStyle = FontStyle.Normal
                )
            )

            //method2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.spped),
                contentDescription = null,
                Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(shape = RoundedCornerShape(50.dp))
            )
            Column {
                Text(text = "15")
                Text(text = "Post")
            }
            Column {
                Text(text = "100M")
                Text(text = "Followers")
            }
            Column {
                Text(text = "15M")
                Text(text = "Following")
            }

        }

        Text(
            text = "Mero nam darren watkins ho ma" +
                    " ohio ma baschu ra ma ronaldo ko kattar fan ho.",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,//Bold chai fontweight ma hunxa
            fontStyle = FontStyle.Normal

        )
        Column(modifier = Modifier.padding(horizontal = 10.dp, vertical = 15.dp)) {
            Text(
                "Darren Watkins", style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    fontSize = 15.sp
                )
            )
            Text("Athlete", modifier = Modifier.alpha(0.5f))
            Text("Youtuber")
            Text("Ishowspeed@gmail.com")
            Text("Followed by Cristiano and NeymarJr")


        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Button(
                onClick = {
                    //user le button click thiche paxi k garne to-do when clicked
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text("Follow")
            }


            OutlinedButton(
                onClick = {
                    //user le button click thiche paxi k garne to-do when clicked
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Text("Message")
            }


            OutlinedButton(
                onClick = {
                    //user le button click thiche paxi k garne to-do when clicked
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Text("Email")
            }


            OutlinedButton(
                onClick = {
                    //user le button click thiche paxi k garne to-do when clicked
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null
                )

            }

        }
    }

}
@Preview
@Composable
fun Previewbody(){
    LoginHeader(innerpadding = PaddingValues(0.dp))
}

@Composable
fun LoginBody(){

}
@Composable
fun LoginFooter(){

}
