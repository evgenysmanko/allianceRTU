package com.example.allianceapp.ui.sportclub;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SportclubViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SportclubViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Спортклуб");
    }

    public LiveData<String> getText() {
        return mText;
    }
}