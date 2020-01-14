package com.example.allianceapp.ui.collecting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CollectingsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CollectingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Сборные");
    }

    public LiveData<String> getText() {
        return mText;
    }
}