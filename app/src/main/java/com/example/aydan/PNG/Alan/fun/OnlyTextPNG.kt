package com.example.aydan


import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aydan.data.CardDescriptionPNG
import com.example.aydan.data.InformationStory
import com.example.aydan.data.ListDescription
import com.example.aydan.ui.theme.AydanTheme
/*
@Composable
fun CustomTextField() {
    val cyberPunkTextFieldColors = TextFieldDefaults.textFieldColors(
        textColor = Color.Black,
        backgroundColor = Color.Red,
        focusedIndicatorColor = Color.Cyan,
        unfocusedIndicatorColor = Color.Gray,
        cursorColor = Color.Cyan,
        placeholderColor = Color.Gray
    )
    val textState = remember { mutableStateOf("") }

    TextField(
        value = textState.value,
        onValueChange = { newText -> textState.value = newText },
        colors = cyberPunkTextFieldColors,
        modifier = Modifier.fillMaxWidth()
        // Altre proprietà personalizzate per il tuo front-end di scrittura
    )
}*/


@Composable
fun OnlyTextPNG(longText: CardDescriptionPNG, modifier: Modifier = Modifier) {

    val expanded = remember {
        mutableStateOf(false)
    }
    val down = painterResource(id = R.drawable.arrow_down)
    val up = painterResource(id = R.drawable.arrow_up)


    Card(
        elevation = 3.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 10.dp)
            .padding(4.dp),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(2.dp, colorResource(id = R.color.gold))

    ) {


        Row(
            modifier = Modifier
                .padding(10.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )

                )
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp)
            ) {
                Text(
                    text = longText.title,
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier
                        .padding(),
                    color = colorResource(id = R.color.light_grey)
                )
               // CustomTextField()

                //--- testo ripetuto ll interno della tendina
                if (expanded.value) {
                    Text(
                        text = longText.body,
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Monospace,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(
                            start = 10.dp,
                            end = 10.dp,
                            top = 20.dp,
                            bottom = 8.dp
                        ),
                        color = colorResource(id = R.color.black)
                    )
                }
                //------
            }

            //--- bottone con la freccetta che va su e giu
            IconButton(onClick = { expanded.value = !expanded.value }) {
                Icon(
                    painter = if (expanded.value) down else up,
                    contentDescription = null
                )
            }
            //-------
        }

    }

}


@Preview
@Composable
fun Preview() {
    AydanTheme {
        InformationStory(message = ListDescription.description)


    }
}