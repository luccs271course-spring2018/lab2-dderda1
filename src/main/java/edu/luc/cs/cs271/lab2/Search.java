package edu.luc.cs.cs271.lab2;

import java.util.List;
import java.util.Optional;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static Optional<Integer> findTeamPosition(final Team[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().equals(key)) {
        // Return the index of where the item with key is located
        return Optional.of(i);
      }
    }
    // If it does not exist in the array then return an index of -1
    return Optional.empty();
  }

  /** Looks for the position of the named team in a list. */
  public static Optional<Integer> findTeamPosition(final List<Team> list, final String key) {
    //used in 2.4 for book 
    int sizeofList = list.size(); //total size of list given similar to your size of arr.length
    for (int compare = 0; compare < sizeofList; compare ++) {
      if (list.get(compare).getName().equals(key)){
        return Optional.of(compare);
      }
    }//loop will compare teams to size
    
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFunding(final Team[] arr, final int minFunding) {
    final int sizeofArr = arr.length; // similar to previous size will be compared with compare this is with an arr tho! think first find
    for (int compare = 0; compare <sizeofArr; compare++){
        if (arr[compare].getFunding () >= minFunding){//array of team objects calls on method getfunding compares to minfunding
          return Optional.of(compare);
        }
      }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially search the entire array, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    // TODO complete this method
    // Gets the array size
    final int size = arr.length;
    // Initially search the entire array
    int low = 0;
    int high = size - 1;
    int middle = ((high + low)/2);
    do {
      if (minFunding > arr[middle].getFunding()){
        low = 1 + middle;
      }
      else if (minFunding <= arr[middle].getFunding()){
        middle = high;
      }
      else if (minFunding == arr[middle].getFunding()){
        return Optional.of(middle);
      }
    } while (high > low);
    if (low <= high && arr[low].getFunding() >= minFunding) {
      return Optional.of(low);
    } else {
      return Optional.empty();
    }
  }
}
