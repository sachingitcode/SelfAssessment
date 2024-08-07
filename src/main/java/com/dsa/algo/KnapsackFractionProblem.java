package com.dsa.algo;

/* It is used to solve the weight/price solution.
 * we have a Knapsack bag,
 */


//0/1 Knapsack: Uses dynamic programming and considers whether
// to include or exclude each item.  Cannot break items.

//Fractional Knapsack: Uses a greedy algorithm and can include fractions of items
// based on their value-to-weight ratio.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// items has weight & price
// sort items in descender order of value/weight order
// for ( item : Items) //- take item one -by one
//  {    if (item.weight < knapSackWeight)
//          knapSackWeight =knapSackWeight-item.weight ;
//          totalValue =totalValue +item.price;
//      else  // for remaing weight
//          totalValue += item.price * knapSackWeight/item.weight;
//          knapSackWeight = ;
//   }
//return totalValue

public class KnapsackFractionProblem {//Fractional Knapsack

    public static void main(String[] args) {
        int[] price = {40, 10, 45, 75, 30, 25};
        int[] weigh = {05, 20, 15, 20, 05, 15};
                      //8, .5, 03, 3.7,06, 1.6
        int packageWeight = 55;
        new KnapsackFractionProblem().startSolution(price, weigh, packageWeight);
    }

    private void startSolution(int[] price, int[] weigh, int W) {

        List<Item> list = new ArrayList<>();
        for (int i = 0; i < price.length; i++)
            list.add(new Item(price[i], weigh[i]));

        list.reversed().sort(Comparator.comparingDouble(item -> item.ratio));   // 3rd Way
        list.stream().map(p -> p.w).forEach(System.out::println);
        int total = 0;
        for (Item item : list) {
            if (W <= 0) break;
            if (W > item.w) {
                W -= item.w;
                total += item.p;
            } else {
                total += item.p * W / item.w;
            }
        }
        System.out.println("Total Price:"+total);
    }

}

class Item {
    int p;
    int w;
    double ratio;

    public Item(int p, int w) {
        this.p = p;
        this.w = w;
        this.ratio = (double) p / w;
    }
}

/*
// Way1 to sort    ->  list.sort(new Comparator<Item>() {
           @Override
          public int compare(Item item2, Item item1) {
              return Double.compare(item1.ratio, item2.ratio);   }     });

//Way2 to sort    //   list.sort((item1, item2) -> Double.compare(item2.ratio, item1.ratio));
//Way3 to sort //    list.reversed().sort(Comparator.comparingDouble(item -> item.ratio));
  */

//Arrays.sort(items, new Comparator<Item>() {
//        @Override
//        public int compare(Item o1, Item o2) {
//            return Double.compare(o2.ratio, o1.ratio);
//        }
//    });