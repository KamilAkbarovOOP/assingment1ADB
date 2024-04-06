import java.util.Scanner;

public class Main {
    public static int Minimum(int n, int[] arr) {//Complexity Linear - O(n)
        int min = 10000;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(Minimum(n, arr));
    }


    public static float AVG(int n, int[] arr) {//Complexity Linear - O(n)
        float total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        return total / n;
    }

    public static void task2(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n;i++) {
        arr[i] = sc.nextInt();
    }
    System.out.print(AVG(n, arr));
    }



    public static String Prime(int n) {//Complexity linear - O(n)
        if (n <= 1) return "Nothing";
        int sq = (int) Math.sqrt(n);
        for (int i = 2; i <=sq; i++) {
            if(n % i == 0) return "Composed";
        }
        return "Prime";
    }

    public static void task3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Prime(n));
    }


    public static int fac(int n) {//Complexity Exponential - O(2^n)
        if (n <= 1) return 1;
        return n * fac(n-1);
    }

    public static void task4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fac(n));
    }


    public static int Fib(int n) {//Complexity Exponential - O(2^n)
        if (n == 1) return 1;
        if (n == 0) return 0;
        return Fib(n - 1) + Fib (n - 2);
    }

    public static void task5(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Fib(n));
    }


    public static int Pow(int a, int n) {//Complexity Linear - O(n)
        int temp = a;
        for(int i = 1; i < n; i++){
            a*=temp;
        }
        return a;
    }

    public static void task6(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(Pow(a, n));
    }

    public static void Permut(String n){ //Complexity Quadratic -  O(n^2)
        char[] arr = new char[n.length()];
        for (int i = 0; i < n.length(); i++){
            arr[i] = n.charAt(i);
        }
        PermutHelper(arr, 0);
    }

    private static void PermutHelper(char[] arr, int index){
        if (index == arr.length - 1){
            for (int i = 0; i < arr.length; ++i){
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++){
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            PermutHelper(arr, index+1);
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void task7(){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Permut(n);
    }


    public static String isInt(String n) {//Complexity Constant - O(1)
        try{
            int i = Integer.parseInt(n);
            return "Yes";
        }
        catch (NumberFormatException numberFormatException){
            return "No";
        }
    }


    public static void task8() {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.print(isInt(n));
    }


    public static int BinomialCoef(int n, int k) {//Complexity Exponential - O(2^n)
        if (k == n || k == 0) return 1;
        return BinomialCoef(n - 1, k - 1) +
                BinomialCoef(n - 1, k);
    }

    public static void task9 (){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(BinomialCoef(n, k));
    }

    public static int Euclid(int a, int b) {//Complexity Logarithmic - O(log(n))
        if (b == 0) return a;
        return Euclid(b, a%b);
    }


    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(Euclid(a, b));
    }


    public static void main(String[] args) {
        task7();
    }
}

