import java.util.ArrayList;
import java.util.LinkedList;

public class TablaAlmacen {

    LinkedList<Object> almacenGlobal;
    LinkedList<Object> almacenLocal;
    private int nivelActual;

    public class Almacen{
        String nombre ;
        Object valor ;

        int nivel;
        public Almacen(String n){
             nombre = n;
             valor = null;
             nivel = nivelActual;

        }
        public void setValue(Object value)
        {
            valor = value;
        }

    }

    public TablaAlmacen() {
        almacenGlobal = new LinkedList<Object>();
        almacenLocal = new LinkedList<Object>();
        this.nivelActual = -1;
    }

   /* public void insertarGlobal(String nombre)
    {
        Almacen i = new Almacen(nombre,valor);
        almacenGlobal.add(i);
    }*/

  /*  public Almacen buscar(String nombre)
    {
        //debe buscarse en otro orden... de atrás para adelante
        Ident temp=null;
        for(Object id : tabla)
            if (((Ident)id).tok.getText().equals(nombre))
                temp = ((Ident)id);
        return temp;
    }

    public Ident buscarPorNivel (String identificador){
        Ident temp = null;
        for(Object id : tabla){
            if (((Ident)id).nivel==this.nivelActual) {
                if (((Ident) id).tok.getText().equals(identificador)) {
                    temp = ((Ident) id);
                }
            }

        }

        return temp;
    };
*/

    public void openScope()
    {

        nivelActual++;
    }

    public void closeScope()//hay que sacar todos los ident del nivel que se está cerrando
    {

        nivelActual--;
    }

   /* public void imprimir() {
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

            System.out.println("Nombre: " + s.getText() + " - NIVEL: " + ((Ident) tabla.get(i)).nivel +" - TIPO :"+tipoVariable+ " - VALOR: " + ((Ident) tabla.get(i)).valor);

        }
        System.out.println("----- FIN TABLA ------");
    }*/


}





