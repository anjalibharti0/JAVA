class negativeException extends Exception{
    @Override
    
        public String toString(){
            return"radius cant be negative";
        }
        @Override
        public String getMessage(){return "radius cant be negative";}
    }



public class throws2{
    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
    }
     public static int divide(int a,int b) throws ArithematicException{//harray ne bata diya ki yh function throw krta h error
        int result=a/b;//made by harry
        return result;
    }
    public static void main(String[] args) {
        try{
            //shivam divide krna chahta h function created by harry
        int c=divide(6,0);}

        System.out.println(c);}
        catch(Exception e){
        System.out.println("Eception",e.getMessage());
   
        }
        try{
            area(6);//throws give the overview that it is negative exception
        }
      catch(Eception e){
        System.out.println("Exception");
      }    
    }
