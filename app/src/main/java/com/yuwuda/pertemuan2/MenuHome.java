package com.yuwuda.pertemuan2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MenuHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_home);
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "aplikasi di mulai", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "aplikasi di stop", Toast.LENGTH_LONG).show();

    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Aplication On Restart", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "aplication On Resume", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "aplication On Destroy", Toast.LENGTH_SHORT).show();


    }
}