import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    static void next_move(int posc, int posr, String[] board){
        //add logic here
        int posicionF = posc;
        int posicionC = posr;
        Solution.encontrarMasCercano(posc, posr,board);
        //System.out.println(posc);


        
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
        for(int i = 0; i < board.length;i++)
        {
            String linea = board[i];
            for( int j = 0; j < linea.length();j++)
            {
                if(linea.charAt(j)=='d')
                {
                  boolean limpiado = Solution.Limpiar(posc,posr,board);   
		          if( limpiado == false)
		          {
			         Solution.Desplazar(i,j,posr,posc);
                     break;
		          }
                }
            
            }
   
        }       
    }
    static boolean Limpiar(int columna, int fila, String[] board)
    {
        if(board[fila].charAt(columna) == 'd')
        {
            System.out.println("CLEAN");
            return true;
        }
        return false;
    }
    static void Desplazar(int DirtFila,int DirtColumna,int RoboFila, int RoboColumna)
    {
        if(DirtFila < RoboFila)
        {
            System.out.println("UP");
        }
        else if(DirtFila > RoboFila)
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