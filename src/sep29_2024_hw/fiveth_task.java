package sep29_2024_hw;

public class fiveth_task {
    public static void main(String[] args) {
        String s = "donut,milk,breath,candle,shelf";
        String[] splitS = s.split(",");

        int i;
        for (i = 0; i < splitS.length; i++) {
            System.out.print(splitS[i] + ", ");
        }
    }
}
