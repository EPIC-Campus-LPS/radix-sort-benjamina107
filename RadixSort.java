import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Queue;

public class RadixSort {

    private ArrayList<String> list = new ArrayList<String>();

    public RadixSort() {

        File file = new File("file_name.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String i = scanner.nextLine();
                list.add(i);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

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
            ArrayList<String> temp = new ArrayList<String>();
            //for each string in the list
            for (String s : list) {
                //if it can be sorted then sort it, if not send it to tbe back

                if (s.length() >= i) {
                    //gets the character to compare
                    String c = s.substring(i, i+1);
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
                            //TODO finish this letter thing












                    }
                }



            }



        }




    }
}
