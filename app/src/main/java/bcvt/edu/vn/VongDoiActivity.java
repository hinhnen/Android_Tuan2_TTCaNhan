package bcvt.edu.vn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class VongDoiActivity extends AppCompatActivity {

    EditText txtName, txtCMND;
    RadioButton rbTrungCap, rbCaoDang, rbDaiHoc;
    CheckBox cbDocBao, cbDocSach, cbDocCode;
    EditText txtTTBS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txt_name);
        txtCMND = findViewById(R.id.txt_cmnd);
        rbCaoDang=findViewById(R.id.rbt_caodang);
        rbDaiHoc=findViewById(R.id.rbt_daihoc);
        rbTrungCap=findViewById(R.id.rbt_trungcap);
        cbDocBao=findViewById(R.id.cb_docbao);
        cbDocSach=findViewById(R.id.cb_docsach);
        cbDocCode=findViewById(R.id.cb_doccode);
        txtTTBS = findViewById(R.id.txt_ttBS);
        Log.d("msg", "1. onCreate");
    }

    public void onStart(){
        super.onStart();
        Log.d("msg", "2. onStart");
    }

    public void onResume(){
        super.onResume();
        Log.d("msg", "3. onResume");
    }

    public void onPause(){
        super.onPause();
        Log.d("msg", "4. onPause");
    }

    public void onStop(){
        super.onStop();
        Log.d("msg", "5. Stop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d("msg", "6. Stop");
    }
}
