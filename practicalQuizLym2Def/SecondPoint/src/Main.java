import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import grammarDefLexer.java;
import grammarDefParser.java;
import com.creativewidgetworks.goldparser.engine.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Create the input stream from the input file
        String inputFile = "input.txt";
        CharStreams input = CharStreams.fromFileName(inputFile);

        // Create the lexer and parser
        grammarDef2Lexer lexer = new grammarDef2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        grammarDef2Parser parser = new grammarDef2Parser(tokens);

        // Parse the input and generate the parse tree
        ParseTree tree = parser.rulelist();

        // Define the states
        Automata states = new Automata();
        states.defineState("q0", true, false); // Start state
        states.defineState("q1", false, false);
        states.defineState("q2", false, false);
        states.defineState("q3", false, true); // Final state
        
        // Define the alphabet
        String alphabet = "abc$";
        
        // Define the transition function
        states.defineTransition("q0", "q0", "abc"); // Loop on all letters
        states.defineTransition("q0", "q1", "abc");
        states.defineTransition("q0", "q2", "abc");
        states.defineTransition("q1", "q0", "abc");
        states.defineTransition("q1", "q2", "abc");
        states.defineTransition("q1", "q3", "$");
        states.defineTransition("q2", "q0", "abc");
        states.defineTransition("q2", "q1", "abc");
        states.defineTransition("q2", "q3", "$");
        states.defineTransition("q3", "q3", "abc$"); // Loop on all letters and accept on $
        
        // Create the parser
        Parser automataParser = new Parser(alphabet, states);
        
        // Walk the parse tree and use the automata to validate the input
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyListener(automataParser), tree);
    }
}