import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);

        Button btnClear = findViewById(R.id.btnClear);
        Button btnParentheses = findViewById(R.id.btnParentheses);
        Button btnExponent = findViewById(R.id.btnExponent);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnEquals = findViewById(R.id.btnEquals);
        Button btnDot = findViewById(R.id.btnDot);
        Button[] numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            int buttonId = getResources().getIdentifier("btn" + i, "id", getPackageName());
            numberButtons[i] = findViewById(buttonId);
        }

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputEditText.setText("");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = inputEditText.getText().toString();
                // Perform calculation using your Calculator logic
                // For demonstration purposes, simply display the expression as the result
                inputEditText.setText(expression);
            }
        });

        for (Button button : numberButtons) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String buttonValue = button.getText().toString();
                    inputEditText.append