package com.mx.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText edt;
    int numThird, numSecond, numOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edt = (EditText) findViewById(R.id.editText3);

        Button btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt.getText().toString().length() != 0){

                    numThird = Integer.parseInt(String.valueOf(edt.getText()));
                    Bundle param = getIntent().getExtras();
                    numSecond = Integer.parseInt(param.getString("numSecond"));
                    numOne = Integer.parseInt(param.getString("numOne"));

                    Intent intent = new Intent(view.getContext(), Main5Activity.class);
                    intent.putExtra("numOne", String.valueOf(numOne));
                    intent.putExtra("numSecond", String.valueOf(numSecond));
                    intent.putExtra("numThird", String.valueOf(numThird));

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
