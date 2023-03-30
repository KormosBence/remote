public class Pen extends WritingInstruments {

    public void write(StringBuilder sb, char[] symbols) {
        for (char symbol : symbols) {
            sb.append(symbol);
            symbolsWritten++;
            remainder -= remainder * 0.0115;
        }
        usageCounter++;

    }

    public void erase(StringBuilder sb) {

    }


    public String toString() {
        return "Pen : " +
                "WritingSubstance left: " + remainder +
                ", symbolsWritten=" + symbolsWritten+
                ", Instrument was used " + usageCounter + " times";
    }
}




