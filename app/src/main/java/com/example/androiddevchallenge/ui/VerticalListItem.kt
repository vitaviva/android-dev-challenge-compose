package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.DemoDataProvider
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun VerticalListItem(
    modifier: Modifier = Modifier,
    puppy: Puppy,
    onClick: (puppy: Puppy) -> Unit
) {
    val typography = MaterialTheme.typography
    Row(
        modifier = Modifier
            .clickable(onClick = { onClick.invoke(puppy) })
            .padding(16.dp)
    ) {
        ItemImage(
            puppy,
            Modifier.padding(end = 16.dp)
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(puppy.name, style = typography.subtitle1)
            ItemInfo("${puppy.sex.str}, ${puppy.age}")
            ItemInfo(puppy.breed)
            ItemInfo(puppy.location)
        }
    }
}

@Composable
private fun ItemInfo(str: String) {
    Text(str, style = typography.body2, maxLines = 1, overflow = TextOverflow.Ellipsis)
}

@Composable
fun ItemImage(puppy: Puppy, modifier: Modifier = Modifier) {
    val image = ImageBitmap.imageResource(puppy.images.first())
    Image(
        bitmap = image,
        contentScale = ContentScale.Crop,
        contentDescription = null,
        modifier = modifier
            .size(120.dp, 80.dp)
            .clip(MaterialTheme.shapes.medium)
    )
}


@Preview
@Composable
fun PreviewListViewItem() {
    val puppy = DemoDataProvider.Edison
    MyTheme {
        VerticalListItem(puppy = puppy) {}
    }
}
