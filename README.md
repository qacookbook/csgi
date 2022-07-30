# Counting Words

This is a small java program that helps to count the number of words(Strings) in a given List of Strings which start with given alphabets and are of any given length.The methods getWords accepts List of Strings, Count of words we want to know starting with specific alphabet/character and length as input and returns the list that contains words starting with specified characters whose length is greater than the given input length.
The method getWordsList accepts List of Strings, Count of words we want to know starting with specific alphabet/character and length as input and returns a map with key which is the count of words starting with specified characters in the input and value which is the set of words greater than the given input length.


Technologies Used

Java, Junits


Usage

As it is a simple program no build tools like maven/gradle are used.

When running from an IDE the application can be run directly by clicking "Run APplication". 

The application can run command line in windows and jre using commands 

javac CounitngWordsDemo.java

java CountingWordsDemo


Tests

TestCases cover inputs with null values, various data sets.
