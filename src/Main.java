import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        double[] y = new double[] { 1, 1.5, 2, 4 };
//        double[] x = new double[] { 1, 2, 3, 4 };
//
//        // double[,] xArray;
//        double[] ratio;
//
//        System.out.println("一次拟合计算：");
//        ratio = FittingFunct.linear(y, x);
//        for (double num : ratio) {
//            System.out.println(num);
//        }
//        double a = ratio[0];
//        double b = ratio[1];
//        System.out.println("R2=" + FittingFunct.calRSquare_linear(x, y, a, b));
//
//        System.out.println("对数拟合计算：");
//        ratio = FittingFunct.logest(y, x);
//        for (double num : ratio) {
//            System.out.println(num);
//        }
//        a = ratio[0];
//        b = ratio[1];
//        System.out.println("R2=" + FittingFunct.calRSquare_logest(x, y, a, b));
//
//        System.out.println("幂函数级数拟合计算：");
//        ratio = FittingFunct.powEST(y, x);
//        for (double num : ratio) {
//            System.out.println(num);
//        }
//        a = ratio[0];
//        b = ratio[1];
//        System.out.println("R2=" + FittingFunct.calRSquare_powEST(x, y, a, b));
//
//        System.out.println("指数函数拟合计算：");
//        ratio = FittingFunct.indexEST(y, x);
//        for (double num : ratio) {
//            System.out.println(num);
//        }
//        a = ratio[0];
//        b = ratio[1];
//        System.out.println("R2=" + FittingFunct.calRSquare_indexEST(x, y, a, b));
       readData();
    }

    private static void readData() {
        try {
            Scanner scanner = new Scanner(new File("src/data.txt"));
            List<ArrayList<Double>> matrix = new ArrayList<>();
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineSpilt = line.split("\t");
                ArrayList<Double> doubleList = new ArrayList<>();
                for (int i = 0; i < lineSpilt.length; i++) {
                    doubleList.add(Double.parseDouble(lineSpilt[i]));
                }
                matrix.add(doubleList);
            }
            System.out.println(matrix.size());
            run(matrix);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void run(List<ArrayList<Double>> matrix) {
//        System.out.println(matrix);
        double[] x = new double[]{2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Double> line = matrix.get(i);
            double[] y = new double[line.size()];
            for (int j = 0; j < line.size(); j++) {
                y[j] = line.get(j);
//                System.out.print(y[i] + ",");
            }
//            System.out.println();
            double[] ratio;
            ratio = FittingFunct.indexEST(y, x);
            System.out.println(ratio[0] + "," + ratio[1]);
        }
    }

    private static void  makeData() {
        float c = 1.3f;
        float m = 2.4f;
        double[] x = new double[10000];
        double[] y = new double[10000];
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            x[i] = random.nextDouble();
            y[i] = c * Math.pow(m, x[i]);
        }

        for (int i = 0; i < 100; ) {
            x[i] = random.nextDouble();
            y[i] = Math.pow(x[i], 2) + 0.01;
            i++;
                y[i] = Math.pow(x[i], 2) + 0.02;
                i += 10;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":" + x[i] + "," + y[i] + "," + x[i] * x[i]);
        }
        double[] ratio;
        ratio = FittingFunct.indexEST(y, x);
        for (double num : ratio) {
            System.out.println(num);
        }
    }
}