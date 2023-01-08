package ru.vsu.cs.semenov_d_s.Math;

import ru.vsu.cs.semenov_d_s.Math.Matrix.Matrix3;

public class Main {
    public static void main(String[] args) {
        Matrix3 m1 = Matrix3.readMatrix3();
        Matrix3 m2 = Matrix3.readMatrix3();
        Matrix3.printMatrix3(Matrix3.sumMatrix3(m1, m2));
    }
}