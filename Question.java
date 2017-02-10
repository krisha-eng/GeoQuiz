package com.example.android.geoquiz;

/**
 * Created by Dell on 20-Oct-16.
 */
public class Question
{
    private int resId;
    private boolean ans;

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public boolean isAns() {
        return ans;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }

    public Question(int textResId, boolean ansTrue)
    {
        resId=textResId;
        ans=ansTrue;
    }
}
