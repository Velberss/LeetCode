
class Solution {
    public int possibleStringCount(String word) {
        int count = 1; // sempre existe pelo menos 1 forma (sem erro)
        int i = 0;

        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int groupLength = j - i;
            if (groupLength > 1) {
                count += groupLength - 1; // possibilidades de erro nesse grupo
            }
            i = j;
        }

        return count;
    }
}


