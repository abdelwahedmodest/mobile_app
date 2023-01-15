public class InputActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText nutritionEditText;
    private EditText addressEditText;
    private EditText ageEditText;
    private EditText colorEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        nameEditText = findViewById(R.id.nameEditText);
        nutritionEditText = findViewById(R.id.nutritionEditText);
        addressEditText = findViewById(R.id.addressEditText);
        ageEditText = findViewById(R.id.ageEditText);
        colorEditText = findViewById(R.id.colorEditText);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString();
                String nutrition = nutritionEditText.getText().toString();
                String address = addressEditText.getText().toString();
                String age = ageEditText.getText().toString();
                String color = colorEditText.getText().toString();

                // Use the user's input to generate a workout plan
                // and display it to the user in the app
            }
        });
    }
}
