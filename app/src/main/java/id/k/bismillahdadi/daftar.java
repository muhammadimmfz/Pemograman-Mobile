package id.k.bismillahdadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftar extends AppCompatActivity  implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        Button btn_Daftar = findViewById(R.id.btnDaftar);
        btn_Daftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDaftar:
                Intent moveIntent = new Intent(daftar.this, menu.class);
                startActivity(moveIntent);
                break;
        }
    }
}
