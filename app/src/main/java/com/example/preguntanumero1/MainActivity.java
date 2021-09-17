package com.example.preguntanumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.alarmaId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alarma("alarma",8,10);
            }
        });
    }
    public void Alarma(String mensaje, int hora,int minutos ){
          Intent intent=new Intent(AlarmClock.ACTION_SET_ALARM)
                  .putExtra(AlarmClock.EXTRA_MESSAGE,mensaje)
                  .putExtra(AlarmClock.EXTRA_HOUR,hora)
                  .putExtra(AlarmClock.EXTRA_MINUTES,minutos);
          if (intent.resolveActivity(getPackageManager()) !=null){
              startActivity(intent);
          }
    }
}