// Generated from words.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link wordsParser}.
 */
public interface wordsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link wordsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(wordsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link wordsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(wordsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link wordsParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(wordsParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link wordsParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(wordsParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link wordsParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(wordsParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link wordsParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(wordsParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link wordsParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(wordsParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link wordsParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(wordsParser.TerminatorContext ctx);
}