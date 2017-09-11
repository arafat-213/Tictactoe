package com.svit.ce.aavishkar.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,buttonReset;
    String mark;
    int player=1;
    int i = -1;
    char board[]="0123456789".toCharArray();
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        buttonReset = (Button) findViewById(R.id.buttonReset);

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (board[1] != 1) {
                        one.setClickable(false);
                    }
                    choice();
                    one.setText(mark);
                    board[1]=mark.charAt(0);
                    //checkresult();
                    display();

                }
            });

            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (board[2] != 2) {
                        two.setClickable(false);
                    }
                    choice();
                    two.setText(mark);
                    board[2]=mark.charAt(0);
                    //checkresult();
                    display();

                }
            });

            three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (board[3]=='3') {
                        choice();
                        three.setText(mark);
                        board[3]=mark.charAt(0);
                        //checkresult();
                        display();
                    }
                }
            });


            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (four.getText().toString().equals("")) {
                        choice();
                        four.setText(mark);
                        board[4]=mark.charAt(0);
                        //checkresult();
                        display();
                    }
                }
            });


            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (five.getText().toString().equals("")) {
                        choice();
                        five.setText(mark);
                        board[5]=mark.charAt(0);
                        //checkresult();
                        display();
                    }
                }
            });


            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (six.getText().toString().equals("")) {
                        choice();
                        six.setText(mark);
                        board[6]=mark.charAt(0);
                        //checkresult();
                        display();
                    }
                }
            });


            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (seven.getText().toString().equals("")) {
                        choice();
                        seven.setText(mark);
                        board[7]=mark.charAt(0);
                        //checkresult();
                        display();
                    }
                }
            });


            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (eight.getText().toString().equals("")) {
                        choice();
                        eight.setText(mark);
                        board[8]=mark.charAt(0);
                        //checkresult();
                        display();
                    }
                }
            });


            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(getApplicationContext(),"Player: "+--player+" Just played",Toast.LENGTH_SHORT).show();
                    if (nine.getText().toString().equals("")) {
                        choice();
                        nine.setText(mark);
                        board[9]=mark.charAt(0);
                        //checkresult();
                        display();
                    }
                }
            });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                player=1;

               for(i=0;i<10;i++){
                   board[i] = String.valueOf(i).charAt(0);
               }

               one.setClickable(true);
                two.setClickable(true);
                three.setClickable(true);
                four.setClickable(true);
                five.setClickable(true);
                six.setClickable(true);
                seven.setClickable(true);
                eight.setClickable(true);
                nine.setClickable(true);

                one.setText("");
                two.setText("");
                three.setText("");
                four.setText("");
                five.setText("");
                six.setText("");
                seven.setText("");
                eight.setText("");
                nine.setText("");

                one.setTextColor(Color.BLACK);
                two.setTextColor(Color.BLACK);
                three.setTextColor(Color.BLACK);
                four.setTextColor(Color.BLACK);
                five.setTextColor(Color.BLACK);
                six.setTextColor(Color.BLACK);
                seven.setTextColor(Color.BLACK);
                eight.setTextColor(Color.BLACK);
                nine.setTextColor(Color.BLACK);

                // board[] = "0123456789".toCharArray();         I have no idea why it's giving an error.
            }
        });
    }


    public void choice()
    {

        if(player%2==1)
            player=1;
        else
            player=2;


        if(player==1)
            mark="O";
        else
            mark="X";
        player++;
    }

    public void display()
    {
        i=checkresult();
        if(i==1) {
            one.setClickable(false);
            two.setClickable(false);
            three.setClickable(false);
            four.setClickable(false);
            five.setClickable(false);
            six.setClickable(false);
            seven.setClickable(false);
            eight.setClickable(false);
            nine.setClickable(false);
            Toast.makeText(getApplicationContext(),"Player "+--player+" Won the match",Toast.LENGTH_SHORT).show();
        }
        else if(i==0)
            Toast.makeText(getApplicationContext(),"Game draw",Toast.LENGTH_SHORT).show();
    }


    /*public int result()
    {
        if(!one.getText().equals("") && one.getText().equals(two.getText()) && one.getText().equals(three.getText()))
            return 1;
        else if(!four.getText().equals("") && four.getText().equals(five.getText()) && four.getText().equals(six.getText()))
            return 1;
        else if(!seven.getText().equals("") && seven.getText().equals(eight.getText()) && seven.getText().equals(nine.getText()))
            return 1;
        else if(!one.getText().equals("") &&
                !two.getText().equals("") &&
                !three.getText().equals("") &&
                !four.getText().equals("") &&
                !five.getText().equals("") &&
                !six.getText().equals("") &&
                !seven.getText().equals("") &&
                !eight.getText().equals("") &&
                !nine.getText().equals("")
                )
            return 0;
        return -1;
    }*/

    public int checkresult()
    {
        if (board[1] == board[2] && board[2] == board[3]) {
            one.setTextColor(Color.BLUE);
            two.setTextColor(Color.BLUE);
            three.setTextColor(Color.BLUE);
            return 1;
        }

        else if (board[4] == board[5] && board[5] == board[6]){
            four.setTextColor(Color.BLUE);
            five.setTextColor(Color.BLUE);
            six.setTextColor(Color.BLUE);
            return 1;
        }

        else if (board[7] == board[8] && board[8] == board[9])

        {
            seven.setTextColor(Color.BLUE);
            eight.setTextColor(Color.BLUE);
            nine.setTextColor(Color.BLUE);
            return 1;
        }
        else if (board[1] == board[4] && board[4] == board[7])

        {
            one.setTextColor(Color.BLUE);
            four.setTextColor(Color.BLUE);
            seven.setTextColor(Color.BLUE);
            return 1;
        }
        else if (board[2] == board[5] && board[5] == board[8])

        {
            two.setTextColor(Color.BLUE);
            five.setTextColor(Color.BLUE);
            eight.setTextColor(Color.BLUE);
            return 1;
        }
        else if (board[3] == board[6] && board[6] == board[9])

        {
            three.setTextColor(Color.BLUE);
            six.setTextColor(Color.BLUE);
            nine.setTextColor(Color.BLUE);
            return 1;
        }
        else if (board[1] == board[5] && board[5] == board[9])

        {
            one.setTextColor(Color.BLUE);
            five.setTextColor(Color.BLUE);
            nine.setTextColor(Color.BLUE);
            return 1;
        }
        else if (board[3] == board[5] && board[5] == board[7])

        {
            three.setTextColor(Color.BLUE);
            five.setTextColor(Color.BLUE);
            seven.setTextColor(Color.BLUE);
            return 1;
        }
        else if (board[1] != '1' && board[2] != '2' && board[3] != '3'
                && board[4] != '4' && board[5] != '5' && board[6] != '6'
                && board[7] != '7' && board[8] != '8' && board[9] != '9')

            return 0;
        else
            return -1;
    }
}

