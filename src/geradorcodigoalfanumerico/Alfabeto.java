/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geradorcodigoalfanumerico;

/**
 *
 * @author vicente-simao
 */
public class Alfabeto {
    private String letras[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}; 
    
    public String[] getMaiusculo(){
        return letras;
    } 
    
    public String[] getMinusculo(){
        String[] letraMinusculas = new String[letras.length];
        
        for(int i = 0; i < letras.length; i++){
            letraMinusculas[i] = this.letras[i].toLowerCase();
        }
        
        return letraMinusculas;
    }
    
    public int tamanho(){
        return this.letras.length;
    }
}
