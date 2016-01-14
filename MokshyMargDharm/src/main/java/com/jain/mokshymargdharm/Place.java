package com.jain.mokshymargdharm;

import android.content.Context;

public class Place {

    public String name;
    public String bhagwanCharitra;
    public String imageName;
    public boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}
