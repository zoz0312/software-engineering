package src.exampleSingleton.singleton;

public class SingletonMain {
    private static final int USER_ENUM = 5;
    public static void main(String[] args) {
//        User[] users = new User[USER_ENUM];
        UserThread[] users = new UserThread[USER_ENUM];

        for (int i = 0; i < USER_ENUM; i++) {
            users[i] = new UserThread("User" + i + " => ");
            users[i].start();
        }
    }
}
