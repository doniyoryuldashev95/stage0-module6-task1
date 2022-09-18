package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        String yesOrNo = "";
        String pawsOrPaw = "";
        if(hasFur){
            yesOrNo = " a ";
        } else {
            yesOrNo = " no ";
        }
        if (numberOfPaws>1){
            pawsOrPaw=" paws ";
        } else {
            pawsOrPaw=" paw ";
        }
        String newString = "This animal is mostly "+this.color+". It has "+this.numberOfPaws+pawsOrPaw+"and"+yesOrNo+ "fur.";
        return newString;
    }
}
