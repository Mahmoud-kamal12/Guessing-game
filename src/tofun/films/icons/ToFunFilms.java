package tofun.films.icons;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ToFunFilms {
public static char[] removeTheElement(char[] arr, int index) 
    { 
        
        char[] anotherArray = new char[arr.length - 1]; 
        for (int i = 0, k = 0 , c = 0; i < arr.length; i++)
        { 

            if (i == index)
                continue;
            anotherArray[k++] = arr[i]; 
        } 
        return anotherArray; 
    }

public static int randomnum(int start , int end)
    {
        int r ;
        
        r = start + (int)(Math.random() * ((end - start)));
        
        return r ;
    }

public static boolean check_number_of_word_is_repeted(int []arr1 , int size , int Random_Index)
{
    int x = 0;
    for (int i = 0 ; i< size ;i++)
        if(Random_Index == arr1[i])
            x++;
    if(x == 0){return true;}
    else {return false;}
}

public static char[] LetterFound(char arr2[] ,String check_character)
{
    for(int i = 0 ; i < arr2.length ; i++)
        {
            if( check_character.equals(String.valueOf(arr2[i]))) 
            {
                arr2 = removeTheElement(arr2,i);
                break;
            }
        }
    return arr2;
}


    public static void main(String[] args) {
        
        
        Form form = new Form();
        form.setVisible(true);
        form.setLocationRelativeTo(null);

    }
}
