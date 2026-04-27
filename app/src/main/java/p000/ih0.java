package p000;

import android.media.AudioTrack;
import android.os.Process;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Thread;

/* JADX INFO: loaded from: classes7.dex */
public class ih0 {

    /* JADX INFO: renamed from: i */
    public static final String f46986i = "AudioTrackManager";

    /* JADX INFO: renamed from: j */
    public static final int f46987j = 44100;

    /* JADX INFO: renamed from: k */
    public static ih0 f46988k;

    /* JADX INFO: renamed from: b */
    public DataInputStream f46990b;

    /* JADX INFO: renamed from: c */
    public Thread f46991c;

    /* JADX INFO: renamed from: f */
    public boolean f46994f;

    /* JADX INFO: renamed from: h */
    public InterfaceC7282b f46996h;

    /* JADX INFO: renamed from: d */
    public boolean f46992d = false;

    /* JADX INFO: renamed from: g */
    public Runnable f46995g = new RunnableC7281a();

    /* JADX INFO: renamed from: e */
    public int f46993e = AudioTrack.getMinBufferSize(44100, 4, 2);

    /* JADX INFO: renamed from: a */
    public AudioTrack f46989a = new AudioTrack(3, 44100, 4, 2, this.f46993e * 2, 1);

    /* JADX INFO: renamed from: ih0$a */
    public class RunnableC7281a implements Runnable {
        public RunnableC7281a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(-19);
                byte[] bArr = new byte[ih0.this.f46993e];
                while (ih0.this.f46990b.available() > 0) {
                    if (ih0.this.f46994f) {
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        int i = ih0.this.f46990b.read(bArr);
                        if (i != -3 && i != -2 && i != 0 && i != -1) {
                            ih0.this.f46989a.play();
                            ih0.this.f46989a.write(bArr, 0, i);
                        }
                    }
                }
                InterfaceC7282b interfaceC7282b = ih0.this.f46996h;
                if (interfaceC7282b != null) {
                    interfaceC7282b.onPlaybackCompletion();
                }
                ih0.this.stopPlay();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: ih0$b */
    public interface InterfaceC7282b {
        void onPlaybackCompletion();
    }

    private void destroyThread() {
        try {
            try {
                this.f46992d = false;
                Thread thread = this.f46991c;
                if (thread != null && Thread.State.RUNNABLE == thread.getState()) {
                    try {
                        Thread.sleep(500L);
                        this.f46991c.interrupt();
                    } catch (Exception unused) {
                        this.f46991c = null;
                    }
                }
            } finally {
                this.f46991c = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ih0 getInstance() {
        if (f46988k == null) {
            synchronized (ih0.class) {
                try {
                    if (f46988k == null) {
                        f46988k = new ih0();
                    }
                } finally {
                }
            }
        }
        return f46988k;
    }

    private void setPath(String str) throws Exception {
        this.f46990b = new DataInputStream(new FileInputStream(new File(str)));
    }

    private void startThread() {
        destroyThread();
        this.f46992d = true;
        if (this.f46991c == null) {
            Thread thread = new Thread(this.f46995g);
            this.f46991c = thread;
            thread.start();
        }
    }

    public int getCurrentPosition() {
        AudioTrack audioTrack = this.f46989a;
        if (audioTrack != null) {
            return audioTrack.getPlaybackHeadPosition() / 44100;
        }
        return 0;
    }

    public boolean isPlaying() {
        return this.f46992d;
    }

    public void pausePlay() {
        AudioTrack audioTrack = this.f46989a;
        if (audioTrack == null || audioTrack.getPlayState() != 3) {
            return;
        }
        this.f46989a.pause();
        this.f46994f = true;
    }

    public void release() {
        AudioTrack audioTrack = this.f46989a;
        if (audioTrack != null) {
            audioTrack.release();
        }
    }

    public void resumePlay() {
        AudioTrack audioTrack = this.f46989a;
        if (audioTrack == null || !this.f46994f) {
            return;
        }
        audioTrack.play();
        this.f46994f = false;
    }

    public void setOnPlaybackCompletionListener(InterfaceC7282b interfaceC7282b) {
        this.f46996h = interfaceC7282b;
    }

    public void startPlay(String str) {
        if (this.f46994f) {
            resumePlay();
            return;
        }
        try {
            setPath(str);
            startThread();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopPlay() {
        try {
            destroyThread();
            AudioTrack audioTrack = this.f46989a;
            if (audioTrack != null && audioTrack.getState() == 1) {
                this.f46989a.stop();
            }
            DataInputStream dataInputStream = this.f46990b;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
