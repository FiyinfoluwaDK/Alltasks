public class TaskSix{
    public static void main (String []args){
    
    int count = 1;
    int productCount = 1;
    
    for(; count <= 10; count++){
        if(count % 4 == 0){
            for(int counter = 1; counter <= 5; counter++){
            productCount = productCount * count;
        System.out.printf("\s" + productCount);
        
        }
        
        }
    }
}
}
