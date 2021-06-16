public class exams {

    public static int[] islem(int[] dizi){
         int a=0;
        for (int i=0;i<dizi.length ;i++){
            for (int j=0 ;j<dizi.length-1;j++){
                if (dizi[j]>dizi[j+1]){
                    a=dizi[j+1];
                    dizi[j+1]=dizi[j];
                    dizi[j]=a;
                }
            }
        }

        return dizi;
    }

    public static void main(String[] args) {

        int[] dizi= {45,2,78,23,9,79,1};
        int[] dizi2=new int[dizi.length];
        dizi2=islem(dizi);
for (int i=0;i<dizi.length;i++){
    System.out.println(dizi2[i]);
}
    }



}
