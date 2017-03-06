import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    static void next_move(int posc, int posr, String[] board){

        Solution.encontrarMasCercano(posc, posr,board);
    }
    


    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        next_move(pos[0], pos[1], board);
    }
    
    static void encontrarMasCercano(int posc, int posr, String[] board){
        int bandera = 0;
        for(int i = 0; i < board.length;i++)
        {
            String linea = board[i];
            for( int j = 0; j < linea.length();j++)
            {
                if(linea.charAt(j)=='d')
                {
                  bandera = 1;  
                  if(posr == i && posc ==j)
                  {
                     System.out.println("CLEAN");
                      break;
                  }
                  else
                  {
                     Solution.Desplazar(i,j,posr,posc);
                      break;
                  }
                }
               
            
            }
            if (bandera == 1){break;}
   
        }       
    }

    static void Desplazar(int DirtFila,int DirtColumna,int RoboFila, int RoboColumna)
    {
        if(DirtFila > RoboFila)
        {
            System.out.println("UP");
        }
        else if(DirtFila < RoboFila)
        {
            System.out.println("DOWN"); 
        }
        else
        {
            if(DirtColumna < RoboColumna)
            {
                System.out.println("LEFT");
            }
            else if(DirtColumna > RoboColumna)
            {
                System.out.println("RIGHT"); 
            }
        }
    }
    
    
    
    
}