/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.DetailScreen
import com.example.androiddevchallenge.ui.HomeScreen
import com.example.androiddevchallenge.ui.Screen
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.vm.NavViewModel

class MainActivity : AppCompatActivity() {

    val vm: NavViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp(vm)
            }
        }
    }

    override fun onBackPressed() {
        if (!vm.onBack()) {
            super.onBackPressed()
        }
    }
}

// Start building your app here!
@Composable
fun MyApp(vm: NavViewModel) {
    val curScreen by vm.curScreen.observeAsState(Screen.HomeScreen)

    Crossfade(curScreen) {
        Surface(color = MaterialTheme.colors.background) {

            when (curScreen) {
                is Screen.HomeScreen -> HomeScreen(vm)
                is Screen.DetailsScreen -> DetailScreen((curScreen as Screen.DetailsScreen).puppy)
            }

        }
    }

}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp(NavViewModel())
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp(NavViewModel())
    }
}

