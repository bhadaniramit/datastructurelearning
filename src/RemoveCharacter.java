public class RemoveCharacter {

    public void replaceChar(String myString, Character a) {
        char[] myNew = myString.toCharArray();
        String res = "";
        for (int i = 0; i < myNew.length; i++) {
            if (res.indexOf(myNew[i]) == -1) {
                res += myString.charAt(i);
            }
        }
        System.out.println("New String " + res);
    }

//4,2,3,4,1,2
    public void secondSmallest(int[] arr){
        int count =0;
        for(int i=0;i<arr.length-1;i++){
          if(arr[i] != arr[i+1]){
              System.out.println(arr[i]);
              count++;
          }
        }
    }

    public static void main(String[] args) {
        RemoveCharacter solution = new RemoveCharacter();
//        solution.replaceChar("ramitbhadani", 'a');
        solution.secondSmallest(new int[]{1,1,3,3,6,6,6,6,8,8,9});
    }
}

