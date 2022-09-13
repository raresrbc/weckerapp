package com.example.wecker;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatActivity;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class SetAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarm);

        TimePicker timePicker = (TimePicker) this.findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true); // 24H Mode.
    }
}

