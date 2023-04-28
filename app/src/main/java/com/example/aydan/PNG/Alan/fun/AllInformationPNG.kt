package com.example.aydan

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aydan.data.InformationStory
import com.example.aydan.data.ListDescription

@Composable
fun AllInformationPNG(name: String, surname: String, modifier: Modifier = Modifier) {

    val imageAlanh = painterResource(id = R.drawable.alan_rustof)
    val back = painterResource(id = R.drawable.arrow_back)

    val dualColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0x92FFB600),
                Color(0xA5A4A4)
            )
        )
    }
    val cornice = 4.dp
    /**
     * BOTTONE da implementare
     */
    Box() {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(all = 10.dp)
        ) {
            Icon(
                contentDescription = null,
                painter = back
            )

        }
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 14.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text(
                    text = name,
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Monospace,
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .padding(top = 24.dp, end = 10.dp),
                )
                Text(
                    text = surname,
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Monospace,
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .padding(top = 24.dp, start = 10.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                contentDescription = null,
                painter = imageAlanh,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .border(
                        BorderStroke(cornice, dualColorsBrush),
                        CircleShape
                    )
                    .padding(cornice)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.height(20.dp))

            InformationStory(message = ListDescription.description)
        }
    }
}

