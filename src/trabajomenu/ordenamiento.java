
package trabajomenu;

import javax.swing.JOptionPane;


public class ordenamiento {
    
    public static void main(String [] arg){
        
      estudiante[] arrayEstudiantes = new estudiante[5];
      arrayEstudiantes[0] = new estudiante("juan", "polania","123", 5, 5.0);
      arrayEstudiantes[1] = new estudiante("kevin", "bermeo","123", 4, 4.5);
      arrayEstudiantes[2] = new estudiante("andres", "garcia","123", 3, 4.8);
      arrayEstudiantes[3] = new estudiante("pedro", "polania","123", 2, 4.2);
      arrayEstudiantes[4] = new estudiante("camilo", "sanchez","123", 1, 2.0);
      
      
      int temp;
        for(int i=1;i<arrayEstudiantes.length;i++){
            for(int j=0;j<arrayEstudiantes.length-1;j++){
                if(arrayEstudiantes[j].getNota()<arrayEstudiantes[j+1].getNota()){
                    temp=arrayEstudiantes[j].getPuesto();
                    arrayEstudiantes[j].setPuesto(arrayEstudiantes[j+1].getPuesto());
                    arrayEstudiantes[j+1].setPuesto(temp);
                }
            }
        
    }
    
        
        for (int x=0;x < arrayEstudiantes.length;x++){
            JOptionPane.showMessageDialog(null, arrayEstudiantes[x].imprimir());
        }
}
    
}
