package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int[][] board = new int[3][3];
    private boolean turn1 = true;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = -1;
            }
        }

        Button tl = findViewById(R.id.tl);
        tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[0][0] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[0][0] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button tm = findViewById(R.id.tm);
        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[0][1] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else{
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[0][1] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button tr = findViewById(R.id.tr);
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[0][2] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[0][2] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button ml = findViewById(R.id.ml);
        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[1][0] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[1][0] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button mm = findViewById(R.id.mm);
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[1][1] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[1][1] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button mr = findViewById(R.id.mr);
        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[1][2] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[1][2] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button bl = findViewById(R.id.bl);
        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[2][0] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[2][0] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button bm = findViewById(R.id.bm);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[2][1] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[2][1] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });

        Button br = findViewById(R.id.br);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(turn1) {
                    ((Button) v).setText("X");
                    turn1 = false;
                    board[2][2] = 0;
                    v.setEnabled(false);
                    player1wins();
                }
                else {
                    ((Button) v).setText("O");
                    turn1 = true;
                    board[2][2] = 1;
                    v.setEnabled(false);
                    player2wins();
                }
            }
        });
    }

    public void player1wins() {
        boolean flag = false;
        if(board[0][0]==0 && board[0][1]==0 && board[0][2]==0)
            flag = true;
        if(board[1][0]==0 && board[1][1]==0 && board[1][2]==0)
            flag = true;
        if(board[2][0]==0 && board[2][1]==0 && board[2][2]==0)
            flag = true;
        if(board[0][0]==0 && board[1][0]==0 && board[2][0]==0)
            flag = true;
        if(board[0][1]==0 && board[1][1]==0 && board[2][1]==0)
            flag = true;
        if(board[0][2]==0 && board[1][2]==0 && board[2][2]==0)
            flag = true;
        if(board[0][0]==0 && board[1][1]==0 && board[2][2]==0)
            flag = true;
        if(board[0][2]==0 && board[1][1]==0 && board[2][0]==0)
            flag = true;

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        if(flag) {
            dialog.setMessage("Player 1 wins!");
            dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // dismiss the dialog and reset board
                    resetboard();
                }
            });
            dialog.setCancelable(false);
            dialog.create().show();
        }
        else if(count==9) {
            dialog.setMessage("DRAW!");
            dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // dismiss the dialog and reset board
                    resetboard();;
                }
            });
            dialog.setCancelable(false);
            dialog.create().show();
        }
    }

    public void player2wins() {
        boolean flag = false;
        if(board[0][0]==1 && board[0][1]==1 && board[0][2]==1)
            flag = true;
        if(board[1][0]==1 && board[1][1]==1 && board[1][2]==1)
            flag = true;
        if(board[2][0]==1 && board[2][1]==1 && board[2][2]==1)
            flag = true;
        if(board[0][0]==1 && board[1][0]==1 && board[2][0]==1)
            flag = true;
        if(board[0][1]==1 && board[1][1]==1 && board[2][1]==1)
            flag = true;
        if(board[0][2]==1 && board[1][2]==1 && board[2][2]==1)
            flag = true;
        if(board[0][0]==1 && board[1][1]==1 && board[2][2]==1)
            flag = true;
        if(board[0][2]==1 && board[1][1]==1 && board[2][0]==1)
            flag = true;

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        if(flag) {
            dialog.setMessage("Player 2 wins!");
            dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // dismiss the dialog and reset board
                    resetboard();
                }
            });
            dialog.setCancelable(false);
            dialog.create().show();
        }
        else if(count==9){
            dialog.setMessage("DRAW!");
            dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // dismiss the dialog and reset board
                    resetboard();
                }
            });
            dialog.setCancelable(false);
            dialog.create().show();
        }
    }

    public void resetboard() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                board[i][j] = -1;
            }
        }
        turn1 = true;
        count = 0;

        Button tl = findViewById(R.id.tl);
        Button tm = findViewById(R.id.tm);
        Button tr = findViewById(R.id.tr);
        Button ml = findViewById(R.id.ml);
        Button mm = findViewById(R.id.mm);
        Button mr = findViewById(R.id.mr);
        Button bl = findViewById(R.id.bl);
        Button bm = findViewById(R.id.bm);
        Button br = findViewById(R.id.br);
        if(!tl.isEnabled())
            tl.setEnabled(true);
        if(!tm.isEnabled())
            tm.setEnabled(true);
        if(!tr.isEnabled())
            tr.setEnabled(true);
        if(!ml.isEnabled())
            ml.setEnabled(true);
        if(!mm.isEnabled())
            mm.setEnabled(true);
        if(!mr.isEnabled())
            mr.setEnabled(true);
        if(!bl.isEnabled())
            bl.setEnabled(true);
        if(!bm.isEnabled())
            bm.setEnabled(true);
        if(!br.isEnabled())
            br.setEnabled(true);
        tl.setText("");
        tm.setText("");
        tr.setText("");
        ml.setText("");
        mm.setText("");
        mr.setText("");
        bl.setText("");
        bm.setText("");
        br.setText("");
    }
}
