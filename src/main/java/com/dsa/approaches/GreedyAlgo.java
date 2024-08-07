package com.dsa.approaches;

public class GreedyAlgo {
    // Used for solving optimisation problem like minimum/maximum


// USES or  Examples
//    Activity Selection Problem
//    Fractional Knapsack Problem
//    Huffman Coding
//    Prim's Algorithm for Minimum Spanning Tree
//    Kruskal's Algorithm for Minimum Spanning Tree
//    Dijkstra's Algorithm for Shortest Path

  //  * feasible soln : soln which satisfy the conditions provided in problem. Their can be multiple feasible soln


    /*Eg : buy a car , suv , more than 4.5 mtr , 7 seater , RWD, under 15 lakh.
    new we start looking for each brand/model then we SELECT  suvs under 15 lakh .
    then in then we SELECT  7 seaters,then rwd ... like this goes on . we get the best car satisfying the cond.
    * */


    /* Greedy Algo(a , n)
    for i to n do
       x=SELECT(a);
       if Feasible(x) then
          Solution =Solution +x ;
    * */

    /*Eg :2 Given a set of activities with start and end times,
     select the maximum number of activities that can be performed by a single person,
      assuming that a person can only work on one activity at a time.
      act1- 10 min , act2 5 min , act4 -15 min act5-10 min
      Person1 can work for27 mins only
      solution:
      sort activities in asc order
       for (sumActivies < 27min)
     sumActivies+=  act[i++]
     */



//    select the first activity
//    lastSelected = first activity
//    for i = 1 to length(activities) - 1
//            if activities[i].start >= lastSelected.finish
//    select activities[i]
//    lastSelected = activities[i]
}
