package reyhan.com.walisongo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class detailWaliActivity extends AppCompatActivity {

    TextView tvNamaWali, tvDetailWali;
    int ID_WALI;
    ImageView ivWali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wali);


        tvNamaWali = findViewById(R.id.tv_namaSunan);
        tvDetailWali = findViewById(R.id.tv_Deskripsi);
        ivWali = findViewById(R.id.ivfoto);

        ID_WALI = getIntent().getIntExtra("KEY_ID", 0);
        if (ID_WALI == 0) {
            tvNamaWali.setText(getString(R.string.sGresik));
            tvDetailWali.setText(getString(R.string.sGresikDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunangresik));

        } else if (ID_WALI == 1) {
            tvNamaWali.setText(getString(R.string.sAmpel));
            tvDetailWali.setText(getString(R.string.sAmpelDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunanampel));

        } else if (ID_WALI == 2) {
            tvNamaWali.setText(getString(R.string.sBonang));
            tvDetailWali.setText(getString(R.string.sBonangDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunanbonang));

        } else if (ID_WALI == 3) {
            tvNamaWali.setText(getString(R.string.sDerajat));
            tvDetailWali.setText(getString(R.string.sDerajatDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunandrajat));

        } else if (ID_WALI == 4) {
            tvNamaWali.setText(getString(R.string.sGiri));
            tvDetailWali.setText(getString(R.string.sGiriDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunangiri));

        } else if (ID_WALI == 5) {
            tvNamaWali.setText(getString(R.string.sGunungjati));
            tvDetailWali.setText(getString(R.string.sGunungjatiDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.gunungjati));

        } else if (ID_WALI == 6) {
            tvNamaWali.setText(getString(R.string.sKalijaga));
            tvDetailWali.setText(getString(R.string.sKalijagaDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunankalijaga));

        } else if (ID_WALI == 7) {
            tvNamaWali.setText(getString(R.string.sKudus));
            tvDetailWali.setText(getString(R.string.sKudusDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunankudus));

        } else if (ID_WALI == 8) {
            tvNamaWali.setText(getString(R.string.sMuria));
            tvDetailWali.setText(getString(R.string.sMuriaDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.sunanmuria));
        }
    }
}