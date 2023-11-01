public class Prime {
    public static void main(String[] args) {
        boolean result=true;
        for(int i=2;i<=100;i++){
            for (int j=2;j<i;j++){
                if(i%j==0){
                    result=false;
                }
            }
            if(result){
                System.out.println(i);
            }
            result=true;
        }
    }
}
