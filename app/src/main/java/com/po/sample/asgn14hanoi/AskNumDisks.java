package com.po.sample.asgn14hanoi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.po.sample.asgn14hanoi.MainActivity;
import com.po.sample.asgn14hanoi.R;

public class AskNumDisks extends AppCompatActivity{

    public EditText numDisks;
    public Button enter;
    public TextView ask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        numDisks = (EditText) findViewById(R.id.input);
        enter = (Button) findViewById(R.id.button);
        ask=(TextView)findViewById(R.id.textView);
        enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //When the button is clicked
                try {
                    String val = numDisks.getText().toString();
                    MainActivity.TOTAL_DISK = Integer.parseInt(val);
                    setContentView(R.layout.activity_main);
                    startActivity();
                } catch (NumberFormatException n) {
                    System.err.println("Input is not a whole  number.");
                }
            }
        });

    }
    public void startActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
