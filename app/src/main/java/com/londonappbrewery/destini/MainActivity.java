package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        TextView mStoryTextView ;
        Button tpButton;
        Button btButton;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        tpButton = (Button) findViewById(R.id.buttonTop);
        btButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        tpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryTextView.setText(R.string.T3_Story);
                tpButton.setText(R.string.T3_Ans1);
                btButton.setText(R.string.T3_Ans2);
                tpButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mStoryTextView.setText(R.string.T6_End);
                        btButton.setVisibility(View.GONE);
                        tpButton.setVisibility(View.GONE);
                    }
                });
                btButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mStoryTextView.setText(R.string.T5_End);
                        btButton.setVisibility(View.GONE);
                        tpButton.setVisibility(View.GONE);
                    }
                });
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryTextView.setText(R.string.T2_Story);
                tpButton.setText(R.string.T2_Ans1);
                btButton.setText(R.string.T2_Ans2);
                tpButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mStoryTextView.setText(R.string.T3_Story);
                        tpButton.setText(R.string.T3_Ans1);
                        btButton.setText(R.string.T3_Ans2);
                        tpButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mStoryTextView.setText(R.string.T6_End);
                                btButton.setVisibility(View.GONE);
                                tpButton.setVisibility(View.GONE);
                            }
                        });
                        btButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                mStoryTextView.setText(R.string.T5_End);
                                btButton.setVisibility(View.GONE);
                                tpButton.setVisibility(View.GONE);
                            }
                        });
                    }
                });
                btButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mStoryTextView.setText(R.string.T4_End);
                        btButton.setVisibility(View.GONE);
                        tpButton.setVisibility(View.GONE);
                    }
                });
            }
        });
    }
}
