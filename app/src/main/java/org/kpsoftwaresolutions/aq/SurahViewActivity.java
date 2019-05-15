package org.kpsoftwaresolutions.aq;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class SurahViewActivity extends AppCompatActivity {

    Intent intent;
    MediaPlayer mplr;
    TextView textView;
    int no;
    String value;
    String data = "";
    StringBuffer sb;
    InputStream is;
    BufferedReader br;
    DatabaseReference dbr;
    String audioLink;
    boolean isPlaying = false;
    boolean isPlayed = false;
    boolean connected = false;

    private AdView mAdViewSF,mAdViewSL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_view);

        dbr = FirebaseDatabase.getInstance().getReference();

        checkingConnection();

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdViewSF = findViewById(R.id.adViewSF);
        mAdViewSL = findViewById(R.id.adViewSL);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewSF.loadAd(adRequest);
        mAdViewSL.loadAd(adRequest);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            value = bundle.getString("no");
            no = Integer.parseInt(value);
        }

        textView = findViewById(R.id.surahView);

        sb = new StringBuffer();

        switch (no) {
            case 1:
                is = this.getResources().openRawResource(R.raw.surah1);
                getData();
                prepareAudio(no);
                break;
            case 2:
                is = this.getResources().openRawResource(R.raw.surah2);
                getData();
                prepareAudio(no);
                break;
            case 3:
                is = this.getResources().openRawResource(R.raw.surah3);
                getData();
                prepareAudio(no);
                break;
            case 4:
                is = this.getResources().openRawResource(R.raw.surah4);
                getData();
                prepareAudio(no);
                break;
            case 5:
                is = this.getResources().openRawResource(R.raw.surah5);
                getData();
                prepareAudio(no);
                break;
            case 6:
                is = this.getResources().openRawResource(R.raw.surah6);
                getData();
                prepareAudio(no);
                break;
            case 7:
                is = this.getResources().openRawResource(R.raw.surah7);
                getData();
                prepareAudio(no);
                break;
            case 8:
                is = this.getResources().openRawResource(R.raw.surah8);
                getData();
                prepareAudio(no);
                break;
            case 9:
                is = this.getResources().openRawResource(R.raw.surah9);
                getData();
                prepareAudio(no);
                break;
            case 10:
                is = this.getResources().openRawResource(R.raw.surah10);
                getData();
                prepareAudio(no);
                break;
            case 11:
                is = this.getResources().openRawResource(R.raw.surah11);
                getData();
                prepareAudio(no);
                break;
            case 12:
                is = this.getResources().openRawResource(R.raw.surah12);
                getData();
                prepareAudio(no);
                break;
            case 13:
                is = this.getResources().openRawResource(R.raw.surah13);
                getData();
                prepareAudio(no);
                break;
            case 14:
                is = this.getResources().openRawResource(R.raw.surah14);
                getData();
                prepareAudio(no);
                break;
            case 15:
                is = this.getResources().openRawResource(R.raw.surah15);
                getData();
                prepareAudio(no);
                break;
            case 16:
                is = this.getResources().openRawResource(R.raw.surah16);
                getData();
                prepareAudio(no);
                break;
            case 17:
                is = this.getResources().openRawResource(R.raw.surah17);
                getData();
                prepareAudio(no);
                break;
            case 18:
                is = this.getResources().openRawResource(R.raw.surah18);
                getData();
                prepareAudio(no);
                break;
            case 19:
                is = this.getResources().openRawResource(R.raw.surah19);
                getData();
                prepareAudio(no);
                break;
            case 20:
                is = this.getResources().openRawResource(R.raw.surah20);
                getData();
                prepareAudio(no);
                break;
            case 21:
                is = this.getResources().openRawResource(R.raw.surah21);
                getData();
                prepareAudio(no);
                break;
            case 22:
                is = this.getResources().openRawResource(R.raw.surah22);
                getData();
                prepareAudio(no);
                break;
            case 23:
                is = this.getResources().openRawResource(R.raw.surah23);
                getData();
                prepareAudio(no);
                break;
            case 24:
                is = this.getResources().openRawResource(R.raw.surah24);
                getData();
                prepareAudio(no);
                break;
            case 25:
                is = this.getResources().openRawResource(R.raw.surah25);
                getData();
                prepareAudio(no);
                break;
            case 26:
                is = this.getResources().openRawResource(R.raw.surah26);
                getData();
                prepareAudio(no);
                break;
            case 27:
                is = this.getResources().openRawResource(R.raw.surah27);
                getData();
                prepareAudio(no);
                break;
            case 28:
                is = this.getResources().openRawResource(R.raw.surah28);
                getData();
                prepareAudio(no);
                break;
            case 29:
                is = this.getResources().openRawResource(R.raw.surah29);
                getData();
                prepareAudio(no);
                break;
            case 30:
                is = this.getResources().openRawResource(R.raw.surah30);
                getData();
                prepareAudio(no);
                break;
            case 31:
                is = this.getResources().openRawResource(R.raw.surah31);
                getData();
                prepareAudio(no);
                break;
            case 32:
                is = this.getResources().openRawResource(R.raw.surah32);
                getData();
                prepareAudio(no);
                break;
            case 33:
                is = this.getResources().openRawResource(R.raw.surah33);
                getData();
                prepareAudio(no);
                break;
            case 34:
                is = this.getResources().openRawResource(R.raw.surah34);
                getData();
                prepareAudio(no);
                break;
            case 35:
                is = this.getResources().openRawResource(R.raw.surah35);
                getData();
                prepareAudio(no);
                break;
            case 36:
                is = this.getResources().openRawResource(R.raw.surah36);
                getData();
                prepareAudio(no);
                break;
            case 37:
                is = this.getResources().openRawResource(R.raw.surah37);
                getData();
                prepareAudio(no);
                break;
            case 38:
                is = this.getResources().openRawResource(R.raw.surah38);
                getData();
                prepareAudio(no);
                break;
            case 39:
                is = this.getResources().openRawResource(R.raw.surah39);
                getData();
                prepareAudio(no);
                break;
            case 40:
                is = this.getResources().openRawResource(R.raw.surah40);
                getData();
                prepareAudio(no);
                break;
            case 41:
                is = this.getResources().openRawResource(R.raw.surah41);
                getData();
                prepareAudio(no);
                break;
            case 42:
                is = this.getResources().openRawResource(R.raw.surah42);
                getData();
                prepareAudio(no);
                break;
            case 43:
                is = this.getResources().openRawResource(R.raw.surah43);
                getData();
                prepareAudio(no);
                break;
            case 44:
                is = this.getResources().openRawResource(R.raw.surah44);
                getData();
                prepareAudio(no);
                break;
            case 45:
                is = this.getResources().openRawResource(R.raw.surah45);
                getData();
                prepareAudio(no);
                break;
            case 46:
                is = this.getResources().openRawResource(R.raw.surah46);
                getData();
                prepareAudio(no);
                break;
            case 47:
                is = this.getResources().openRawResource(R.raw.surah47);
                getData();
                prepareAudio(no);
                break;
            case 48:
                is = this.getResources().openRawResource(R.raw.surah48);
                getData();
                prepareAudio(no);
                break;
            case 49:
                is = this.getResources().openRawResource(R.raw.surah49);
                getData();
                prepareAudio(no);
                break;
            case 50:
                is = this.getResources().openRawResource(R.raw.surah50);
                getData();
                prepareAudio(no);
                break;
            case 51:
                is = this.getResources().openRawResource(R.raw.surah51);
                getData();
                prepareAudio(no);
                break;
            case 52:
                is = this.getResources().openRawResource(R.raw.surah52);
                getData();
                prepareAudio(no);
                break;
            case 53:
                is = this.getResources().openRawResource(R.raw.surah53);
                getData();
                prepareAudio(no);
                break;
            case 54:
                is = this.getResources().openRawResource(R.raw.surah54);
                getData();
                prepareAudio(no);
                break;
            case 55:
                is = this.getResources().openRawResource(R.raw.surah55);
                getData();
                prepareAudio(no);
                break;
            case 56:
                is = this.getResources().openRawResource(R.raw.surah56);
                getData();
                prepareAudio(no);
                break;
            case 57:
                is = this.getResources().openRawResource(R.raw.surah57);
                getData();
                prepareAudio(no);
                break;
            case 58:
                is = this.getResources().openRawResource(R.raw.surah58);
                getData();
                prepareAudio(no);
                break;
            case 59:
                is = this.getResources().openRawResource(R.raw.surah59);
                getData();
                prepareAudio(no);
                break;
            case 60:
                is = this.getResources().openRawResource(R.raw.surah60);
                getData();
                prepareAudio(no);
                break;
            case 61:
                is = this.getResources().openRawResource(R.raw.surah61);
                getData();
                prepareAudio(no);
                break;
            case 62:
                is = this.getResources().openRawResource(R.raw.surah62);
                getData();
                prepareAudio(no);
                break;
            case 63:
                is = this.getResources().openRawResource(R.raw.surah63);
                getData();
                prepareAudio(no);
                break;
            case 64:
                is = this.getResources().openRawResource(R.raw.surah64);
                getData();
                prepareAudio(no);
                break;
            case 65:
                is = this.getResources().openRawResource(R.raw.surah65);
                getData();
                prepareAudio(no);
                break;
            case 66:
                is = this.getResources().openRawResource(R.raw.surah66);
                getData();
                prepareAudio(no);
                break;
            case 67:
                is = this.getResources().openRawResource(R.raw.surah67);
                getData();
                prepareAudio(no);
                break;
            case 68:
                is = this.getResources().openRawResource(R.raw.surah68);
                getData();
                prepareAudio(no);
                break;
            case 69:
                is = this.getResources().openRawResource(R.raw.surah69);
                getData();
                prepareAudio(no);
                break;
            case 70:
                is = this.getResources().openRawResource(R.raw.surah70);
                getData();
                prepareAudio(no);
                break;
            case 71:
                is = this.getResources().openRawResource(R.raw.surah71);
                getData();
                prepareAudio(no);
                break;
            case 72:
                is = this.getResources().openRawResource(R.raw.surah72);
                getData();
                prepareAudio(no);
                break;
            case 73:
                is = this.getResources().openRawResource(R.raw.surah73);
                getData();
                prepareAudio(no);
                break;
            case 74:
                is = this.getResources().openRawResource(R.raw.surah74);
                getData();
                prepareAudio(no);
                break;
            case 75:
                is = this.getResources().openRawResource(R.raw.surah75);
                getData();
                prepareAudio(no);
                break;
            case 76:
                is = this.getResources().openRawResource(R.raw.surah76);
                getData();
                prepareAudio(no);
                break;
            case 77:
                is = this.getResources().openRawResource(R.raw.surah77);
                getData();
                prepareAudio(no);
                break;
            case 78:
                is = this.getResources().openRawResource(R.raw.surah78);
                getData();
                prepareAudio(no);
                break;
            case 79:
                is = this.getResources().openRawResource(R.raw.surah79);
                getData();
                prepareAudio(no);
                break;
            case 80:
                is = this.getResources().openRawResource(R.raw.surah80);
                getData();
                prepareAudio(no);
                break;
            case 81:
                is = this.getResources().openRawResource(R.raw.surah81);
                getData();
                prepareAudio(no);
                break;
            case 82:
                is = this.getResources().openRawResource(R.raw.surah82);
                getData();
                prepareAudio(no);
                break;
            case 83:
                is = this.getResources().openRawResource(R.raw.surah83);
                getData();
                prepareAudio(no);
                break;
            case 84:
                is = this.getResources().openRawResource(R.raw.surah84);
                getData();
                prepareAudio(no);
                break;
            case 85:
                is = this.getResources().openRawResource(R.raw.surah85);
                getData();
                prepareAudio(no);
                break;
            case 86:
                is = this.getResources().openRawResource(R.raw.surah86);
                getData();
                prepareAudio(no);
                break;
            case 87:
                is = this.getResources().openRawResource(R.raw.surah87);
                getData();
                prepareAudio(no);
                break;
            case 88:
                is = this.getResources().openRawResource(R.raw.surah88);
                getData();
                prepareAudio(no);
                break;
            case 89:
                is = this.getResources().openRawResource(R.raw.surah89);
                getData();
                prepareAudio(no);
                break;
            case 90:
                is = this.getResources().openRawResource(R.raw.surah90);
                getData();
                prepareAudio(no);
                break;
            case 91:
                is = this.getResources().openRawResource(R.raw.surah91);
                getData();
                prepareAudio(no);
                break;
            case 92:
                is = this.getResources().openRawResource(R.raw.surah92);
                getData();
                prepareAudio(no);
                break;
            case 93:
                is = this.getResources().openRawResource(R.raw.surah93);
                getData();
                prepareAudio(no);
                break;
            case 94:
                is = this.getResources().openRawResource(R.raw.surah94);
                getData();
                prepareAudio(no);
                break;
            case 95:
                is = this.getResources().openRawResource(R.raw.surah95);
                getData();
                prepareAudio(no);
                break;
            case 96:
                is = this.getResources().openRawResource(R.raw.surah96);
                getData();
                prepareAudio(no);
                break;
            case 97:
                is = this.getResources().openRawResource(R.raw.surah97);
                getData();
                prepareAudio(no);
                break;
            case 98:
                is = this.getResources().openRawResource(R.raw.surah98);
                getData();
                prepareAudio(no);
                break;
            case 99:
                is = this.getResources().openRawResource(R.raw.surah99);
                getData();
                prepareAudio(no);
                break;
            case 100:
                is = this.getResources().openRawResource(R.raw.surah100);
                getData();
                prepareAudio(no);
                break;
            case 101:
                is = this.getResources().openRawResource(R.raw.surah101);
                getData();
                prepareAudio(no);
                break;
            case 102:
                is = this.getResources().openRawResource(R.raw.surah102);
                getData();
                prepareAudio(no);
                break;
            case 103:
                is = this.getResources().openRawResource(R.raw.surah103);
                getData();
                prepareAudio(no);
                break;
            case 104:
                is = this.getResources().openRawResource(R.raw.surah104);
                getData();
                prepareAudio(no);
                break;
            case 105:
                is = this.getResources().openRawResource(R.raw.surah105);
                getData();
                prepareAudio(no);
                break;
            case 106:
                is = this.getResources().openRawResource(R.raw.surah106);
                getData();
                prepareAudio(no);
                break;
            case 107:
                is = this.getResources().openRawResource(R.raw.surah107);
                getData();
                prepareAudio(no);
                break;
            case 108:
                is = this.getResources().openRawResource(R.raw.surah108);
                getData();
                prepareAudio(no);
                break;
            case 109:
                is = this.getResources().openRawResource(R.raw.surah109);
                getData();
                prepareAudio(no);
                break;
            case 110:
                is = this.getResources().openRawResource(R.raw.surah110);
                getData();
                prepareAudio(no);
                break;
            case 111:
                is = this.getResources().openRawResource(R.raw.surah111);
                getData();
                prepareAudio(no);
                break;
            case 112:
                is = this.getResources().openRawResource(R.raw.surah112);
                getData();
                prepareAudio(no);
                break;
            case 113:
                is = this.getResources().openRawResource(R.raw.surah113);
                getData();
                prepareAudio(no);
                break;
            case 114:
                is = this.getResources().openRawResource(R.raw.surah114);
                getData();
                prepareAudio(no);
                break;
        }
    }

    public void checkingConnection() {
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            connected = true;
        }
        else
            connected = false;
    }

    @Override
    public void onBackPressed() {
        if(isPlaying) {
            mplr.stop();
        }
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = new MenuInflater(getApplicationContext());
        mi.inflate(R.menu.menu_layout_audio,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.playItem:
                playAudio();
                break;
            case R.id.pauseItem:
                if(isPlayed) {
                    if(isPlaying) {
                        mplr.pause();
                        isPlaying = false;
                    }
                    else {
                        mplr.start();
                        isPlaying = true;
                    }
                }
                else {
                    playAudio();
                }
                break;

            case R.id.aboutUsItem:
                intent = new Intent(SurahViewActivity.this,CompanyActivity.class);
                startActivity(intent);
                break;

            case R.id.privacyPolicyItem:
                intent = new Intent(getApplicationContext(),PrivacyPolicyActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void getData() {

        br = new BufferedReader(new InputStreamReader(is));

        try{
            while((data = br.readLine()) != null) {
                sb.append(data).append("\n");
            }
            textView.setText(sb);
            is.close();
        } catch (IOException ex) {
            Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT).show();
        }
    }

    public void prepareAudio(final int audioNo) {

        dbr.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                audioLink = dataSnapshot.child("links").child("surah"+audioNo).getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void playAudio() {
        if (!connected) {
            Toast.makeText(getApplicationContext(), "Network not available", Toast.LENGTH_SHORT).show();
        } else {
            if (!isPlaying) {
                Toast.makeText(getApplicationContext(), "Preparing to play...", Toast.LENGTH_SHORT).show();
                mplr = new MediaPlayer();
                try {
                    mplr.setDataSource(audioLink);
                    mplr.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            mp.start();
                            isPlaying = true;
                            isPlayed = true;
                        }
                    });
                    mplr.prepare();
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "Failed to play", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
