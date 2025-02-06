import java.util.*;

public class SumTriangle {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      
      List<Integer> list = new ArrayList<>();
      for(int i = 0;i < arr.length;i++){
        list.add(arr[i]);
      }
      List<Integer> temp = new ArrayList<>();
      
      solve(list, temp);
      
  }
  public static void solve(List<Integer> list , List<Integer> temp){
    if(list.size() == 1){
      System.out.println(list.toString());
      return ;
    }else{
      for(int i = 0;i< list.size()-1;i++){
      temp.add(list.get(i) + list.get(i+1));
    }
    solve(temp, new ArrayList<>());
    System.out.println(list.toString());
    return;
    }
    
  }
}