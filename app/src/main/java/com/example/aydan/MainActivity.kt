package com.example.aydan


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aydan.ui.theme.AydanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AydanTheme {
                AlanRustof(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun AlanRustof(modifier: Modifier = Modifier){
    BackGroung()
    AllInformationPNG(
        stringResource(R.string.alan),
        stringResource(R.string.rustof)
    )
}


@Preview
@Composable
fun PreviewUI() {
    AydanTheme {
        AlanRustof(modifier = Modifier.fillMaxSize())
    }
}
