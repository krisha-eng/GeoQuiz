package com.example.android.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button TrueButton;
    private Button FalseButton;
    private TextView qtextview;
    private int currentIndex=0;
//    int score=0;

    private Question[] qList = new Question[]
            {       new Question(R.string.q1,true),
                    new Question(R.string.q2,false),
                    new Question(R.string.q3,false),
                    new Question(R.string.q4,true),
                    new Question(R.string.q5,true),
            };



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qtextview=(TextView) findViewById(R.id.textview1);
//        int question=qList[currentIndex].getResId();
//        qtextview.setText(question);

        updateQues();
    }

    private void checkAnswer(boolean userPressedTrue)
    {
        boolean ansIsTrue = qList[currentIndex].isAns();

        if(userPressedTrue==ansIsTrue)
        {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
//            score++;
//            TextView displayScore = (TextView) findViewById(
//                    R.id.scoretext);
//            displayScore.setText(score);
        }
        else
        {
            Toast.makeText(this, "InCorrect!", Toast.LENGTH_SHORT).show();
//            score--;
//            TextView displayScore = (TextView) findViewById(
//                    R.id.scoretext);
//            displayScore.setText(score);

        }
    }


    private void updateQues()
    {
        int q = qList[currentIndex].getResId();
        qtextview.setText(q);
    }

    public void true_button(View view)
    {


        checkAnswer(true);
//        if(t1.setText(R.string.q1)
//        {
//            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
//        }
//        int question=qList[currentIndex].getResId();
//        if(qList[currentIndex].isAns()==true)
//        {
//            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
//        }
//        else if(qList[currentIndex].isAns()==false)
//        {
//            Toast.makeText(this, "InCorrect!", Toast.LENGTH_SHORT).show();
//        }
    }

    public void false_button(View view)
    {
        checkAnswer(false);
    }

    public void next_button(View view)
    {
        currentIndex=(currentIndex+1)%qList.length;
        int question=qList[currentIndex].getResId();
        qtextview.setText(question);
    }

    public void pre_button(View view)
    {
        currentIndex=Math.abs(currentIndex-1)%qList.length;
        int question=qList[currentIndex].getResId();
        qtextview.setText(question);
    }

}
