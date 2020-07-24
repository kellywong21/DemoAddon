package sg.edu.rp.c347.demoaddon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ZoomageView myZoomageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myZoomageView = findViewById(R.id.myZoomageView);
        String imageURL = "https://i.pinimg.com/originals/e0/c0/2f/e0c02f58c47dd7d80561be121d746f7d.jpg";
        Picasso.with(this).load(imageURL).into(myZoomageView);
    }
}
