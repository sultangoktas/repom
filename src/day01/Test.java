package day01;

public class Test extends calisma01 {
    int x = 4;
    int getSum(){
        return x + x;
    }
    int getSum(int x, int y){
        int z = x + y;
        System.out.print(z);
        return z;
    }

    @Override
    int getSum(int x) {
        return 0;
    }

    public static void main(String[] args){
        calisma01 sub = new Test();
        sub.getSum(4,2);
    }
}
