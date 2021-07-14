package com.example.homeapplication;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    TextView gameIdTextView, amountTextView;
    Button ClickGreen, ClickVoilet, ClickRed;
    ArrayList<Button> buttons = new ArrayList<>();
    boolean primaryColorSelected = false;
    int amount = 0;
    Button Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1_layout, container, false);
        gameIdTextView = (TextView) v.findViewById(R.id.gameIdTextView);
        amountTextView = (TextView) v.findViewById(R.id.amountTextView);
        ClickGreen = v.findViewById(R.id.greenButton);
        ClickVoilet = v.findViewById(R.id.voiletButton);
        ClickRed = v.findViewById(R.id.redButton);
        Button0 = v.findViewById(R.id.button0);
        Button1 = v.findViewById(R.id.button1);
        Button2 = v.findViewById(R.id.button2);
        Button3 = v.findViewById(R.id.button3);
        Button4 = v.findViewById(R.id.button4);
        Button5 = v.findViewById(R.id.button5);
        Button6 = v.findViewById(R.id.button6);
        Button7 = v.findViewById(R.id.button7);
        Button8 = v.findViewById(R.id.button8);
        Button9 = v.findViewById(R.id.button9);
        buttons.add(ClickGreen);
        buttons.add(ClickRed);
        buttons.add(ClickVoilet);

        ClickGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primaryColorSelected){
                    ShowDialog();
                }else {
                    showChooseColorDialog(v);
                }
            }
        });

        ClickVoilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primaryColorSelected){
                    ShowDialog();
                }else {
                    showChooseColorDialog(v);
                }
            }
        });

        ClickRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primaryColorSelected){
                    ShowDialog();
                }else {
                    showChooseColorDialog(v);
                }
            }
        });

        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowDialog();
            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              ShowDialog();
            }

        });
        return v;
    }


    public void ShowDialog(){

        final AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        View mView = getLayoutInflater().inflate(R.layout.selectamount_dialogbox,null);
        alert.setView(mView);
        amount = 0;
        ImageView tenPlus = mView.findViewById(R.id.tenPlusImageView);
        ImageView tenMinus = mView.findViewById(R.id.tenMinusImageView);
        ImageView hundredPlus = mView.findViewById(R.id.hundredPlusImageView);
        ImageView hundredMinus = mView.findViewById(R.id.hundradMinusImageView);

        ImageView fiveHundredPlus = mView.findViewById(R.id.fiveHundredPlusImageView);
        ImageView fiveHundredMinus = mView.findViewById(R.id.fivdHundradMinusImageView);

        ImageView thousandPlus = mView.findViewById(R.id.thousandPlusImageView);
        ImageView thousandMinus = mView.findViewById(R.id.thousandMinusImageView);
        Button ten = mView.findViewById(R.id.firstButton);
        Button hundred = mView.findViewById(R.id.secondButton);
        Button fiveHundred = mView.findViewById(R.id.thirdButton);
        Button thousand = mView.findViewById(R.id.fourthButton);
        final TextView AmountTextValue = mView.findViewById(R.id.amountValue);
        AmountTextValue.setText(String.valueOf(amount));

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AmountTextValue.setText("10");
            }
        });
        tenPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                amount = amount+10;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });

        tenMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = amount-10;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });

        hundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AmountTextValue.setText("100");
            }
        });
        hundredPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = amount+100;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });
        hundredMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = amount-100;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });

        fiveHundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AmountTextValue.setText("500");
            }
        });
        fiveHundredPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount=amount+500;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });
        fiveHundredMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = amount-500;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });

        thousand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AmountTextValue.setText("1000");
            }
        });
        thousandPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = amount+1000;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });
        thousandMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = amount-1000;
                AmountTextValue.setText(String.valueOf(amount));
            }
        });

        Button cancel = mView.findViewById(R.id.cancelButton);
        Button okay = mView.findViewById(R.id.okayButton);


        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(false);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.hide();
            }
        });

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.hide();
            }
        });

        alertDialog.show();
    }

    public int increase(int amount,int increse){
        return amount+increse;
    }
    public void decrease(){

    }
    /*

     */
    public void showChooseColorDialog(final View buttonView){
        final AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        View mView = getLayoutInflater().inflate(R.layout.choosecolor_dialogbox,null);
        alert.setView(mView);
        Button okay = mView.findViewById(R.id.okayButton);
        Button cancel = mView.findViewById(R.id.cancelButton);



        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        okay.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                for (Button button:buttons){
                    if (button ==buttonView){
                        button.setEnabled(false);
                        button.setClickable(false);
                        button.setBackgroundColor(R.color.gray);
                        primaryColorSelected = true;
                    }
                }
                alertDialog.hide();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.hide();
            }
        });
        alertDialog.show();
    }







  /*  public void (View view){
        final AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        View mView = getLayoutInflater().inflate(R.layout.selectamount_dialogbox,null);
        alert.setView(mView);

        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        alertDialog.show();
       // Intent intent = new Intent();
       // startActivity(intent);
    }  
    return v;
        }
*/
    public void clickGreen(View view){
        Intent intent = new Intent();
        startActivity(intent);
    }

    public void clickRed(View view){
        Intent intent = new Intent();
        startActivity(intent);
    }

    public void infoClick(View view){
        Intent intent = new Intent();
        startActivity(intent);
    }
}
