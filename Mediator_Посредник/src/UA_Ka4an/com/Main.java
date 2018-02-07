package UA_Ka4an.com;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	TextChat chat = new TextChat();
	User userAdmin = new Admin(chat);

	User user1 = new SimpleUser(chat);
	User user2 = new SimpleUser(chat);

	chat.setAdmin(userAdmin);
	chat.addUser(user1);
	chat.addUser(user2);

	user1.getMessahe("привет я новый пользаватель!");
	userAdmin.sendMessage("Админ зашол в беседу ");
    }
}
interface User{
    void sendMessage(String message);
    void getMessahe(String message);
}
class Admin implements User{
Chat chat;
    public Admin(Chat chat) {
        this.chat = chat;
    }
    @Override
    public void sendMessage(String message) {
            chat.sendMessage(message, this);
    }
    @Override
    public void getMessahe(String message) {
        System.out.println("Админ получает сообщение: "+" "+ message+ "'");
    }
}
interface Chat{
    void sendMessage(String message, User user);
}
class SimpleUser implements User{
    Chat chat;
    public SimpleUser(Chat chat) {
        this.chat = chat;
    }
    @Override
    public void sendMessage(String message) {
            chat.sendMessage(message, this);
    }
    @Override
    public void getMessahe(String message) {
        System.out.println("Пользователь получает сообщение: "+" "+ message+ "'");
    }
}
class TextChat implements Chat{
User admin;
    public void setAdmin(User admin) {
        this.admin = admin;
    }
    List<User> users = new ArrayList<>();
    public void addUser(User u){
        users.add(u);
    }
    @Override
    public void sendMessage(String message, User user) {
        for (User u:users){
            u.getMessahe(message);
        }
        admin.getMessahe(message);
    }
}