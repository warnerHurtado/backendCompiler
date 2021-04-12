// Generated from C:/Users/Huawei D14/Desktop/backendCompiler\miParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miParser}.
 */
public interface miParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(miParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(miParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(miParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(miParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#funtionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuntionDeclaration(miParser.FuntionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#funtionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuntionDeclaration(miParser.FuntionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(miParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(miParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(miParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(miParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(miParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(miParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(miParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(miParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(miParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(miParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(miParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(miParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(miParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(miParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDeclaration(miParser.ClassVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDeclaration(miParser.ClassVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(miParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(miParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(miParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(miParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(miParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(miParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(miParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(miParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(miParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(miParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(miParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(miParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(miParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(miParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(miParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(miParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(miParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(miParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpression(miParser.AllocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpression(miParser.AllocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAllocationExpression(miParser.ArrayAllocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAllocationExpression(miParser.ArrayAllocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(miParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(miParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#funtionCall}.
	 * @param ctx the parse tree
	 */
	void enterFuntionCall(miParser.FuntionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#funtionCall}.
	 * @param ctx the parse tree
	 */
	void exitFuntionCall(miParser.FuntionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParams(miParser.ActualParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParams(miParser.ActualParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookup(miParser.ArrayLookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookup(miParser.ArrayLookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(miParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(miParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(miParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(miParser.LiteralContext ctx);
}