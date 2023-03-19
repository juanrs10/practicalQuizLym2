// Generated from grammarDef.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarDefParser}.
 */
public interface grammarDefListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarDefParser#v}.
	 * @param ctx the parse tree
	 */
	void enterV(@NotNull grammarDefParser.VContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDefParser#v}.
	 * @param ctx the parse tree
	 */
	void exitV(@NotNull grammarDefParser.VContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarDefParser#w}.
	 * @param ctx the parse tree
	 */
	void enterW(@NotNull grammarDefParser.WContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDefParser#w}.
	 * @param ctx the parse tree
	 */
	void exitW(@NotNull grammarDefParser.WContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarDefParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(@NotNull grammarDefParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDefParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(@NotNull grammarDefParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarDefParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull grammarDefParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarDefParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull grammarDefParser.StartContext ctx);
}