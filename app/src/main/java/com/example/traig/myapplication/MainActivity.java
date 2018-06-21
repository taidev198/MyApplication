package com.example.traig.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.traig.myapplication.activity.OtherActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Thanh Tai Nguyen";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call intent 
//                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"));
//                startActivity(i);
//                
                //transfer data between activities
//                Intent i = new Intent(getBaseContext(),OtherActivity.class);
//                i.putExtra("Value1","thanh tai nguyen");
//                i.putExtra("Value2","nguyen thanh tai");
//                startActivityForResult(i,1);
                
                
            }
        });
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
      
        if (resultCode == Activity.RESULT_OK && requestCode == 1){
//            if (data.hasExtra("returnKey1"))
//                Toast.makeText(getBaseContext(),data.getExtras().toString(),Toast.LENGTH_LONG).show();
            Bundle extras = data.getExtras();
            if (extras != null){
                Toast.makeText(getBaseContext(),extras.getString("returnKey1"),Toast.LENGTH_LONG).show();
            }
        }
       
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressed: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    public void finish() {
        Log.d(TAG, "finish: ");
        super.finish();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");
    }

}
