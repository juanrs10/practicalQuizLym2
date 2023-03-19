private static final int MAX_OCCURRENCES = 5;

private Automata automata;
private Map<String, Integer> letterCounts;

public DFA() {
    // Define the states
    automata = new Automata();
    automata.defineState("q0", true, false); // Start state
    automata.defineState("q1", false, false);
    automata.defineState("q2", false, false);
    automata.defineState("q3", false, true); // Final state

    // Define the alphabet
    String alphabet = "abc$";

    // Define the transition function
    automata.defineTransition("q0", "q0", alphabet); // Loop on all letters
    automata.defineTransition("q0", "q1", alphabet);
    automata.defineTransition("q0", "q2", alphabet);
    automata.defineTransition("q1", "q0", alphabet);
    automata.defineTransition("q1", "q2", alphabet);
    automata.defineTransition("q1", "q3", "$");
    automata.defineTransition("q2", "q0", alphabet);
    automata.defineTransition("q2", "q1", alphabet);
    automata.defineTransition("q2", "q3", "$");
    automata.defineTransition("q3", "q3", alphabet + "$"); // Loop on all letters and accept on $
    letterCounts = new HashMap<>();
    letterCounts.put("a", 0);
    letterCounts.put("b", 0);
    letterCounts.put("c", 0);
}

public boolean recognize(String input) {
    automata.reset();
    letterCounts.replaceAll((k, v) -> 0); // Reset the letter counts

    for (int i = 0; i < input.length(); i++) {
        String letter = Character.toString(input.charAt(i));
        if (!letterCounts.containsKey(letter)) {
            continue; // Ignore unrecognized letters