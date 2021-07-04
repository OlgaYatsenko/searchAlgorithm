# searchAlgorithm
## Overview

Requirements: Java 11.
Programm opens data.txt file and goes word by word from the file checking if a word is already in dictionary (both LinkedList and BinaryTree dictionary) and adding it if it's not. Then programm outputs how many words were checked and how much time spent (in nanoseconds) by each of the dictionary. BinaryTree dictionary is faster 

Programm output:
![alt text](https://github.com/OlgaYatsenko/searchAlgorithm/blob/master/data/searchAlgorithmResult1.png "Logo Title Text 1")

## How to run on Linux from Terminal
Compile
../searchAlgorithm
```
javac -p searchAlgorithm -d src src/dictionary/*.java
```
Go to src directory
```
cd src
```
Run
```
java dictionary.Main
```

