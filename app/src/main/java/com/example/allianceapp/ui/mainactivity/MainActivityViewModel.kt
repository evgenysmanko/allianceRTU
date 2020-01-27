package com.example.allianceapp.ui.mainactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var mText: MutableLiveData<String>? = null

    fun MainActivityViewModel() {
        mText = MutableLiveData()
        mText!!.value = "Главная"
    }

    fun getText(): LiveData<String>? {
        return mText
    }
}
