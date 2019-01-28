package com.sc;

/**
 * Created by vvaghicharla on 1/28/2019.
 */
public class StringCalculator {

    public static void main(String[] args){

    }

    int processStringArray(String inputString){
        String an  = validateInput(inputString);
        String[] validArray = an.trim().split(" ");

        int[] intA = new int[validArray.length];
        for(int i=0; i < validArray.length; i++) {
            if (validArray[i].equalsIgnoreCase("")) {
                continue;
            }
            int num = Integer.parseInt(validArray[i]);
            if (num >= 1000) {
                num = 0;
            }
            intA[i] = num;
        }
        return arrayResult(intA);
    }

    String validateInput(String input){
        String noSpaces = input.replaceAll(" ", "");
        return noSpaces.replaceAll("[ \\[\\]\n\t\r.,;:!*?()%{/]", " ");
    }

    int arrayResult(int[] intA){
        int sum = 0;
        for(int i= 0; i < intA.length; i++){
            sum += intA[i];
        }
        return sum;
    }

}
