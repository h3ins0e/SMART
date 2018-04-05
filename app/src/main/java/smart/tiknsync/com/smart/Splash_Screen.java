package smart.tiknsync.com.smart;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {

    private static int SPLASH_TIME = 3000;
    ImageView ivSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash__screen);

        ivSplash = findViewById(R.id.ivSplash);
        ivSplash.setImageResource(R.drawable.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME);
    }
}
