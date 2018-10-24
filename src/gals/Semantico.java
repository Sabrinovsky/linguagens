package gals;
import linguagens.*;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        Integer a, b;
        switch(action){
            case 2: 
                a = Integer.parseInt(token.getLexeme(), 2);
                Linguagens.pilha.push(a);
                break;
            case 4: 
                a = Linguagens.pilha.pop();
                b = Linguagens.pilha.pop();
                Linguagens.pilha.push(a+b);
                break;
            case 5: 
                a = Linguagens.pilha.pop();
                b = Linguagens.pilha.pop();
                Linguagens.pilha.push(a*b);
                break;
                
        }
    }	
}
