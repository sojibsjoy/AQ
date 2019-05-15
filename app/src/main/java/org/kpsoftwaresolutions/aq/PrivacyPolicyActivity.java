package org.kpsoftwaresolutions.aq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class PrivacyPolicyActivity extends AppCompatActivity {

    AdView mAdViewP1;
    AdView mAdViewP2;
    AdView mAdViewP3;
    AdView mAdViewP4;
    AdView mAdViewP5;
    AdView mAdViewP6;
    AdView mAdViewP7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);


        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdViewP1 = findViewById(R.id.adViewP1);
        mAdViewP2 = findViewById(R.id.adViewP2);
        mAdViewP3 = findViewById(R.id.adViewP3);
        mAdViewP4 = findViewById(R.id.adViewP4);
        mAdViewP5 = findViewById(R.id.adViewP5);
        mAdViewP6 = findViewById(R.id.adViewP6);
        mAdViewP7 = findViewById(R.id.adViewP7);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewP1.loadAd(adRequest);
        mAdViewP2.loadAd(adRequest);
        mAdViewP3.loadAd(adRequest);
        mAdViewP4.loadAd(adRequest);
        mAdViewP5.loadAd(adRequest);
        mAdViewP6.loadAd(adRequest);
        mAdViewP7.loadAd(adRequest);
    }
}
