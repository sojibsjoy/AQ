package org.kpsoftwaresolutions.aq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class CompanyActivity extends AppCompatActivity {

    AdView mAdViewC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);


        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdViewC = findViewById(R.id.adViewC);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewC.loadAd(adRequest);

    }
    private void connect2web(String s) {
        Uri uri = Uri.parse(s); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void KPWebsite(View view) {
        connect2web("https://www.kpsoftwaresolutions.org/");
    }

    public void KPFacebook(View view) {
        connect2web("https://www.facebook.com/kpsoftwaresolutions/");
    }

    public void KPLinkedIn(View view) {
        connect2web("https://www.linkedin.com/in/kp-software-solutions-8455a5144/");
    }

    public void KPPlayStore(View view) {
        connect2web("https://play.google.com/store/apps/dev?id=7174269229329822451");
    }

    public void KPTwitter(View view) {
        connect2web("https://twitter.com/kpsoft_soln");
    }

}
