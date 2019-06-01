
import java.util.LinkedList;

public class TablaAlmacen {

    LinkedList<Object> almacenGlobal;

    private int nivelActual;

    class Almacen{

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
        this.nivelActual = -1;
    }

    public void insertar(String nombre)
    {
        Almacen i = new Almacen(nombre);
        almacenGlobal.add(i);
    }

    public Almacen buscar(String nomb)
    {
        //debe buscarse en otro orden... de atrás para adelante
        Almacen temp=null;
        for(Object id : almacenGlobal) {
            if (((Almacen) id).nombre.equals(nomb)) {
                temp = (Almacen) id;
            }
        }
        return temp;
    }

    public Almacen buscarPorNivel (String identificador){
        Almacen temp = null;
        for(Object id : almacenGlobal){
            if (((Almacen)id).nivel==this.nivelActual) {
                if (((Almacen) id).nombre.equals(identificador)) {
                    temp = ((Almacen) id);
                }
            }

        }

        return temp;
    };


    public void openScope()
    {

        nivelActual++;
    }

    public void closeScope()//hay que sacar todos los ident del nivel que se está cerrando
    {

        nivelActual--;
    }

    public void imprimir() {
        System.out.println("----- INICIO Almacen ------");
        String tipoVariable ="";
        for (int i = 0; i < almacenGlobal.size(); i++) {
            Almacen var = (Almacen)almacenGlobal.get(i);
            System.out.println("Nombre: " + var.nombre + " - NIVEL: " +var.nivel +" - VALOR: " +var.valor);

        }
        System.out.println("----- FIN Almacen ------");
    }


}





