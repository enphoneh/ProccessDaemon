package proccessdaemon.aven.com.proccessdaemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Watcher watcher = new Watcher(this);
        watcher.createAppMonitor("com.aven.proccess");
    }
}
