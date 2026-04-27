package p000;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class kfa {

    /* JADX INFO: renamed from: e */
    public static kfa f53969e;

    /* JADX INFO: renamed from: a */
    public MediaRecorder f53970a;

    /* JADX INFO: renamed from: b */
    public String f53971b;

    /* JADX INFO: renamed from: c */
    public String f53972c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8350b f53973d;

    /* JADX INFO: renamed from: kfa$a */
    public class C8349a implements AudioManager.OnAudioFocusChangeListener {
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    /* JADX INFO: renamed from: kfa$b */
    public interface InterfaceC8350b {
        void preparedDone();
    }

    /* JADX INFO: renamed from: kfa$c */
    public interface InterfaceC8351c {
        default void sendPauseKeyEvent(AudioManager audioManager) {
            StringBuilder sb = new StringBuilder();
            sb.append("=====> sendPauseKeyEvent.audioManager:");
            sb.append(audioManager == null);
            Log.e("testtest", sb.toString());
            audioManager.dispatchMediaKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 127, 0));
        }
    }

    private kfa(String str) {
        this.f53971b = str;
    }

    public static void audioStopMusic(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.setMode(0);
            audioManager.setSpeakerphoneOn(false);
            audioManager.requestAudioFocus(new C8349a(), 3, 1);
            audioManager.dispatchMediaKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 127, 0));
        }
    }

    public static kfa getInstance(String str) {
        if (f53969e == null) {
            synchronized (kfa.class) {
                try {
                    if (f53969e == null) {
                        f53969e = new kfa(str);
                    }
                } finally {
                }
            }
        }
        return f53969e;
    }

    public void cancel() {
        release();
        if (this.f53972c != null) {
            File file = new File(this.f53972c);
            if (file.exists()) {
                file.delete();
            }
            this.f53972c = null;
        }
    }

    public String getFilePath() {
        return this.f53972c;
    }

    public void prepare() {
        try {
            File file = new File(this.f53971b);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, System.currentTimeMillis() + ".amr");
            this.f53970a = new MediaRecorder();
            this.f53972c = file2.getAbsolutePath();
            this.f53970a.setOutputFile(new File(file2.getAbsolutePath()));
            this.f53970a.setAudioSource(1);
            this.f53970a.setOutputFormat(3);
            this.f53970a.setAudioEncoder(1);
            this.f53970a.prepare();
            this.f53970a.start();
            InterfaceC8350b interfaceC8350b = this.f53973d;
            if (interfaceC8350b != null) {
                interfaceC8350b.preparedDone();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void release() {
        this.f53970a.stop();
        this.f53970a.release();
        this.f53970a = null;
    }

    public void setMediaStateListener(InterfaceC8350b interfaceC8350b) {
        this.f53973d = interfaceC8350b;
    }
}
