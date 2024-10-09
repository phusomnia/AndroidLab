package phusomnia.androidlab;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivityJ extends AppCompatActivity{
    // Cach 1
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        ImageView myImageView = new ImageView(this);
//        myImageView.setImageResource(R.drawable.logo__padoru);
//        setContentView(myImageView);
//    }

    // Cach 2
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
