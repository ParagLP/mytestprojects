package com.javacodingpractice;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BoatTraveling {

  public static void main(String[] args) {

    ArrayList<int[]> inputArrayList = readInput();
    if(inputArrayList!=null){
      for (int [] input : inputArrayList) {

        long totalOptimalCostForIthTestCase = calculateOptimalTravelCost(input);
        System.out.println(totalOptimalCostForIthTestCase);
      }
    }
    else
    {
      System.out.println("Some thing went wring while reading input. Plz try again with valid input");
    }
  }


  public static ArrayList<int[]> readInput() {

    BufferedReader reader =
        new BufferedReader(new InputStreamReader(System.in));
    ArrayList<int[]> inputArray = null;
    //System.out.println("Enter number of test cases:");
    try {

      int numberOfTestCases = Integer.parseInt(reader.readLine());

      if (numberOfTestCases < 0 || numberOfTestCases > 10) {
        System.out.println("Invalid input. Number of test cases should be in the range 1<=T<=10");
      } else {
        //initialize input array list
        inputArray = new ArrayList<>();
        //For number of test cases read the input and save it in array
        for (int i = 0; i < numberOfTestCases; i++) {
          try {
            int numberOfPersonsToTravel = Integer.parseInt(reader.readLine());
            String input = reader.readLine();
            int[] personsWeightArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            //Add the ith number of test case person weight list in to the input array list
            inputArray.add(personsWeightArray);

          } catch (IOException io) {
            System.out.println("Invalid input. Input should be int");
          }
        }
      }
    } catch (IOException io) {
      System.out.println("Invalid input. Input should be int");
    }
    return inputArray;
  }

  static long calculateOptimalTravelCost(int personsInputWeightArray[])
  {

    // Sort the price array
    Arrays.sort(personsInputWeightArray);
    int inputArraySize = personsInputWeightArray.length;

    long totalOptimalCost = 0;

    // Calcualte minimum price
    // of n-2 most costly person
    for (int i = inputArraySize - 1; i > 1; i -= 2)
    {
      if (i == 2)
      {
        totalOptimalCost += personsInputWeightArray[2] + personsInputWeightArray[0];
      }
      else
      {

       
        long price_first = personsInputWeightArray[i] + personsInputWeightArray[0] + 2 * personsInputWeightArray[1];
        long price_second = personsInputWeightArray[i] + personsInputWeightArray[i - 1] + 2 * personsInputWeightArray[0];
        totalOptimalCost += Math.min(price_first, price_second);
      }
    }

    // Calculate the minimum price
    // of the two cheapest person
    if (inputArraySize == 1)
    {
      totalOptimalCost += personsInputWeightArray[0];
    }
    else
    {
      totalOptimalCost += personsInputWeightArray[1];
    }

    return totalOptimalCost;
  }

}
