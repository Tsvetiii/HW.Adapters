package qkikakiood.com.hwadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CommentsActivity extends AppCompatActivity {

    TextView txtComments;
    EditText edtComments;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        txtComments = (TextView) findViewById(R.id.txtComments);
        edtComments = (EditText) findViewById(R.id.edtSend);
        btnSend = (Button) findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtComments.setText(String.valueOf(txtComments.getText()) + "\n" + String.valueOf(edtComments.getText()));
            }
        });
    }
}
