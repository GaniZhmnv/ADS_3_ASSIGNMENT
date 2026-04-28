Sorting and Searching Algorithm Analysis System

Project Overview

in this project i implemented three algorithms bubble sort quick sort and binary search
the goal was to compare their speed on different array sizes and types

Algorithms

bubble sort
compares neighbor elements and swaps them if needed
slow for big arrays

quick sort
uses pivot and splits array into parts then sorts
much faster than bubble sort

binary search
works only on sorted array
divides array in half each step

What I tested

array sizes
10
100
1000

types
random arrays
sorted arrays

time measured with system nanotime

Results
____________________________________________________
|______|_____RANDOM_____|_____SORTED______|________|
| size | bubble | quick | bubble | quick  | binary |
| 10   | 5300   | 4800  | 1400   | 2200   | 1800   |
| 100  | 142800 | 21900 | 92900  | 131700 | 1300   | 
| 1000 | 4412800| 143600| 2284200| 2679900| 4100   |

Analysis

which sorting algorithm was faster and why
quick sort was faster because it splits the array and works in n log n while bubble sort is n squared

how does performance change with input size
when size increases bubble sort becomes much slower quick sort still works fast

how does sorted vs unsorted data affect performance
bubble sort is faster on sorted arrays because fewer swaps
quick sort depends on pivot but usually still fast

do results match big o
yes bubble sort grows very fast like n squared quick sort grows slower like n log n

which searching algorithm is more efficient and why
binary search is more efficient because it cuts the array in half every step

why binary search requires sorted array
because it needs order to know which half to remove

Conclusion

this project showed that algorithm choice is important
bubble sort is simple but slow
quick sort is better for big data
binary search is very fast for searching

README.md
