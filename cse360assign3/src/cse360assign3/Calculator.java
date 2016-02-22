/** Calculator performs some basic mathematical calculations.
 *
 * @author Hannah Van Den Bosch (826)
 * @version February 22 2016
 */

package cse360assign3;

public class Calculator {

    private int total;

    /** Constructor */
    public Calculator() {
        total = 0; // not needed - included for clarity
    }

    /** getTotal returns the total variable.
     * 
     * @return  Total value. */
    public int getTotal() {
        return total;
    }

    /** add adds the parameter to the total variable.
     *
     * @param   value Amount to be added to the total.
     */
    public void add(int value) {
        total += value;
    }

    /** subtract subtracts the parameter from the total variable.
     *
     * @param   value Amount to be subtracted from the total.
     */
    public void subtract(int value) {
        total -= value;
    }

    /** multiply multiplies the total by the parameter.
     *
     * @param   value Amount to be multiplied by the total.
     */
    public void multiply(int value) {
        total *= value;
    }

    /** divide divides the total by the parameter.
    *
    * @param    value Amount to be divided by the total.
    */
    public void divide(int value) {
        if (value == 0) {
            total = 0;
        } else {
            total /= value;
        }
    }

    /** getHistory returns an empty String.
     * 
     * @return  Empty String. */
    public String getHistory() {
        return "";
    }
}