import generated.Parser2;
import generated.Parser2BaseVisitor;
import org.antlr.v4.runtime.Token;

public class MiVisitorInterprete extends Parser2BaseVisitor<Object> {

        //INSTANCIA DE ALMACEN

        public MiVisitorInterprete() {
            //Instacnia EL ALMACEN
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
        public Object visitAssignSCAST(Parser2.AssignSCASTContext ctx) {
            visit(ctx.expression());
            return null;
        }


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
            Object value = visit(ctx.expression());
            if (value instanceof Integer) {
                for (int i = 0; i < (Integer) value; i++) {
                    visit(ctx.singleCommand());
                }
            }
            return null;
        }

        @Override
        public Object visitLetSCAST(Parser2.LetSCASTContext ctx) {
            visit(ctx.declaration());
            visit(ctx.singleCommand());
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

           visit(ctx.typedenoter());
            return null;
        }

        @Override
        public Object visitTypedenoterAST(Parser2.TypedenoterASTContext ctx) {
            return ctx.getText();
        }

        @Override
        public Object visitExpressionAST(Parser2.ExpressionASTContext ctx) {

           visit(ctx.primaryExpression(0));
                for (int i = 1; i < ctx.primaryExpression().size(); i++) {
                     visit(ctx.operator(i - 1));
                     visit(ctx.primaryExpression(i));

                    }
                    return null;


        }

        private int oper(char op, Integer o1, Integer o2) {
            switch (op) {
                case '+':
                    return o1 + o2;
                case '-':
                    return o1 - o2;
                case '*':
                    return o1 * o2;
                case '/':
                    return o1 / o2;
            }
            return 0;
        }

        private String operString(char op, String o1, String o2) {
            switch (op) {
                case '+':
                    return o1 + o2;
            }
            return "";
        }

        @Override
        public Object visitNumPEAST(Parser2.NumPEASTContext ctx) {
            return Integer.parseInt(ctx.NUM().getText());
        }

        @Override
        public Object visitIdPEAST(Parser2.IdPEASTContext ctx) {

            return null;
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
            return visit(ctx.expression());
        }

        @Override
        public Object visitBooleanPEAST(Parser2.BooleanPEASTContext ctx) {
            return null;
        }


        @Override
        public Object visitOperator(Parser2.OperatorContext ctx) {
            return ctx.getText().charAt(0);
        }

        private void printError(String msg, Token t) {
            System.out.println(msg +
                    t.getText() + " (" +
                    t.getLine() +
                    ":" +
                    t.getCharPositionInLine() + ")");
        }

}
