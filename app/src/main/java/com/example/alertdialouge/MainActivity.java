package com.example.alertdialouge;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout CL;
    AlertDialog.Builder adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CL = (ConstraintLayout) findViewById(R.id.CL);
    }

    public void firstBtnClicked(View view)
    {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Header");
        adb.setMessage("Hello");
        AlertDialog ad = adb.create();
        ad.show();
    }

    public void secondButtonClicked(View view)
    {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Header");
        adb.setMessage("Hello");
        adb.setIcon(R.drawable.ic_launcher_background);

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void thirdButtonClicked(View view)
    {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Header");
        adb.setMessage("Hello");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void fourthButtonClicked(View view)
    {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Header");
        adb.setMessage("Hello");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        adb.setNegativeButton("Change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Random color = new Random();
                CL.setBackgroundColor(Color.argb(255, color.nextInt(255), color.nextInt(255), color.nextInt(255)));            }
        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void fifthButtonClicked(View view)
    {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Header");
        adb.setMessage("Change the color of the screen");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setNeutralButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                dialogInterface.cancel();
            }
        });

        adb.setPositiveButton("Change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Random color = new Random();
                CL.setBackgroundColor(Color.argb(255, color.nextInt(255), color.nextInt(255), color.nextInt(255)));            }
        });

        adb.setNegativeButton("Back to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                CL.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent si = new Intent(this, MainActivity2.class);
        startActivity(si);
        return super.onOptionsItemSelected(item);
    }
}