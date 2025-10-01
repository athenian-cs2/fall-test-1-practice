import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTests {

    private final OperatorsPractice operatorsPractice = new OperatorsPractice();
    private final MathPractice mathPractice = new MathPractice();
    private final LoopsPractice loopsPractice = new LoopsPractice();
    private final StringsPractice stringsPractice = new StringsPractice();
    private final BinaryPractice binaryPractice = new BinaryPractice();
    private final ArraysPractice arraysPractice = new ArraysPractice();

    @Test
    public void testIsEven() {
        assertTrue(operatorsPractice.isEven(4));
        assertTrue(operatorsPractice.isEven(0));
        assertFalse(operatorsPractice.isEven(3));
        assertFalse(operatorsPractice.isEven(7));
    }

    @Test
    public void testGetLastDigit() {
        assertEquals(5, operatorsPractice.getLastDigit(12345));
        assertEquals(0, operatorsPractice.getLastDigit(100));
        assertEquals(7, operatorsPractice.getLastDigit(7));
        assertEquals(9, operatorsPractice.getLastDigit(999));
    }

    @Test
    public void testIsInRange() {
        assertTrue(operatorsPractice.isInRange(5, 1, 10));
        assertTrue(operatorsPractice.isInRange(1, 1, 10));
        assertTrue(operatorsPractice.isInRange(10, 1, 10));
        assertFalse(operatorsPractice.isInRange(0, 1, 10));
        assertFalse(operatorsPractice.isInRange(11, 1, 10));
    }

    @Test
    public void testRollDice() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 1000; i++) {
            int result = mathPractice.rollDice();
            assertTrue(result >= 1 && result <= 6);
            min = Math.min(min, result);
            max = Math.max(max, result);
        }
        assertEquals(1, min, "Expected minimum value of 1 to be reached in 1000 trials");
        assertEquals(6, max, "Expected maximum value of 6 to be reached in 1000 trials");
    }

    @Test
    public void testRandomInRange() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 1000; i++) {
            int result = mathPractice.randomInRange(10, 20);
            assertTrue(result >= 10 && result <= 20);
            min = Math.min(min, result);
            max = Math.max(max, result);
        }
        assertEquals(10, min, "Expected minimum value of 10 to be reached in 1000 trials");
        assertEquals(20, max, "Expected maximum value of 20 to be reached in 1000 trials");
    }

    @Test
    public void testDistance() {
        assertEquals(5.0, mathPractice.distance(0, 0, 3, 4), 0.01);
        assertEquals(0.0, mathPractice.distance(1, 1, 1, 1), 0.01);
        assertEquals(10.0, mathPractice.distance(0, 0, 6, 8), 0.01);
    }

    @Test
    public void testGetWholePart() {
        assertEquals(5, mathPractice.getWholePart(5.7));
        assertEquals(0, mathPractice.getWholePart(0.99));
        assertEquals(123, mathPractice.getWholePart(123.456));
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(5.0, mathPractice.calculateAverage(10, 2), 0.01);
        assertEquals(3.0, mathPractice.calculateAverage(9, 3), 0.01);
        assertEquals(2.5, mathPractice.calculateAverage(5, 2), 0.01);
    }

    @Test
    public void testSumToN() {
        assertEquals(15, loopsPractice.sumToN(5));
        assertEquals(55, loopsPractice.sumToN(10));
        assertEquals(1, loopsPractice.sumToN(1));
        assertEquals(0, loopsPractice.sumToN(0));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, loopsPractice.factorial(5));
        assertEquals(1, loopsPractice.factorial(0));
        assertEquals(1, loopsPractice.factorial(1));
        assertEquals(24, loopsPractice.factorial(4));
    }

    @Test
    public void testIsPrime() {
        assertTrue(loopsPractice.isPrime(2));
        assertTrue(loopsPractice.isPrime(3));
        assertTrue(loopsPractice.isPrime(11));
        assertFalse(loopsPractice.isPrime(1));
        assertFalse(loopsPractice.isPrime(4));
        assertFalse(loopsPractice.isPrime(9));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, stringsPractice.countVowels("hello"));
        assertEquals(5, stringsPractice.countVowels("aeiou"));
        assertEquals(0, stringsPractice.countVowels("xyz"));
        assertEquals(2, stringsPractice.countVowels("HELLO"));
    }

    @Test
    public void testAreStringsEqual() {
        assertTrue(stringsPractice.areStringsEqual("hello", "hello"));
        assertFalse(stringsPractice.areStringsEqual("hello", "world"));
        assertTrue(stringsPractice.areStringsEqual("", ""));
    }

    @Test
    public void testIsUppercase() {
        assertTrue(stringsPractice.isUppercase('A'));
        assertTrue(stringsPractice.isUppercase('Z'));
        assertFalse(stringsPractice.isUppercase('a'));
        assertFalse(stringsPractice.isUppercase('1'));
    }

    @Test
    public void testGetAlphabetPosition() {
        assertEquals(1, stringsPractice.getAlphabetPosition('A'));
        assertEquals(26, stringsPractice.getAlphabetPosition('Z'));
        assertEquals(1, stringsPractice.getAlphabetPosition('a'));
        assertEquals(26, stringsPractice.getAlphabetPosition('z'));
    }

    @Test
    public void testDecimalToBinary() {
        assertEquals("101", binaryPractice.decimalToBinary(5));
        assertEquals("1010", binaryPractice.decimalToBinary(10));
        assertEquals("0", binaryPractice.decimalToBinary(0));
        assertEquals("1111", binaryPractice.decimalToBinary(15));
    }

    @Test
    public void testBinaryToDecimal() {
        assertEquals(5, binaryPractice.binaryToDecimal("101"));
        assertEquals(10, binaryPractice.binaryToDecimal("1010"));
        assertEquals(0, binaryPractice.binaryToDecimal("0"));
        assertEquals(15, binaryPractice.binaryToDecimal("1111"));
    }

    @Test
    public void testIsPowerOfTwo() {
        assertTrue(binaryPractice.isPowerOfTwo(1));
        assertTrue(binaryPractice.isPowerOfTwo(2));
        assertTrue(binaryPractice.isPowerOfTwo(16));
        assertFalse(binaryPractice.isPowerOfTwo(3));
        assertFalse(binaryPractice.isPowerOfTwo(10));
    }

    @Test
    public void testCreateSequence() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arraysPractice.createSequence(1, 5));
        assertArrayEquals(new int[]{0, 1, 2}, arraysPractice.createSequence(0, 2));
        assertArrayEquals(new int[]{5}, arraysPractice.createSequence(5, 5));
    }

    @Test
    public void testGetMiddleElement() {
        assertEquals(3, arraysPractice.getMiddleElement(new int[]{1, 2, 3, 4, 5}));
        assertEquals(2, arraysPractice.getMiddleElement(new int[]{1, 2, 3}));
        assertEquals(5, arraysPractice.getMiddleElement(new int[]{5}));
    }

    @Test
    public void testFindMax() {
        assertEquals(5, arraysPractice.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(10, arraysPractice.findMax(new int[]{10, 2, 5, 3}));
        assertEquals(7, arraysPractice.findMax(new int[]{7}));
    }

    @Test
    public void testReverseArray() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arraysPractice.reverseArray(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{3, 2, 1}, arraysPractice.reverseArray(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{7}, arraysPractice.reverseArray(new int[]{7}));
    }

    @Test
    public void testIsSorted() {
        assertTrue(arraysPractice.isSorted(new int[]{1, 2, 3, 4, 5}));
        assertTrue(arraysPractice.isSorted(new int[]{1, 1, 2, 3}));
        assertFalse(arraysPractice.isSorted(new int[]{5, 4, 3, 2, 1}));
        assertFalse(arraysPractice.isSorted(new int[]{1, 3, 2, 4}));
        assertTrue(arraysPractice.isSorted(new int[]{5}));
    }
}
