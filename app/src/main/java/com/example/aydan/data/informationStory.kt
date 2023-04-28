package com.example.aydan.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.aydan.OnlyTextPNG

@Composable
fun InformationStory(message: List<CardDescriptionPNG>) {
    LazyColumn {
        items(message) { mex ->
            OnlyTextPNG(longText = mex)
        }
    }
}

