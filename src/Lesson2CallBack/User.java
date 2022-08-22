package Lesson2CallBack;

public class User extends Human implements OnNewPostListener {


    public User(String name, int age) {
        super(name, age);
    }

    @Override
    public void onNewPostPublished(String content) {

        System.out.println("user " + getName() + " with age " + getAge() + " notified about " + content);
    }
}
