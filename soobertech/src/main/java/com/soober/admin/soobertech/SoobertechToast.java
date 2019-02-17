package com.soober.admin.soobertech;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.soober.admin.soobertech.R.id.toastText;

public class SoobertechToast {

    public static void toastMessage(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();


    }
    public static void customToastMessage(Context c,String message){
        View view =View.inflate(c,R.layout.toast_layout,null);
        Toast toast=new Toast(c);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(message);
        toast.setView(view);
        toast.show();

    }
     public static void customToastMessage(Context c,String message){
        View view =View.inflate(c,R.layout.toast_layout,null);
        Toast toast=new Toast(c);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(message);
        toast.setView(view);
        toast.show();
}
