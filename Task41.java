package com.epam.task;


public class Task41 {
    public static void main(String[] args) {
        String input = "WWWIIINNNTTTEEERRR";
        String result = delDuplicate(input);
        System.out.println(result);
    }
    public static String delDuplicate(final String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++)
            if (!result.contains(str.charAt(i) + ""))
                result += str.charAt(i);

        return result;
    }
}