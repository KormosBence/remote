public abstract class WritingInstruments   {

    protected float remainder = 100;

    protected int usageCounter = 0;
    protected int symbolsWritten = 0;
    public abstract void write(StringBuilder sb, char [] symbols);
    public abstract void erase (StringBuilder sb);
}
