package sci.ubu.ac.th.scinotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

public class Main extends AppCompatActivity {

    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mTextView = findViewById(R.id.msgText);
        FirebaseMessaging.getInstance().subscribeToTopic("repair_it");
    }
    public void showToken(View view) {
        // แสดง token มาให้ดูหน่อยเสะ
        //mTextView.setText(FirebaseInstanceId.getInstance().getToken());
        Log.i("token", FirebaseInstanceId.getInstance().getToken());
    }
    public void subscribeIT(View view) {
        // สับตะไคร้ it repair
        FirebaseMessaging.getInstance().subscribeToTopic("repair_it");
        //mTextView.setText(R.string.it_subscribed);
    }
    public void unsubscribeIT(View view) {
        // ยกเลิกสับตะไคร้ it repair
        FirebaseMessaging.getInstance().unsubscribeFromTopic("repair_it");
        //mTextView.setText(R.string.it_un_subscribed);
    }
    public void subscribeAsset(View view) {
        // สับตะไคร้ it repair
        FirebaseMessaging.getInstance().subscribeToTopic("repair_asset");
        //mTextView.setText(R.string.asset_subscribed);
    }
    public void unsubscribeAsset(View view) {
        // ยกเลิกสับตะไคร้ it repair
        FirebaseMessaging.getInstance().unsubscribeFromTopic("repair_asset");
        //mTextView.setText(R.string.asset_un_subscribed);
    }
}
