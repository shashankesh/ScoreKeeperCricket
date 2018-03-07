package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    try {
                        Button btn = (Button) findViewById(R.id.run10);
                        btn.setText(String.valueOf(String.format("+1 extra")));
                        Button btn1 = (Button) findViewById(R.id.run12);
                        btn1.setText(String.valueOf(String.format("no run")));

                        Button btn2 = (Button) findViewById(R.id.run11);
                        btn2.setText(String.valueOf(String.format("wicket")));


                        Button btn3 = (Button) findViewById(R.id.run18);
                        btn3.setText(String.valueOf(String.format("four")));

                        Button btn4 = (Button) findViewById(R.id.run19);
                        btn4.setText(String.valueOf(String.format("six")));
                        Button btn5 = (Button) findViewById(R.id.run17);
                        btn5.setText(String.valueOf(String.format("run")));

                        Button btn6 = (Button) findViewById(R.id.run4);
                        btn6.setText(String.valueOf(String.format("+1 extra")));

                        Button btn7 = (Button) findViewById(R.id.run16);
                        btn7.setText(String.valueOf(String.format("no run")));

                        Button btn8 = (Button) findViewById(R.id.run15);
                        btn8.setText(String.valueOf(String.format("wicket")));

                        Button btn9 = (Button) findViewById(R.id.run2);
                        btn9.setText(String.valueOf(String.format("four")));

                        Button btn0 = (Button) findViewById(R.id.run3);
                        btn0.setText(String.valueOf(String.format("six")));

                        Button btn11 = (Button) findViewById(R.id.run1);
                        btn11.setText(String.valueOf(String.format("run")));
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
                        Button btn = (Button) findViewById(R.id.run10);
                        btn.setText(String.valueOf(String.format("+1 extra")));
                        Button btn1 = (Button) findViewById(R.id.run12);
                        btn1.setText(String.valueOf(String.format("no run")));

                        Button btn2 = (Button) findViewById(R.id.run11);
                        btn2.setText(String.valueOf(String.format("wicket")));


                        Button btn3 = (Button) findViewById(R.id.run18);
                        btn3.setText(String.valueOf(String.format("four")));

                        Button btn4 = (Button) findViewById(R.id.run19);
                        btn4.setText(String.valueOf(String.format("six")));
                        Button btn5 = (Button) findViewById(R.id.run17);
                        btn5.setText(String.valueOf(String.format("run")));

                        Button btn6 = (Button) findViewById(R.id.run4);
                        btn6.setText(String.valueOf(String.format("+1 extra")));

                        Button btn7 = (Button) findViewById(R.id.run16);
                        btn7.setText(String.valueOf(String.format("no run")));

                        Button btn8 = (Button) findViewById(R.id.run15);
                        btn8.setText(String.valueOf(String.format("wicket")));

                        Button btn9 = (Button) findViewById(R.id.run2);
                        btn9.setText(String.valueOf(String.format("four")));

                        Button btn0 = (Button) findViewById(R.id.run3);
                        btn0.setText(String.valueOf(String.format("six")));

                        Button btn11 = (Button) findViewById(R.id.run1);
                        btn11.setText(String.valueOf(String.format("run")));
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
            Button btn = (Button) findViewById(R.id.run1);
            btn.setText(String.valueOf(String.format("Over")));
            view.setClickable(false);
            view.setEnabled(false);
            v[0] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run1);
            btn.setText(String.valueOf(String.format("run")));
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
            Button btn = (Button) findViewById(R.id.run3);
            btn.setText(String.valueOf(String.format("Over")));
            view.setClickable(false);
            view.setEnabled(false);
            v[1] = view;

        } else {
            Button btn = (Button) findViewById(R.id.run3);
            btn.setText(String.valueOf(String.format("six")));

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
            Button btn = (Button) findViewById(R.id.run2);
            btn.setText(String.valueOf(String.format("Over")));
            view.setClickable(false);
            view.setEnabled(false);
            v[2] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run2);
            btn.setText(String.valueOf(String.format("four")));
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
            Button btn = (Button) findViewById(R.id.run15);
            btn.setText(String.valueOf(String.format("Over")));
            view.setClickable(false);
            view.setEnabled(false);
            v[3] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run15);
            btn.setText(String.valueOf(String.format("wicket")));

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
            Button btn = (Button) findViewById(R.id.run16);
            btn.setText(String.valueOf(String.format("Over")));
            view.setClickable(false);
            view.setEnabled(false);
            v[4] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run16);
            btn.setText(String.valueOf(String.format("no run")));

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
            Button btn = (Button) findViewById(R.id.run4);
            btn.setText(String.valueOf(String.format("Over")));
            view.setClickable(false);
            view.setEnabled(false);
            v[5] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run4);
            btn.setText(String.valueOf(String.format("+1 extra")));
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
            Button btn = (Button) findViewById(R.id.run17);
            btn.setText(String.valueOf(String.format("Over")));
            view.setEnabled(false);
            view.setClickable(false);
            v[6] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run17);
            btn.setText(String.valueOf(String.format("run")));
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
            Button btn = (Button) findViewById(R.id.run19);
            btn.setText(String.valueOf(String.format("Over")));
            view.setEnabled(false);
            view.setClickable(false);
            v[7] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run19);
            btn.setText(String.valueOf(String.format("six")));
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
            Button btn = (Button) findViewById(R.id.run18);
            btn.setText(String.valueOf(String.format("Over")));
            view.setEnabled(false);
            view.setClickable(false);
            v[8] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run18);
            btn.setText(String.valueOf(String.format("four")));
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
            Button btn = (Button) findViewById(R.id.run11);
            btn.setText(String.valueOf(String.format("Over")));
            view.setEnabled(false);
            view.setClickable(false);
            v[9] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run11);
            btn.setText(String.valueOf(String.format("wicket")));
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
            Button btn = (Button) findViewById(R.id.run12);
            btn.setText(String.valueOf(String.format("Over")));
            view.setEnabled(false);
            view.setClickable(false);
            v[10] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run12);
            btn.setText(String.valueOf(String.format("no run")));
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
            Button btn = (Button) findViewById(R.id.run10);
            btn.setText(String.valueOf(String.format("Over")));
            view.setEnabled(false);
            view.setClickable(false);
            v[11] = view;
        } else {
            Button btn = (Button) findViewById(R.id.run10);
            btn.setText(String.valueOf(String.format("+1 extra")));
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

            Button btn = (Button) findViewById(R.id.run10);
            btn.setText(String.valueOf(String.format("+1 extra")));
            Button btn1 = (Button) findViewById(R.id.run12);
            btn1.setText(String.valueOf(String.format("no run")));

            Button btn2 = (Button) findViewById(R.id.run11);
            btn2.setText(String.valueOf(String.format("wicket")));


            Button btn3 = (Button) findViewById(R.id.run18);
            btn3.setText(String.valueOf(String.format("four")));

            Button btn4 = (Button) findViewById(R.id.run19);
            btn4.setText(String.valueOf(String.format("six")));
            Button btn5 = (Button) findViewById(R.id.run17);
            btn5.setText(String.valueOf(String.format("run")));

            Button btn6 = (Button) findViewById(R.id.run4);
            btn6.setText(String.valueOf(String.format("+1 extra")));

            Button btn7 = (Button) findViewById(R.id.run16);
            btn7.setText(String.valueOf(String.format("no run")));

            Button btn8 = (Button) findViewById(R.id.run15);
            btn8.setText(String.valueOf(String.format("wicket")));

            Button btn9 = (Button) findViewById(R.id.run2);
            btn9.setText(String.valueOf(String.format("four")));

            Button btn0 = (Button) findViewById(R.id.run3);
            btn0.setText(String.valueOf(String.format("six")));

            Button btn11 = (Button) findViewById(R.id.run1);
            btn11.setText(String.valueOf(String.format("run")));


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

