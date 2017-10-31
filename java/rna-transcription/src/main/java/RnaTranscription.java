class RnaTranscription {

    String transcribe(String dnaStrand) {
        switch(dnaStrand) {
            case "A":
                return "U";
            case "C":
                return "G";
            case "G":
                return "C";
            case "T":
                return "A";
        }
        return "fail";
    }
}
