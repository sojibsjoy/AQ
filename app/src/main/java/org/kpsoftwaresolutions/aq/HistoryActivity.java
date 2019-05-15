package org.kpsoftwaresolutions.aq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HistoryActivity extends AppCompatActivity {
    AdView mAdViewH1;
    AdView mAdViewH2;
    AdView mAdViewH3;
    AdView mAdViewH4;
    AdView mAdViewH5;
    AdView mAdViewH6;
    AdView mAdViewH7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdViewH1 = findViewById(R.id.adViewH1);
        mAdViewH2 = findViewById(R.id.adViewH2);
        mAdViewH3 = findViewById(R.id.adViewH3);
        mAdViewH4 = findViewById(R.id.adViewH4);
        mAdViewH5 = findViewById(R.id.adViewH5);
        mAdViewH6 = findViewById(R.id.adViewH6);
        mAdViewH7 = findViewById(R.id.adViewH7);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewH1.loadAd(adRequest);
        mAdViewH2.loadAd(adRequest);
        mAdViewH3.loadAd(adRequest);
        mAdViewH4.loadAd(adRequest);
        mAdViewH5.loadAd(adRequest);
        mAdViewH6.loadAd(adRequest);
        mAdViewH7.loadAd(adRequest);
    }
}
