public class Firstone {


    static void family(String fname,String lname){

        System.out.println("firstname :" +fname + " lastname : " +lname);


    }


    public static void main(String []args){

        String[] words={"Hello","Good Morning","Good EVENING","WELCOME"};

        for (int i=0;i<words.length;i++){

            String w=words[i].toLowerCase();
            System.out.println(w);

            System.out.println("we converted uppercase to lowercase");

        }


        family("Banala"," Naveen");

        family("Banala"," krishna");
        family("Banala"," suguna");
        family("Banala"," raj");

        family("Banala"," naveena");
        family("Banala"," ruhansi");




    }
}
