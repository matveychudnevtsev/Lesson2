package ru.mirea.chudnevtsevmr.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOpenBrowserClick(View view) {
        Uri address = Uri.parse("https://www.mirea.ru");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openLinkIntent);
    }

    public void onShareDataClick(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "МИРЭА");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "ЧУДНЕВЦЕВ МАТВЕЙ РОМАНОВИЧ");
        startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
    }
}