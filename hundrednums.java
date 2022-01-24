public class MyClass {
    public static void main(String args[]) {
        int x=101;

        for(int i = 0;i<x ;i++){
            if(i%5==0 && i%3==0){
              System.out.println("mareigua");
                
            }
            else{
                if(i%3==0){
                  System.out.println("mare");
                    
                }
                else if(i%5==0){
                  System.out.println("igua");
                    
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
}