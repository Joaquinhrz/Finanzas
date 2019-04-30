    package com.example.finanzas;

    import android.os.Bundle;
    import android.support.design.widget.FloatingActionButton;
    import android.support.design.widget.Snackbar;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.Toolbar;
    import android.text.method.ScrollingMovementMethod;
    import android.view.View;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        public
        Button btn;
        EditText txt;
        TextView txtvw;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            btn=(Button)findViewById(R.id.button1);
            txtvw=(TextView)findViewById(R.id.textView1);
            txtvw.setMovementMethod(new ScrollingMovementMethod());

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt=(EditText)findViewById(R.id.EditText1);

                    txtvw.setText("\n"+txt.getText().toString()+"\nEnd.");
                }
            });



        }


    }
