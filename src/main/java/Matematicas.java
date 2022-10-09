public class Matematicas {
    public boolean esPar(int x){
        return x%2 == 0;
    }

    public int factorial(int x){
        if (x<0){
            return 0;
        }
        else if (x==0){
            return 1;
        }else{
            return x * factorial(x-1);
        }
    }

    public int fibonacci(int x){
        if (x<=0){
            return 0;
        }else if (x==1){
            return 1;
        }else{
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
}
