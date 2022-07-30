# Counting Words
This is a small java program that helps to count the number of words(Strings) in a given List of Strings which start with given alphabets and are of any given length.
The class CounitngWordsDemo.java has four methods - getWords , getWordsList, countWords, countWordsWithLength. 
The methods getWords accepts List of Strings, Count of words we want to know starting with specific alphabet/character and length as input and returns the list that contains words starting with specified characters whose length is greater than the given input length.
The method getWordsList accepts List of Strings, Count of words we want to know starting with specific alphabet/character and length as input and returns a map with key which is the count of words starting with specified characters in the input and value which is the set of words greater than the given input length.
Method countWords and countWordsWithLength call getWords and getWordsList methods respectively and iterate through the list and map to print the count of number of words and print the words greater than specified length.
When an empty/null list of words are passed as an input the program returns null.
When there are no business rules specified the program returns the list of strings.
CountingWordsDemoTest is a test class covering the junit test cases when null values, invalid data, valid data are passed as input.
The code can be tested by running the test cases and by changing the input to the test cases. AssertEquals is used for testing.
As it is a simple program maven is not used and when running from an IDE the application can be run directly by clicking "Run APplication". The application can run command line in windows and jre using commands "javac CounitngWordsDemo.java" and "java CountingWordsDemo"
