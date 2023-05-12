package sg.edu.np.mad.practical2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton Follow = (ToggleButton)findViewById(R.id.button);
        User user = new User("Jesiah","Hello");
        Follow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged (CompoundButton Follow, boolean isChecked) {
                if (isChecked) {
                    Follow.setChecked(true);

                } else {
                    Follow.setChecked(false);
                }
            }
            });
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "on start!!");


    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG, "On Pause!!");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "Destroy!!");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG, "On Stop!!!");
    }
}
