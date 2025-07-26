public class App {
    public static void main(String[] rgs) {
        String a = "abc";
        System.out.println(numTilePossibilities(a));
    }

    public static int numTilePossibilities(String tiles) {
        int[] freq = new int[26];

        for (int i = 0; i < tiles.length(); i++) {
            int index = Character.toUpperCase(tiles.charAt(i)) - 'A';
            freq[index]++;
        }

        return back(freq);
    }

    public static int back(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;
                freq[i]--;
                count += back(freq);
                freq[i]++;
            }
        }
        return count;
    }
}
