package com.lzivan.password;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private PassCheck pcheck;
    private EditText onePass;
    private EditText twoPass;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pcheck = new PassCheck("","");
        onePass = findViewById(R.id.passone);
        twoPass = findViewById(R.id.passtwo);
        result = findViewById(R.id.label);

    }

    public void checkBtn(View view){

       pcheck.setPone(onePass.getText().toString());
       pcheck.setPtwo(twoPass.getText().toString());

       if (pcheck.compare()){
           result.setText("THANK YOU");
       }else{
           result.setText("PASSWORDS MUST MATCH");
       }
    }

}