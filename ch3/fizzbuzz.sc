for (i <- Range.inclusive(1, 100)) {
  println(
    if (i % 15 ==0) "Fizzbuzz"
    else if (i % 5 == 0) "Buzz"
    else if (i % 3 == 0) "Fizz"
    else i
  ) 
}
