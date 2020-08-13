package reyhan.com.walisongo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CarouselView carouselView;
    int[] listImage = {R.drawable.gunungjati, R.drawable.sunanampel, R.drawable.sunanbonang, R.drawable.sunandrajat, R.drawable.sunangiri, R.drawable.sunangresik, R.drawable.sunankalijaga, R.drawable.sunankudus, R.drawable.sunanmuria};
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(listImage[position]);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.lv_Wali);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "POSISI YANG DI TEKAN = " + position, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, detailWaliActivity.class)
                        .putExtra("KEY_ID", position));


            }
        });

        carouselView = findViewById(R.id.crView);
        carouselView.setPageCount(listImage.length);
        carouselView.setImageListener(imageListener);
    }

}
