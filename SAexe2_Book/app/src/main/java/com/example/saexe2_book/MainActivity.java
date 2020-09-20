package com.example.saexe2_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSearchButtonClicked(View view) {
        /*
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);

         */

        Intent intent = new Intent(this, ResultActivity.class);
        EditText keywordText = findViewById(R.id.keywordText);
        intent.putExtra("QUERY", keywordText.getText().toString());
        startActivity(intent);

    }

    public void onAddbookButtonClicked(View view) {
        Intent intent = new Intent(this, Add_Bookinfo.class);
        startActivity(intent);
    }
}
