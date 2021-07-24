class Solution {
    public double myPow(double x, int n) {
        double temp=1.00000;
        if(n>0){
            temp = multiplication_loop(x,n,temp);
            return temp;
        }else if(n<0){
            n= -n;
             temp = multiplication_loop(x,n,temp);
             temp = 1/temp; 
            return temp;
        }else{
                 temp = 1.00000;
                return temp;
        }   
    }  
    public double multiplication_loop(double x,int n,double temp){
    
        for(int i=1; i<=n; i++){
                 temp =  temp * x;
             }
        return temp;
    }
}