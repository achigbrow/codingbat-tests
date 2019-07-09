package edu.cnm.deepdive;

public class Array2 {

  public boolean either24(int[] nums) {

      boolean either = false;
      boolean two = false;
      boolean four = false;

      for(int i = 0; i < nums.length-1; i++) {
        if(nums[i] == 2 && nums[i+1] == 2) {
          two = true;
        } if(nums[i] == 4 && nums[i+1] == 4) {
          four = true;
        }
      }
      if(two && four || !two && !four) {
        either = false;
      } else if (two && ! four || !two && four) {
        either = true;
      }

      return either;
    }


//    public int[] pre4(int[] nums) {
//    int pre;
//
//    return pre;
//  }

}
