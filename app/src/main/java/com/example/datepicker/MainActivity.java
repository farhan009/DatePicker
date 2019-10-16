package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView dateTextView;
    private Button chooseButton;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTextView = findViewById(R.id.date_TextView_id);
        chooseButton = findViewById(R.id.choose_Button_id);
        datePicker = findViewById(R.id.datePicker_id);

        dateTextView.setText(currentDate());
        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateTextView.setText(currentDate());
            }
        });
    }

    public String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("CurrentDate ");
        stringBuilder.append(datePicker.getDayOfMonth() + "/");
        stringBuilder.append((datePicker.getMonth() + 1) + "/");
        stringBuilder.append(datePicker.getYear());

        return stringBuilder.toString();
    }
}
