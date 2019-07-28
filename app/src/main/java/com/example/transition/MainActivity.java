package com.example.transition;

import android.content.Intent;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewPager mSlideViewpager;
    private LinearLayout mDotLayout;

    private SliderAdapter sliderAdapter;

    private TextView[] mDots;
    private TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlideViewpager = findViewById(R.id.slideViewpager);
        // nmDotLayout = (LinearLayout) findViewById(R.id.dotsControl);


        sliderAdapter = new SliderAdapter(this);
        skip = findViewById(R.id.tvSkip);
        //addDotsIndicator(0);
        mSlideViewpager.setAdapter(sliderAdapter);
        mSlideViewpager.addOnPageChangeListener(viewListener);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Clients.class);
                startActivity(intent);

            }
        });


    }


    public void addDotsIndicator(int position){
       mDots = new TextView[3];

        for(int i=0;i < mDots.length;i++){
           // mDots[i]= new TextView(this);
           // mDots[i].setText(Html.fromHtml("&#183"));
            //mDots[i].setTextSize(35);
            //mDots[i].setTextColor(getResources().getColor(R.color.colorWhite));
            //mDotLayout.addView(mDots[i]);
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

           // addDotsIndicator(i);

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
