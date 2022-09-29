public class Week4 {
    
    /**
     * Comment.
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Comment.
     */
    public static int minArray (int[] array) {
        if (array.length == 0) return 0;
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            minValue = Math.min(minValue, array[i]);
        }
        return minValue;
    }

    /**
     * Comment.
     */
    public static String calculateBMI(double weight, double height){
        double BMI = weight / (height * height);
        BMI = Math.round(BMI * 10.0) / 10.0;
        if (BMI < 18.5) {
            return "Thieu can";
        }
        if (BMI < 23.0) {
            return "Binh thuong";
        }
        if (BMI < 25.0) {
            return "Thua can";
        }
        return "Beo phi";
    }
}