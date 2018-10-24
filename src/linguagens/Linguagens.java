/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linguagens;

import gals.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author 412422
 */
public class Linguagens {
    public static Stack<Integer> pilha = new Stack<Integer>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lexico lex = new Lexico("a <- 11*10+10");
        Sintatico sin = new Sintatico();
        Semantico sem = new Semantico();
        try {
            sin.parse(lex, sem);
            System.out.println("Resultado: "+Integer.toBinaryString(pilha.pop()));
        } catch (LexicalError ex) {
            Logger.getLogger(Linguagens.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SyntaticError ex) {
            Logger.getLogger(Linguagens.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SemanticError ex) {
            Logger.getLogger(Linguagens.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
