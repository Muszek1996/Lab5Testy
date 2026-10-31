# Lab5Testy

Java unit testing lab (JUnit 4/5). `Solution.java` has two functions that validate their input and throw exceptions, and the tests cover normal, edge and invalid cases.

- `solution(List<Integer>)`: smallest positive integer missing from the list (list size up to 100000)
- `solution(int[])`: takes digits 0-9, builds the number `Σ a[i]·10^(i+1)`, multiplies it by 17 and returns the digit sum
- `TestJunit1.java`, `TestJunit2.java`: tests for each function; `TestSuite.java` groups them
- `Main.java`: runs the suite with `JUnitCore`

## Run
Open in IntelliJ IDEA (JUnit 4 and JUnit 5 libraries are configured in `Lab5Testy.iml`) and run `Main` or `TestSuite`.
