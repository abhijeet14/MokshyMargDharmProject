package com.jain.mokshymargdharm;

import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ListAdapter;

import java.util.ArrayList;


public class Technique4Activity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView planets_list;
    RecyclerView.LayoutManager layout_manager;
    CollapsingToolbarLayout collapsing_container;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       // String[] bhagwanCharitraArray = {"      भारतीय जीवन-धारा में जिन ग्रन्थों का महत्वपूर्ण स्थान है उनमें पुराण भक्ति ग्रंथों के रूप में बहुत महत्वपूर्ण माने जाते हैं। पुराण साहित्य भारतीय जीवन और साहित्य की अक्षुण्ण निधि हैं। इनमें मानव जीवन के उत्कर्ष और अपकर्ष की अनेक गाथाएँ मिलती हैं। कर्मकांड से ज्ञान की ओर आते हुए भारतीय मानस चिंतन के बाद भक्ति की अविरल धारा प्रवाहित हुई है। विकास की इसी प्रक्रिया में बहुदेववाद और निर्गुण ब्रह्म की स्वरूपात्मक व्याख्या से धीरे-धीरे मानस अवतारवाद या सगुण भक्ति की ओर प्रेरित हुआ। अठारह पुराणों में अलग-अलग देवी-देवताओं को केन्द्र मानकर पाप और पुण्य, धर्म और अधर्म, कर्म, और अकर्म की गाथाएँ कही गई हैं", "Canada Data", "Dubai Data", "Hong Kong Data", "Iceland Data", "India Data", "Kenya Data", "London Data", "Switzerland Data", "Sydney Data"};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique4);
        toolbar = (Toolbar) findViewById(R.id.technique_four_toolbar);
        planets_list = (RecyclerView) findViewById(R.id.days_list_4);

        collapsing_container = (CollapsingToolbarLayout) findViewById(R.id.collapsing_container);
        layout_manager = new LinearLayoutManager(this);
        planets_list.setLayoutManager(layout_manager);


        adapter = new RecyclerViewAdapter(getResources().getStringArray(R.array.days_names));
        planets_list.setAdapter(adapter);

        setSupportActionBar(toolbar);
        collapsing_container.setTitle(getResources().getString(R.string.title_activity_technique4));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
