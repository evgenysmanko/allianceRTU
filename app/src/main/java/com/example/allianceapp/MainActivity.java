package com.example.allianceapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.api.sdk.utils.VKUtils;
import java.util.Arrays;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] fingerprints = VKUtils.getCertificateFingerprint(this, this.getPackageName());
        System.out.println(Arrays.asList(fingerprints));
    }
}
