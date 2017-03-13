import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String solucion = "";
        try{
         BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
         //String[] temp = bfr.readLine().split(" ");
            
         //Leer Entrada de la Computadora   
         String[] temp = bfr.readLine().split(" ");
         int numeroProblemas = Integer.parseInt(temp[0]);
         if(numeroProblemas < 1){System.out.println("No hay problemas por resolver");}   
         for(int i = 1; i <= numeroProblemas; i++)
         {
             Problem problema = new Problem();
             String[] ProblemaInfo = bfr.readLine().split(" ");
             int numeroNodos = Integer.parseInt(ProblemaInfo[0]);
             int numeroAristas = Integer.parseInt(ProblemaInfo[1]);
             for(int j = 0; j < numeroAristas; j++)
             {
                 String[] arista = bfr.readLine().split(" ");
                 problema.insertNodo(Integer.parseInt(arista[0]),Integer.parseInt(arista[1]));
                 problema.insertNodo(Integer.parseInt(arista[1]),Integer.parseInt(arista[0]));
             }
             problema.idNodoInicial = Integer.parseInt(bfr.readLine().split(" ")[0]);   
         
         
            //Resolver Problema
            Vector pesos = new Vector();
            Vector colaFiFo = new Vector();
            int index = 0;
            Nodo nodo_inicial = new Nodo();
            nodo_inicial.visitado = true;
             
            colaFifo.add(0,problema.idNodoInicial);
            while(!colaFifo.isEmty())
            {
                Nodo padre = colaFifo.get(0);
                for(int k = 0; k < padre.hijos.size(); k++)
                {
                    colaFifo.add(padre.hijos.get(k).id);
                }
                
                problema.borrarPrimerElemento(cola);
     
            } 
         
         
         
         
         }
            
         
            
        }
        catch(IOException e){}
    }
}
class Bot
{
    public Vector problemas = new Vector();
    public Vector pesos = new Vector();
    public Vector colaFiFo = new Vector();
    int numeroProblemas = 0;
    public void solveProblem()
    {
        for(int i =0; i < numeroProblemas; i++)
        {
            
            //while(colaFiFo.isEmpty() )
            //this.numeroProblemas --;
        }
    }
}

class Problem
{
    public int idNodoInicial = 0;
    Vector grafo = new Vector();

    public void insertNodo(int id, int idNuevo)
    {
        for(int i = 0; i < this.grafo.size(); i++)
        {
            if(findNodo(grafo, id))
            {
                Nodo node = (Nodo)this.grafo.get(i);
                node.hijos.add(idNuevo);
            }
        }
    }
    public boolean findNodo(Vector vector, int id)
    {
        for(int i = 0; i <= vector.size()-1; i++)
        {
            Nodo nodo = (Nodo)vector.get(i);
            if(nodo.get_Id() == id){return true;}
        }
        return false;
    }
    public void borrarPrimerElemento(Vector vector)
    {
        Collections.reverse(vector);
        vector.remove(vector.size()-1);
        Collections.reverse(vector);
    }
    
    
}
 
class Nodo{
    public boolean visitado = false;
    public Vector hijos = new Vector();
    public int id;
    public int get_Id()
    {
        return this.id;
    }
    public Vector get_Hijos()
    {
        return this.hijos;
    }
    public boolean getVisitado()
    {
        return this.visitado;
    }  
}


