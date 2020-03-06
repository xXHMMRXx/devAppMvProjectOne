package com.mx.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = (EditText)findViewById(R.id.editText);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edt.getText().toString().length() != 0){

                    Intent intent = new Intent(view.getContext(), Main2Activity.class);
                    intent.putExtra("numOne", edt.getText().toString());
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
