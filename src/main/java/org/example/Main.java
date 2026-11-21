package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        int freq[] = new int[26];

        String m="abcdefghijklmnopqrstuvwxyz";

        int n=s.length();

        for(int i=0;i<n;i++){
            char t=s.charAt(i);
            freq[t-'a']++;
        }

        System.out.println("The Frequency are: ");

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println(m.charAt(i)+" : "+freq[i]);
            }
        }
    }
}