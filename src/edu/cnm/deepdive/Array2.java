package edu.cnm.deepdive;

public class Array2 {

  public boolean either24(int[] nums) {
    boolean either = false;

    for(int i : nums) {
      if(((i == 2 && i++ == 2)
          && (i == 4 && i++ == 4))
          || ((i == 2 && i++ != 2)
          && (i == 4 && i++ != 4))) {
        either = false;
      } else if((i == 2 && i++ == 2)
          || (i == 4 && i++ == 4)) {
        either = true;
      }
    }
    return either;
  }
  public int[] pre4(int[] nums) {
    int pre;

    return pre;
  }

}
