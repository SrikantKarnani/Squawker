package android.example.com.squawker.fcm;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Srikant on 10/1/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static String LOG_TAG = MyFirebaseInstanceIDService.class.getSimpleName();

    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(LOG_TAG,"Token  = "+refreshedToken);
    }
}
