public class Find_maximume_number {
    public static void main(String[] args) {
        int array[]={3,5,4,6,5,6,7,7,8,6,7,5,6,5,5};
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("the largest element in array....."+max);
    }
}
