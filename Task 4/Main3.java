// Interface for printing
interface Printer {
    void printDocument();
}

// Interface for scanning
interface Scanner {
    void scanDocument();
}

// Interface for faxing
interface FaxMachine {
    void faxDocument();
}

// Multi-function copier supports all features
class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning...");
    }

    @Override
    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

// Basic printer only supports printing
class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Basic Printer
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.printDocument();

        System.out.println();

        // Multi-Function Copier
        MultiFunctionCopier copier = new MultiFunctionCopier();
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument();
    }
}
