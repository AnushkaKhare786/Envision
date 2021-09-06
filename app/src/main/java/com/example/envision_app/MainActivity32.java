package com.example.envision_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity32 extends AppCompatActivity {
    TextView tv1, tv2;
    Button b,B1,B2;
    EditText E,E2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);

        final String[] people = new String[]{"divya","A. Sampath Kumar", "Abhay Vidyarthi", "Abhishek Verma", "Amita Mahor", "Amrut Shrikant Mulay", "Anand Motwani", "Anant Kant Shukla", "Anirban Bhowmick", "Anita Yadav", "Ankur Beohar", "Ashish Kumar Sahu", "Ashish Tripathi", "Baseera A.", "Bhakti Parashar", "Bhumika Girishkumar Choksi", "Chandan Kumar Behera", "Charles Richard", "Deepika Masand", "Divya Haridas", "Dhruv Sharma", "Duggineni Karthik", "G L Balaji", "H. Azath", "Harihara Padhy", "J. Amudhavel ", "Jitendra Kumar Tandelkar", "K. Venkatachalam", "Kanchanlata Kashyap", "Krishna Kumar", "L. Shakkeera", "M. Dinesh Babu", "Maheshwar R", "Mamta Agrawal", "Manas Kumar Mishra", "Manikandan Kalimuthu", "Manoj Acharya", "Mayank Gupta", "Muneeswaran V", "Nageswara Guptha", "Neha Choubey", "Nella Anveshkumar", "Nilamadhab Mishra", "Pallabi Sarkar", "Paras Jain", "Pon Harshavardhanan", "Pradeep Kumar Kayshap", "Praveen Lalwani", "Pritesh Vishwasrao Bansod", "Priyanka Singh", "Pushpdant Jain", "Pushpindra Singh", "Rahul Kottath", "Reena Jain", "Ribu Mathew", "Roja Rani Ilka", "Sandip Mal", "Saravanan J.", "Sathish Kumar R", "Sharad Chandra Tripathi", "Shince V Joseph", "Shishir K Shandilya", "Shriram R.", "Shubhash Chandra Patel", "Sounthar Rajan", "Suganya E.", "Sumit Mittal", "Suresh Dara", "Tushar Choudhary", "V. Pandimurugan", "Venkat Prasad Padhya", "Venkatesh T.", "Vinod Bhatt", "Virendra Kushwah", "Y. Sharmasth Vali", "Yogesh Shukla","Divya Mathew", "Rakesh R"};
        final String[] phoneNumbers = new String[]{"94795385126","9894721222", "8765773284", "7586852491", "9425019572", "8830091723", "9894512300  ", "9345522103 ", "9547155428", "9977588551", "9893383443", "9506347438", "7579287442", "9698960667", "9826722177", "7016527953", "8847872575", "7708342512", "9425602587", "9930594727", "8535034245", "8124709555", "7974537024", "8120008102", "9668780860", "9597788658", "9406784831", "8610569054", "9826733258", "7584826299", "9701336323", "6380043405", "9655212300", "9425027637", "9956250356", "9952387877", "9131096990", "7722993939", "9842541667", "9843255706", "9713606045", "9503132874", "9437169510", "6294524861", "9963023330", "9937704985", "9389634514", "8087181373", "9933979757", "8765330670", "6301800673", "9893273243", "8591515682", "8989982847", "9003397713", "7987253273", "9583085832", "9047240141", "7667281338", "7697867027", "9938165145", "9009972032", "7358194673", "7905407827", "9786066776", "9884970535", "9318325748", "9007400537", "9752005705", "8249897681", "8310597038", "7747973581", "9826143220 ", "7415869616", "9557404420", "9479877102","9479538512", "9840768026"};
        final String[] email = new String[]{"abc@gmail.com","sampath.kumar@vitbhopal.ac.in", "abhay.vidyarthi@vitbhopal.ac.in", "abhishek.verma@vitbhopal.ac.in", "amita.mahor@vitbhopal.ac.in", "amrut.shrikant@vitbhopal.ac.in", "anand.motwani@vitbhopal.ac.in ", "anantkant.shukla@vitbhopal.ac.in", "anirban.bhowmick@vitbhopal.ac.in", "anita.yadav@vitbhopal.ac.in", "ankur.beohae@vitbhopal.ac.in", "ashish.kumar@vitbhopal.ac.in", "ashish.tripathi@vitbhopal.ac.in", "baseera.a@vitbhopal.ac.in", "bhakti.parashar@vitbhopal.ac.in", "bhumika.choksi@vitbhopal.ac.in", "chandank.behera@vitbhopal.ac.in", "charles.richard@vitbhopal.ac.in", "deepika.masandvitbhopal.ac.in", "divya.haridas@vitbhopal.ac.in", "dhruv.sharma@vitbhopal.ac.in", "duggineni.karthik@vitbhopal.ac.in", "balajigl@vitbhopal.ac.in", "azah.h@vitbhopal.ac.in  ", "dean.sasl@vitbhopal.ac.in", "amuthavel.j@vitbhopal.ac.in", "Hitendra.kumar@vitbhopal.ac.in", "venkatachalam.k@vitbhopal.ac.in", "kanchan.k@vitbhopal.ac.in", "krishnakumar@vitbhopal.ac.in", "shakkeera.l@vitbhopal.ac.in   ", "dineshbabu.m@vitbhopal.ac.in", "maheswar.n@vitbhopal.ac.in", "mamta.agrawal@vitbhopal.ac.in", "manaskumar.mishra@vitbhopal.ac.in", "manikandan.k@vitbhopal.ac.in", "manoj.acharya@vitbhopal.ac.in", "mayank.gupta@vitbhopal.ac.in", "muneeswaran@vitbhopal.ac.in", "nageswara.guptha@vitbhopal.ac.in", "neha.choubey@vitbhopal.ac.in", "nella.anveshkumar@vitbhopal.ac.in", "nilamadhab.mishra@vitbhopal.ac.in", "pallabi.sarkar@vitbhopal.ac.in", "paras.jain@vitbhopal.ac.in", "pon.harshavardhanan@vitbhopal.ac.in", "priyanka.singh@vitbhopal.ac.in", "praveen.lalwani@vitbhopal.ac.in", "priteshvishwasrao.b@vitbhopal.ac.in", "priyanka.singh@vitbhopal.ac.in", "pushpdant.jain@vitbhopal.ac.in", "pushpinder.singh@vitbhopal.ac.in", "rahul.kottath@vitbhopal.ac.in", "reena.jain@vitbhopal.ac.in  ", "ribu.mathew@vitbhopal.ac.in", "rojaran.ika@vitbhopal.ac.in", "sandip.mal@vitbhopal.ac.in", "saravanan.j@vitbhopal.ac.in", "sathish.kumar@vitbhopal.ac.in", "sharadchandra.tripathi@vitbhopal.ac.in", "shincey.joseph@vitbhopal.ac.in", "shishirkumar.mishra@vitbhopal.ac.in", "shriram.r@vitbhopal.ac.in", "subhath.patel@vithhopal.ac.in ", "s.sountharrajan@vitbhopal.ac.in", "suganya.e@vitbhopal.ac.in", "sumit.mittal@vitbhopal.ac.in", "suresh.dara@vitbhopal.ac.in", "tushar.choudhary@vitbhopal.ac.in", "pandi.murugan@vitbhopal.ac.in", "venkat.prasad@vitbhopal.ac.in", "venkatesh.t@vitbhopal.ac.in", "vinod.bhatt@vitbhopal.ac.in ", "virendra.kushwah@vitbhopal.ac.in", "sharmasth.vali@vithbopal.ac.in ", "yogesh.shukla@vitbhopal.ac.in","divya.mathew@vitbhopal.ac.in","rakesh.r@vitbhopal.ac.in"};
        ActivityCompat.requestPermissions(MainActivity32.this,new String[]{Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);
        ActivityCompat.requestPermissions(MainActivity32.this,new String[]{Manifest.permission.CALL_PHONE},1);
        E = (EditText) findViewById(R.id.editText);
        E2 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        b = (Button) findViewById(R.id.button);
        B1 = (Button) findViewById(R.id.button2);
        B2 = (Button) findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < people.length; i++) {
                    if (people[i].equals(E.getText().toString())) {
                        tv1.setText(phoneNumbers[i]);
                        tv2.setText(email[i]);
                    }
                }
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < people.length; i++) {
                    if (people[i].equals(E.getText().toString())) {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phoneNumbers[i], null, E2.getText().toString(),null,null);
                    }
                }
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < people.length; i++) {
                    if (people[i].equals(E.getText().toString())) {
                        String number1=phoneNumbers[i];
                        String dial="tel:"+number1;
                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                    }
                }
            }
        });
    }
}