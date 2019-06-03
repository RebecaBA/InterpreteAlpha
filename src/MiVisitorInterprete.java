import generated.Parser2;
import generated.Parser2BaseVisitor;
import org.antlr.v4.runtime.Token;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.IllegalFormatException;
import java.util.logging.SocketHandler;

public class MiVisitorInterprete extends Parser2BaseVisitor<Object> {

        private TablaAlmacen miAlmacen;

        public MiVisitorInterprete() {
            this.miAlmacen = new TablaAlmacen();
        }

    @Override
    public Object visitProgramAST(Parser2.ProgramASTContext ctx) {
        visit(ctx.singleCommand());
        return null;
    }

    @Override
    public Object visitCommandAST(Parser2.CommandASTContext ctx) {
        visit(ctx.singleCommand(0));
        for (int i = 1; i < ctx.singleCommand().size(); i++) {
            visit(ctx.singleCommand(i));
        }
        return null;
    }

    @Override
    public Object visitAssignSCAST(Parser2.AssignSCASTContext ctx) throws IllegalFormatException {
       TablaAlmacen.Almacen exists = miAlmacen.buscar(ctx.ID().getText());
            Object valor = visit(ctx.expression());
            if (valor instanceof Integer ) {
                exists.setValue(valor);
            } else if (valor instanceof String ) {
                exists.setValue(valor);
            } else if (valor instanceof Boolean) {
                exists.setValue(valor);
            }

        return null;
    }

    //Funcion que imprimir
    @Override
    public Object visitCallSCAST(Parser2.CallSCASTContext ctx) {
        visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitIfSCAST(Parser2.IfSCASTContext ctx) {
        Object expresion = visit(ctx.expression());
        if((Boolean)expresion){
            visit(ctx.singleCommand(0));
        }else{
            visit(ctx.singleCommand(1));
        }

        return null;
    }
    /*****************************HABILITAR DIFERENTES COMPARACIONES**************************************/
    @Override
    public Object visitWhileSCAST(Parser2.WhileSCASTContext ctx)
    {




        Object value = visit(ctx.expression());

        if (value instanceof Integer)
        {
            for (int i = 0; i < (Integer) value; i++)
            {

                visit(ctx.singleCommand());
            }
        }
        else if (value instanceof  Boolean)
        {
            while ((Boolean)visit(ctx.expression())){
                visit(ctx.singleCommand());
            }

            /*
            while((Boolean)value){

                visit(ctx.singleCommand());
            }
             */
        }
        return null;
    }

    @Override
    public Object visitLetSCAST(Parser2.LetSCASTContext ctx) {
        miAlmacen.openScope();
        visit(ctx.declaration());
        visit(ctx.singleCommand());
        miAlmacen.closeScope();
        return null;
    }

    @Override
    public Object visitBeginSCAST(Parser2.BeginSCASTContext ctx) {
        visit(ctx.command());
        return null;
    }

    @Override
    public Object visitDeclarationAST(Parser2.DeclarationASTContext ctx) {
        visit(ctx.singleDeclaration(0));
        for (int i = 1; i < ctx.singleDeclaration().size(); i++) {
            visit(ctx.singleDeclaration(i));
        }
        return null;
    }

    @Override
    public Object visitConstDeclAST(Parser2.ConstDeclASTContext ctx) {
        visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitVarDeclAST(Parser2.VarDeclASTContext ctx) {
        Object value = visit(ctx.typedenoter());
        if(miAlmacen.buscarPorNivel(ctx.ID().getSymbol().getText()) == null) {
            if (value.equals("string")) {
                //Si es string el valor de typeDenoter inserto con 2
                miAlmacen.insertar(ctx.ID().getSymbol().getText());
            } else if (value.equals("int")) {
                //Si es int el valor de typeDenoter inserto con 1
                miAlmacen.insertar(ctx.ID().getSymbol().getText());
            } else if (value.equals("boolean")) {
                //Si es int el valor de typeDenoter inserto con 3
                miAlmacen.insertar(ctx.ID().getSymbol().getText());
            }
        }else{

            return null;
        }
        return null;
    }

    @Override
    public Object visitTypedenoterAST(Parser2.TypedenoterASTContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitExpressionAST(Parser2.ExpressionASTContext ctx) {
        Object value = visit(ctx.primaryExpression(0));
        if(value instanceof Integer){
            for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                String oper = (String) visit(ctx.operator(i - 1));
                Object value2 = visit(ctx.primaryExpression(i));
                if (value2 instanceof Integer){
                    if (oper.equals(">") || oper.equals("<") || oper.equals(">=") || oper.equals("<=") || oper.equals("==")){
                        value = compInt(oper, (Integer) value, (Integer) value2);
                        System.out.println("RETORNA : " + value);
                        return value;
                    }
                    else if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")){
                        value = oper(oper, (Integer) value, (Integer) value2);
                        return value;
                    }
                }
            }
        }
        else if (value instanceof String){
            for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                String oper = (String) visit(ctx.operator(i - 1));
                Object value2 = visit(ctx.primaryExpression(i));
                if (value2 instanceof String){
                    if (oper.equals("==")){
                        System.out.println("==");
                        value = compStr(oper, (String) value, (String) value2);
                        return value;
                    }
                    else if (oper.equals("+")){
                        System.out.println("+");
                        value = operString(oper, (String) value, (String) value2);
                        return value;
                    }
                }
            }
        }

        else if (value instanceof  Boolean){
            for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                String oper = (String) visit(ctx.operator(i - 1));
                Object value2 = visit(ctx.primaryExpression(i));
                if (value2 instanceof Boolean){
                    if(oper.equals("==")||oper.equals("and")||oper.equals("or")) {
                        value = compBool(oper, (Boolean) value, (Boolean) value2);
                        return value;
                    }
                }
                return value;
            }
        }
        return value;
    }



    @Override
    public Object visitNumPEAST(Parser2.NumPEASTContext ctx) {

        return Integer.parseInt(ctx.NUM().getText());
    }

    @Override
    public Object visitIdPEAST(Parser2.IdPEASTContext ctx) {
        TablaAlmacen.Almacen exists = miAlmacen.buscar(ctx.ID().getText());
        return exists.valor;
    }

    @Override
    public Object visitStringPEAST(Parser2.StringPEASTContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public Object visitGroupPEAST(Parser2.GroupPEASTContext ctx) {
        return visit(ctx.expression());
    }


    @Override
    public Object visitPrintSCAST(Parser2.PrintSCASTContext ctx) {
        Object impresion = visit(ctx.expression());
        System.out.println(impresion);
        return visit(ctx.PRINT());
    }

    @Override
    public Object visitBooleanPEAST(Parser2.BooleanPEASTContext ctx) {
        if(ctx.BOOLEAN().getText().equals("false")){
            return false;
        }
        else if (ctx.BOOLEAN().getText().equals("true")){
            return true;
        }
        return null;
    }


    @Override
    public Object visitOperator(Parser2.OperatorContext ctx) {
        return ctx.getText();
    }

    private Object oper(String op, Object o1, Object o2){
        switch(op) {
            case "+"   : return (Integer)o1 +(Integer)o2;
            case "-"   : return (Integer)o1 - (Integer)o2;
            case "*"   : return (Integer)o1 * (Integer)o2;
            case "/"   : return (Integer)o1 / (Integer)o2;
        }
        return 0;
    }

    private Object compBool (String op, Object o1, Object o2){
        switch (op){
            case "=="  :
                return (Boolean) o1 == (Boolean) o2;
            case "and" :
                return (Boolean) o1 && (Boolean) o2;
            case "or" :
                System.out.println("Holaaaa");
                return (Boolean) o1 || (Boolean) o2;
        }
        return false;
    }

    private Object compInt (String op, Object o1, Object o2){
        switch (op){
            case ">":
                if ((Integer)o1 > (Integer)o2){
                    return true;
                }
                else {
                    return false;
                }
            case "<":
                if ((Integer)o1 < (Integer)o2){
                    return true;
                }
                else {
                    return false;
                }
            case ">=":
                if ((Integer)o1 >= (Integer)o2){
                    return true;
                }
                else {
                    return false;
                }
            case "<=":
                if ((Integer)o1 <= (Integer)o2){
                    return true;
                }
                else {
                    return false;
                }
            case "==":
                if (((Integer)o1).equals((Integer)o2)){
                    return true;
                }
                else {
                    return false;
                }
        }
        return false;
    }

    private Object compStr (String op, Object o1, Object o2){
        if ("==".equals(op)) {
            return ((String) o1).equals((String) o2);
        }
        return false;
    }

    private Object operString(String op, String o1, String o2){
        switch(op) {
            case "+": return o1 + o2;
            case "==" : if(o1.equals(o2)){return true;}else return false;
        }
        return "";
    }


    private void printError(String msg, Token t){
        System.out.println(msg +
                t.getText() + " (" +
                t.getLine() +
                ":" +
                t.getCharPositionInLine() + ")");
    }

}
