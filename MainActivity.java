package edu.upenn.cis350.mental_health_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logWater(View view) {
        Intent intent = new Intent(this, WaterActivity.class);
        startActivity(intent);
    }

    public void logExercise(View view) {
        Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);
    }

    public void logSleep(View view) {
        Intent intent = new Intent(this, SleepActivity.class);
        startActivity(intent);
    }

    public void logMood(View view) {
        Intent intent = new Intent(this, MoodActivity.class);
        startActivity(intent);
    }


}
