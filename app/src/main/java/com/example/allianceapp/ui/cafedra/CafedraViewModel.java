package com.example.allianceapp.ui.cafedra;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CafedraViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CafedraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Кафедра");
    }

    public LiveData<String> getText() {
        return mText;
    }
}