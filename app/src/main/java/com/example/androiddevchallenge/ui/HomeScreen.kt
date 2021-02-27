package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.vm.NavViewModel
import com.example.androiddevchallenge.data.DemoDataProvider
import com.example.androiddevchallenge.data.Puppy


@Composable
fun HomeScreen(vm: NavViewModel) = VerticalListView(vm)


@Composable
private fun VerticalListView(vm: NavViewModel) {
    val list = remember { DemoDataProvider.puppyList }
    val bannerList = remember { DemoDataProvider.banner }
    val bannerLstState = rememberLazyListState()
    val onClickItem: (Puppy) -> Unit = remember { { vm.navigateToDetail(it) } }
    LazyColumn {
        item {
            BannerView(bannerLstState, bannerList, onClickItem)
        }
        items(list.size) { index ->
            val puppy = list[index]
            VerticalListItem(puppy = puppy, onClick = onClickItem)
            ListItemDivider()

        }
    }
}


@Composable
private fun ListItemDivider() {
    Divider(
        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
    )
}

