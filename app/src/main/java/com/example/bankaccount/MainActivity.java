package com.example.bankaccount;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       editText=findViewById(R.id.editTextTextPersonName);
       BankAccount bankAccount=new BankAccount("100",210,2.58);
       editText.setText( ""+bankAccount.gettotalAmountOfMoney());
    }

}