package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    // Generic Length equality
    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }

    // Feet equality
    public static void demonstrateFeetEquality() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(1.0, Length.LengthUnit.FEET);

        System.out.println("Feet equal: " + demonstrateLengthEquality(f1, f2));
    }

    // Inches equality
    public static void demonstrateInchesEquality() {
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(1.0, Length.LengthUnit.INCHES);

        System.out.println("Inches equal: " + demonstrateLengthEquality(i1, i2));
    }

    // Cross comparison
    public static void demonstrateFeetInchesComparison() {
        Length f = new Length(1.0, Length.LengthUnit.FEET);
        Length i = new Length(12.0, Length.LengthUnit.INCHES);

        System.out.println("Feet vs Inches equal: " + demonstrateLengthEquality(f, i));
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}