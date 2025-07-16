public class App {
    public static void main(String[] args) {
        String a = "a3$e";
        System.out.println(isValid(a));
    }

    public static boolean isValid(String word) {
        boolean resultado = false;
        boolean temVogal = false;
        boolean temConsoante = false;

        if (word.length() < 3) {
            return resultado = false;
        } else if (!word.matches("[a-zA-Z0-9]+"))
        return resultado = false;

        word = word.toLowerCase(); // padroniza para minúsculo

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) { // só analisa letras
                if ("aeiou".indexOf(c) >= 0) {
                    temVogal = true;
                } else {
                    temConsoante = true;
                }

                // Se já tem os dois, pode parar
                if (temVogal && temConsoante) {
                    resultado = true;
                }
            }
        }
        return resultado;
    }
}
