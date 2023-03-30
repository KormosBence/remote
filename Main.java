
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        char[][] sequence = {{'H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D'}};
        ArrayList<WritingInstruments> instruments = new ArrayList<>();
        instruments.add(new Pen());
        instruments.add(new Pencil());
        instruments.add(new Marker());


        int[] counts = new int[instruments.size()];
        for (int i = 0; i < 10; i++) {
            int index = rand.nextInt(instruments.size());
            WritingInstruments instrument = instruments.get(index);
            int numChars = rand.nextInt(3) + 3;
            char[] selectedChars = new char[numChars];
            for (int j = 0; j < numChars; j++) {
                int charIndex = rand.nextInt(sequence[0].length);
                selectedChars[j] = sequence[0][charIndex];
            }
            instrument.write(sb, selectedChars);
            counts[index] += numChars;
        }

        for (WritingInstruments instrument : instruments) {
            System.out.println(instrument);
        }


    }
}