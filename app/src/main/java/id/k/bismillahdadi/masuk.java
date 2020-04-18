package id.k.bismillahdadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class masuk extends AppCompatActivity  implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);

        Button btn_Login = findViewById(R.id.btnLogin);
        btn_Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                Intent moveIntent = new Intent(masuk.this, menu.class);
                startActivity(moveIntent);
                break;
        }
    }
}