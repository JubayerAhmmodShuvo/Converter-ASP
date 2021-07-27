package com.example.converter;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add (View v){
        LinearLayout l1 =(LinearLayout)findViewById(R.id.layout);
        TextView result = (TextView)findViewById(R.id.result);
        EditText input = (EditText)findViewById(R.id.EditText);
        String valueS = String.valueOf(input.getText());
        int valueI = Integer.parseInt(valueS);

        RadioButton b = (RadioButton)findViewById(R.id.b);
        RadioButton d = (RadioButton)findViewById(R.id.d);
        if(b.isChecked()){
            l1.setBackgroundColor(Color.CYAN);
            result.setText(bd(valueI)+"");
            d.setChecked(true);
        }
        else{
            l1.setBackgroundColor(Color.LTGRAY);
            result.setText(db(valueS)+"");
            b.setChecked(true);
        }

    }
    private String db(String valueS){
        int dec =Integer.parseInt(valueS,2);
        return String.valueOf(dec);
    }
    private  String bd(int valueI){
        String bin = Integer.toBinaryString(Integer.parseInt(String.valueOf(valueI)));
        return bin;
    }
}