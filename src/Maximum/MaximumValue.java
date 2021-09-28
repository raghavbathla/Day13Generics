package Maximum;

public class MaximumValue  {
   public void firstTest(){
       Integer a = 80;
       Integer b =40;
       Integer c = 60;
       int result = a.compareTo(b);
       if(result>=1){
           int result2 = a.compareTo(c);
           if(result2>=1){
               System.out.println(a);
           }
           else
           {
               System.out.println(c);
           }
       }
       else {
           int result2 = b.compareTo(c);
           if(result2>=1){
               System.out.println(b);
           }
           else
           {
               System.out.println(c);
           }
       }
   }

    public void strFirstTest(){
        String a = "Tiger is our national Animl";
        String b ="40";
        String c = "60";
        int result = a.compareTo(b);
        if(result>=1){
            int result2 = a.compareTo(c);
            if(result2>=1){
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else {
            int result2 = b.compareTo(c);
            if(result2>=1){
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }

    public void floatFirstTest(){
        Float a = 30F;
        Float b = 20F;
        Float c = 10F;
        int result = a.compareTo(b);
        if(result>=1){
            int result2 = a.compareTo(c);
            if(result2>=1){
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else {
            int result2 = b.compareTo(c);
            if(result2>=1){
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
    }


}
