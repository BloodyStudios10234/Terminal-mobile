package com.example.termuxclone;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import jackpal.androidterm.emulatorview.EmulatorView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EmulatorView terminalView = new EmulatorView(this);
        terminalView.setTextSize(14);
        terminalView.setUseCookedInput(true);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(terminalView);

        setContentView(layout);

        // Basit komut yazdırma (örnek)
        terminalView.getTermSession().write("echo Merhaba Termux Klonu!\n");
    }
}
