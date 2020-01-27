package com.example.allianceapp.ui.sportclub

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SportclubViewModel : ViewModel() {

    var mText: MutableLiveData<String>? = null

    fun SportclubViewModel() {
        mText = MutableLiveData()
        mText!!.value = "ССК Альянс"
    }

    fun getText(): LiveData<String>? {
        return mText
    }
}