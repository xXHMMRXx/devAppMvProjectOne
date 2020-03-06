package com.mx.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    TextView tv, tv2;
    int numThird, numSecond, numOne, operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tv = (TextView) findViewById(R.id.textView4);
        tv2 = (TextView) findViewById(R.id.textView5);

        Bundle param = getIntent().getExtras();
        numOne = Integer.parseInt(param.getString("numOne"));
        numSecond = Integer.parseInt(param.getString("numSecond"));
        numThird = Integer.parseInt(param.getString("numThird"));
        operacion = (numOne * numSecond) - numThird;
        tv.setText("Resultado: "+operacion);
        tv2.setText("Operación: ("+param.getString("numOne") +" * "+param.getString("numSecond")+") -"+param.getString("numThird"));

        Button btn = (Button) findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }

}
