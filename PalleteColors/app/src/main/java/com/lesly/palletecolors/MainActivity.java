package com.lesly.palletecolors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbr_Red = null;
    private SeekBar sbr_green = null;
    private SeekBar sbr_blue = null;
    private SeekBar sbr_alpha = null;
    private SeekBar vie_colors = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbr_Red = findViewById(R.id.sbrRed);
        sbr_green = findViewById(R.id.sbrGreen);
        sbr_blue = findViewById(R.id.sbrBlue);
        sbr_alpha = findViewById(R.id.sbrAlpha);
        //vie_colors = findViewById(R.id.vieColors);
    }

    //show options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //Actions options menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.iteAboutOF :
                Toast.makeText(this, "you've pressed About of option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iteHelp :
                Toast.makeText(this, "you've pressed Help option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iteExit :
                Toast.makeText(this, "you've pressed exit option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iteSearch :
                Toast.makeText(this, "you've pressed search option", Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}