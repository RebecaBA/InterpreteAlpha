import generated.Parser2;
import generated.Parser2BaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.IllegalFormatException;


public class MiVisitor extends Parser2BaseVisitor<Object>{

    private TablaSimbolos miTabla;
    boolean vengoWhile = false;
    boolean vengoIf = false;


    public MiVisitor() {
        this.miTabla = new TablaSimbolos(); //Instacnia de la Tabla de Métodos
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitProgramAST(Parser2.ProgramASTContext ctx) {
        visit(ctx.singleCommand());
        miTabla.imprimir();
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
        TablaSimbolos.Ident exists = miTabla.buscar(ctx.ID().getText());
        if (exists == null) {
            printError("SEMANTIC ERROR: Undefined identifier ", ctx.ID().getSymbol());
        }else {

            Object valor = visit(ctx.expression());

            //System.out.println("Before insertions " + valor);
            if (valor instanceof Integer && exists.type == 1) {
                //System.out.println("Insertado un integer");
                exists.setValue(visit(ctx.expression()));
            } else if (valor instanceof String && exists.type == 2) {
               // System.out.println("Insertado un string");
                exists.setValue(visit(ctx.expression()));
            } else if (valor instanceof Boolean && exists.type == 3) {
                //System.out.println("Insertado un Boolean");
                exists.setValue(visit(ctx.expression()));
            } else {
                printError("SEMANTIC ERROR: No se puede realizar la asignación verifique ", ctx.ID().getSymbol());
                System.exit(0);
            }
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
        visit(ctx.expression());
        visit(ctx.singleCommand(0));
        visit(ctx.singleCommand(1));
        return null;
    }

    @Override
    public Object visitWhileSCAST(Parser2.WhileSCASTContext ctx) {
        vengoWhile = true;
        Object value = visit(ctx.expression());
        System.out.println("VALUEEEE WHILEE : " + visit(ctx.expression()));
        if (value instanceof Integer) {
            for (int i = 0; i < (Integer) value; i++){
                visit(ctx.singleCommand());
            }
        } else{
            System.out.println("ERROR!!! ... No es posible realizar un while con el tipo de dato asignado");
            System.exit(0);

        }
        return null;
    }

    @Override
    public Object visitLetSCAST(Parser2.LetSCASTContext ctx) {
        miTabla.openScope();
        visit(ctx.declaration());
        visit(ctx.singleCommand());
        miTabla.closeScope();
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
        if(miTabla.buscar(ctx.ID().getSymbol().getText()) == null) {
            if (value.equals("string")) {
                //Si es string el valor de typeDenoter inserto con 2

                miTabla.insertar(ctx.ID().getSymbol(), 2);
            } else if (value.equals("int")) {
                //Si es int el valor de typeDenoter inserto con 1
                miTabla.insertar(ctx.ID().getSymbol(), 1);
            } else if (value.equals("boolean")) {
                //Si es int el valor de typeDenoter inserto con 1
                miTabla.insertar(ctx.ID().getSymbol(), 3);
            } else{
                System.out.println("TIPO NO INDENTIFICADO" );
            }
        }

        visit(ctx.typedenoter());
        return null;
    }

    @Override
    public Object visitTypedenoterAST(Parser2.TypedenoterASTContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitExpressionAST(Parser2.ExpressionASTContext ctx) {

        Object value1 = visit(ctx.primaryExpression(0));
        Object value2;
        String cmp_opr;



        if (ctx.comparison(0) != null){
            System.out.println("SOY CMP DEL WHILE" + ctx.comparison(0).getText());
        }

        else {
            if(value1 instanceof Integer){
                for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                    char oper = (Character) visit(ctx.operator(i - 1));
                    value2 = visit(ctx.primaryExpression(i));
                    System.out.println("Entróoooo 1");
                    if (value2 instanceof Integer){
                        value1 = oper(oper, (Integer) value1, (Integer) value2);
                        return value1;
                    }
                    return value1;
                }
            }

            else if (value1 instanceof Boolean){
                //System.out.println("SOY INSTANCIA DE BOOLEAN");
                System.out.println("Entróoooo 2");
                for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                    visit(ctx.comparison(i - 1));
                    visit(ctx.primaryExpression(i));
                }
            }


            else if (value1 instanceof String){
                System.out.println("Entróoooo 3");
                //System.out.println("SIZE: " + ctx.primaryExpression().size());
                for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                    String oper = (String) visit(ctx.operator(i - 1));
                    value2 = visit(ctx.primaryExpression(i));
                    if (value2 instanceof String){
                        if(oper =="<"|oper ==">"|oper =="<="|oper ==">="){
                            System.out.println("SEMANTIC ERROR: No es posible realizar la comparacion con { >,<,>=,<=} intente con ==");
                            System.exit(0);
                        }
                        value1 = operString(oper, (String) value1, (String) value2);
                        return value1;
                    }
                    return value1;
                }
            }
            return value1;
        }
        return value1;
    }

    @Override
    public Object visitNumPEAST(Parser2.NumPEASTContext ctx) {
        //System.out.println("EN UN NUMPEAST");
        return Integer.parseInt(ctx.NUM().getText());
    }

    @Override
    public Object visitIdPEAST(Parser2.IdPEASTContext ctx) {
        //System.out.println("EN UN IDPEAST");
        TablaSimbolos.Ident exists = miTabla.buscar(ctx.ID().getText());
        if (exists == null){
            printError("SEMANTIC ERROR: Undefined identifier ", ctx.ID().getSymbol());
            System.exit(0);
        }
        else
            return exists.valor;
        return null;
    }

    @Override
    public Object visitStringPEAST(Parser2.StringPEASTContext ctx) {
        //System.out.println("EN UN STRINGPEAST");
        //System.out.println("STRIIIING"+ctx.STRING().getText());
        return ctx.STRING().getText();
    }

    @Override
    public Object visitGroupPEAST(Parser2.GroupPEASTContext ctx) {
        //System.out.println("EN UN GROUP_PEAST");
        return visit(ctx.expression());
    }


    @Override
    public Object visitPrintSCAST(Parser2.PrintSCASTContext ctx) {
        //System.out.println("EN UN PRINTSCAST");
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
    public Object visitComparison(Parser2.ComparisonContext ctx) {
        return ctx.getText().charAt(0);
    }

    @Override
    public Object visitOperator(Parser2.OperatorContext ctx) {
        return ctx.getText().charAt(0);
    }

    private int oper(char op, Integer o1, Integer o2){
        switch(op) {
            case '+': return o1 + o2;
            case '-': return o1 - o2;
            case '*': return o1 * o2;
            case '/': return o1 / o2;
        }
        return 0;
    }
    private Boolean logicCompare (String op, Integer o1, Integer o2){
        switch(op) {
            case ">":
                return o1 > o2;
            case ">=":
                return o1 >= o2;
            case "<=":
                return o1 <= o2;
            case "<":
                return o1 < o2;
            case "==":
                return o1.equals(o2);
        }
        return false;
    }

    private String operString(String op, String o1, String o2){
        if ("+".equals(op)) {
            return o1 + o2;
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
