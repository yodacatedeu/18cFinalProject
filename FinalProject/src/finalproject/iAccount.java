/*
Interface for account objects
 */
package finalproject;

import java.math.BigDecimal;


public interface iAccount {
    void depositChecking (BigDecimal amount);
    void withdrawlChecking (BigDecimal amount); 
    void depositSavings (BigDecimal amount); 
    void withdrawlSavings (BigDecimal amount);
}
