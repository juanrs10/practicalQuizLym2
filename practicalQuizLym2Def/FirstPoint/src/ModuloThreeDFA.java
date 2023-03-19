import com.creativewidgetworks.goldparser.engine.*;

public class ModuloThreeDFA {

    public static void main(String[] args) {
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
        Parser parser = new Parser(alphabet, states);
        
        // Parse an example input string
        ParseTree parseTree = parser.parse("aabbbccc$");
        
        // Print whether the input was recognized by the automata
        System.out.println(parseTree != null);
    }
}