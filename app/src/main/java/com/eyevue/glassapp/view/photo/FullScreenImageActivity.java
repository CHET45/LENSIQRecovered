package com.eyevue.glassapp.view.photo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public class FullScreenImageActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C2558R.layout.activity_full_screen_image);
        ComponentCallbacks2C2485a.with((FragmentActivity) this).load((Uri) getIntent().getParcelableExtra("imageUri")).into((ImageView) findViewById(C2558R.id.fullScreenImageView));
    }
}
