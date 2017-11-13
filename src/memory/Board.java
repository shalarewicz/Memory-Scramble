/* Copyright (c) 2017 MIT 6.031 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package memory;

import java.io.IOException;
import java.util.Set;

/**
 * TODO specification
 * Mutable and threadsafe.
 * 
 * <p>PS4 instructions: the specifications of static methods
 * {@link #parseFromFile(String)} and {@link #generateRandom(int, int, Set)} are
 * required.
 */
public class Board {
    
    /**
     * Make a new board by parsing a file.
     * 
     * @param filename path to a game board file
     * @return a new board with the size and cards from the given file
     * @throws IOException if an error occurs reading or parsing the file
     */
    public static Board parseFromFile(String filename) throws IOException {
        throw new RuntimeException("unimplemented");
    }
    
    /**
     * Make a new random board.
     * 
     * @param columns board width
     * @param rows board height
     * @param cards cards that appear on the board
     * @return a new columns-by-rows-size board filled randomly with the given
     *         cards in as equal numbers as possible
     */
    public static Board generateRandom(int columns, int rows, Set<String> cards) {
        throw new RuntimeException("unimplemented");
    }
    
    // TODO fields
    
    // Abstraction function:
    //   TODO
    // Representation invariant:
    //   TODO
    // Safety from rep exposure:
    //   TODO
    // Thread safety argument:
    //   TODO
    
    // TODO constructor(s)
    
    // TODO checkRep
    
    // TODO other methods
    
}
