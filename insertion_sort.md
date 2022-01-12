# Proje 1
## Soru 1
[22,27,16,2,18,6] -> Insertion Sort


1) Yukarı verilen dizinin insertion sort türüne göre aşamalarını yazınız.

2) Big-O gösterimini yazınız.

3) Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
4) Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

## Cevap
1. Insertion Sort algoritmasında öncelikle dizinin ilk elemanını bulup ilk elemanımızla değiştiririz ardından sırayla 2. eleman için aynı işlem uygulanır ve bu şekilde son elemana kadar sıralanır. Bu yüzden dizimizin en küçük elemanı 2 olduğu için 2 ile 1. elemanımızın yerini değiştiriyoruz.
```
    [22,27,16,2,18,6]
    [2,27,16,22,18,6]
    [2,6,16,22,18,27]
    [2,6,16,18,22,27]
```
2.
``` 
    O(n^2)
```
3.  

```
    Best Case  2
    Avarage Case  16, 18
    Worst case  27
```
4.
```
    Avarage Case
```
## Soru 2

[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

## Cevap

```
1. [2,3,5,8,7,9,4,15,6]
2. [2,3,4,8,7,9,5,15,6]
3. [2,3,4,5,7,9,8,15,6]
4. [2,3,4,5,6,9,8,15,7]
```