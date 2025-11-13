public class TypewriterSong {
    public static void main(String[] args) throws InterruptedException {
        // You can replace this with any lyrics you like
        String lyrics = """
                andha malaikum indha malaikum nadula kairu un koodhila mairu
                """;

        typeWriterEffect(lyrics, 60); // Adjust delay for speed (in milliseconds)
    }

    // Function to create a typewriter effect
    public static void typeWriterEffect(String text, int delay) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            Thread.sleep(delay);
        }
    }
}