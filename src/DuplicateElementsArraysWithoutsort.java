public class DuplicateElementsArraysWithoutsort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 2, 1, 5};

         int len=arr.length;
                             System.out.println(len);
         int []result=new int[len];

         int count=0;
                               System.out.println(count);

         for (int i=0;i<len;i++){

             boolean found =false;

             // Check if arr[i] is already in result

             for (int j = 0; j < count; j++) {
                 if (arr[i] == result[j])
                 {
                        found = true;
                        break;
                 }
             }
             // If not found, add to result
             if (!found) {
                 result[count] = arr[i];
                 count++;
             }
         }
        System.out.print("Unique elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
