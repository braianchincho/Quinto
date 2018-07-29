/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package intartificial;

import java.util.ArrayList;

/**
 *
 * @author Ani Rufinetto
 */
public class Histograma {


  public  int[] calcularHistograma(int[] vec, int valorDesde,int valorHasta)
    {
       int[] resultado=new int[valorHasta+1];
       for(int x=0;x<resultado.length;x++)
       {resultado[x]=0;}
       for(int i=0;i<vec.length;i++)
       {
       if(vec[i]<=valorHasta)
       {
        switch (vec[i])
        {
            case 0:
                resultado[0]++;
                break;
            case 1:
                 resultado[1]++;
                break;
            case 2:
                 resultado[2]++;
                break;
            case 3:
                 resultado[3]++;
                break;
            case 4:
                 resultado[4]++;
                break;
            case 5:
                 resultado[5]++;
                break;
            case 6:
                 resultado[6]++;
                break;
            case 7:
                 resultado[7]++;
                break;
            case 8:
                 resultado[8]++;
                break;
            case 9:
                 resultado[9]++;
                break;             
            case 10:
                 resultado[10]++;
                break;
            case 11:
                 resultado[11]++;
                break;
            case 12:
                 resultado[12]++;
                break;
            case 13:
                 resultado[13]++;
                break;
            case 14:
                 resultado[14]++;
                break;
            case 15:
                 resultado[15]++;
                break;
             case 16:
                 resultado[16]++;
                break;
            default:
             }
       }
       }
      return resultado;
    }

/*public static void main(String args[])

    {
       int[] va=new int[16];
       va[0]=5;
       va[1]=6;
       va[2]=7;
       va[3]=8;
       va[4]=4;
       va[5]=5;
       va[6]=6;
       va[7]=7;
       va[8]=4;
       va[9]=4;
       va[10]=5;
       va[11]=6;
       va[12]=4;
       va[13]=4;
       va[14]=4;
       va[15]=5;
       int[] vec=calcularHistograma(va,0,6);
       for(int i=0;i<vec.length;i++)
           {
            System.out.println(vec[i]);
           }
    */

  public int[] calcularHistogramaEcualizado(ArrayList<NivelGris> array,int[] imagen)
    {
      int[] imagenEcualizada=new int[imagen.length];
     for(int i=0;i<imagen.length;i++)
     {
       NivelGris nivel=esNivelGris(imagen[i],array);
         if(nivel!=null)
         { 
         if (nivel.getFrecuencia() > 0)
         {
             int x=Math.round(nivel.getgPrevia());

             imagenEcualizada[i]=x;
         }
       else
         {
             imagenEcualizada[i]=nivel.getNivelGris();
         }

         }
     }
     return imagenEcualizada;
    }
  
  private NivelGris esNivelGris(int x,ArrayList<NivelGris> array)
    {
    for(int i=0;i<array.size();i++)
     {
       NivelGris nivel=array.get(i);
       if(x==nivel.getNivelGris())
         {
          return nivel;
         }
        }
    return null;
    }
}
