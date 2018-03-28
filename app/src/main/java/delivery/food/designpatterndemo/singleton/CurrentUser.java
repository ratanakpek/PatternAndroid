package delivery.food.designpatterndemo.singleton;

import android.util.Log;

public class CurrentUser {
    private static final String DEBUG_TAG="tag";

    private String name;

    private static CurrentUser user = new CurrentUser();

    private CurrentUser() {

    }

    public static CurrentUser getUser(){
        return user;
    }

    protected  void setName(String n){
        name=n;
    }
    protected void outPutName(){
        Log.d(DEBUG_TAG, name);
    }
}
