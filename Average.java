public class Average {
    public static void main(String[] args){
        double[] numArray = {2.4,5,7,3,7,9,6};
        double sum = 0.0;

        for (double num: numArray){
            sum += num;
        }
        double average = sum / numArray.length;
        System.out.format("Average value of array elements is: %.2f " , average);
    }
}
