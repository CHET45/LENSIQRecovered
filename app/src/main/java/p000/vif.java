package p000;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes6.dex */
public class vif {

    /* JADX INFO: renamed from: m */
    public static final String f91265m = "AudioPlayer";

    /* JADX INFO: renamed from: n */
    public static final int f91266n = 16;

    /* JADX INFO: renamed from: o */
    public static final int f91267o = 5;

    /* JADX INFO: renamed from: a */
    public uui f91268a;

    /* JADX INFO: renamed from: b */
    public byte[] f91269b;

    /* JADX INFO: renamed from: c */
    public AudioTrack f91270c;

    /* JADX INFO: renamed from: e */
    public C14098b f91272e;

    /* JADX INFO: renamed from: f */
    public InterfaceC14099c f91273f;

    /* JADX INFO: renamed from: g */
    public svi f91274g;

    /* JADX INFO: renamed from: d */
    public boolean f91271d = false;

    /* JADX INFO: renamed from: h */
    public Object f91275h = this;

    /* JADX INFO: renamed from: i */
    public boolean f91276i = false;

    /* JADX INFO: renamed from: j */
    public int f91277j = 0;

    /* JADX INFO: renamed from: k */
    public int f91278k = 0;

    /* JADX INFO: renamed from: l */
    public int f91279l = 0;

    /* JADX INFO: renamed from: vif$b */
    public class C14098b extends Thread {
        private C14098b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    vif.this.f91273f.onStart();
                    synchronized (vif.this.f91275h) {
                        try {
                            if (vif.this.f91279l != 0 && vif.this.f91279l != 3) {
                                vif.this.f91279l = 2;
                            }
                        } finally {
                        }
                    }
                    while (true) {
                        if (vif.this.f91276i) {
                            vif.this.f91273f.onStop();
                            break;
                        }
                        if (vif.this.f91279l == 3) {
                            vif.this.f91273f.onPause();
                            vif.this.f91270c.pause();
                        } else if (vif.this.f91279l == 2) {
                            vif.this.f91270c.play();
                        }
                        vif.this.f91270c.write(vif.this.f91269b, vif.this.f91278k, vif.this.f91277j);
                        vif.this.f91278k += vif.this.f91277j;
                        if (vif.this.f91278k >= vif.this.f91269b.length) {
                            vif.this.onPlayComplete();
                            break;
                        }
                    }
                    synchronized (vif.this.f91275h) {
                        vif.this.f91279l = 1;
                    }
                    if (vif.this.f91270c == null) {
                        return;
                    }
                } catch (Exception e) {
                    sui.m22258b(vif.f91265m, "play media failed:" + e);
                    synchronized (vif.this.f91275h) {
                        vif.this.f91279l = 1;
                        if (vif.this.f91270c == null) {
                            return;
                        }
                    }
                }
                vif.this.f91270c.release();
                vif.this.f91270c = null;
            } catch (Throwable th) {
                synchronized (vif.this.f91275h) {
                    vif.this.f91279l = 1;
                    if (vif.this.f91270c != null) {
                        vif.this.f91270c.release();
                        vif.this.f91270c = null;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: vif$c */
    public interface InterfaceC14099c {
        void onCompleted();

        void onError(int i);

        void onPause();

        void onStart();

        void onStop();
    }

    public vif(InterfaceC14099c interfaceC14099c) {
        this.f91273f = interfaceC14099c;
    }

    private void createAudioTrack() throws Exception {
        uui uuiVar = this.f91268a;
        int minBufferSize = AudioTrack.getMinBufferSize(uuiVar.f89188a, uuiVar.f89189b, uuiVar.f89190c);
        this.f91277j = minBufferSize * 2;
        uui uuiVar2 = this.f91268a;
        this.f91270c = new AudioTrack(3, uuiVar2.f89188a, uuiVar2.f89189b, uuiVar2.f89190c, minBufferSize, 1);
    }

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f91270c;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f91270c.release();
            this.f91270c = null;
        }
    }

    private boolean setPlayState(int i) {
        synchronized (this.f91275h) {
            this.f91279l = i;
        }
        return true;
    }

    private void startThread() {
        if (this.f91272e == null) {
            this.f91276i = false;
            C14098b c14098b = new C14098b();
            this.f91272e = c14098b;
            c14098b.start();
        }
    }

    private void stopThread() {
        if (this.f91272e != null) {
            this.f91276i = true;
            this.f91272e = null;
        }
    }

    public void onPlayComplete() {
        this.f91272e = null;
        if (this.f91279l != 3) {
            setPlayState(1);
            InterfaceC14099c interfaceC14099c = this.f91273f;
            if (interfaceC14099c != null) {
                interfaceC14099c.onCompleted();
            }
        }
    }

    public boolean pause() {
        if (!this.f91271d) {
            return false;
        }
        if (this.f91279l != 2) {
            return true;
        }
        setPlayState(3);
        stopThread();
        return true;
    }

    public boolean play() {
        if (!this.f91271d) {
            return false;
        }
        int i = this.f91279l;
        if (i != 1) {
            if (i == 3) {
            }
            return true;
        }
        this.f91278k = 0;
        setPlayState(2);
        startThread();
        return true;
    }

    public boolean prepare() {
        if (this.f91269b != null && this.f91268a != null) {
            if (this.f91271d) {
                return true;
            }
            try {
                createAudioTrack();
                this.f91271d = true;
                setPlayState(1);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean release() {
        stop();
        releaseAudioTrack();
        this.f91271d = false;
        setPlayState(0);
        return true;
    }

    public boolean resume() {
        return true;
    }

    public void setAudioParam(uui uuiVar) {
        this.f91268a = uuiVar;
    }

    public void setDataSource(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.f91269b = bArr;
    }

    public void setListener(InterfaceC14099c interfaceC14099c) {
        this.f91273f = interfaceC14099c;
    }

    public boolean stop() {
        if (!this.f91271d) {
            return false;
        }
        setPlayState(1);
        stopThread();
        return true;
    }

    public vif(InterfaceC14099c interfaceC14099c, uui uuiVar) {
        this.f91273f = interfaceC14099c;
        setAudioParam(uuiVar);
    }

    public void setListener(svi sviVar) {
        this.f91274g = sviVar;
    }

    public vif(svi sviVar) {
        setListener(sviVar);
    }

    public vif(svi sviVar, uui uuiVar) {
        setListener(sviVar);
        setAudioParam(uuiVar);
    }
}
