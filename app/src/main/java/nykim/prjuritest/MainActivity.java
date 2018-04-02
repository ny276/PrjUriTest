package nykim.prjuritest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etPhoneNumber, etWeb;
    Button btCall, btWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        etWeb = findViewById(R.id.etWeb);

        btCall = findViewById(R.id.btCall);
        btCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String str = etPhoneNumber.getText().toString();
               Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse(str));
               startActivity(i);
            }
        });

        btWeb = findViewById(R.id.btWeb);
        btWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = etWeb.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(i);
            }
        });
    }
}
