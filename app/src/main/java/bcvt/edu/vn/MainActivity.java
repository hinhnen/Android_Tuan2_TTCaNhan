package bcvt.edu.vn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtName, txtCMND;
    private RadioButton rbTrungCap, rbCaoDang, rbDaiHoc;
    private CheckBox cbDocBao, cbDocSach, cbDocCode;
    private EditText txtTTBS;
    private Button btnThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControl();
        setEvent();
    }

    private void setControl(){
        txtName = findViewById(R.id.txt_name);
        txtCMND = findViewById(R.id.txt_cmnd);
        rbCaoDang=findViewById(R.id.rbt_caodang);
        rbDaiHoc=findViewById(R.id.rbt_daihoc);
        rbTrungCap=findViewById(R.id.rbt_trungcap);
        cbDocBao=findViewById(R.id.cb_docbao);
        cbDocSach=findViewById(R.id.cb_docsach);
        cbDocCode=findViewById(R.id.cb_doccode);
        txtTTBS = findViewById(R.id.txt_ttBS);
        btnThongTin=findViewById(R.id.btn_gui);
    }

    private void setEvent(){
        btnThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienthi();
            }

        });
    }

    private void hienthi(){
        String msg = "";

        msg = "Họ tên : " + String.valueOf(txtName.getText()) +"\n" + "CMND : " + String.valueOf(txtCMND.getText()) +"\n";

        if(rbTrungCap.isChecked()){
            msg += "\nBằng cấp : " + rbTrungCap.getText();
        }
        if(rbCaoDang.isChecked()){
            msg += "\nBằng cấp : " + rbCaoDang.getText();
        }
        if(rbDaiHoc.isChecked()){
            msg += "\nBằng cấp : " + rbDaiHoc.getText();
        }

        msg += "\nSở thích : ";
        if(cbDocBao.isChecked()) {
            msg += "\n" + cbDocBao.getText();
        }
        if(cbDocSach.isChecked()) {
            msg += "\n" + cbDocSach.getText();
        }
        if(cbDocCode.isChecked()) {
            msg += "\n" + cbDocCode.getText();
        }

        msg += "\n----------\nThông tin bổ sung : \n" + String.valueOf(txtTTBS.getText())+"\n----------\n";

        Toast.makeText(MainActivity.this, "guithongtin", Toast.LENGTH_SHORT).show();
        Log.d("msg", "guithongtin");

        Intent intent = new Intent(this, NhanThongTin.class);
        intent.putExtra("msg", msg);
        startActivity(intent);
    }
}
