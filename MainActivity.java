package com.csufcpsc411.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.graphics.Typeface;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        HorizontalScrollView sv = new HorizontalScrollView(this);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
       // ScrollView sv = new ScrollView(this);


        LinearLayout Wrap = new LinearLayout(this);
        Wrap.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams D = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        Wrap.setLayoutParams(D);
        //1. Create a text view object
        TextView v = new TextView(this);

        //2. Set attribute
        v.setText("Rules void hello1(int hour)");
        v.setBackgroundColor(Color.BLACK);
        v.setGravity(Gravity.CENTER_HORIZONTAL);
        // v.setPadding(50,50,50,350);
        v.setTextSize(12);
        v.setTypeface(null, Typeface.BOLD);
        v.setTextColor(Color.WHITE);
        //v.setID(R.id._test_obj_id);

        //3.Create Layout Params
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);
        Wrap.addView(v);

        //---------------------------
        GridLayout g1 = new GridLayout(this);
        g1.setRowCount(4);
        g1.setColumnCount(3);
        TextView tv = new TextView(this);
        tv.setText(" name");
        GridLayout.Spec row1 = GridLayout.spec(0);
        GridLayout.Spec col2 = GridLayout.spec(1);
        GridLayout.Spec row4 = GridLayout.spec(3);
        GridLayout.LayoutParams first = new GridLayout.LayoutParams(row1,col2);
        tv.setTextSize(12);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        first.width = 500;
        first.setMargins(5,5,5,5);
        tv.setLayoutParams(first);
        g1.addView(tv);
        //----------------
        TextView tvP = new TextView(this);
        tvP.setText("properties");
        GridLayout.Spec row2 = GridLayout.spec(1);
        GridLayout.Spec col1 = GridLayout.spec(0);
        GridLayout.LayoutParams sd = new GridLayout.LayoutParams(row1,col1);
        tvP.setTextSize(12);
        tvP.setTextColor(Color.BLACK);
        tvP.setBackgroundColor(Color.WHITE);
        tvP.setGravity(Gravity.CENTER_VERTICAL);
        sd.width = 200;
        sd.setMargins(5,5,5,5);
        tvP.setLayoutParams(sd);
        g1.addView(tvP);
        //-----------------
        TextView tvD = new TextView(this);
        tvD.setText("Day Hour Classification");
        GridLayout.Spec row3 = GridLayout.spec(2);
        GridLayout.Spec col3 = GridLayout.spec(2);
        GridLayout.LayoutParams thd = new GridLayout.LayoutParams(row1,col3);
        tvD.setTextSize(12);
        tvD.setTextColor(Color.BLACK);
        tvD.setBackgroundColor(Color.WHITE);
        tvD.setGravity(Gravity.CENTER_VERTICAL);
        thd.width = 700;
        thd.setMargins(5,5,5,5);
        tvD.setLayoutParams(thd);
        g1.addView(tvD);
        //---------------
        TextView tvBlank = new TextView(this);
        tvBlank.setText("");
        tvBlank.setTypeface(null,Typeface.BOLD);
        //GridLayout.Spec row4 = GridLayout.spec(1);
        //GridLayout.Spec col1 = GridLayout.spec(2);
        GridLayout.LayoutParams BK = new GridLayout.LayoutParams(row2,col1);
        tvBlank.setTextSize(12);
        tvBlank.setTextColor(Color.BLACK);
        tvBlank.setBackgroundColor(Color.WHITE);
        tvBlank.setGravity(Gravity.CENTER_VERTICAL);
        BK.width = 200;
        BK.setMargins(5,5,5,5);
        tvBlank.setLayoutParams(BK);
        g1.addView(tvBlank);
        //-------------------
        TextView tvR = new TextView(this);
        tvR.setText("Rule");
        tvR.setTypeface(null,Typeface.BOLD);
        // GridLayout.Spec row5 = GridLayout.spec(2);
        //GridLayout.Spec col1 = GridLayout.spec(2);
        GridLayout.LayoutParams ule = new GridLayout.LayoutParams(row3,col1);
        tvR.setTextSize(12);
        tvR.setTextColor(Color.BLACK);
        tvR.setBackgroundColor(Color.CYAN);
        tvR.setGravity(Gravity.CENTER_HORIZONTAL);
        ule.width = 200;
        ule.setMargins(5,5,5,5);
        tvR.setLayoutParams(ule);
        g1.addView(tvR);
        //---------------
        TextView tvC = new TextView(this);
        tvC.setText("Category");
        GridLayout.LayoutParams cat = new GridLayout.LayoutParams(row2,col2);
        tvC.setTextSize(12);
        tvC.setTextColor(Color.BLACK);
        tvC.setBackgroundColor(Color.WHITE);
        tvC.setGravity(Gravity.CENTER_HORIZONTAL);
        cat.width = 500;
        cat.setMargins(5,5,5,5);
        tvC.setLayoutParams(cat);
        g1.addView(tvC);
        //-----------------
        TextView tvDT = new TextView(this);
        tvDT.setText("Day and Time");
        GridLayout.LayoutParams Dtm = new GridLayout.LayoutParams(row2,col3);
        tvDT.setTextSize(12);
        tvDT.setTextColor(Color.BLACK);
        tvDT.setBackgroundColor(Color.WHITE);
        tvDT.setGravity(Gravity.CENTER_VERTICAL);
        Dtm.width = 700;
        Dtm.setMargins(5,5,5,5);
        tvDT.setLayoutParams(Dtm);
        g1.addView(tvDT);
        //-----------------
        TextView tvCO = new TextView(this);
        tvCO.setText("C1");
        tvCO.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams c1 = new GridLayout.LayoutParams(row3,col2);
        tvCO.setTextSize(12);
        tvCO.setTextColor(Color.BLACK);
        tvCO.setBackgroundColor(Color.CYAN);
        tvCO.setGravity(Gravity.CENTER_HORIZONTAL);
        c1.width = 500;
        c1.setMargins(5,5,5,5);
        tvCO.setLayoutParams(c1);
        g1.addView(tvCO);
        //------------------
        TextView tvAO = new TextView(this);
        tvAO.setText("A1");
        tvAO.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams a1 = new GridLayout.LayoutParams(row3,col3);
        tvAO.setTextSize(12);
        tvAO.setTextColor(Color.BLACK);
        tvAO.setBackgroundColor(Color.CYAN);
        tvAO.setGravity(Gravity.CENTER_HORIZONTAL);
        a1.width = 700;
        a1.setMargins(5,5,5,5);
        tvAO.setLayoutParams(a1);
        g1.addView(tvAO);
        //-------------
        TextView tvNo = new TextView(this);
        tvNo.setText("");
        //GridLayout.Spec row5 = GridLayout.spec(4);
        GridLayout.LayoutParams Wn = new GridLayout.LayoutParams(row4,col1);
        tvNo.setBackgroundColor(Color.CYAN);
        tvNo.setGravity(Gravity.CENTER_HORIZONTAL);
        Wn.width = 200;
        Wn.setMargins(5,5,5,5);
        tvNo.setLayoutParams(Wn);
        g1.addView(tvNo);
        //------------
        TextView tvMm = new TextView(this);
        tvMm.setText("min <= hour && hour <= max");
        GridLayout.LayoutParams Min = new GridLayout.LayoutParams(row4,col2);
        tvMm.setTextSize(10);
        tvMm.setTextColor(Color.BLACK);
        tvMm.setBackgroundColor(Color.CYAN);
        tvMm.setGravity(Gravity.CENTER_HORIZONTAL);
        Min.width = 500;
        Min.height = 55;
        Min.setMargins(1,1,1,1);
        tvMm.setLayoutParams(Min);
        g1.addView(tvMm);
        //--------------
        TextView tvSys = new TextView(this);
        tvSys.setText("System.out.printIn(greeting+,\"World!\"");
        GridLayout.LayoutParams Sy = new GridLayout.LayoutParams(row4,col3);
        tvSys.setTextSize(12);
        tvSys.setTextColor(Color.BLACK);
        tvSys.setBackgroundColor(Color.CYAN);
        tvSys.setGravity(Gravity.CENTER_HORIZONTAL);
        Sy.width = 700;
        Sy.setMargins(5,5,5,5);
        tvSys.setLayoutParams(Sy);
        g1.addView(tvSys);

        //----Grid 2 for 4 columns
        GridLayout g2 = new GridLayout(this);
        g2.setRowCount(11);
        g2.setColumnCount(4);
        GridLayout.Spec row6 = GridLayout.spec(5);
        GridLayout.Spec row7 = GridLayout.spec(6);
        GridLayout.Spec row8 = GridLayout.spec(7);
        GridLayout.Spec row9 = GridLayout.spec(8);
        GridLayout.Spec row10 = GridLayout.spec(9);
        GridLayout.Spec row11 = GridLayout.spec(10);
        //
        TextView tvBK = new TextView(this);
        tvBK.setText("");
        GridLayout.LayoutParams Cb = new GridLayout.LayoutParams(row6,col1);
        tvBK.setBackgroundColor(Color.CYAN);
        tvBK.setGravity(Gravity.CENTER_VERTICAL);
        Cb.width = 200;
        Cb.setMargins(5,5,5,5);
        tvBK.setLayoutParams(Cb);
        g2.addView(tvBK);
        //-------------------
        TextView tvIm = new TextView(this);
        tvIm.setText("int min");
        GridLayout.LayoutParams Imn = new GridLayout.LayoutParams(row6,col2);
        tvIm.setTextSize(12);
        tvIm.setTextColor(Color.BLACK);
        tvIm.setBackgroundColor(Color.CYAN);
        tvIm.setGravity(Gravity.CENTER_HORIZONTAL);
        Imn.width = 240;
        Imn.setMargins(5,5,5,5);
        tvIm.setLayoutParams(Imn);
        g2.addView(tvIm);
        //--------------------
        TextView tvmX = new TextView(this);
        tvmX.setText("int max");
        GridLayout.LayoutParams Mx = new GridLayout.LayoutParams(row6,col3);
        tvmX.setTextSize(12);
        tvmX.setTextColor(Color.BLACK);
        tvmX.setBackgroundColor(Color.CYAN);
        tvmX.setGravity(Gravity.CENTER_HORIZONTAL);
        Mx.width = 240;
        Mx.setMargins(5,5,5,5);
        tvmX.setLayoutParams(Mx);
        g2.addView(tvmX);
        //---------
        TextView tvStr = new TextView(this);
        tvStr.setText("String Greeting");
        GridLayout.Spec col4 = GridLayout.spec(3);
        GridLayout.LayoutParams Sgn = new GridLayout.LayoutParams(row6,col4);
        tvStr.setTextSize(12);
        tvStr.setTextColor(Color.BLACK);
        tvStr.setBackgroundColor(Color.CYAN);
        //tvGt.setBackgroundColor(Color.parseColor("#FF9800"));
        tvStr.setGravity(Gravity.CENTER_HORIZONTAL);
        Sgn.width = 705;
        Sgn.setMargins(5,5,5,5);
        tvStr.setLayoutParams(Sgn);
        g2.addView(tvStr);
        //--------------
        TextView tvRL = new TextView(this);
        tvRL.setText("Rule");
        tvRL.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams RU = new GridLayout.LayoutParams(row7,col1);
        tvRL.setTextSize(12);
        tvRL.setTextColor(Color.BLACK);
        tvRL.setBackgroundColor(Color.WHITE);
        tvRL.setGravity(Gravity.CENTER_VERTICAL);
        RU.width = 200;
        RU.setMargins(5,5,5,5);
        tvRL.setLayoutParams(RU);
        g2.addView(tvRL);
        //-------
        TextView tvR10 = new TextView(this);
        tvR10.setText("R10");
        GridLayout.LayoutParams R1 = new GridLayout.LayoutParams(row8,col1);
        tvR10.setTextSize(12);
        tvR10.setTextColor(Color.BLACK);
        tvR10.setBackgroundColor(Color.WHITE);
        tvR10.setGravity(Gravity.CENTER_VERTICAL);
        R1.width = 200;
        R1.setMargins(5,5,5,5);
        tvR10.setLayoutParams(R1);
        g2.addView(tvR10);
        //----------
        TextView tvR20 = new TextView(this);
        tvR20.setText("R20");
        GridLayout.LayoutParams R2 = new GridLayout.LayoutParams(row9,col1);
        tvR20.setTextSize(12);
        tvR20.setTextColor(Color.BLACK);
        tvR20.setBackgroundColor(Color.WHITE);
        tvR20.setGravity(Gravity.CENTER_VERTICAL);
        R2.width = 200;
        R2.setMargins(5,5,5,5);
        tvR20.setLayoutParams(R2);
        g2.addView(tvR20);
        //----------
        TextView tvR30 = new TextView(this);
        tvR30.setText("R30");
        GridLayout.LayoutParams R3 = new GridLayout.LayoutParams(row10,col1);
        tvR30.setTextSize(12);
        tvR30.setTextColor(Color.BLACK);
        tvR30.setBackgroundColor(Color.WHITE);
        tvR30.setGravity(Gravity.CENTER_VERTICAL);
        R3.width = 200;
        R3.setMargins(5,5,5,5);
        tvR30.setLayoutParams(R3);
        g2.addView(tvR30);
        //
        TextView tvR40 = new TextView(this);
        tvR40.setText("R40");
        GridLayout.LayoutParams R4 = new GridLayout.LayoutParams(row11,col1);
        tvR40.setTextSize(12);
        tvR40.setTextColor(Color.BLACK);
        tvR40.setBackgroundColor(Color.WHITE);
        tvR40.setGravity(Gravity.CENTER_VERTICAL);
        R4.width = 200;
        R4.setMargins(5,5,5,5);
        tvR40.setLayoutParams(R4);
        g2.addView(tvR40);
        //--------------
        TextView tvZe = new TextView(this);
        tvZe.setText("From");
        tvZe.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams zero = new GridLayout.LayoutParams(row7,col2);
        tvZe.setTextSize(12);
        tvZe.setTextColor(Color.BLACK);
        tvZe.setBackgroundColor(Color.YELLOW);
        tvZe.setGravity(Gravity.CENTER_VERTICAL);
        zero.width = 240;
        zero.setMargins(5,5,5,5);
        tvZe.setLayoutParams(zero);
        g2.addView( tvZe);
        //-----------------
        TextView tvTw = new TextView(this);
        tvTw.setText("0");
        GridLayout.LayoutParams Twelve = new GridLayout.LayoutParams(row8,col2);
        tvTw.setTextSize(12);
        tvTw.setTextColor(Color.BLACK);
        tvTw.setBackgroundColor(Color.YELLOW);
        tvTw.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Twelve.width = 240;
        Twelve.setMargins(5,5,5,5);
        tvTw.setLayoutParams(Twelve);
        g2.addView( tvTw );
        //------------------
        TextView tvEt = new TextView(this);
        tvEt.setText("12");
        GridLayout.LayoutParams Eit = new GridLayout.LayoutParams(row9,col2);
        tvEt.setTextSize(12);
        tvEt.setTextColor(Color.BLACK);
        tvEt.setBackgroundColor(Color.YELLOW);
        tvEt.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Eit.width = 240;
        Eit.setMargins(5,5,5,5);
        tvEt.setLayoutParams(Eit);
        g2.addView(tvEt);
        //--------------
        TextView tvTT = new TextView(this);
        tvTT.setText("18");
        GridLayout.LayoutParams TwT = new GridLayout.LayoutParams(row10,col2);
        tvTT.setTextSize(12);
        tvTT.setTextColor(Color.BLACK);
        tvTT.setBackgroundColor(Color.YELLOW);
        tvTT.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        TwT.width = 240;
        TwT.setMargins(5,5,5,5);
        tvTT.setLayoutParams(TwT);
        g2.addView(tvTT);
        //--------------
        TextView tvTwD = new TextView(this);
        tvTwD.setText("22");
        GridLayout.LayoutParams TD = new GridLayout.LayoutParams(row11,col2);
        tvTwD.setTextSize(12);
        tvTwD.setTextColor(Color.BLACK);
        tvTwD.setBackgroundColor(Color.YELLOW);
        tvTwD.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        TD.width = 240;
        TD.setMargins(5,5,5,5);
        tvTwD.setLayoutParams(TD);
        g2.addView(tvTwD);
        //-------
        TextView tvOO = new TextView(this);
        tvOO.setText("To");
        tvOO.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams El = new GridLayout.LayoutParams(row7,col3);
        tvOO.setTextSize(12);
        tvOO.setTextColor(Color.BLACK);
        tvOO.setBackgroundColor(Color.YELLOW);
        tvOO.setGravity(Gravity.CENTER_VERTICAL);
        El.width = 240;
        El.setMargins(5,5,5,5);
        tvOO .setLayoutParams(El);
        g2.addView(tvOO);
        //-----------------
        TextView tvST = new TextView(this);
        tvST.setText("11");
        GridLayout.LayoutParams Stn = new GridLayout.LayoutParams(row8,col3);
        tvST.setTextSize(12);
        tvST.setTextColor(Color.BLACK);
        tvST.setBackgroundColor(Color.YELLOW);
        tvST.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Stn.width = 240;
        Stn.setMargins(5,5,5,5);
        tvST.setLayoutParams(Stn);
        g2.addView( tvST );
        //------------------
        TextView tvSvg = new TextView(this);
        tvSvg.setText("17");
        GridLayout.LayoutParams twn = new GridLayout.LayoutParams(row9,col3);
        tvSvg.setTextSize(12);
        tvSvg.setTextColor(Color.BLACK);
        tvSvg.setBackgroundColor(Color.YELLOW);
        tvSvg.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        twn.width = 240;
        twn.setMargins(5,5,5,5);
        tvSvg.setLayoutParams(twn);
        g2.addView(tvSvg);
        //--------------
        TextView Tee = new TextView(this);
        Tee.setText("21");
        GridLayout.LayoutParams juan = new GridLayout.LayoutParams(row10,col3);
        Tee.setTextSize(12);
        Tee.setTextColor(Color.BLACK);
        Tee.setBackgroundColor(Color.YELLOW);
        Tee.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        juan.width = 240;
        juan.setMargins(5,5,5,5);
        Tee.setLayoutParams(juan);
        g2.addView(Tee);
        //-------------------------
        TextView TeT = new TextView(this);
        TeT.setText("23");
        GridLayout.LayoutParams Three = new GridLayout.LayoutParams(row11,col3);
        TeT.setTextSize(12);
        TeT.setTextColor(Color.BLACK);
        TeT.setBackgroundColor(Color.YELLOW);
        TeT.setGravity(Gravity.CENTER_VERTICAL|Gravity.RIGHT);
        Three.width = 240;
        Three.setMargins(5,5,5,5);
        TeT.setLayoutParams(Three);
        g2.addView(TeT);
        //----------------------
        TextView tvGM = new TextView(this);
        tvGM.setText("Greeting");
        tvGM.setTypeface(null,Typeface.BOLD);
        GridLayout.LayoutParams GoM = new GridLayout.LayoutParams(row7,col4);
        tvGM.setTextSize(12);
        tvGM.setTextColor(Color.BLACK);
        tvGM.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGM.setGravity(Gravity.CENTER_VERTICAL);
        GoM.width = 705;
        GoM.setMargins(5,5,5,5);
        tvGM.setLayoutParams( GoM);
        g2.addView(tvGM);
        //-------------
        TextView tvGA = new TextView(this);
        tvGA.setText("Good Morning");
        GridLayout.LayoutParams GoA = new GridLayout.LayoutParams(row8,col4);
        tvGA.setTextSize(12);
        tvGA.setTextColor(Color.BLACK);
        tvGA.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGA.setGravity(Gravity.CENTER_VERTICAL);
        GoA.width = 705;
        GoA.setMargins(5,5,5,5);
        tvGA.setLayoutParams( GoA);
        g2.addView(tvGA);
        //-------------
        TextView tvGE = new TextView(this);
        tvGE.setText("Good Afternoon");
        GridLayout.LayoutParams GoE = new GridLayout.LayoutParams(row9,col4);
        tvGE.setTextSize(12);
        tvGE.setTextColor(Color.BLACK);
        tvGE.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGE.setGravity(Gravity.CENTER_VERTICAL);
        GoE.width = 705;
        GoE.setMargins(5,5,5,5);
        tvGE.setLayoutParams( GoE);
        g2.addView(tvGE);
        //-------------
        TextView tvGN = new TextView(this);
        tvGN.setText("Good Evening");
        GridLayout.LayoutParams GoN = new GridLayout.LayoutParams(row10,col4);
        tvGN.setTextSize(12);
        tvGN.setTextColor(Color.BLACK);
        tvGN.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGN.setGravity(Gravity.CENTER_VERTICAL);
        GoN.width = 705;
        GoN.setMargins(5,5,5,5);
        tvGN.setLayoutParams( GoN);
        g2.addView(tvGN);
        //---------------
        TextView tvGNe = new TextView(this);
        tvGNe.setText("Good Night");
        GridLayout.LayoutParams GN = new GridLayout.LayoutParams(row11,col4);
        tvGNe.setTextSize(12);
        tvGNe.setTextColor(Color.BLACK);
        tvGNe.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGNe.setGravity(Gravity.CENTER_VERTICAL);
        GN.width = 705;
        GN.setMargins(5,5,5,5);
        tvGNe.setLayoutParams( GN);
        g2.addView(tvGNe);


        //-------------
        Wrap.addView(g1);
        Wrap.addView(g2);

        sv.addView(Wrap);

        setContentView(sv);
       // setContentView(R.layout.activity_main);
    }
}
