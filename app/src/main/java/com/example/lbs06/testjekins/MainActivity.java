package com.example.lbs06.testjekins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.btn_tag_view).setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()){
      case R.id.btn_tag_view:
        String channel=Util.getAppMetaData(this,"UMENG_CHANNEL");
        Toast.makeText(this,channel,Toast.LENGTH_LONG).show();
        break;
    }
  }
}
