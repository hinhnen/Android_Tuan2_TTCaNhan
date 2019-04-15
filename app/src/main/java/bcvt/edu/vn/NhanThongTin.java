package bcvt.edu.vn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NhanThongTin extends AppCompatActivity {

    TextView tvThongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_thong_tin);
        tvThongtin = findViewById(R.id.tvThongTin);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        tvThongtin.setText(msg);
    }

    protected void onThoat(){
        finish();
    }
}
