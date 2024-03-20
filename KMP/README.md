# Problem with Naive Algorithm:

In the basic string searching algorithm, when a mismatch occurs between the pattern and a substring of the main string, it typically requires backtracking to recheck characters. This leads to potentially repetitive comparisons and inefficient searching, especially when the size of the string and pattern grows.
Repeatedly check characters, compare repeatedly, and backtrack whenever a mismatch occurs.
Maximum time : if size of string is n and size of pattern is m, O(mn)

# Knuth-Morris-Pratt (KMP)

KMP algorithm is a string searching algorithm that searches for occurences of a word with main text string.
KMP algorithm is used for pattern matching. It does efficiently by avoiding unnecessary comparisions.

# It has a linear run time complexity(meaning that the time it takes for the algorithm to run grows linearly with the size of the input.)

O(n+m) where n is the length of text and m is the length of pattern

Time complexity:
text n
pattern m

n, one time we gone, for search
for preparing table, m

When combining, the total time complexity of the KMP algorithm is O(m+n),

# Working:

If there is a pattern given , we can find prefix or suffix of pattern.
eg: pattern: abcdabc

prefix: we have to take the subset of this alphabets in the pattern. Any substring of the pattern that starts from the beginning of the pattern and extends to any position within the pattern. For example, given the pattern "abcdabc", the prefixes would be "a", "ab", "abc", and "abcd".
eg: a,ab,abc,abcd

Suffix: I have to take subset of string but I should start from right side. Any substring of the pattern that starts from the end of the pattern and extends to any position within the pattern. For example, given the pattern "abcdabc", the suffixes would be "c", "bc", "abc", and "dabc".

Idea of kmp is that inside this string, is there any prefix same as suffix.
Here in our example "abc" is matching. This is basically, kmp algorithm will do , it avoids the number of comparision.

## Pi Table

In KMP algorithm for a pattern we generate a pi table.
It is used to efficiently determine shifts during the string search process.
The Pi table stores information about the longest proper prefix of the pattern that is also a suffix up to each position in the pattern.
provides information about whether the beginning part of the pattern is appearing again anywhere else in the pattern.

The Pi Table for the pattern "ABCDABD" is as follows:

| Position | Value |
| -------- | ----- |
| 0        | 0     |
| 1        | 0     |
| 2        | 0     |
| 3        | 0     |
| 4        | 1     |
| 5        | 2     |
| 6        | 0     |
