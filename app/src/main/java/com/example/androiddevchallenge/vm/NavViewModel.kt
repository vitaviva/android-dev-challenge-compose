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
package com.example.androiddevchallenge.vm

import androidx.annotation.MainThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.Screen

class NavViewModel : ViewModel() {

    private val _screen = MutableLiveData<Screen>(Screen.HomeScreen)

    var curScreen: LiveData<Screen> = _screen

    @MainThread
    fun onBack(): Boolean {
        if (_screen.value != Screen.HomeScreen) {
            _screen.value = Screen.HomeScreen
            return true
        }
        return false
    }

    @MainThread
    fun navigateToDetail(puppy: Puppy) {
        _screen.value = Screen.DetailsScreen(puppy)
    }
}
