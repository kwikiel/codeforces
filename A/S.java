import java.util.Scanner;


public class S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int friends_count = in.nextInt();
        int height = in.nextInt();
        int minimum_width = 0;
        for(int i = 0; i < friends_count ; i++){
            int friend_height = in.nextInt();
            if(friend_height > height){
                minimum_width = minimum_width + 2; 
            } else {
                minimum_width++ ;
            }

        }
        System.out.println(minimum_width);
        in.close();

    }
}