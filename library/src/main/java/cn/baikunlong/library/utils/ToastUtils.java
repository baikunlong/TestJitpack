package cn.baikunlong.library.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Android Studio.
 * User: baikunlong
 * Date: 2019/1/18
 * Time: 16:25
 */
public class ToastUtils {

    public static void say(Context context,String data){
        Toast.makeText(context, data, Toast.LENGTH_SHORT).show();
    }

}
