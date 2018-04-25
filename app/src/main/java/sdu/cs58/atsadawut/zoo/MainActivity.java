package sdu.cs58.atsadawut.zoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playsound(View view) {
        if (mediaPlayer != null) { //ตรวจสอบว่ามี obj. mediaplayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop(); // ถ้ามีให้หยุดเล่น
            mediaPlayer.release(); // คืน resource ที่ mediaplayer เดิมให้กับระบบ
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.horse); //สร้าง obj ที่ต้องการเล่นเสียง
        mediaPlayer.start();
    }

    public void playsound1(View view) {
        if (mediaPlayer != null) { //ตรวจสอบว่ามี obj. mediaplayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop(); // ถ้ามีให้หยุดเล่น
            mediaPlayer.release(); // คืน resource ที่ mediaplayer เดิมให้กับระบบ
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elephant); //สร้าง obj ที่ต้องการเล่นเสียง
        mediaPlayer.start();
    }

    public void playsound2(View view) {
        if (mediaPlayer != null) { //ตรวจสอบว่ามี obj. mediaplayer เล่นอยู่หรือเปล่า
            mediaPlayer.stop(); // ถ้ามีให้หยุดเล่น
            mediaPlayer.release(); // คืน resource ที่ mediaplayer เดิมให้กับระบบ
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lion); //สร้าง obj ที่ต้องการเล่นเสียง
        mediaPlayer.start();
    }

    public void clickmobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0970533255"));
        startActivity(mobileIntent);
    }//end method mobile

    public void googlemap(View view) {
        String lat = "13.216298";
        String lng = "101.056642";
        String label = "สวนสัตว์เปิดเขาเขียว";
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:" + lat + "," + lng + "("+label+")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        // mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}