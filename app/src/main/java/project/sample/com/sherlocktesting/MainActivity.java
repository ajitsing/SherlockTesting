package project.sample.com.sherlocktesting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.singhajit.sherlock.crashes.activity.CrashListActivity;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void crashList(View view) {
    startActivity(new Intent(this, CrashesActivity.class));
  }

  public void crash(View view) {
    throw new RuntimeException("test");
  }
}
