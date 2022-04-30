public class Min_Max_element {
    public static void main(String[] args) {
        int array[]={6,5,4,32,4,8,5,7,4,6,5};
        int min=6,max=0;
        for(int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
            else if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("the max element of this array is..."+max);
        System.out.println("the min element of this array is..."+min);
    }
}
