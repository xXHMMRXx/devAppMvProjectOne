package com.mx.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText edt;
    int numOne, numSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edt = (EditText) findViewById(R.id.editText2);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt.getText().toString().length() != 0){

                    Bundle param = getIntent().getExtras();
                    numOne = Integer.parseInt(param.getString("numOne"));
                    numSecond = Integer.parseInt(String.valueOf(edt.getText()));

                    Intent intent = new Intent(view.getContext(), Main3Activity.class);
                    intent.putExtra("numOne", String.valueOf(numOne));
                    intent.putExtra("numSecond", String.valueOf(numSecond));
                    startActivity(intent);
                    finish();


                } else {

                    toast();
                }

            }
        });

    }

    public void toast(){
        Toast.makeText(this, "*** Por favor ingrese un número ***", Toast.LENGTH_LONG).show();
    }
}
