package Lesson2CallBack;

import java.util.ArrayList;

public class NewsPage {
    ArrayList<OnNewPostListener> newsListenerUsers = new ArrayList<>();
    private OnNewPostListener onNewPostListener;

    public void setOnNewPostListener(OnNewPostListener onNewPostListener) {
        this.onNewPostListener = onNewPostListener;
    }


    public void setNewsListenerUsers(ArrayList<OnNewPostListener> newsListenerUsers) {
        this.newsListenerUsers = newsListenerUsers;
    }

    public void post(String content) {
        if (newsListenerUsers != null && onNewPostListener != null) {
            for (OnNewPostListener onNewPostListeners : newsListenerUsers) {
                onNewPostListeners.onNewPostPublished(content);
            }
            onNewPostListener.onNewPostPublished(content);

        }
    }
}
