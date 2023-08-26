package ru.mirea.chudnevtsevmr.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String TAG = SecondActivity.class.getSimpleName().toString();
    private TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvOut = findViewById(R.id.tvOut);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String text = extras.getString("ptInput");
            tvOut.setText(text);
            Log.d(TAG, text);
        }
    }
}