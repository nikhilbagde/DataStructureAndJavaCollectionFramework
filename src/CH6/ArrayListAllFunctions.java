package CH6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikhil on 1/18/2016.
 */
public class ArrayListAllFunctions {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        InputStreamReader inputReader = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath,line,word;

        try{
            //System.out.print("\nPlease Enter the path for input file: ");
            //filePath = reader.readLine();
            BufferedReader filereader = new BufferedReader(new FileReader("C:\\Users\\Nikhi\\IdeaProjects\\DataStructureAndJavaCollectionFramework\\src\\Textfile.txt"));

            while(true){
                line = filereader.readLine();
                if(line==null)
                    break;
                aList.add(line);
            }
            System.out.println(aList);

            System.out.println("\n\nPlease enter the word you want to search for: ");
            word = reader.readLine();

            if(aList.indexOf(word)>=0){
                System.out.println(word + " was found.\n\n");
            }else{
                System.out.println(word + " was not found.\n\n");
            }
            System.out.println(aList);

            System.out.println("Please enter the word you want to remove: ");
            word = reader.readLine();
            int removalCount = 0;

            while(aList.remove(word)){
                removalCount++;
            }
            if(removalCount==0)
                System.out.println(word +" was not found, so not removed.\n\n");
            else if(removalCount==1)
                System.out.println("The only instance of "+ word + " was removed.\n\n");
            else
                System.out.println("All " + removalCount + " instances of " + word + " were removed.\n\n");
            System.out.println(aList);

            System.out.println("Please enter the word you want to append: ");
            word = reader.readLine();
            aList.add(word);
            System.out.println(word + " was appended.\n\n");
            System.out.println(aList);

            System.out.println("Please enter the word you want to uppercase");
            word = reader.readLine();
            int index = aList.indexOf(word);
            if(index>=0) {
                aList.set(index, word.toUpperCase());
                System.out.println(word + " was converted to uppercase.\n\n ");
            }else{
                System.out.println(word + " was not found. So not converted to upper-case.\n\n");
            }
            System.out.println(aList);







        }catch (IOException e){
            System.out.println(e);
        }


    }
}
