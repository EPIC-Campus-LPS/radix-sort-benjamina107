import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @org.junit.jupiter.api.Test
    void sort() {
        ArrayList<String> test = new ArrayList<String>();
        test.add("cdef");
        test.add("bcdef");
        test.add("abcdef");
        test.add("ef");
        test.add("def");
        test.add("f");

        ArrayList<String> key = new ArrayList<String>();
        key.add("abcdef");
        key.add("bcdef");
        key.add("cdef");
        key.add("def");
        key.add("ef");
        key.add("f");

        ArrayList<String> test1 = RadixSort.sort(test);

        assertEquals(key, test1);
    }

    @org.junit.jupiter.api.Test
    void sort2() {

        File alph = new File("alphabetTest.txt");
        RadixSort.radixSort(alph);
        File correct = new File("alphabetCorrect.txt");
        File out = new File("alphabetTest_key.txt");


        String listCorrect = "";
        try {
            Scanner scanner = new Scanner(correct);

            while (scanner.hasNextLine()) {
                String i = scanner.nextLine();
                listCorrect += i;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String listOut = "";
        try {
            Scanner scanner = new Scanner(out);

            while (scanner.hasNextLine()) {
                String i = scanner.nextLine();
                listOut += i;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        assertEquals(listOut, listCorrect);

    }
}