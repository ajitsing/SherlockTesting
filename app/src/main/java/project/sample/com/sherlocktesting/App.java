package project.sample.com.sherlocktesting;

import android.app.Application;

import com.singhajit.sherlock.core.Sherlock;

/**
 * Created by Ajit on 11/09/17.
 */

public class App extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Sherlock.init(this);
  }
}
