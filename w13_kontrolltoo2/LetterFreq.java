class LetterFreq implements Comparable<LetterFreq> {

    int index, value;

    LetterFreq(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int compareTo(LetterFreq e) {
        return this.value - e.value;
    }
}
