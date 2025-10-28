public class TypewriterSong {
    public static void main(String[] args) throws InterruptedException {
        // You can replace this with any lyrics you like
        String lyrics = """
                I only see my goals, I don't believe in failure
                'Cause I know the smallest voices, they can make it major
                I got my boys with me, at least those in favor
                And if we don't meet before I leave, I hope I'll see you later
                
                Once, I was twenty years old, my story got told
                I was writin' 'bout everything I saw before me
                Once, I was twenty years old
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