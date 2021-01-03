package com.example.calculatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    MethodsCalculator calculator = new MethodsCalculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOneClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onOneClicked(displayField.getText().toString()));
    }

    public void onThreeClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onThreeClicked(displayField.getText().toString()));
    }

    public void onAddClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onAddClicked(displayField.getText().toString()));
    }

    public void onTwoClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onTwoClicked(displayField.getText().toString()));
    }

    public void onZeroClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onZeroClicked(displayField.getText().toString()));
    }

    public void onEqualClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onEqualClicked(displayField.getText().toString()));
    }

    public void onDotClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onDotClicked(displayField.getText().toString()));
    }

    public void onFourClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onFourClicked(displayField.getText().toString()));
    }

    public void onSixClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onSixClicked(displayField.getText().toString()));
    }

    public void onSubtractClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onSubtractClicked(displayField.getText().toString()));
    }

    public void onFiveClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onFiveClicked(displayField.getText().toString()));
    }

    public void onSevenClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onSevenClicked(displayField.getText().toString()));
    }

    public void onNineClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onNineClicked(displayField.getText().toString()));
    }

    public void onMultiplyClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onMultiplyClicked(displayField.getText().toString()));
    }

    public void onEightClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onEightClicked(displayField.getText().toString()));
    }

    public void onClearClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onClearClicked(displayField.getText().toString()));
    }

    public void onChangeSignClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onChangeSignClicked(displayField.getText().toString()));
    }

    public void onPercentClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onPercentClicked(displayField.getText().toString()));
    }

    public void onDivideClicked(View view) {
        EditText displayField = (EditText) findViewById(R.id.display);
        displayField.setText(calculator.onDivideClicked(displayField.getText().toString()));
    }
}