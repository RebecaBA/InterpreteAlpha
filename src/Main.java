import generated.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args){
        Scanner inst = null;
        Parser2 parser = null;
        ParseTree tree=null;


        CharStream input=null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new Scanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new Parser2(tokens);

            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );

            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );

            try {
                tree = parser.program();
                MiVisitor mv = new MiVisitor();
                mv.visit(tree);
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }

            if (errorListener.hasErrors() == false) {
                System.out.println("Compilación Exitosa!!\n");
                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);
            }
            else {
                System.out.println("Compilación Fallida!!\n");
                System.out.println(errorListener.toString());
            }

        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }

}
