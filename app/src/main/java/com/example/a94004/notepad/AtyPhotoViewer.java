package com.example.a94004.notepad;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by 94004 on 2017/6/27.
 */
public class AtyPhotoViewer extends Activity{
    private ImageView iv;

    public static final String EXTRA_PATH = "path";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iv = new ImageView(this);
        setContentView(iv);

        String path = getIntent().getStringExtra(EXTRA_PATH);
        if (path != null) {
            iv.setImageURI(Uri.fromFile(new File(path)));
        } else {
            finish();
        }
    }
}
