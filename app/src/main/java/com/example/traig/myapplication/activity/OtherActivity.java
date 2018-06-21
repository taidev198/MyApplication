package com.example.traig.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.traig.myapplication.R;

public class OtherActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private static final int REQUEST_OK = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }
    @Override
    public void finish() {
//prepare data intent

        Intent data = new Intent();
        data.putExtra("returnKey1","thanh tai nguyen");
        data.putExtra("returnKey2","nguyen thanh tai");
        setResult(RESULT_OK,data);
        super.finish();
    }

}
