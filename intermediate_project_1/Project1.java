/*
 * @author Kenneth Mathenge
 */
public class Project1 {

    /*
     * A method to find the minimum weight
     * 
     * @params Weight
     * 
     * @return Weight, the minimum weight
     */
    private static Weight findMinimum(Weight weight1, Weight weight2, Weight weight3) {
        Weight[] weights = new Weight[] { weight1, weight2, weight3 };
        Weight minWeight = weights[0];
        for (int i = 1; i < weights.length; i++) {
            if (weights[i].lessThan(minWeight)) {
                minWeight = weights[i];
            }
        }

        System.out.println("The minimum weight is " + minWeight.toString());
        return minWeight;
    }

    /*
     * A method to find the maximum weight
     * 
     * @params Weight
     * 
     * @return Weight, the maximum weight
     */
    private static Weight findMaximum(Weight weight1, Weight weight2, Weight weight3) {
        Weight[] weights = new Weight[] { weight1, weight2, weight3 };
        Weight maxWeight = weights[0];
        for (int i = 1; i < weights.length; i++) {
            if (weights[i].lessThan(maxWeight) == false) {
                maxWeight = weights[i];
            }
        }

        System.out.println("The maximum weight is " + maxWeight.toString());
        return maxWeight;
    }

    /*
     * A method to find the average weight
     * 
     * @params Weight
     * 
     * @return Weight, the average weight
     */
    private static Weight findAverage(Weight weight1, Weight weight2, Weight weight3) {
        final Weight averageWeight = new Weight(0, 0);
        Weight[] weights = new Weight[] { weight1, weight2, weight3 };
        for (int i = 1; i < weights.length; i++) {
            averageWeight.addTo(weights[i]);
        }
        averageWeight.divide(weights.length);

        System.out.println("The average weight is " + averageWeight.toString());
        return averageWeight;
    }

    public static void main(String[] args) {
        Weight weight1 = new Weight(11, 3);
        Weight weight2 = new Weight(7, 20);
        Weight weight3 = new Weight(14, 6);

        System.out.println("");
        findMinimum(weight1, weight2, weight3);
        findMaximum(weight1, weight2, weight3);
        findAverage(weight1, weight2, weight3);
    }
}
