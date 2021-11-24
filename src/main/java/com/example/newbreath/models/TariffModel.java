package com.example.newbreath.models;

import static com.example.newbreath.NewbreathApplication.STRING_ARRAY;

public class TariffModel {
    private String tariffNumber;

    public int getTariffNumber(String tarifServerName){
        int index = -1;
        for(int i=0;i<STRING_ARRAY.length;i++){
            if(STRING_ARRAY[i].equals(tarifServerName)){
                index = i;
            }
        }
        return index;

    }
}


