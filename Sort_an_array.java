public class Sort_an_array {
    public static void main(String[] args) {
        int array[]={9,8,7,6,5,4,3,2,2,3,4};
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
