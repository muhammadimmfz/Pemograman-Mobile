package id.k.bismillahdadi;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class profil extends AppCompatActivity {
    public static final String EXTRA_NIM = "extra_nim";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);


        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String nim = getIntent().getStringExtra(EXTRA_NIM);
        String text = "Name : " + name + ",\nNIM : " + nim;
        tvDataReceived.setText(text);
    }
}