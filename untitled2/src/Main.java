public class Main {

    public static double[] calculateAk(double[] f, int N) {
        double[] A = new double[N];
        for (int k = 0; k < N; k++) {
            double sum = 0.0;
            for (int j = 0; j < N; j++) {
                sum += f[j] * Math.cos(2 * Math.PI * k * j / N);
            }
            A[k] = sum / N;
        }
        return A;
    }

    public static double[] calculateBk(double[] f, int N) {
        double[] B = new double[N];
        for (int k = 0; k < N; k++) {
            double sum = 0.0;
            for (int j = 0; j < N; j++) {
                sum += f[j] * Math.sin(2 * Math.PI * k * j / N);
            }
            B[k] = sum / N;
        }
        return B;
    }

    public static double calculateT(double[] A, double[] B, double x) {
        int n = A.length;
        double T = A[0] / 2;

        for (int k = 1; k < n; k++) {
            T += A[k] * Math.cos(k * x) + B[k] * Math.sin(k * x);
        }

        return T;
    }

    public static void main(String[] args) {
        double[] f = {1.0, 0.5, -0.5, -1.0, -0.5, 0.5};
        int N = f.length;

        double[] A = calculateAk(f, N);
        double[] B = calculateBk(f, N);

        double x = Math.PI / 4;

        double result = calculateT(A, B, x);

        System.out.println("T(" + x + ") = " + result);
    }
}