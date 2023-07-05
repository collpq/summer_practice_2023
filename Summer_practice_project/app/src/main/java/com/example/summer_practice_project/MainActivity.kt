package com.example.summer_practice_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.summer_practice_project.ui.theme.Summer_practice_projectTheme
import java.sql.Driver
import java.util.Stack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                GameCover()
                InformationAboutTheGame()
                ReviewsOfTheGames()
            }
            Buttom()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Buttom(){
    Row(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .size(1000.dp, 50.dp)
            .padding(horizontal = 20.dp)
            .clip(shape = RoundedCornerShape(size = 12.dp))
            .background(color = Color(0xFFF4D144)),

            contentAlignment = Alignment.Center)

        {
            Text(text = "Install", fontSize = 17.sp, fontWeight = FontWeight(600),
                color = Color(0xFF050B18),
                fontFamily = FontFamily.SansSerif)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GameCover(){
    Column(modifier = Modifier.background(Color(0xFF050B18))) {
        Box(modifier = Modifier
        ) {
            Image(
                painter = painterResource(id = R.drawable.game_cover),
                contentDescription = "Content description for visually impaired"
            )
        }

        Column(modifier = Modifier
            .padding(bottom = 5.dp)
        ) {
            Row(modifier = Modifier
                .padding(horizontal = 30.dp)
                .offset(y = -18.dp)
            ) {

                Box(modifier = Modifier
                    .size(size = 70.dp)
                    .clip(shape = RoundedCornerShape(size = 12.dp))
                    .border(width = 2.4.dp, color = Color(0xFF1f2430), RoundedCornerShape(10.dp))
                    .background(color = Color.Black),
                    contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.dota2_logo_png),
                        contentDescription = "Content description for visually impaired",
                        modifier = Modifier
                            .size(45.dp)
                    )
                }

                Column(modifier = Modifier
                    .padding(top = 20.dp, start = 8.dp),

                    ) {
                    Text(text = "DoTA 2", fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFEEF2FB),
                        fontFamily = FontFamily.SansSerif)
                    Row(modifier = Modifier
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.stars1),
                            contentDescription = "Content description for visually impaired",
                            modifier = Modifier
                                .size(60.dp, 15.dp)
                        )
                        Box(modifier = Modifier
                            .padding(start = 3.dp, top = 2.5.dp)
                        ) {
                            Text(text="70M", fontSize = 8.5.sp, color = Color(0xFF45454D))
                        }

                    }
                }
            }

            Row(modifier = Modifier
                .padding(horizontal = 30.dp)
            ) {
                Box(modifier = Modifier
                    .clip(shape = RoundedCornerShape(size = 12.dp))
                    .background(color = Color(0x5044a9f4))
                    .size(45.dp, 18.dp),
                    contentAlignment = Alignment.Center){
                    Text(text = "MOBA", fontSize = 9.sp,
                        color = Color(0xFF44a9f4))
                }

                Box(modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .clip(shape = RoundedCornerShape(size = 12.dp))
                    .background(color = Color(0x5044a9f4))
                    .size(87.dp, 18.dp),
                    contentAlignment = Alignment.Center){
                    Text(text = "MULTIPLAYER", fontSize = 9.sp,
                        color = Color(0xFF44a9f4))

                }

                Box(modifier = Modifier
                    .clip(shape = RoundedCornerShape(size = 12.dp))
                    .background(color = Color(0x5044a9f4))
                    .size(67.dp, 18.dp),
                    contentAlignment = Alignment.Center) {
                    Text(text = "STRATEGY", fontSize = 9.sp,
                        color = Color(0xFF44a9f4))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InformationAboutTheGame(){
    Column (modifier = Modifier
        .background(Color(0xFF050B18))
        .fillMaxWidth()
        .fillMaxHeight(0.70f)
        .padding(horizontal = 30.dp, vertical = 5.dp)
        ) {

        Box(modifier = Modifier.padding(vertical = 20.dp)) {
            Text(text = "Dota 2 is a multiplayer online battle arena (MOBA) " +
                    "game which has two teams of five players compete to collectively destroy" +
                    " a large structure defended by the opposing team known as the, " +
                    "whilst defending their own.",
                fontSize = 12.sp, color = Color(0x90EEF2FB)
            )
        }

        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Row(){
                Box(contentAlignment = Alignment.Center) {
                    Box(modifier = Modifier
                        .clip(shape = RoundedCornerShape(size = 25.dp))
                        .size(240.dp, 128.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.info1),
                            contentDescription = "Content description for visually impaired",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                    Box(modifier = Modifier
                        .size(size = 48.dp)
                        .clip(CircleShape)
                        .background(color = Color(0x50FFFFFF)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.play),
                            contentDescription = "Content description for visually impaired",
                            modifier = Modifier
                                .size(17.dp)
                        )
                    }
                }
            }

            Box(modifier = Modifier
                .clip(shape = RoundedCornerShape(size = 30.dp))
                .padding(start = 10.dp)
                .size(240.dp, 128.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.info2),
                    contentDescription = "Content description for visually impaired",
                    modifier = Modifier
                        .fillMaxSize()
                    )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ReviewsOfTheGames(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF050B18))
        .padding(horizontal = 20.dp, vertical = 10.dp)
    ) {
        Box() {
            Text(text = "Reviews & Ratings", color = Color(0xFFEEF2FB))
        }

        Box(modifier = Modifier
            .offset(y = 2.dp)
        ){
            Column() {
                Row() {
                    Box(){
                        Text(text="4.9", fontSize = 40.sp,
                            fontWeight = FontWeight(800),
                            color = Color(0xFFEEF2FB))
                    }

                    Box(modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .offset(y = 10.dp)){
                        Column() {
                            Column() {
                                Image(
                                    painter = painterResource(id = R.drawable.stars2),
                                    contentDescription = "Content description for visually impaired",
                                    modifier = Modifier

                                        .size(70.dp, 20.dp)
                                )

                                Text(text = "70M Reviews", fontSize = 10.sp,
                                    color = Color(0xFF45454D)
                                )
                            }
                        }
                    }
                }
            }
        }
        
        Box(modifier = Modifier
            .background(Color(0xFF050B18))
            .padding(vertical = 10.dp)

        ) {
            Column(modifier = Modifier
                .background(Color(0xFF050B18))
                .padding()
            ){
                Row(){
                    Box()
                    {
                        Image(
                            painter = painterResource(id = R.drawable.auguste_conte),
                            contentDescription = "Content description for visually impaired",
                            modifier = Modifier
                                .padding(5.dp)
                                .size(35.dp)
                                .clip(CircleShape)
                            )
                    }
                    Box(modifier = Modifier
                        .padding(5.dp)
                    ) {
                        Column() {
                            Text(text = "Auguste Conte", fontSize = 12.sp, color = Color(0xFFFFFFFF))
                            Text(text = "February 14, 2019",
                                fontSize = 10.sp, color = Color(0x50FFFFFF))
                        }
                    }
                }

                Box(modifier = Modifier
                    .padding(start = 4.dp, top = 10.dp, bottom = 15.dp)
                    .drawBehind {
                    }
                ) {
                    Text(text = "“Once you start to learn its secrets, " +
                            "there’s a wild and exciting variety of play " +
                            "here that’s unmatched, even by its peers.”",
                        fontSize = 12.sp, color = Color(0xFFA8ADB7),
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .fillMaxWidth()
                .height(1.dp)
                .background(color = Color(0xFF1A1F29))
        )

        Box(modifier = Modifier
            .padding(top = 15.dp)

        ) {
            Column(){
                Row(){
                    Box(){
                        Image(
                            painter = painterResource(id = R.drawable.jang_marselino),
                            contentDescription = "Content description for visually impaired",
                            modifier = Modifier
                                .padding(5.dp)
                                .size(35.dp)
                                .clip(CircleShape)
                        )
                    }
                    Box(modifier = Modifier
                        .padding(5.dp)
                    ) {
                        Column() {
                            Text(text = "Jang Marcelino", fontSize = 12.sp, color = Color(0xFFFFFFFF))
                            Text(text = "February 14, 2019",
                                fontSize = 10.sp, color = Color(0x50FFFFFF)
                            )
                        }
                    }
                }

                Box(modifier = Modifier
                    .padding(start = 4.dp, top = 10.dp, bottom = 100.dp)
                ) {
                    Text(text = "“Once you start to learn its secrets, " +
                            "there’s a wild and exciting variety of play " +
                            "here that’s unmatched, even by its peers.”",
                        fontSize = 12.sp, color = Color(0xFFA8ADB7)
                    )
                }
            }
        }
    }
}