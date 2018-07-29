/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package intartificial;

/**
 *
 * @author Ani Rufinetto
 */
public class Filtro {

   
    public int calcularMedia(int[] porcionImagen)
    {
      int media=0;
      int tamaño=porcionImagen.length;
      for(int i=0;i<porcionImagen.length;i++)
      {
          media+=porcionImagen[i];

      }
     
     return media/tamaño;
    }


  public int calcularMediana(int[] porcionImagen)
    {
       int[] ordenado=ordenar(porcionImagen);
              // System.out.println(""+ordenado[(porcionImagen.length-1)/2]);
       return ordenado[(porcionImagen.length-1)/2];
    }


    public int[] ordenar(int[] porcionImagen)
    {
        int[] imagenOrdenada=new int[porcionImagen.length];
        for(int x=0;x<imagenOrdenada.length;x++)
        {
            imagenOrdenada[x]=porcionImagen[x];

        }
       
        int aux;
        boolean ordenado=false;
      for(int i=0;i< imagenOrdenada.length-1 && !ordenado;i++)
      {
          ordenado=true;
       for(int j=0;j< imagenOrdenada.length-i-1;j++)
            if(imagenOrdenada[j]>imagenOrdenada[j+1])
            {
                ordenado=false;
                 aux= imagenOrdenada[j];
                 imagenOrdenada[j]= imagenOrdenada[j+1];
                 imagenOrdenada[j+1]=aux;

            }
      }
        
     //porcionImagen[porcionImagen.length/2]=imagenOrdenada[imagenOrdenada.length/2];
       return imagenOrdenada;
    }


  



   
}
