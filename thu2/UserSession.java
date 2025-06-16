package thu2;

public class UserSession {
    private static int onlineCount = 0;

    public UserSession() {
        onlineCount++;
    }

    public void logout() {
        if (onlineCount > 0)
            onlineCount--;
    }

    public static int getOnlineCount() {
        return onlineCount;
    }

    public static void main(String[] args) {
        UserSession u1 = new UserSession();
        UserSession u2 = new UserSession();
        UserSession u3 = new UserSession();

        System.out.println("Số người dùng online: " + UserSession.getOnlineCount()); // 3

        u2.logout();

        System.out.println("Số người dùng online sau khi u2 logout: " + UserSession.getOnlineCount()); // 2
    }
}
