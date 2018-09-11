package extras;

import javax.swing.JOptionPane;

public class DataValidation {
    public float string2float (String value){ 

//Se crea este metodo para validar los datos que son introducidos por el usuario

        float result = 0;
        
        try{
            result = Float.parseFloat(value);//Se convierte la variable de String a Float
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El valor que introdujo es Erroneo FLOAT!!");
            result = 0;
        }
        return result;
    }
    public int string2int (String value){
        int result = 0;
        
        try{
            result = Integer.parseInt(value);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El valor que introdujo es Erroneo INT!!");
            result = 0;
        }
        return result;
    }
    public double string2double (String value){
        double result = 0;
        
        try{
            result = Double.parseDouble(value);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El valor que introdujo es Erroneo DOUBLE!!");
            result = 0;
        }
        return result;
    }
}
