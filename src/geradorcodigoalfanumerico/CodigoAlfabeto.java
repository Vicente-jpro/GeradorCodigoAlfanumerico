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

    public List<Ascii> getListaMaiuscula() {
        return ListaMaiuscula;
    }

    public void setListaMaiuscula(List<Ascii> ListaMaiuscula) {
        this.ListaMaiuscula = ListaMaiuscula;
    }

    public List<Ascii> getListaMinuscula() {
        return ListaMinuscula;
    }

    public void setListaMinuscula(List<Ascii> ListaMinuscula) {
        this.ListaMinuscula = ListaMinuscula;
    }
    
    
    
        
}
