// Generated from Churumela.g by ANTLR 4.5.3


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChurumelaParser}.
 */
public interface ChurumelaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChurumelaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ChurumelaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChurumelaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ChurumelaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChurumelaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ChurumelaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChurumelaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ChurumelaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChurumelaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ChurumelaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChurumelaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ChurumelaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChurumelaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ChurumelaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChurumelaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ChurumelaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChurumelaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ChurumelaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChurumelaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ChurumelaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChurumelaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ChurumelaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChurumelaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ChurumelaParser.FactorContext ctx);
}