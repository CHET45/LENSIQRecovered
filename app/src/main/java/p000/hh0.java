package p000;

import android.media.AudioTrack;
import android.os.Process;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.Thread;

/* JADX INFO: loaded from: classes6.dex */
public class hh0 {

    /* JADX INFO: renamed from: g */
    public static volatile hh0 f43609g = null;

    /* JADX INFO: renamed from: h */
    public static final int f43610h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f43611i = 16000;

    /* JADX INFO: renamed from: j */
    public static final int f43612j = 24000;

    /* JADX INFO: renamed from: k */
    public static final int f43613k = 44100;

    /* JADX INFO: renamed from: l */
    public static final int f43614l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f43615m = 2;

    /* JADX INFO: renamed from: n */
    public static int f43616n = 1;

    /* JADX INFO: renamed from: o */
    public static int f43617o = 24000;

    /* JADX INFO: renamed from: a */
    public AudioTrack f43618a;

    /* JADX INFO: renamed from: b */
    public DataInputStream f43619b;

    /* JADX INFO: renamed from: c */
    public Thread f43620c;

    /* JADX INFO: renamed from: e */
    public int f43622e;

    /* JADX INFO: renamed from: d */
    public boolean f43621d = false;

    /* JADX INFO: renamed from: f */
    public Runnable f43623f = new RunnableC6850a();

    /* JADX INFO: renamed from: hh0$a */
    public class RunnableC6850a implements Runnable {
        public RunnableC6850a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(-19);
                byte[] bArr = new byte[hh0.this.f43622e];
                while (hh0.this.f43619b.available() > 0 && hh0.this.f43621d) {
                    int i = hh0.this.f43619b.read(bArr);
                    if (i != -3 && i != -2 && i != 0 && i != -1) {
                        int state = hh0.this.f43618a.getState();
                        AudioTrack unused = hh0.this.f43618a;
                        if (state == 0) {
                            hh0.this.initData();
                        }
                        hh0.this.f43618a.play();
                        if (hh0.this.f43618a.getState() == 1) {
                            hh0.this.f43618a.write(bArr, 0, i);
                        }
                    }
                }
                hh0.this.stopPlay();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: hh0$b */
    public static /* synthetic */ class C6851b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43625a;

        static {
            int[] iArr = new int[EnumC6852c.values().length];
            f43625a = iArr;
            try {
                iArr[EnumC6852c.SAMPLE_RATE_16k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43625a[EnumC6852c.SAMPLE_RATE_24k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43625a[EnumC6852c.SAMPLE_RATE_44k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: hh0$c */
    public enum EnumC6852c {
        SAMPLE_RATE_16k,
        SAMPLE_RATE_24k,
        SAMPLE_RATE_44k
    }

    public hh0() {
        initData();
    }

    private void destroyThread() {
        try {
            try {
                this.f43621d = false;
                Thread thread = this.f43620c;
                if (thread != null && Thread.State.RUNNABLE == thread.getState()) {
                    try {
                        Thread.sleep(100L);
                        this.f43620c.interrupt();
                    } catch (Exception unused) {
                        this.f43620c = null;
                    }
                }
            } finally {
                this.f43620c = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static hh0 getInstance() {
        if (f43609g == null) {
            synchronized (hh0.class) {
                try {
                    if (f43609g == null) {
                        f43609g = new hh0();
                    }
                } finally {
                }
            }
        }
        return f43609g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initData() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrackManager:sampleRate=");
        sb.append(f43617o);
        this.f43622e = AudioTrack.getMinBufferSize(f43617o, 2, 2);
        this.f43618a = new AudioTrack(3, f43617o, 2, 2, this.f43622e, f43616n);
    }

    private void setPath(String str) throws Exception {
        this.f43619b = new DataInputStream(new FileInputStream(new File(str)));
    }

    private void startThread() {
        this.f43621d = true;
        if (this.f43620c == null) {
            Thread thread = new Thread(this.f43623f);
            this.f43620c = thread;
            thread.start();
        }
    }

    public int getPlayState() {
        AudioTrack audioTrack = this.f43618a;
        if (audioTrack != null) {
            return audioTrack.getPlayState();
        }
        return 1;
    }

    public void setSampleRate(EnumC6852c enumC6852c) {
        int i = C6851b.f43625a[enumC6852c.ordinal()];
        if (i == 1) {
            f43617o = 16000;
        } else if (i == 2) {
            f43617o = 24000;
        } else {
            if (i != 3) {
                return;
            }
            f43617o = 44100;
        }
    }

    public void startPlay(String str) {
        stopPlay();
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
            AudioTrack audioTrack = this.f43618a;
            if (audioTrack != null) {
                if (audioTrack.getState() == 1) {
                    this.f43618a.stop();
                }
                AudioTrack audioTrack2 = this.f43618a;
                if (audioTrack2 != null) {
                    audioTrack2.release();
                }
            }
            DataInputStream dataInputStream = this.f43619b;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
