public class COC_Feb_2 {
    private int num_cats;
    private int year;
    private String[] cats;

    public COC_Feb_2(int num_cats, int year, String[] cats) {
        this.num_cats = num_cats;
        this.year = year;
        this.cats = cats;
    }

    public int solution() {
        int cats_alive = 0;

        for (int i=0; i < this.num_cats; i++){
            String string_cat = this.cats[i];

            String[] parts = string_cat.split(" ");

            int birth = Integer.parseInt(parts[1]);
            int died = Integer.parseInt(parts[2]);

            if (birth <= this.year && died > this.year){
                cats_alive += 1;
            }
        }

        System.out.println("Number of cats alive " + cats_alive);
        return 0;
    }

    public int get_num_cats(){
        return this.num_cats;
    }

    public int get_year(){
        return this.year;
    }

    public String[] get_cats(){
        return this.cats;
    }

    public void set_num_cats(int new_num_cats){
        this.num_cats = new_num_cats;
    }

    public void set_year(int new_year){
        this.year = new_year;
    }
}
