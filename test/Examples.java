import java.util.Arrays;

/** Runs each solution against the examples from the Codility problem statements. */
public class Examples {
    private static int failures = 0;

    private static void check(String name, Object actual, Object expected) {
        boolean ok = (actual instanceof int[] a && expected instanceof int[] e)
                ? Arrays.equals(a, e)
                : actual.equals(expected);
        String shown = actual instanceof int[] a ? Arrays.toString(a) : String.valueOf(actual);
        System.out.printf("%s %-22s -> %s%n", ok ? "PASS" : "FAIL", name, shown);
        if (!ok) failures++;
    }

    public static void main(String[] args) {
        check("BinaryGap(1041)", new BinaryGap.Solution().solution(1041), 5);
        check("BinaryGap(32)", new BinaryGap.Solution().solution(32), 0);
        check("CyclicRotation", new CyclicRotation.Solution().solution(new int[] {3, 8, 9, 7, 6}, 3), new int[] {9, 7, 6, 3, 8});
        check("CyclicRotation(empty)", new CyclicRotation.Solution().solution(new int[] {}, 1), new int[] {});
        check("Distinct", new Distinct.Solution().solution(new int[] {2, 1, 1, 2, 3, 1}), 3);
        check("FrogJmp", new FrogJmp.Solution().solution(10, 85, 30), 3);
        check("FrogRiverOne", new FrogRiverOne.Solution().solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}), 6);
        check("MaxCounters", new MaxCounters.Solution().solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}), new int[] {3, 2, 2, 4, 2});
        check("MaxProductOfThree", new MaxProductOfThree.Solution().solution(new int[] {-3, 1, 2, -2, 5, 6}), 60);
        check("MissingInteger", new MissingInteger.Solution().solution(new int[] {1, 3, 6, 4, 1, 2}), 5);
        check("MissingInteger(neg)", new MissingInteger.Solution().solution(new int[] {-1, -3}), 1);
        check("OddOccurrences", new OddOccurrencesInArray.Solution().solution(new int[] {9, 3, 9, 3, 9, 7, 9}), 7);
        check("PassingCars", new PassingCars.Solution().solution(new int[] {0, 1, 0, 1, 1}), 5);
        check("PermCheck(yes)", new PermCheck.Solution().solution(new int[] {4, 1, 3, 2}), 1);
        check("PermCheck(no)", new PermCheck.Solution().solution(new int[] {4, 1, 3}), 0);
        check("PermMissingElem", new PermMissingElem.Solution().solution(new int[] {2, 3, 1, 5}), 4);
        check("TapeEquilibrium", new TapeEquilibrium.Solution().solution(new int[] {3, 1, 2, 4, 3}), 1);
        check("Triangle(yes)", new Triangle.Solution().solution(new int[] {10, 2, 5, 1, 8, 20}), 1);
        check("Triangle(no)", new Triangle.Solution().solution(new int[] {10, 50, 5, 1}), 0);

        System.out.println(failures == 0 ? "\nAll examples passed." : "\n" + failures + " example(s) failed.");
        if (failures > 0) System.exit(1);
    }
}
