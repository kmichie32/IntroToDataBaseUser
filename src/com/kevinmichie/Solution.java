package com.kevinmichie;


import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n+1];
        for(int i=0; i <= n; i++){
            arr[i] = scanner.nextLine();
        }


       String stringWithAllUserValues = "";
        for(int j = 0; j < arr.length; j++){
           stringWithAllUserValues += (arr[j]+ " ");
        }

        String[] arrayWithAllUserValues = stringWithAllUserValues.split(" ");


        String valueHolder="";
        for(int k = 0; k < arrayWithAllUserValues.length; k++){
            if(arrayWithAllUserValues[k].contains("@gmail.com")){
                valueHolder += arrayWithAllUserValues[k-1] + " ";
            }
        }

       String[] valuesWithTheCorrectEmails = valueHolder.split(" ");
        String[] arraySwap = new String[2];
        for (int i = 0; i < valuesWithTheCorrectEmails.length; i++) {
            for (int j = 0; j < valuesWithTheCorrectEmails.length - 1; j++) {
             if (valuesWithTheCorrectEmails[j].charAt(0) > valuesWithTheCorrectEmails[j + 1].charAt(0)) {
                    arraySwap[0] = valuesWithTheCorrectEmails[j + 1];
                    arraySwap[1] = valuesWithTheCorrectEmails[j];
                    valuesWithTheCorrectEmails[j] = arraySwap[0];
                    valuesWithTheCorrectEmails[j + 1] = arraySwap[1];
                }
             if(valuesWithTheCorrectEmails[j].charAt(0) == valuesWithTheCorrectEmails[j + 1].charAt(0)){
                 if(valuesWithTheCorrectEmails[j].length() < valuesWithTheCorrectEmails[j + 1].length()){
                     arraySwap[0] = valuesWithTheCorrectEmails[j + 1];
                     arraySwap[1] = valuesWithTheCorrectEmails[j];
                     valuesWithTheCorrectEmails[j] = arraySwap[0];
                     valuesWithTheCorrectEmails[j + 1] = arraySwap[1];
                 }
             }

            }
        }

       for(int i = 0; i< valuesWithTheCorrectEmails.length; i++){
           System.out.println(valuesWithTheCorrectEmails[i]);
        }


    }
}
