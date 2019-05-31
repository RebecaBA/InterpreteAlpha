import org.antlr.v4.runtime.*;
import java.util.LinkedList;

/**
 * Created by oviquez on 19/9/2016.
 */
public class TablaSimbolos {
    LinkedList<Object> tabla;

    private int nivelActual;

    class Ident{
        Token tok;
        int type; // 1 para int 2 para String y 3 para Boolean
        int nivel;
        Object valor; //se cambia el valor para que reciba string o int

        public Ident(Token t, int tp){
            tok = t;
            type = tp;
            nivel=nivelActual;
            valor = null;
        }

        public void setValue(Object value)
        {
            valor = value;
        }

    }

    public TablaSimbolos() {
        tabla = new LinkedList<Object>();
        this.nivelActual=-1;
    }

    public void insertar(Token id, int tipo)
    {
        Ident i = new Ident(id,tipo);
        tabla.add(i);
    }

    public Ident buscar(String nombre)
    {
        //debe buscarse en otro orden... de atrás para adelante
        Ident temp=null;
        for(Object id : tabla)
            if (((Ident)id).tok.getText().equals(nombre))
                temp = ((Ident)id);
        return temp;
    }

    public void openScope()
    {

        nivelActual++;
    }

    public void closeScope()//hay que sacar todos los ident del nivel que se está cerrando
    {

        nivelActual--;
    }

    public void imprimir() {
        System.out.println("----- INICIO TABLA ------");
        String tipoVariable ="";
        for (int i = 0; i < tabla.size(); i++) {
            Token s = (Token) ((Ident) tabla.get(i)).tok;
            if(((Ident) tabla.get(i)).type == 1){
                tipoVariable = "int";
            }
            else if(((Ident) tabla.get(i)).type == 2){
                tipoVariable = "string";
            }
            else if(((Ident) tabla.get(i)).type == 3){
                tipoVariable = "boolean";
            }

            System.out.println("Nombre: " + s.getText() + ", Nivel: " + ((Ident) tabla.get(i)).nivel +", Tipo: "+tipoVariable+ ", Valor: " + ((Ident) tabla.get(i)).valor);

        }
        System.out.println("----- FIN TABLA ------");
    }
}
