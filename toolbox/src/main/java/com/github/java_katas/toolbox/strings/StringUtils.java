package com.github.java_katas.toolbox.strings;

public class StringUtils {

    public String reverseSentence(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i > -1 ; i--) {
            sb.append(arr[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }



}