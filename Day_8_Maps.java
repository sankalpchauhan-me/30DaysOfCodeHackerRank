import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sankalp
 */
public class Solution {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> ajeeb = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            ajeeb.put(name, phone);
            
        
        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
            if(ajeeb.containsKey(name)){
                int phone = ajeeb.get(name);
                System.out.println(name + "=" + phone);
            }
            else 
                System.out.println("Not Found");
        }
        in.close();
    }
    
}
