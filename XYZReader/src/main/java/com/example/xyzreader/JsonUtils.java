package com.example.xyzreader;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Erick on 30/6/17.
 */

public class JsonUtils {

    public static String readJsonFromAssets(Context context) {
        String json = null;
        try {
            InputStream is = context.getResources().openRawResource(R.raw.xyzreader);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }


}
