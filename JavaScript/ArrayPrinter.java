/*
Input: Array of elements

["h","o","l","a"]

Output: String with comma delimited elements of the array in th same order.

"h,o,l,a"
*/
//Printing_Array_elements_with_Comma_delimiters

public class ArrayPrinter {
    public static String printArray(Object[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i].toString());
            if (i < array.length - 1) {
                result.append(",");
            }
        }
        return result.toString();
    }
}
