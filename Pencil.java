public class Pencil extends WritingInstruments {

    public void write(StringBuilder sb, char [] symbols) {

        for (char symbol : symbols) {
            sb.append(symbol);
            symbolsWritten++;
            remainder -= remainder*0.095;
            if (symbolsWritten % 20 == 0) {
                remainder += remainder * 0.03;
            }

        } usageCounter++;

    }
    public void erase(StringBuilder sb){
        sb.deleteCharAt(sb.length()-1);
}


    public String toString() {
        return "Pencil : " +
                "WritingSubstance left: " + remainder +
                ", symbolsWritten=" + symbolsWritten+
                ", Instrument was used " + usageCounter + " times";
    }
}
