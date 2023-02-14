/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geradorcodigoalfanumerico;

import java.util.List;

/**
 *
 * @author vicente-simao
 */
public class GeradorCodigoAlfanumerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CodigoAlfabeto codigoAlfabeto = new CodigoAlfabeto();
        codigoAlfabeto.cadastrarCodigo();
        List<Ascii> lista = codigoAlfabeto.getListaMinuscula();
     
       
        for(Ascii elemento: lista){
            System.out.println(elemento.getLetra()+" - "+elemento.getCodigo());
        }
    
    }
    
}
