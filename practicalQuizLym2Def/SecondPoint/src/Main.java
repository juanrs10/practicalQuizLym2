import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import grammarDefLexer.java

public class Main {

    public static void main(String[] args) throws IOException {
        // Create the input stream from the input file
        String inputFile = "input.txt";
        CharStreams input = CharStreams.fromFileName(inputFile);

        // Create the lexer and parser
        grammarDefLexer lexer = new grammarDefLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        grammarDefParser parser = new grammarDefParser(tokens);

        // Parse the input and generate the parse tree
        ParseTree tree = parser.rulelist();

        // Print the parse tree
        System.out.println(tree.toStringTree(parser));
    }
}