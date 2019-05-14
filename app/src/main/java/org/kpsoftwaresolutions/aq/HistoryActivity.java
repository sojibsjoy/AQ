package org.kpsoftwaresolutions.aq;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HistoryActivity extends AppCompatActivity {
    private AdView mAdViewH1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdViewH1 = findViewById(R.id.adViewH1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewH1.loadAd(adRequest);
    }
}
