package id.k.bismillahdadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity  implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn_HotelHewan = findViewById(R.id.btnHotelHewanUtama);
        btn_HotelHewan.setOnClickListener(this);

        Button btn_Grooming = findViewById(R.id.btnGrooming);
        btn_Grooming.setOnClickListener(this);

        Button btn_Petshop = findViewById(R.id.btnPetShoop);
        btn_Petshop.setOnClickListener(this);

        Button btn_Profil = findViewById(R.id.btnProfil);
        btn_Profil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnHotelHewanUtama:
                Intent moveIntent = new Intent(menu.this, hotelhewan.class);
                startActivity(moveIntent);
                break;
            case R.id.btnGrooming:
                moveIntent = new Intent(menu.this, grooming.class);
                startActivity(moveIntent);
                break;
            case R.id.btnPetShoop:
                moveIntent = new Intent(menu.this, petshop.class);
                startActivity(moveIntent);
                break;

            case R.id.btnProfil:
                Intent moveWithDataIntent = new Intent(menu.this, profil.class);
                moveWithDataIntent.putExtra(profil.EXTRA_NAME, "Muhammad Imam Fauzi");
                moveWithDataIntent.putExtra(profil.EXTRA_NIM, "2017150113");
                startActivity(moveWithDataIntent);
                break;
        }
    }
}