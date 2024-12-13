package org.example;// Generated from ProjectParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(ProjectParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(ProjectParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProjectParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProjectParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ProjectParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ProjectParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ProjectParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ProjectParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(ProjectParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(ProjectParser.ScopeContext ctx);
}