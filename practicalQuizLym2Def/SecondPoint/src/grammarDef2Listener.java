// Generated from grammarDef2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarDef2Parser}.
 */
public interface grammarDef2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarDef2Parser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(@NotNull grammarDef2Parser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDef2Parser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(@NotNull grammarDef2Parser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarDef2Parser#w}.
	 * @param ctx the parse tree
	 */
	void enterW(@NotNull grammarDef2Parser.WContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDef2Parser#w}.
	 * @param ctx the parse tree
	 */
	void exitW(@NotNull grammarDef2Parser.WContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarDef2Parser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(@NotNull grammarDef2Parser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDef2Parser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(@NotNull grammarDef2Parser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarDef2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull grammarDef2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDef2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull grammarDef2Parser.StartContext ctx);
}