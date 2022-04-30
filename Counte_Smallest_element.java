public class Counte_Smallest_element {
    public static void main(String[] args) {
        int array[]={6,5,43,76,48,93,8};
        int task=43,counter=0;
        for(int i=0;i<array.length;i++){
            if(task<array[i]){
                counter++;
            }
        }
        System.out.println("the all smallest element of this task is.."+counter);
    }
}
