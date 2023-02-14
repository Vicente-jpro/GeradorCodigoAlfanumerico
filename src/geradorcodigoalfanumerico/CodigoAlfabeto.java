/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package geradorcodigoalfanumerico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vicente-simao
 */
public class CodigoAlfabeto {
    
    private List<Ascii> ListaMaiuscula;
    private List<Ascii> ListaMinuscula;
    private Ascii ascii;
    private Alfabeto alfabeto; 

    public CodigoAlfabeto(){
        this.ListaMaiuscula = new ArrayList<>();
        this.ListaMinuscula = new ArrayList<>();
    }

    public void cadastrarCodigo(){
        Integer codigo = 65;
        for(int i = 0; i < alfabeto.tamanho(); i++){
            
            String letra = alfabeto.getMinusculo()[i];
            ascii = new Ascii(letra, codigo);
            ListaMinuscula.add(ascii);
            codigo++;
     
        }

      
    }
        
}
