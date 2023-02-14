/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geradorcodigoalfanumerico;

import java.util.Random;

/**
 * @author vicente-simao
 * @version 1.0.0
 * @see This class generate 8 
 */
public class Alfanumerico {
    
    private Integer quantidadeCodigo;
    private final String CODIGO_DEFAULT = "Vicente0301"; 
    private Random random;
    
    public Alfanumerico(Integer quantidadeCodigo){
        this.quantidadeCodigo = quantidadeCodigo;
    }
    
    public String gerarCodigo(){
        
        return null ;
    }
    
    // A=65, Z=90
    private String gerarLetraMaiuscula(){
        random = new Random();
        Integer numero = random.nextInt(1, 4);
        
        return null;
    }
    
    // a=97, z=122
    private String gerarLetraMinuscula(){
        random = new Random();
        return null;
    }
    
    // 0 = 48, 9 = 57
    private String gerarNumero(){
        random = new Random();
        return null;
    }
    
    
    public Integer escolherPrimeiroCaracterSequencia(){
        random = new Random();
        
        return random.nextInt(1, 4);
    }
    
    private boolean isCodigoGerado(String codigo){
        return CODIGO_DEFAULT.equalsIgnoreCase(codigo);
    }
    
    
    
}
