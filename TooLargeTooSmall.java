
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author Leila Hsiao
 * @version 2/5/2020
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        Integer res = 0;
        
        //if the guess number is bigger then the given seed, return1
        //if the guess number is smaller then the given seed, return-1
        //if the guess number is equal to the given seed, return0
        if( chosenNum < g ){
            res = 1;
        }else if( chosenNum > g ){            
            res = -1;
        }else{
            res = 0;
        }        
        return res;
    }
}