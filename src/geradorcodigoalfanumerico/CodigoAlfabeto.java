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
    
    private List<Ascii> listaMaiuscula;
    private List<Ascii> listaMinuscula;
    private Ascii ascii;
    private Alfabeto alfabeto; 

    public CodigoAlfabeto(){
        this.listaMaiuscula = new ArrayList<>();
        this.listaMinuscula = new ArrayList<>();
        this.alfabeto = new Alfabeto();
    }

    public List<Ascii> getListaMaiuscula() {
        this.listaMaiuscula = cadastrar(65);
        return listaMaiuscula;
    }

    public List<Ascii> getListaMinuscula() {
        this.listaMinuscula = cadastrar(97);
        return listaMinuscula;
    }
    

    private List<Ascii> cadastrar(int codigoInicialAlfabeto){
        
        List<Ascii> lista = new ArrayList<>();
        String letra = null;
        
        for(int i = 0; i < alfabeto.tamanho(); i++){
            if (codigoInicialAlfabeto < 97)
                letra = alfabeto.getMaiusculo()[i];
            else
                letra = alfabeto.getMinusculo()[i];
            
            ascii = new Ascii(letra, codigoInicialAlfabeto);
            lista.add(ascii);
            codigoInicialAlfabeto++;
     
        }
        
        return lista;
    }    
        
}
