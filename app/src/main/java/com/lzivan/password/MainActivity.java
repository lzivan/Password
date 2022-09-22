package com.lzivan.password;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText onePass;
    private EditText twoPass;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onePass = findViewById(R.id.passone);
        twoPass = findViewById(R.id.passtwo);
        result = findViewById(R.id.label);

    }

    public void checkBtn(View view){

       if (onePass.getText().toString().equals(twoPass.getText().toString())){
           result.setText("THANK YOU");
       }else{
           result.setText("PASSWORDS MUST MATCH");
       }
    }

}