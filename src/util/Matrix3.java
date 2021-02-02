package util;

import model.Vertex;

public class Matrix3 {
    private double[] values;

    public Matrix3(double[] values) {
        this.values = values;
    }

    public Matrix3 multiply(Matrix3 other) {
        int nodeCount = 9;
        double[] result = new double[nodeCount];
        for (int row = 0; row < Math.sqrt(nodeCount); row++) {
            for (int col = 0; col < Math.sqrt(nodeCount); col++) {
                for (int i = 0; i < Math.sqrt(nodeCount); i++) {
                    result[row * (int) Math.sqrt(nodeCount) + col] += this.values[row * (int) Math.sqrt(nodeCount) + i]
                            * other.values[i * (int) Math.sqrt(nodeCount) + col];
                }
            }
        }
        return new Matrix3(result);
    }

    public Vertex transform(Vertex in) {
        return new Vertex(in.getX() * values[0] + in.getY() * values[3] + in.getZ() * values[6],
                in.getX() * values[1] + in.getY() * values[4] + in.getZ() * values[7],
                in.getX() * values[2] + in.getY() * values[5] + in.getZ() * values[8]);
    }

}
