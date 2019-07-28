package com.example.transition;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter  {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;


    }


    //  Arrays

    public int[] slide_images ={
       //     R.drawable.tdlogo,
       //     R.drawable.tdlogo,
            //   R.drawable.tdlogo

    };

    public Integer[] slide_indicator ={
            R.drawable.page1,
            R.drawable.page2,
           R.drawable.page3

    };

    public String[] slide_headings={
            "Who are we ?",
            "What we do ?",
            "How we do it ?"
    };
    public String[] slide_desc={
            "Transition Digitale was founded in Port-au-prince" +
                    " in 2015 by Carly Baja and Jules Walter. " +
                    "Today, we’re headquartered in Port-au-Prince," +
                    " with our staff and clients around the globe.",
            "Today, we maintain a robust consulting " +
                    "practice offering security services, " +
                    "custom software engineering, ecommerce " +
                    "development, and infrastructure support.",
            "That's why we begin every project with a workshop crafting a one-of-a-kind, " +
                    "unique strategy that is designed to help you win."

    };
    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        //ImageView slideImageView = (ImageView) view.findViewById(R.id.ivLogo);
        TextView slideTitle = (TextView) view.findViewById(R.id.tvTitle);
        TextView slideDesc = (TextView) view.findViewById(R.id.tvDescription);
        ImageView slideInd = (ImageView) view.findViewById(R.id.ivSlideIndicator);

        //slideImageView.setImageResource(slide_images[position]);
        slideTitle.setText(slide_headings[position]);
        slideDesc.setText(slide_desc[position]);
        slideInd.setImageResource(slide_indicator[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
