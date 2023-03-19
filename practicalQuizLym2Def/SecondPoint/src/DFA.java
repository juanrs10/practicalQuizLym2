import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DFA {

    public static void main(String[] args) {
        // Define the input string
        String input = "aabbbccc$";
        
        // Create the lexer
        grammarDefLexer lexer = new grammarDefLexer(CharStreams.fromString(input));
        
        // Create the token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Create the parser
        grammarDefParser parser = new grammarDefParser(tokens);
        
        // Parse the input string and get the parse tree
        ParseTree parseTree = parser.start();
        
        // Check if the input string was recognized by the automata
        boolean recognized = parseTree != null;
        
        // Print the result
        System.out.println(recognized);
    }
}