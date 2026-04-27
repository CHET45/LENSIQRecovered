package com.eyevue.glassapp.view.photo;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import com.eyevue.glassapp.C2558R;
import com.eyevue.glassapp.view.photo.FullScreenVideoActivity;
import com.watchfun.voicenotes.CommonWebViewActivity;

/* JADX INFO: loaded from: classes4.dex */
public class FullScreenVideoActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a */
    public VideoView f18853a;

    /* JADX INFO: renamed from: b */
    public MediaController f18854b;

    /* JADX INFO: renamed from: c */
    public TextView f18855c;

    /* JADX INFO: renamed from: d */
    public ImageView f18856d;

    /* JADX INFO: renamed from: e */
    public Uri f18857e;

    /* JADX INFO: renamed from: f */
    public String f18858f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreate$1(View view, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f18854b.hide();
            finish();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreate$2(MediaPlayer mediaPlayer) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onCreate$3(MediaPlayer mediaPlayer, int i, int i2) {
        Toast.makeText(this, "播放出错", 0).show();
        finish();
        return true;
    }

    private void pauseVideo() {
        if (this.f18853a.isPlaying()) {
            this.f18853a.pause();
        }
    }

    private void resumeVideo() {
        if (this.f18853a.isPlaying()) {
            return;
        }
        this.f18853a.start();
    }

    private void stopVideo() {
        this.f18853a.stopPlayback();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C2558R.layout.activity_full_screen_video);
        this.f18853a = (VideoView) findViewById(C2558R.id.videoView);
        this.f18855c = (TextView) findViewById(C2558R.id.titleTextView);
        this.f18856d = (ImageView) findViewById(C2558R.id.backButton);
        this.f18857e = (Uri) getIntent().getParcelableExtra("mediaUri");
        String stringExtra = getIntent().getStringExtra(CommonWebViewActivity.f26185L);
        this.f18858f = stringExtra;
        if (stringExtra == null || stringExtra.isEmpty()) {
            Uri uri = this.f18857e;
            if (uri != null) {
                this.f18855c.setText(uri.getLastPathSegment());
            }
        } else {
            this.f18855c.setText(this.f18858f);
        }
        this.f18856d.setOnClickListener(new View.OnClickListener() { // from class: by6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15190a.lambda$onCreate$0(view);
            }
        });
        Uri uri2 = this.f18857e;
        if (uri2 == null) {
            Toast.makeText(this, "无法获取视频", 0).show();
            finish();
            return;
        }
        this.f18853a.setVideoURI(uri2);
        MediaController mediaController = new MediaController(this);
        this.f18854b = mediaController;
        mediaController.setAnchorView(this.f18853a);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f18854b.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: cy6
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                    return this.f28027a.lambda$onCreate$1(view, keyEvent);
                }
            });
        }
        this.f18853a.setMediaController(this.f18854b);
        this.f18853a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: dy6
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                FullScreenVideoActivity.lambda$onCreate$2(mediaPlayer);
            }
        });
        this.f18853a.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ey6
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return this.f34427a.lambda$onCreate$3(mediaPlayer, i, i2);
            }
        });
        this.f18853a.start();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopVideo();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        pauseVideo();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        resumeVideo();
    }
}
