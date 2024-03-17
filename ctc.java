import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        //fill the code here
        System.out.println("Enter the first string");
        String f= sc.nextLine();
        System.out.println("Enter the second string");
        String s= sc.nextLine();
        if(f.length()!=s.length()){
            System.out.println("Length of the strings "+f+" and "+s+" does not match");
            return;
        }
        boolean rf=isValid(f);
        boolean rs=isValid(s);
        if(!rf && !rs){
            System.out.println(f+" and "+s+" contains invalid symbols");
            return;
        }
        else if(!rf){
            System.out.println(f+" contains invalid symbols");
            return;
        }
        
        else if(!rs){
            System.out.println(s+" contains invalid symbols");
            return;
        }
        
        StringBuilder res=new StringBuilder();
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)=='!'){
                res.append(s.charAt(i));
            }
            else{
                res.append(f.charAt(i));
            }
        }
        System.out.println(res);
        
        
    }
    private static boolean isValid(String f){
            for(char c:f.toCharArray()){
                if(!Character.isLetter(c) && c!='!' && c!=' '){
                    return false;
                }
            }
            
            return true;
        
        }
        
    
}
