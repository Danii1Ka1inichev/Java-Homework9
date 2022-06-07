public class Task {
    public static void main(String [] args){

        Integer[] digits = new Integer[]{1,2,3,4,5};

        Func func = Integer::sum;

        System.out.println(reduce(func, digits ));

    }

    public static int reduce(Func f, Integer[] e){

        int y;
        int x = 0;

        for(int i = 0; i<e.length; i++){
            x += (y =  e [i]);
        }
        return x;
    }
}