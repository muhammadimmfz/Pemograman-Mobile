package id.k.bismillahdadi;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

import id.k.bismillahdadi.R;
import id.k.bismillahdadi.daftar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Daftar = findViewById(R.id.btnDaftar);
        btn_Daftar.setOnClickListener(this);

        Button btn_Masuk = findViewById(R.id.btnMasuk);
        btn_Masuk.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDaftar:
                Intent moveIntent = new Intent(MainActivity.this, daftar.class);
                startActivity(moveIntent);
                break;

            case R.id.btnMasuk:
                moveIntent = new Intent(MainActivity.this, masuk.class);
                startActivity(moveIntent);
                break;



        }
    }
}