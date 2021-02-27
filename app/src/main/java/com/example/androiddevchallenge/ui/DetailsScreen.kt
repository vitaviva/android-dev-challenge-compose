package com.example.androiddevchallenge.ui

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lens
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.DemoDataProvider
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DetailScreen(puppy: Puppy) {

    var showDialogState by remember { mutableStateOf(false) }
    var adoptSuccess by remember { mutableStateOf(false) }

    if (showDialogState) {
        ShowDialog(puppy) {
            adoptSuccess = it
            showDialogState = false
        }
    }

    val pageState = remember {
        PagerState().apply {
            minPage = 0
            maxPage = (puppy.images.size - 1).coerceAtLeast(0)
        }
    }
    Column {
        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            puppy.images.forEachIndexed { index, _ ->
                CarouselDot(
                    selected = index == pageState.currentPage,
                    Icons.Filled.Lens
                )
            }
        }

        Pager(state = pageState, modifier = Modifier.weight(1f)) {
            Card(
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .padding(start = 18.dp, end = 18.dp, top = 16.dp, bottom = 16.dp)
                    .fillMaxSize()
                    .shadow(20.dp)
            ) {
                Image(
                    bitmap = ImageBitmap.imageResource(id = puppy.images[page]),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }

        }

        Column(Modifier.padding(start = 20.dp, end = 16.dp)) {
            Row {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "My name is ${puppy.name}!",
                    style = typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.size(1.dp))

                Image(
                    modifier = Modifier
                        .size(20.dp)
                        .align(Alignment.CenterVertically),
                    colorFilter = ColorFilter.tint(puppy.sex.color),
                    imageVector = puppy.sex.label, contentDescription = null
                )
            }

            Divider(modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp))
            Column(modifier = Modifier.padding(8.dp)) {
                Row(modifier = Modifier.padding(top = 3.dp)) { ProfileItem("Age", puppy.age) }
                Row(modifier = Modifier.padding(top = 3.dp)) { ProfileItem("Breed", puppy.breed) }
                Row(modifier = Modifier.padding(top = 3.dp)) { ProfileItem("Color", puppy.color) }
            }
        }

        if (adoptSuccess) {
            var scaleUp by remember { mutableStateOf(false) }
            val scale by animateFloatAsState(
                if (scaleUp) 1.1f else 0.9f,
                finishedListener = { scaleUp = !scaleUp },
                animationSpec = spring(stiffness = Spring.StiffnessLow)
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .scale(scale = scale),
                bitmap = ImageBitmap.imageResource(id = R.drawable.congurtulations),
                contentDescription = "congratulations"
            )
        } else {
            Button(
                onClick = { showDialogState = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "I love ${puppy.name}")
            }

        }

    }


}

@Composable
private fun ProfileItem(key: String, value: String) {
    Text(
        key, modifier = Modifier.width(70.dp),
        fontWeight = FontWeight.Bold
    )
    Text(value, fontWeight = FontWeight.Light)
}

@Composable
fun CarouselDot(selected: Boolean, icon: ImageVector) {
    Icon(
        imageVector = icon,
        modifier = Modifier
            .padding(4.dp)
            .size(12.dp),
        contentDescription = null,
        tint = if (selected) Color.Gray else Color.LightGray
    )
}


@Composable
fun ShowDialog(puppy: Puppy, onDismiss: (Boolean) -> Unit) {
    AlertDialog(
        title = { Text(text = "Take ${puppy.name} home?", style = typography.h6) },
        text = {
            Column {
                Text(puppy.story, modifier = Modifier.padding(bottom = 8.dp))
            }
        },
        buttons = {

            Row {

                OutlinedButton(
                    onClick = { onDismiss(false) },
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                ) {
                    Text(text = "Cancel")
                }
                Button(
                    onClick = { onDismiss(true) },
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                ) {
                    Text(text = "Ok")
                }

            }

        },
        onDismissRequest = { onDismiss(false) }
    )

}


@Preview
@Composable
fun PreviewDetails() {
    val puppy = DemoDataProvider.Edison
    MyTheme {
        DetailScreen(puppy = puppy)
    }
}
