package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};

        season[0]="봄";
        season[1]="여름";
        season[2]="가을";
        season[3]="겨울";


        for(int i=0; i<season.length; i++) {
            System.out.println(season[i]);
        }




    }

}
