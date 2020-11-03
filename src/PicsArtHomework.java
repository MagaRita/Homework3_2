public class PicsArtHomework {
    public static void main(String[] args) {

        int[] array = {4,6,7,2,6,7,4};
        int number = array[0];
        for(int i = 1; i<array.length;i++){
            number ^= array[i];
        }
        System.out.println("The number which doesn't repeat even times is: " + number);
    }
}