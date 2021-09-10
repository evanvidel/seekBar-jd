package com.axweb.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarEscala;
    private TextView textResulatado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarEscala = findViewById(R.id.seekBarEscala);
        textResulatado = findViewById(R.id.textResultado);

        seekBarEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               textResulatado.setText("Progresso: " + progress + "/" + seekBar.getMax() );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
               // textResulatado.setText("onStartTrackingTouch");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //textResulatado.setText("onStopTrackingTouch");
            }
        });
    }

    public void recuperarProgresso(View view) {
        textResulatado.setText("Escolhido: " + seekBarEscala.getProgress());
    }
}