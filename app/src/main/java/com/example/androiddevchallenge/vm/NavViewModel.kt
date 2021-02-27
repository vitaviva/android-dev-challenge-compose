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