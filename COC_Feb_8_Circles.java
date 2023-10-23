public class COC_Feb_8_Circles {
    private String string_number;

    public COC_Feb_8_Circles(String string_number) {
        this.string_number = string_number;
    }

    public String getString_number() {
        return string_number;
    }

    public void setString_number(String string_number) {
        this.string_number = string_number;
    }

    public int solve() {
        int count = 0;
        for (int i = 0; i < this.string_number.length(); i++) {
            char letter = this.string_number.charAt(i);
            if (letter == '0' || letter == '6' || letter == '9') {
                count++;
            }

            if (letter == '8') {
                count += 2;
            }
        }

        return count;
    }
}
