/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geradorcodigoalfanumerico;

/**
 *
 * @author vicente-simao
 */
public class Ascii {
    
    private String letra;
    private String codigo;

    public Ascii(String letra, String codigo) {
        this.letra = letra;
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return letra+","+codigo;
    }
    
    
}
