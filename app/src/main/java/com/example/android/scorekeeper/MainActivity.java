package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    int run = 0, wk = 0;
    int ov = 0, bl = 0;
    int runB = 0, wkB = 0;
    int ovB = 0, blB = 0;
    View v[] = new View[14];
    int ov_limit = 4;
    boolean setA = true, setB = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggle = (ToggleButton) findViewById(R.id.start);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()

        {
            public void onCheckedChanged (CompoundButton buttonView,boolean isChecked){
                if (isChecked) {
                    // The toggle is enabled
                    try {

                            setA = true;
                            setB = false;
                            for (int i = 0; i < 6; i++) {
                                v[i].setEnabled(true);
                                v[i].setClickable(true);
                            }

                    } catch (Exception ex) {
                        display_score(run, wk, ov, bl, "");
                        display_scoreB(runB, wkB, ovB, blB, "");
                    }
                } else {
                    // The toggle is disabled
                    try {
                            setA = false;
                            setB = true;
                            for (int i = 6; i < 12; i++) {
                                v[i].setEnabled(true);
                                v[i].setClickable(true);
                            }


                    } catch (Exception ex) {
                        display_score(run, wk, ov, bl, "");
                        display_scoreB(runB, wkB, ovB, blB, "");
                    }
                }
            }
        });
    }


    public void add1(View view) {
        if (wk > 9 || (ov > ov_limit) || setA == false) {
            view.setClickable(false);
            view.setEnabled(false);
            v[0] = view;
        } else {

            run++;
            bl++;
            if (bl == 6) {
                bl = 0;
                ov++;
            }
            display_score(run, wk, ov, bl, "");
        }

    }

    public void add6(View view) {
        if (wk > 9 || (ov > ov_limit) || setA == false) {
            view.setClickable(false);
            view.setEnabled(false);
            v[1] = view;

        } else {

            run = run + 6;
            bl++;
            if (bl == 6) {
                bl = 0;
                ov++;
            }

            display_score(run, wk, ov, bl, "");
        }

    }

    public void add4(View view) {
        if (wk > 9 || (ov > ov_limit) || setA == false) {
            view.setClickable(false);
            view.setEnabled(false);
            v[2] = view;
        } else {

            run = run + 4;
            bl++;
            if (bl == 6) {
                bl = 0;
                ov++;
            }
            display_score(run, wk, ov, bl, "");
        }

    }

    public void wck(View view) {
        if (wk > 9 || (ov > ov_limit) || setA == false) {
            view.setClickable(false);
            view.setEnabled(false);
            v[3] = view;
        } else {

            wk++;
            bl++;
            if (bl == 6) {
                bl = 0;
                ov++;
            }
            display_score(run, wk, ov, bl, "");
        }
    }

    public void noRun(View view) {
        if (wk > 9 || (ov > ov_limit) || setA == false) {
            view.setClickable(false);
            view.setEnabled(false);
            v[4] = view;
        } else {

            bl++;
            if (bl == 6) {
                bl = 0;
                ov++;
            }
            display_score(run, wk, ov, bl, "");
        }
    }

    public void extra(View view) {
        if (wk > 9 || (ov > ov_limit) || setA == false) {
            view.setClickable(false);
            view.setEnabled(false);
            v[5] = view;
        } else {

            run++;
            if (bl == 6) {
                bl = 0;
                ov++;
            }
            display_score(run, wk, ov, bl, "");
        }
    }

    public void display_score(int run, int wk, int ov, int bl, String mg) {
        TextView scoreResult = (TextView) findViewById(R.id.Team_a_score);
        TextView overResult = (TextView) findViewById(R.id.Team_a_over);
        if (mg == "") {
            scoreResult.setText(String.valueOf(String.format("R: %d / %d", run, wk)));
            overResult.setText(String.valueOf(String.format("O: %d.%d", ov, bl)));
        } else {
            scoreResult.setText(String.valueOf(mg));
        }
    }


    public void add1B(View view) {
        if (wkB > 9 || (ovB > ov_limit) || setB == false) {
            view.setEnabled(false);
            view.setClickable(false);
            v[6] = view;
        } else {
            runB++;
            blB++;
            if (blB == 6) {
                blB = 0;
                ovB++;
            }
            display_scoreB(runB, wkB, ovB, blB, "");
        }

    }

    public void add6B(View view) {
        if (wkB > 9 || (ovB > ov_limit) || setB == false) {
            view.setEnabled(false);
            view.setClickable(false);
            v[7] = view;
        } else {
            runB = runB + 6;
            blB++;
            if (blB == 6) {
                blB = 0;
                ovB++;
            }
            display_scoreB(runB, wkB, ovB, blB, "");
        }

    }

    public void add4B(View view) {
        if (wkB > 9 || (ovB > ov_limit) || setB == false) {
            view.setEnabled(false);
            view.setClickable(false);
            v[8] = view;
        } else {
            runB = runB + 4;
            blB++;
            if (blB == 6) {
                blB = 0;
                ovB++;
            }
            display_scoreB(runB, wkB, ovB, blB, "");
        }

    }

    public void wckB(View view) {
        if (wkB > 9 || (ovB > ov_limit) || setB == false) {
            view.setEnabled(false);
            view.setClickable(false);
            v[9] = view;
        } else {
            wkB++;
            blB++;
            if (blB == 6) {
                blB = 0;
                ovB++;
            }
            display_scoreB(runB, wkB, ovB, blB, "");
        }
    }

    public void noRunB(View view) {
        if (wkB > 9 || (ovB > ov_limit) || setB == false) {
            view.setEnabled(false);
            view.setClickable(false);
            v[10] = view;
        } else {
            blB++;
            if (blB == 6) {
                blB = 0;
                ovB++;
            }
            display_scoreB(runB, wkB, ovB, blB, "");
        }
    }

    public void extraB(View view) {
        if (wkB > 9 || (ovB > ov_limit) || setB == false) {
            view.setEnabled(false);
            view.setClickable(false);
            v[11] = view;
        } else {
            runB++;
            if (blB == 6) {
                blB = 0;
                ovB++;
            }
            display_scoreB(runB, wkB, ovB, blB, "");
        }

    }

    public void display_scoreB(int runB, int wkB, int ovB, int blB, String mg) {
        TextView scoreResult = (TextView) findViewById(R.id.Team_b_score);
        TextView overResult = (TextView) findViewById(R.id.Team_b_over);
        if (mg == "") {
            scoreResult.setText(String.valueOf(String.format("R: %d / %d", runB, wkB)));
            overResult.setText(String.valueOf(String.format("O: %d.%d", ovB, blB)));
        } else {
            scoreResult.setText(String.valueOf(mg));

        }
    }

    public void display_alert(String mg) {
        TextView error = (TextView) findViewById(R.id.alert);
        error.setText(String.valueOf(mg));
    }

    public void reset(View view) {

        try {
            for (int i = 0; i < 12; i++) {
                v[i].setEnabled(true);
                v[i].setClickable(true);
            }
            if (run > runB) {
                display_score(run, wk, ov, bl, "winner");
                display_scoreB(runB, wkB, ovB, blB, "loser");
            } else {
                display_score(run, wk, ov, bl, "loser");
                display_scoreB(runB, wkB, ovB, blB, "winner");
            }
            run = 0;
            wk = 0;
            ov = 0;
            bl = 0;
            runB = 0;
            wkB = 0;
            ovB = 0;
            blB = 0;
        } catch (Exception ex) {
            display_score(0, 0, 0, 0, "");
            display_scoreB(0, 0, 0, 0, "");
        }


    }


}

