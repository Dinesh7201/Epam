/*
Input: Array of elements

["h","o","l","a"]

Output: String with comma delimited elements of the array in th same order.

"h,o,l,a"
*/
//Printing_Array_elements_with_Comma_delimiters

function printArray(array) {
    let result = '';
    for (let i = 0; i < array.length; i++) {
        result += array[i].toString();
        if (i < array.length - 1) {
            result += ',';
        }
    }
    return result;
}
