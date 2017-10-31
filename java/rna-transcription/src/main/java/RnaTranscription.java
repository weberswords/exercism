
class RnaTranscription {

    String transcribe(String dnaStrand) {

        char[] dnaAsArray = dnaStrand.toCharArray();
        StringBuilder rnaStrand = new StringBuilder();
            for (Character character : dnaAsArray) {
                switch (character) {
                    case 'A':
                        rnaStrand.append('U');
                        continue;
                    case 'C':
                        rnaStrand.append('G');
                        continue;
                    case 'G':
                        rnaStrand.append('C');
                        continue;
                    case 'T':
                        rnaStrand.append('A');
                        continue;
                    default:
                        throw new IllegalArgumentException("Invalid input.");
                }
            }
        return rnaStrand.toString();
    }
}
