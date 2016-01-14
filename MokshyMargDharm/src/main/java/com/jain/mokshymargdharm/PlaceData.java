package com.jain.mokshymargdharm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class PlaceData {
    public static String[] placeNameHindiArray = {"आदिनाथ", "अजितनाथ", "संभवनाथ", "अभिनंदन", "सुमतिनाथ", "पद्मप्रभु", "सुपार्श्वनाथ", "चन्द्रप्रभु", "पुष्पदंत", "शीतलनाथ", "श्रेयांशनाथ", "वाँसुपूज्य", "विमलनाथ", "अनंतनाथ", "धर्मनाथ", "शांतिनाथ", "कुंथुनाथ", "अरहनाथ", "मल्लिनाथ", "मुनिसुव्रतनाथ", "नमिनाथ", "नेमिनाथ", "पार्श्वनाथ", "महावीर"};
    public static String[] placeNameArray = {"adinathji", "ajitnath", "sambhavnath", "abhinandan", "sumatinath", "padmaprabhu", "suparshvnath", "chandraprabhu", "pushpdant", "sheetalnath","shreyanshnath", "vansupujya", "vimalnath", "anantnath", "dharmanath", "shantinath", "kunthunath", "arahnathji", "mallinath", "munisuvrat", "naminath", "neminath", "parshvnath", "mahaveer"};
    public static String[] bhagwanCharitraArray = {"आदिनाथ", "अजितनाथ", "संभवनाथ", "अभिनंदन", "सुमतिनाथ", "पद्मप्रभु", "सुपार्श्वनाथ", "चन्द्रप्रभु", "पुष्पदंत", "शीतलनाथ", "श्रेयांशनाथ", "वाँसुपूज्य", "विमलनाथ", "अनंतनाथ", "धर्मनाथ", "शांतिनाथ", "कुंथुनाथ", "अरहनाथ", "मल्लिनाथ", "मुनिसुव्रतनाथ", "नमिनाथ", "नेमिनाथ", "पार्श्वनाथ", "महावीर"};
    //public static String bhagwanData

    public static ArrayList<Place> placeList() {
        ArrayList<Place> list = new ArrayList<Place>();
        for (int i = 0; i < placeNameArray.length; i++) {
            Place place = new Place();
            place.name = placeNameHindiArray[i];
            place.bhagwanCharitra = bhagwanCharitraArray[i];
            place.imageName = placeNameArray[i].replaceAll("\\s+", "").toLowerCase();
            if (i == 2 || i == 24) {
                place.isFav = true;
            }
            list.add(place);
        }
        return (list);
    }

    /*public static void setBhagwanData(String fromData){
        bhagwanData = fromData;
    }
    */
}
