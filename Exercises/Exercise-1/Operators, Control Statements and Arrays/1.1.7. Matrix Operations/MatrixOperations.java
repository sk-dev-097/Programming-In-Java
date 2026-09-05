import java.util.Scanner;

class Matrix {
    int rows, cols;
    int[][] mat;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mat = new int[rows][cols];
    }

    void readMatrix(Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void display(String message) {
        System.out.println(message);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static Matrix add(Matrix A, Matrix B) {
        if (A.rows != B.rows || A.cols != B.cols) {
            System.out.println("Addition not possible");
            return null;
        }

        Matrix C = new Matrix(A.rows, A.cols);
        for (int i = 0; i < A.rows; i++) {
            for (int j = 0; j < A.cols; j++) {
                C.mat[i][j] = A.mat[i][j] + B.mat[i][j];
            }
        }
        return C;
    }

    static Matrix subtract(Matrix A, Matrix B) {
        if (A.rows != B.rows || A.cols != B.cols) {
            System.out.println("Subtraction not possible");
            return null;
        }

        Matrix C = new Matrix(A.rows, A.cols);
        for (int i = 0; i < A.rows; i++) {
            for (int j = 0; j < A.cols; j++) {
                C.mat[i][j] = A.mat[i][j] - B.mat[i][j];
            }
        }
        return C;
    }

    static Matrix multiply(Matrix A, Matrix B) {
        if (A.cols != B.rows) {
            System.out.println("Multiplication not possible");
            return null;
        }

        Matrix C = new Matrix(A.rows, B.cols);
        for (int i = 0; i < A.rows; i++) {
            for (int j = 0; j < B.cols; j++) {
                for (int k = 0; k < A.cols; k++) {
                    C.mat[i][j] += A.mat[i][k] * B.mat[k][j];
                }
            }
        }
        return C;
    }

    Matrix transpose() {
        Matrix T = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T.mat[j][i] = mat[i][j];
            }
        }
        return T;
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first matrix
        System.out.println("Rows and columns:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        Matrix A = new Matrix(r1, c1);
        System.out.println("First matrix:");
        A.readMatrix(sc);

        // Read second matrix
        System.out.println("Rows and columns:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        Matrix B = new Matrix(r2, c2);
        System.out.println("Second matrix:");
        B.readMatrix(sc);

        // Display matrices
        A.display("Matrix A:");
        B.display("Matrix B:");

        // Perform a single operation
        System.out.println("Choose an option:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Transpose");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Matrix C = Matrix.add(A, B);
                if (C != null) C.display("Addition:");
                break;
            case 2:
                Matrix D = Matrix.subtract(A, B);
                if (D != null) D.display("Subtraction:");
                break;
            case 3:
                Matrix E = Matrix.multiply(A, B);
                if (E != null) E.display("Multiplication:");
                break;
            case 4:
                Matrix T = A.transpose();
                T.display("Transpose:");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
