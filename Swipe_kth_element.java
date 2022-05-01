public class Swipe_kth_element {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
        int n= array.length;
        int k=3;
        System.out.println("Before swipe kth element");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        //After swipe the element
        int temp=array[k-1];
        array[k-1]=array[n-k];
        array[n-k]=temp;
        System.out.println("After swipe the kth element in array..");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
