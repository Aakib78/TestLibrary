package com.soober.admin.soobertech;

import android.content.Context;
import android.widget.Toast;

public class SoobertechToast {

    public static void toastMessage(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
