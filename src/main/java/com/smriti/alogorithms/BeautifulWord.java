package com.smriti.alogorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smraj on 4/12/2017.
 */
public class BeautifulWord {

    public static List vowels = new ArrayList();

    static {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
    }

    public void checkBeautiful(String str) {
        if (str == null || str == "") {
            throw new RuntimeException("String should not be null");
        }

        if(!str.equals(str.toLowerCase())){
            throw new RuntimeException("String should not be lowercase only");
        }

        int len = str.length() - 1;
        boolean beautifulflag = true;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == str.charAt(i + 1) || (vowels.contains(str.charAt(i)) && (vowels.contains(str.charAt(i + 1))))) {
                beautifulflag = false;
                System.out.print("No");
                break;
            }
        }
        if (beautifulflag)
            System.out.print("Yes");
    }
}
