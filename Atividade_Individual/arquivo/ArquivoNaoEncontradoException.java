/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

/**
 *
 * @author buckl
 */
public class ArquivoNaoEncontradoException extends Exception{
    
    @Override
    public String getMessage(){
        return "Arquivo nao encontrado!";
    }
    
}
