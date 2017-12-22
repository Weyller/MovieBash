package ca.qc.lbpsb.fusion.fcmnotification;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.zookey.universalpreferences.UniversalPreferences;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import ca.qc.lbpsb.fusion.fcmnotification.Manager.AlertDialogManager;
import ca.qc.lbpsb.fusion.fcmnotification.Manager.FcmVolley;
import ca.qc.lbpsb.fusion.fcmnotification.Manager.SharedPreference;
import ca.qc.lbpsb.fusion.fcmnotification.Model.Constants;
import ca.qc.lbpsb.fusion.fcmnotification.Model.User;
import ca.qc.lbpsb.fusion.fcmnotification.Model.UserType;

public class MainActivity extends AppCompatActivity {


    private ProgressDialog progressDialog;

    // Fields to be saved in Sharedpreferences
    private static String tokenFromDB = "";
    private static String userFromDB = "";
    private static String userNameFromDB = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setLogo(R.drawable.board_logo);
//        getSupportActionBar().setDisplayUseLogoEnabled(true);


        setContentView(R.layout.activity_main);



        // Universal shared preference init
        UniversalPreferences.initialize(this);

        setTitle("Movie Bash");


        try {
            Thread.sleep(3);
            Intent intent = new Intent(this, NotificationCenterActivity.class);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    //--------------------------------------------------------------



    @Override
    protected void onResume() {
        super.onResume();
    }
}