public class Codelab1 {
    public static void main(String[] args) {
        String[] names = {"Zaidan", "Alif", "Mahfudz", "Joko", "Yoga"};
        String longestName = names[0];

        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println("Nama terpanjang: " + longestName);
    }
}

