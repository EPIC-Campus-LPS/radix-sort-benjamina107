import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class RadixSort {

    private ArrayList<String> list = new ArrayList<String>();

    public RadixSort(File f) {

        File file = f;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String i = scanner.nextLine();
                if (i != "")
                    list.add(i);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }

    public ArrayList<String> sort() {
        //gets longest string length
        int longestLength = 0;
        for (String s : list) {
            if (s.length() > longestLength) {
                longestLength = s.length();
            }
        }


        //for each word length possible / "digit" in letter
        for (int i = longestLength; i >= 0; i--) {
            ArrayList<String> temp = new ArrayList<String>(26);
            for (int j = 0; j < 26; j++) {
                temp.add(null);
            }
            ArrayList<String> q = new ArrayList<String>();
            //for each string in the list
            for (String s : list) {
                //if it can be sorted then sort it, if not send it to the back
                if (s.length() >= i) {
                    //gets the character to compare
                    String c = "";
                    if(i == 0)
                        c = String.valueOf(s.charAt(0));
                    else
                        c = String.valueOf(s.charAt(i-1));
                    //adds in position to arraylist based on char
                    switch(c) {
                        case "A":
                        case "a":
                            temp.add(1, s);
                            break;
                        case "B":
                        case "b":
                            temp.add(2, s);
                            break;
                        case "C":
                        case "c":
                            temp.add(3, s);
                            break;
                        case "D":
                        case "d":
                            temp.add(4, s);
                            break;
                        case "E":
                        case "e":
                            temp.add(5, s);
                            break;
                        case "F":
                        case "f":
                            temp.add(6, s);
                            break;
                        case "G":
                        case "g":
                            temp.add(7, s);
                            break;
                        case "H":
                        case "h":
                            temp.add(8, s);
                            break;
                        case "I":
                        case "i":
                            temp.add(9, s);
                            break;
                        case "J":
                        case "j":
                            temp.add(10, s);
                            break;
                        case "K":
                        case "k":
                            temp.add(11, s);
                            break;
                        case "L":
                        case "l":
                            temp.add(12, s);
                            break;
                        case "M":
                        case "m":
                            temp.add(13, s);
                            break;
                        case "N":
                        case "n":
                            temp.add(14, s);
                            break;
                        case "O":
                        case "o":
                            temp.add(15, s);
                            break;
                        case "P":
                        case "p":
                            temp.add(16, s);
                            break;
                        case "Q":
                        case "q":
                            temp.add(17, s);
                            break;
                        case "R":
                        case "r":
                            temp.add(18, s);
                            break;
                        case "S":
                        case "s":
                            temp.add(19, s);
                            break;
                        case "T":
                        case "t":
                            temp.add(20, s);
                            break;
                        case "U":
                        case "u":
                            temp.add(21, s);
                            break;
                        case "V":
                        case "v":
                            temp.add(22, s);
                            break;
                        case "W":
                        case "w":
                            temp.add(23, s);
                            break;
                        case "X":
                        case "x":
                            temp.add(24, s);
                            break;
                        case "Y":
                        case "y":
                            temp.add(25, s);
                            break;
                        case "Z":
                        case "z":
                            temp.add(26, s);
                            break;
                    }
                } else {
                    //if not the right length to be sorted then add to back
                    q.add(s);
                }
            }
            //adds the currently too-short strings to the back
            for (int k = 0; k < q.size(); k++) {
                String gggg = q.get(k);
                temp.add(gggg);
            }
            temp.removeAll(Collections.singleton(null));
            //replaces list with temp
            list = temp;
        }
        return list;
    }

    public static void main(String[] args) {

        File file = new File("words.txt");
        RadixSort radix = new RadixSort(file);
        System.out.println(radix.sort());

    }
}
