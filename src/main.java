public class main {
    ///english class <><><><><>
    public static void main(String[] args) {
    dortislem(10,20,'+');
    }
    // 3 prameteres , 2 number , 1 operator
//ex :10 20
    //0.5

    public static void dortislem (double a,double b,char c){
        if (c=='/'){
            System.out.println(a/b);
        }else if(c=='*'){
            System.out.println(a*b);
        }else if(c=='+'){
            System.out.println(a+b);
        }else if(c=='-'){
            System.out.println(a-b);
        }
    }



}
//dd