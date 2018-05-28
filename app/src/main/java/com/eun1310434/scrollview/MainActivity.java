/*=====================================================================
□ INFORMATION
  ○ Data : 28.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ FUNCTION
  ○

□ STUDY
  ○ ScrollView
     - A view group that allows the view hierarchy placed within it to be scrolled.
       Scroll view may have only one direct child placed within it.
       To add multiple views within the scroll view, make the direct child you add
       a view group,
       for example LinearLayout, and place additional views within that LinearLayout.
       Scroll view supports vertical scrolling only. For horizontal scrolling,
       use HorizontalScrollView instead.
       Never add a RecyclerView or ListView to a scroll view.
       Doing so results in poor user interface performance and a poor user experience.

=====================================================================*/
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
