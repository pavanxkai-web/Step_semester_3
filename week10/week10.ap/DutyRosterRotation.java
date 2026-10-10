import java.util.Arrays;

public class DutyRosterRotation {

    // Rotates the roster to the right by k positions.
    public static String[] rotateRoster(String[] names, int k) {
        if (names == null || names.length == 0) {
            return new String[0];
        }

        int n = names.length;
        int shift = k % n;
        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + shift) % n;
            rotated[newIndex] = names[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};

        System.out.println(Arrays.toString(rotateRoster(names, 2)));
        // [D, E, A, B, C]

        System.out.println(Arrays.toString(rotateRoster(names, 7)));
        // [D, E, A, B, C]
    }
}
