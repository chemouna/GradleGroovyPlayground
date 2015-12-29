package euler

/**
 * Created by cheikhnamouna on 12/28/15.
 */

/**
 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 The sum of these multiples is 23.
 Find the sum of all the multiples of 3 or 5 below 1000.
 **/

//solution 1
def MAX = 100
int sum = 0
for (int i = 0; i < MAX; i++) {
  if (i % 3 == 0 || i % 5 == 0) {
    sum += i
  }
}
println(" Solution 1 : $sum")

//solution 2
sum = 0;
0.upto(MAX - 1, {
  if (it % 3 == 0 || it % 5 == 0) {
    sum += it
  }
})
println(" Solution 2 : $sum")

//solution 3
sum = 0;
MAX.times {
  if (it % 3 == 0 || it % 5 == 0) {
    sum += it
  }
}
println(" Solution 3 : $sum")

//solution 4:
sum = 0;
0.step MAX, 1, {
  if (it % 3 == 0 || it % 5 == 0) {
    sum += it
  }
}
println(" Solution 4 : $sum")


