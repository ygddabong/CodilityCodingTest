# Codility Coding Test

My Java solutions to [Codility Lessons](https://app.codility.com/programmers/lessons/) problems, written in 2020 while preparing for coding tests.

| Lesson | Problem | Approach | Time |
| --- | --- | --- | --- |
| 1. Iterations | [BinaryGap](src/BinaryGap/Solution.java) | Scan the binary string, track the longest run of 0s closed by a 1 | O(log N) |
| 2. Arrays | [CyclicRotation](src/CyclicRotation/Solution.java) | Write each element to index `(i + K) % n` | O(n) |
| 2. Arrays | [OddOccurrencesInArray](src/OddOccurrencesInArray/Solution.java) | Count occurrences in a HashMap | O(n) |
| 3. Time Complexity | [FrogJmp](src/FrogJmp/Solution.java) | `ceil((Y - X) / D)` | O(1) |
| 3. Time Complexity | [PermMissingElem](src/PermMissingElem/Solution.java) | Sort, find first index where `A[i] != i + 1` | O(n log n) |
| 3. Time Complexity | [TapeEquilibrium](src/TapeEquilibrium/Solution.java) | Running prefix/suffix sums | O(n) |
| 4. Counting Elements | [FrogRiverOne](src/FrogRiverOne/Solution.java) | Remove positions from a set until it is empty | O(n + X) |
| 4. Counting Elements | [MaxCounters](src/MaxCounters/Solution.java) | Lazy "max counter" baseline applied at the end | O(n + m) |
| 4. Counting Elements | [MissingInteger](src/MissingInteger/Solution.java) | HashSet, find smallest missing positive | O(n) |
| 4. Counting Elements | [PermCheck](src/PermCheck/Solution.java) | Sort and compare with 1..n | O(n log n) |
| 5. Prefix Sums | [PassingCars](src/PassingCars/Solution.java) | Count eastbound cars seen so far | O(n) |
| 6. Sorting | [Distinct](src/Distinct/Solution.java) | HashSet size | O(n) |
| 6. Sorting | [MaxProductOfThree](src/MaxProductOfThree/Solution.java) | Sort; max of top-3 product and two-smallest × largest | O(n log n) |
| 6. Sorting | [Triangle](src/Triangle/Solution.java) | Sort; check adjacent triplets | O(n log n) |

## Running the examples

[`test/Examples.java`](test/Examples.java) runs every solution against the examples from the problem statements. Requires JDK 17+.

```bash
javac -d out $(find src test -name '*.java')
java -cp out Examples
```

## 2026 update

- Added the example runner and this README
- Made `Solution` classes public so they can be called from the runner; removed Codility template comments
- Fixed the misspelled `Soultion.java` file name
- Removed compiled `.class` files and Eclipse project files; added `.gitignore`
