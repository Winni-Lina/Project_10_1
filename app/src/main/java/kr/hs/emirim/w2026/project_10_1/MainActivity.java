package kr.hs.emirim.w2026.project_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.radiogroup);
        Button btnOpen = findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(btnOpenListener);
    }

    View.OnClickListener btnOpenListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch(rg.getCheckedRadioButtonId()){
                case R.id.rs:
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                    break;
                case R.id.rt:
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
}