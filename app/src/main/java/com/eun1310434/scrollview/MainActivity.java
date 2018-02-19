
/**
 * 19.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 */

package com.eun1310434.scrollview;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;
    int check = 0;

    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = (ScrollView) findViewById(R.id.scrollView);
        imageView = (ImageView) findViewById(R.id.imageView);

        scrollView.setHorizontalScrollBarEnabled(true);

        //리소스 접근
        res = getResources();
        changeImage();
    }

    public void onButtonClicked(View v) {
        //android:onClick="onButtonClicked"
        changeImage();
    }

    private void changeImage() {
        if(check == 0){
            check = 1;
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        }else{
            check = 0;
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image02);
        }
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

}
