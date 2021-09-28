package Maximum;

public class Generic <T extends Comparable<T>> {
public void compare(T a, T b, T c){
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
