package me.apoorvaagupta;

public class App {
    /**
     * Driver function to take test the reader, processor, writer claases
     * @param args
     */
    public static void main(String[] args) {

        Reader<String> r = new Reader<String>(String.class);
        Processor<String> p = new Processor<String>(String.class);

        String v1 = r.takeInput();
        String v2 = r.takeInput();

        String ans = p.process(v1, v2);

        Writer.print(ans);
    }
}
