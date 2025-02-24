package ex3_2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        if (coeffs.length == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) {
                continue;
            }

            if (coeffs[i] > 0 && i < coeffs.length - 1) {
                sb.append(" + ");
            }

            if (i == 0) {
                sb.append(coeffs[i]);
            } else {
                sb.append(coeffs[i]).append("x");
                if (i > 1) {
                    sb.append("^").append(i);
                }
            }
        }

        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int degree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[degree + 1];

        for (int i = 0; i < newCoeffs.length; i++) {
            double coeff1 = (i < this.coeffs.length) ? this.coeffs[i] : 0;
            double coeff2 = (i < right.coeffs.length) ? right.coeffs[i] : 0;
            newCoeffs[i] = coeff1 + coeff2;
        }

        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int degree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[degree + 1];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}
