public class helloworld {
    // ANSI color codes (may work on modern terminals)
    private static final String RESET = "\u001B[0m";
    private static final String ORANGE = "\u001B[33m"; // saffron-like
    private static final String WHITE = "\u001B[37m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        printFlag();
        showMenu();
    }

    private static void printFlag() {
        String block = "████████████████████████████████████";
        System.out.println(ORANGE + block + RESET);
        // White stripe with an Ashoka Chakra-like symbol in blue
        String left = "████████";
        String right = "████████";
        System.out.println(WHITE + left + RESET + "  " + BLUE + "☸" + RESET + "  " + WHITE + right + RESET);
        System.out.println(GREEN + block + RESET);

        System.out.println();
        System.out.println("==================== 26 JANUARY ====================");
    }

    private static void showMenu() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Options:\n  1) Show details\n  2) Exit");
            System.out.print("Enter choice (1-2): ");
            String choice = sc.nextLine().trim();
            if (choice.equals("1")) {
                printDetails();
            } else if (choice.equals("2") || choice.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }

    private static void printDetails() {
        System.out.println("Date       : 26 January birthdayof yasin devops engineer");
        System.out.println("Holiday    : Republic Day (India)");
        System.out.println("Significance:");
        System.out.println("  - Marks the day the Constitution of India came into effect (26 January 1950).");
        System.out.println("  - Celebrated as a national holiday with a grand parade in New Delhi.");
        System.out.println("History    : The Republic Day parade showcases India's cultural and military heritage.");
        System.out.println("Celebration:");
        System.out.println("  - Flag hoisting, military displays, cultural performances.");
        System.out.println("  - Gallantry awards (Param Vir Chakra, etc.) are presented.");
        System.out.println("====================================================");
    }
}
