import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class RadixSort {
    /**
     * Sorts a text file alphabetically and creates a new 'Key' sorted file.
     *
     * @param f The text file to be input and sorted.
     */
    public static void radixSort(File f) {
        ArrayList<String> list = new ArrayList<String>();
        File file = f;

        //writing to file
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String i = scanner.nextLine();
                if (!(i.equals("")))
                    list.add(i);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> outA = sort(list);

        try {
            File out = new File((f.getName().substring(0, f.getName().length() - 4)) + "_key.txt");
            FileWriter fw = new FileWriter(out.getName());
            //write each item into file in order
            String write = "";
            for(String item : outA) {
                write += item + "\n\n";
            }
            fw.write(write);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Helper method that does the main sorting for RadixSort.
     *
     * @param list The list to be taken from the input and sorted.
     * @return The sorted version of the list in question.
     */
    public static ArrayList<String> sort(ArrayList<String> list) {
        ArrayList<String> l = list;
        //gets longest string length
        int longestLength = 0;
        for (String s : list) {
            if (s.length() > longestLength) {
                longestLength = s.length();
            }
        }


        for (int i = longestLength - 1; i >= 0; i--) {
            ArrayList<String> tooShort = new ArrayList<String>();
            HashMap<Character, LinkedList<String>> map = new HashMap<Character, LinkedList<String>>();

            for (char j = 'a'; j <= 'z'; j++) {
                map.put(j, new LinkedList<String>());
            }
            ArrayList<String> temp = new ArrayList<String>();
            for (String word : l) {
                //if it can be sorted then sort it, if not send it to the back
                    if (word.length() >= i + 1) {
                        //gets the character to compare
                        String c = "";
                        c = String.valueOf(word.charAt(i));
                        switch (c) {
                            case "A":
                            case "a":
                                map.get('a').add(word);
                                break;
                            case "B":
                            case "b":
                                map.get('b').add(word);
                                break;
                            case "C":
                            case "c":
                                map.get('c').add(word);
                                break;
                            case "D":
                            case "d":
                                map.get('d').add(word);
                                break;
                            case "E":
                            case "e":
                                map.get('e').add(word);
                                break;
                            case "F":
                            case "f":
                                map.get('f').add(word);
                                break;
                            case "G":
                            case "g":
                                map.get('g').add(word);
                                break;
                            case "H":
                            case "h":
                                map.get('h').add(word);
                                break;
                            case "I":
                            case "i":
                                map.get('i').add(word);
                                break;
                            case "J":
                            case "j":
                                map.get('j').add(word);
                                break;
                            case "K":
                            case "k":
                                map.get('k').add(word);
                                break;
                            case "L":
                            case "l":
                                map.get('l').add(word);
                                break;
                            case "M":
                            case "m":
                                map.get('m').add(word);
                                break;
                            case "N":
                            case "n":
                                map.get('n').add(word);
                                break;
                            case "O":
                            case "o":
                                map.get('o').add(word);
                                break;
                            case "P":
                            case "p":
                                map.get('p').add(word);
                                break;
                            case "Q":
                            case "q":
                                map.get('q').add(word);
                                break;
                            case "R":
                            case "r":
                                map.get('r').add(word);
                                break;
                            case "S":
                            case "s":
                                map.get('s').add(word);
                                break;
                            case "T":
                            case "t":
                                map.get('t').add(word);
                                break;
                            case "U":
                            case "u":
                                map.get('u').add(word);
                                break;
                            case "V":
                            case "v":
                                map.get('v').add(word);
                                break;
                            case "W":
                            case "w":
                                map.get('w').add(word);
                                break;
                            case "X":
                            case "x":
                                map.get('x').add(word);
                                break;
                            case "Y":
                            case "y":
                                map.get('y').add(word);
                                break;
                            case "Z":
                            case "z":
                                map.get('z').add(word);
                                break;
                        }
                    } else {
                    //if not the right length to be sorted then add to back
                    tooShort.add(word);
                }
            }

            for (char j = 'a'; j <= 'z'; j++) {

                temp.addAll(map.get(j));

            }

            temp.addAll(tooShort);
            l = temp;

        }
        return l;
    }
}
