public class Marker extends WritingInstruments {

    public void write(StringBuilder sb, char[] symbols) {
        for (char symbol : symbols) {
            sb.append(symbol);
            symbolsWritten++;

            if (symbolsWritten < 21) {
                remainder -= remainder * 0.01;

            } else if (symbolsWritten < 41) {
                remainder -= remainder * 0.0109;

            } else {
                remainder -= remainder * 0.0121;

            }

        }usageCounter++;
    }

    public void erase(StringBuilder sb) {
    }


    public String toString() {
        return "Marker : " +
                "WritingSubstance left: " + remainder +
                ", symbolsWritten=" + symbolsWritten+
                ", Instrument was used " + usageCounter + " times";
    }
}
