package edu.washington.j75smith.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.*;
import edu.washington.j75smith.lifecounter.Player;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;


public class MainActivity extends Activity {

    private List<Player> players;
    private List<TextView> lifeTotals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        players = new ArrayList<Player>();
        lifeTotals = new ArrayList<TextView>();
        for (int i = 1; i < 5; i++) {
            players.add(new Player("Player "+i));
        }

        //set the listener to hear all the buttons
        this.findViewById(R.id.p1_g1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p1_g5).setOnClickListener(onClickListener);
        this.findViewById(R.id.p1_l1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p1_l5).setOnClickListener(onClickListener);
        this.findViewById(R.id.p2_g1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p2_g5).setOnClickListener(onClickListener);
        this.findViewById(R.id.p2_l1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p2_l5).setOnClickListener(onClickListener);
        this.findViewById(R.id.p3_g1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p3_g5).setOnClickListener(onClickListener);
        this.findViewById(R.id.p3_l1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p3_l5).setOnClickListener(onClickListener);
        this.findViewById(R.id.p4_g1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p4_g5).setOnClickListener(onClickListener);
        this.findViewById(R.id.p4_l1).setOnClickListener(onClickListener);
        this.findViewById(R.id.p4_l5).setOnClickListener(onClickListener);

        //collect the lifeTotal views
        lifeTotals.add((TextView) this.findViewById(R.id.p1_life));
        lifeTotals.add((TextView) this.findViewById(R.id.p2_life));
        lifeTotals.add((TextView) this.findViewById(R.id.p3_life));
        lifeTotals.add((TextView) this.findViewById(R.id.p4_life));
    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch (v.getId()) {
                case R.id.p1_g1:
                    players.get(0).gainLife(1);
                    int life = players.get(0).getLifeTotal();
                    if(life > 0){
                        lifeTotals.get(0).setText("" + life);
                    }else{
                       lifeTotals.get(0).setText("0");
                       Toast.makeText(getApplicationContext(), "PLAYER 1 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p1_g5:
                    players.get(0).gainLife(5);
                    lifeTotals.get(0).setText("" + players.get(0).getLifeTotal());
                    break;
                case R.id.p1_l1:
                    players.get(0).loseLife(1);
                    if(players.get(0).getLifeTotal() > 0){
                        lifeTotals.get(0).setText("" + players.get(0).getLifeTotal());
                    }else{
                        lifeTotals.get(0).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 1 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p1_l5:
                    players.get(0).loseLife(5);
                    if(players.get(0).getLifeTotal() > 0){
                        lifeTotals.get(0).setText("" + players.get(0).getLifeTotal());
                    }else{
                        lifeTotals.get(0).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 1 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p2_g1:
                    players.get(1).gainLife(1);
                    lifeTotals.get(1).setText("" + players.get(1).getLifeTotal());
                    break;
                case R.id.p2_g5:
                    players.get(1).gainLife(5);
                    lifeTotals.get(1).setText("" + players.get(1).getLifeTotal());
                    break;
                case R.id.p2_l1:
                    players.get(1).loseLife(1);
                    if(players.get(1).getLifeTotal() > 0){
                        lifeTotals.get(1).setText("" + players.get(1).getLifeTotal());
                    }else{
                        lifeTotals.get(1).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 2 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p2_l5:
                    players.get(1).loseLife(5);
                    if(players.get(1).getLifeTotal() > 0){
                        lifeTotals.get(1).setText("" + players.get(1).getLifeTotal());
                    }else{
                        lifeTotals.get(1).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 2 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p3_g1:
                    players.get(2).gainLife(1);
                    lifeTotals.get(2).setText("" + players.get(2).getLifeTotal());
                    break;
                case R.id.p3_g5:
                    players.get(2).gainLife(5);
                    lifeTotals.get(2).setText("" + players.get(2).getLifeTotal());
                    break;
                case R.id.p3_l1:
                    players.get(2).loseLife(1);
                    if(players.get(2).getLifeTotal() > 0){
                        lifeTotals.get(2).setText("" + players.get(2).getLifeTotal());
                    }else{
                        lifeTotals.get(2).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 3 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p3_l5:
                    players.get(2).loseLife(5);
                    if(players.get(2).getLifeTotal() > 0){
                        lifeTotals.get(2).setText("" + players.get(2).getLifeTotal());
                    }else{
                        lifeTotals.get(2).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 3 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p4_g1:
                    players.get(3).gainLife(1);
                    lifeTotals.get(3).setText("" + players.get(3).getLifeTotal());
                    break;
                case R.id.p4_g5:
                    players.get(3).gainLife(5);
                    lifeTotals.get(3).setText("" + players.get(3).getLifeTotal());
                    break;
                case R.id.p4_l1:
                    players.get(3).loseLife(1);
                    if(players.get(3).getLifeTotal() > 0){
                        lifeTotals.get(3).setText("" + players.get(3).getLifeTotal());
                    }else{
                        lifeTotals.get(3).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 4 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.p4_l5:
                    players.get(3).loseLife(5);
                    if(players.get(3).getLifeTotal() > 0){
                        lifeTotals.get(3).setText("" + players.get(3).getLifeTotal());
                    }else{
                        lifeTotals.get(3).setText("0");
                        Toast.makeText(getApplicationContext(), "PLAYER 4 HAS LOST", Toast.LENGTH_LONG).show();
                    }
                    break;
            }
        }
    };
}