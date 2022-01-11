# Proje 1
## Soru
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
Big-O gösterimini yazınız.
Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.


[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

## Cevap
Insertion Sort algoritmasında öncelikle dizinin ilk elemanını bulup ilk elemanımızla değiştiririz ardından sırayla 2. eleman için aynı işlem uygulanır ve bu şekilde son elemana kadar sıralanır. Bu yüzden dizimizin en küçük elemanı 2 olduğu için 2 ile 1. elemanımızın yerini değiştiriyoruz.

* [22,27,16,2,18,6]
* [2,27,16,22,18,6]
* [2,6,16,22,18,27]
* [2,6,16,18,22,27]
