public class LengthOfArray {
    /*  void lengFind(int[] arr) {
          int i, x;

          for (i = 0; i < arr.length; i++) {
              x = arr[i];
              System.out.println(x);
          }
      }

      public static void main(String[] args) {
          int[] arr = {12, 13, 14, 15};
          LengthOfArray len = new LengthOfArray();
          len.lengFind(arr);

      }
  }*/
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int i = 0;

        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
