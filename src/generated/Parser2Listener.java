// Generated from C:/Users/RebecaBA/Documents/InterpreteAlpha\Parser2.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser2}.
 */
public interface Parser2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link Parser2#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramAST(Parser2.ProgramASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link Parser2#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramAST(Parser2.ProgramASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link Parser2#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandAST(Parser2.CommandASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link Parser2#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandAST(Parser2.CommandASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterAssignSCAST(Parser2.AssignSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitAssignSCAST(Parser2.AssignSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterCallSCAST(Parser2.CallSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitCallSCAST(Parser2.CallSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfSCAST(Parser2.IfSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfSCAST(Parser2.IfSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterWhileSCAST(Parser2.WhileSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitWhileSCAST(Parser2.WhileSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterLetSCAST(Parser2.LetSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitLetSCAST(Parser2.LetSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterPrintSCAST(Parser2.PrintSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitPrintSCAST(Parser2.PrintSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beginSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterBeginSCAST(Parser2.BeginSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beginSCAST}
	 * labeled alternative in {@link Parser2#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitBeginSCAST(Parser2.BeginSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link Parser2#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationAST(Parser2.DeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link Parser2#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationAST(Parser2.DeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link Parser2#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclAST(Parser2.ConstDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link Parser2#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclAST(Parser2.ConstDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link Parser2#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclAST(Parser2.VarDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link Parser2#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclAST(Parser2.VarDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedenoterAST}
	 * labeled alternative in {@link Parser2#typedenoter}.
	 * @param ctx the parse tree
	 */
	void enterTypedenoterAST(Parser2.TypedenoterASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedenoterAST}
	 * labeled alternative in {@link Parser2#typedenoter}.
	 * @param ctx the parse tree
	 */
	void exitTypedenoterAST(Parser2.TypedenoterASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link Parser2#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAST(Parser2.ExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link Parser2#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAST(Parser2.ExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumPEAST(Parser2.NumPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumPEAST(Parser2.NumPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPEAST(Parser2.BooleanPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPEAST(Parser2.BooleanPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdPEAST(Parser2.IdPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdPEAST(Parser2.IdPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringPEAST(Parser2.StringPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringPEAST(Parser2.StringPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupPEAST(Parser2.GroupPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupPEAST}
	 * labeled alternative in {@link Parser2#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupPEAST(Parser2.GroupPEASTContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser2#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(Parser2.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser2#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(Parser2.OperatorContext ctx);
}