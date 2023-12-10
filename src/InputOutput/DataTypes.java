package InputOutput;

class DataTypes {
    public static void main(String[] args) {
        long exampleLong = 123456789012345678L;
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        int sizeInBytes = Long.BYTES;
        System.out.println("Size of long in bytes: " + sizeInBytes);

        int widthInBits = Long.SIZE;
        System.out.println("Width of long in bits: " + widthInBits);

        System.out.println("Example long value: " + exampleLong);
    }
}
