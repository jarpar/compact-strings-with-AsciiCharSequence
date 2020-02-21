# compact-strings-with-AsciiCharSequence

Code Challenge — Write a program

Write a class named AsciiCharSequence that implements compact storage of ASCII-character sequences. Their codes can be stored in one single byte, unlike Unicode characters. Compared to the standard String class, your class will require twice less memory (before Java 9).

The class AsciiCharSequence should:

implement the interface java.lang.CharSequence;
have a constructor that takes a byte array;
define methods length, charAt, subSequence, and toString.
You can see the declaration of methods and their behavior in the description of java.lang.CharSequence (JavaDoc or sources).
