public class SecondProgram {

    public static void main(String[] args) {

        int []num={100, 300, 500, 600, 200, 400, 300, 100};

        boolean isduplicate=false;

           for (int i=0;i<num.length;i++){

               for (int j=i+1;j<num.length;j++){
                   if(num[i]==num[j]) {
                       System.out.println("Duplicate found " + num[i]);
                       isduplicate = true;
                   }

               }
        }
           if(!isduplicate) {
               System.out.println(" No Duplicate found ");
           }
    }
}
