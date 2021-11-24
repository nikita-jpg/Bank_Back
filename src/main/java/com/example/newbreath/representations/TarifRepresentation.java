package com.example.newbreath.representations;

public class TarifRepresentation {
    public String getMathExpression(int tarifIndex){
        //x - количество денег, y - количество лет
        String ret = "-1";

        switch (tarifIndex){
            //(50 000*4,7*365):100
            case 0:
                ret = "(x*2.57*(y*365)/365)/100+x";
                break;
            case 1:
                ret = "(x*3.33*(y*365)/365)/100+x";
                break;
            case 2:
                ret = "(x*4.117*(y*365)/365)/100+x";
                break;
            default:
                return "-1";
        }
        return ret;
    }
}
