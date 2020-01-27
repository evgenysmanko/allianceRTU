package com.example.allianceapp.ui.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsViewModel : ViewModel() {

    private val mText: MutableLiveData<String> = MutableLiveData()

    val text: LiveData<String>
        get() = mText

    init {
        mText.value = "Сборные"
    }
}