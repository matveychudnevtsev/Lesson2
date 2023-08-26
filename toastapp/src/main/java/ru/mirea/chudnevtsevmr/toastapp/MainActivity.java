package ru.mirea.chudnevtsevmr.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ptInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ptInput = findViewById(R.id.ptInput);
    }

    public void onToastClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Студент No 25, Группа БСБО-06-21, Количество символов: " + ptInput.getText().length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}