public class exams {
    public static void main(String[] args) {
        System.out.println(add(1,1));


        int[] dizi= {45,2,78,23,9,78,1};

int a=dizi(21);
        System.out.println("a="+a);

        String aa="mahsum ";
        String b="ozer";
        System.out.println("concat ="+aa.concat(b));

    }
    public static int dizi(int dizi){
if (dizi==0){

    return dizi;
}System.out.println(dizi);
        return dizi(dizi-1);
    }
///

//
    public static int add(int a, int b){
        return a+b;
    }
}
