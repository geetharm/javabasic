package basicpackage;

import java.util.List;
import java.util.ArrayList;

public class Permutations {

    public List<String> permutations(String input){
        
        List<String> stList = new ArrayList<String>();
        getPermutations("", input, stList);
        return stList;    
    }
    
    
    public void getPermutations(String cons, String input, List<String> list){
    
        if(input.isEmpty()){
            list.add(cons+input);
            return;
        }
        
        for(int i = 0; i < input.length(); i++){
            getPermutations(cons+input.charAt(i), 
                           input.substring(0,i)+input.substring(i+1),
                           list);
        }
        
    }
    
    public static void main(String[] args) {
       
        Permutations st = new Permutations();
        List<String> op = new ArrayList<String>();
        op = st.permutations("abc");
        System.out.println(op);
        
    }

}
