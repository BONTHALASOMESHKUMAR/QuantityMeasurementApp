import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetEquality() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(l1, l2);
    }

    @Test
    void testInchesEquality() {
        Length l1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length l2 = new Length(1.0, Length.LengthUnit.INCHES);

        assertEquals(l1, l2);
    }

    @Test
    protected void testFeetInchesComparison() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);

        assertEquals(feet, inches);
    }

    @Test
    void testInequality() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(2.0, Length.LengthUnit.FEET);

        assertNotEquals(l1, l2);   // ✔ correct
    }

    @Test
    void testNullComparison() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);

        assertNotEquals(null, l1);   // ✔ FIXED
    }
}