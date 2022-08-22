package Lesson2CallBack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {

        NewsPage mamulAM = new NewsPage();
        ArrayList users = new HumanGenerator().userGeneratorMethod();
        Boss boss = new Boss();
        String content = "Kensatoshaki tariqy darnum e 30";
        String bossNews = "you are fired";

//        String content = "Aysorvanic toshaknery kbarcranan 700%-ov";
//        mamulAM.post(content);
//        mamulAM.setOnNewPostListener(new OnNewPostListener() {
//            @Override
//            public void onNewPostPublished(String content) {
//                System.out.println(content);
//            }
//        });
//        mamulAM.post("Ashtanqain orery darnum en 2");

//        User user1 = new User("Mamikon", 40);

        mamulAM.setNewsListenerUsers(users);
        mamulAM.setOnNewPostListener(boss);
        mamulAM.post(content);
        boss.bossNewsMethod(bossNews);
    }
}
