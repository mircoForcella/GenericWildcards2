public class Main {
    public static void main(String[] args) {
        GenericsClass<Integer> firstElement = new GenericsClass();
        GenericsClass<Integer> secondElement = new GenericsClass();
        GenericsClass<String> thirdElement = new GenericsClass();
        GenericsClass<String> fourthElement = new GenericsClass();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a String");
        fourthElement.setT("This is a String");

        System.out.println("first element is equal to second element?" + GenericsClass.isEqual(firstElement, secondElement));
        System.out.println("third element is equal to fourth element?" + GenericsClass.isEqual(thirdElement, fourthElement));

    }
}
