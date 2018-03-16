/**
 * Created by Yilia on 2018/3/6.
 */
public class Sort {
  //插入排序 稳定的排序算法
  private void insertSort(int[] nums){
    int n = nums.length;
    for(int i = 1; i<n; i++){
      for(int j = i-1; j>=0; j--){
        if(nums[j+1]<nums[j]){
          int temp = nums[j+1];
          nums[j+1] = nums[j];
          nums[j] = temp;
        }
      }
    }
    System.out.println("Insert Sort 1: ");
    printArray(nums);
  }

  private void insertSort2(int[] nums){
    for(int i=1; i<nums.length; i++){
      int target = nums[i];
      int j = i;
      while(j>0 && nums[j-1]>target){
        nums[j] = nums[j-1];
        j--;
      }
      nums[j] = target;
    }
    System.out.println("Insert Sort 2；");
    printArray(nums);
  }
  //冒泡排序 稳定
  private void bubbleSort(int[] nums){
    for(int i=0; i<nums.length; i++){
      for(int j=0; j<nums.length-i-1; j++){
        if(nums[j]>nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }
    System.out.println("Bubble Sort:");
    printArray(nums);
  }
  //选择排序 不稳定
  private void selectSort(int[] nums){
    for(int i=0; i<nums.length; i++){
      int minIndex = i;
      for(int j=i; j<nums.length-1; j++){
        if(nums[j+1]<nums[j]){
          minIndex = j+1;
        }
      }
      int temp = nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;
    }
    System.out.println("Select Sort:");
    printArray(nums);
  }
  //希尔排序 不稳定
  private void shellSort(int[] nums){

  }

  private void printArray(int[] nums){
    for(int i=0; i<nums.length; i++){
      System.out.println(nums[i]);
    }
  }



  public static void main(String[] args){
    Sort sort = new Sort();
    int[] nums = new int[]{2,1,4,5,3,6,7,9,8,0};
    sort.insertSort(nums);
    sort.insertSort2(nums);
    sort.bubbleSort(nums);
    sort.selectSort(nums);

  }

}
