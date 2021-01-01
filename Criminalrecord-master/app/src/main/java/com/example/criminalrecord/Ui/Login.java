package com.example.criminalrecord.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.example.criminalrecord.R;

public class Login extends AppCompatActivity {

    EditText user_login , password_login;
    Button btn_login;
    Typeface font;

    private static final String TAG = "loginCriminal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Start find View By ID
        user_login = findViewById(R.id.user_login);
        password_login = findViewById(R.id.password_login);
        btn_login = findViewById(R.id.btn_login);
        //End find View By ID

        //Add Font Al_mateen (test)
        font = Typeface.createFromAsset(getApplicationContext().getAssets() ,"font/al_mateen.ttf");
        btn_login.setTypeface(font);
        user_login.setTypeface(font);
        password_login.setTypeface(font);

        //Start Method
        checkUserAndPassword();
        //End Method

    }


    private void checkUserAndPassword(){
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = user_login.getText().toString().trim();
                String password = password_login.getText().toString().trim();
                Log.d(TAG , "user : " + user + " , password : " + password);
                if (user.isEmpty() && password.isEmpty()){
                    Toast.makeText(getApplicationContext() ,  "ادخل الرقم العسكري و كلمة المرور" , Toast.LENGTH_SHORT).show();
                }else if(user.isEmpty()){
                    Toast.makeText(getApplicationContext() ,  "ادخل الرقم العسكري" , Toast.LENGTH_SHORT).show();
                }else if(password.isEmpty()){
                    Toast.makeText(getApplicationContext() ,  "ادخل كلمة المرور" , Toast.LENGTH_SHORT).show();
                }else {

                    // check User and Password (API)

                    startActivity(new Intent(getApplicationContext(), SearchById.class));
                }
            }
        });

    }
}
