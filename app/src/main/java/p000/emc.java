package p000;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.fmc;
import p000.iud;

/* JADX INFO: loaded from: classes6.dex */
public class emc extends Thread {

    /* JADX INFO: renamed from: M1 */
    public static final int f33517M1 = 4;

    /* JADX INFO: renamed from: V1 */
    public static final int f33518V1 = 0;

    /* JADX INFO: renamed from: Z */
    public static final String f33519Z = "PcmRecorder";

    /* JADX INFO: renamed from: Z1 */
    public static final int f33520Z1 = 1;

    /* JADX INFO: renamed from: a2 */
    public static final int f33521a2 = 2;

    /* JADX INFO: renamed from: b2 */
    public static final int f33522b2 = 16000;

    /* JADX INFO: renamed from: c2 */
    public static final int f33523c2 = 40;

    /* JADX INFO: renamed from: N */
    public int f33529N;

    /* JADX INFO: renamed from: X */
    public InterfaceC5395e f33531X;

    /* JADX INFO: renamed from: Y */
    public Handler f33532Y;

    /* JADX INFO: renamed from: a */
    public final short f33533a = 16;

    /* JADX INFO: renamed from: b */
    public byte[] f33534b = null;

    /* JADX INFO: renamed from: c */
    public AudioRecord f33535c = null;

    /* JADX INFO: renamed from: d */
    public ovi f33536d = null;

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f33537e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public double f33538f = 0.0d;

    /* JADX INFO: renamed from: m */
    public double f33539m = 0.0d;

    /* JADX INFO: renamed from: C */
    public int f33524C = 16000;

    /* JADX INFO: renamed from: F */
    public int f33525F = 40;

    /* JADX INFO: renamed from: H */
    public int f33526H = 40;

    /* JADX INFO: renamed from: L */
    public short f33527L = 1;

    /* JADX INFO: renamed from: M */
    public int f33528M = 2;

    /* JADX INFO: renamed from: Q */
    public int f33530Q = 0;

    /* JADX INFO: renamed from: emc$a */
    public class C5391a implements InterfaceC5395e {

        /* JADX INFO: renamed from: a */
        public boolean f33540a = false;

        public C5391a() {
        }

        @Override // p000.emc.InterfaceC5395e
        public void onFinish() {
            if (this.f33540a) {
                return;
            }
            emc.this.startRecording();
            this.f33540a = true;
        }
    }

    /* JADX INFO: renamed from: emc$b */
    public class C5392b implements ovi {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fmc.InterfaceC5891a f33542a;

        public C5392b(fmc.InterfaceC5891a interfaceC5891a) {
            this.f33542a = interfaceC5891a;
        }

        @Override // p000.ovi
        public void onBuffer(byte[] bArr, int i, int i2) {
            this.f33542a.onRecordBuffer(bArr, i, i2);
        }

        @Override // p000.ovi
        public void onDecibel(int i) {
            this.f33542a.onDecibel(i);
        }

        @Override // p000.ovi
        public void onError(vxf vxfVar) {
            this.f33542a.onError((wxf) vxfVar);
        }

        @Override // p000.ovi
        public void onRelease() {
            this.f33542a.onRecordReleased();
        }

        @Override // p000.ovi
        public void onStart(boolean z) {
            this.f33542a.onRecordStarted(z);
        }
    }

    /* JADX INFO: renamed from: emc$c */
    public class HandlerC5393c extends Handler {
        public HandlerC5393c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    sui.m22259c("mRecordHandle: ", "msg.what: " + message.what);
                    emc.this.f33537e.set(false);
                    if (emc.this.f33535c == null) {
                        emc.this.initRetry();
                        emc.this.startRetry();
                    }
                    emc.this.startRecord();
                    return;
                }
                if (i == 1) {
                    sui.m22259c("mRecordHandle: ", "msg.what: " + message.what);
                    emc.this.stop(((Boolean) message.obj).booleanValue());
                    return;
                }
                if (i != 2) {
                    return;
                }
                sui.m22259c("mRecordHandle: ", "msg.what: " + message.what);
                emc.this.release();
            } catch (Exception e) {
                sui.m22258b(emc.f33519Z, "Exception：" + e.getMessage());
                if (emc.this.f33536d != null) {
                    emc.this.f33536d.onError(new vxf(x45.f96562k4));
                }
            }
        }
    }

    /* JADX INFO: renamed from: emc$d */
    public static class C5394d {

        /* JADX INFO: renamed from: a */
        public int f33545a = 1;

        /* JADX INFO: renamed from: b */
        public int f33546b = 16000;

        /* JADX INFO: renamed from: c */
        public short f33547c = 1;

        /* JADX INFO: renamed from: d */
        public int f33548d = 2;

        /* JADX INFO: renamed from: e */
        public int f33549e = 0;

        /* JADX INFO: renamed from: f */
        public zk3 f33550f;

        public static C5394d build() {
            return new C5394d();
        }

        public int getAudioFormat() {
            return this.f33548d;
        }

        public int getAudioSource() {
            return this.f33545a;
        }

        public int getBufferSize() {
            return this.f33549e;
        }

        public short getChannel() {
            return this.f33547c;
        }

        public zk3 getDecibelListener() {
            return this.f33550f;
        }

        public int getRate() {
            return this.f33546b;
        }

        public C5394d setAudioFormat(int i) {
            this.f33548d = i;
            return this;
        }

        public C5394d setAudioSource(int i) {
            this.f33545a = i;
            return this;
        }

        public C5394d setBufferSize(int i) {
            this.f33549e = i;
            return this;
        }

        public C5394d setChannel(short s) {
            this.f33547c = s;
            return this;
        }

        public C5394d setDecibelListener(zk3 zk3Var) {
            this.f33550f = zk3Var;
            return this;
        }

        public C5394d setRate(int i) {
            this.f33546b = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: emc$e */
    public interface InterfaceC5395e {
        void onFinish();
    }

    public emc(C5394d c5394d, fmc.InterfaceC5891a interfaceC5891a) {
        setListener(interfaceC5891a);
        init(c5394d.f33545a, c5394d.f33546b, c5394d.f33547c, c5394d.f33548d, c5394d.f33549e);
    }

    private int calculateVolume(byte[] bArr) {
        double dAbs = 0.0d;
        for (int i = 0; i < bArr.length; i += 2) {
            int i2 = (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8);
            if (i2 >= 32768) {
                i2 = 65535 - i2;
            }
            dAbs += (double) Math.abs(i2);
        }
        return (int) (Math.log10(((dAbs / ((double) bArr.length)) / 2.0d) + 1.0d) * 10.0d);
    }

    private double checkAudio(byte[] bArr, int i) {
        double dPow = 0.0d;
        if (bArr == null || i <= 0) {
            return 0.0d;
        }
        double d = 0.0d;
        for (byte b : bArr) {
            d += (double) b;
        }
        double length = d / ((double) bArr.length);
        for (byte b2 : bArr) {
            dPow += Math.pow(((double) b2) - length, 2.0d);
        }
        return Math.sqrt(dPow / ((double) (bArr.length - 1)));
    }

    private void init(int i, int i2, short s, int i3, int i4) {
        this.f33529N = i;
        this.f33524C = i2;
        this.f33527L = s;
        this.f33528M = i3;
        this.f33530Q = i4;
        int i5 = this.f33525F;
        if (i5 < 40 || i5 > 100) {
            this.f33525F = 40;
        }
        this.f33526H = 10;
        setPriority(10);
        setFinishListener(new C5391a());
        start();
        sui.m22259c(f33519Z, "START RUN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initRetry() throws InterruptedException, vxf {
        if (this.f33537e.get()) {
            return;
        }
        try {
            m10143i(this.f33527L, this.f33524C, this.f33525F, this.f33528M, this.f33530Q);
        } catch (Exception unused) {
            Thread.sleep(40L);
            throw new vxf(x45.f96562k4);
        }
    }

    private int readRecordData() throws vxf {
        ovi oviVar;
        String str;
        AudioRecord audioRecord = this.f33535c;
        if (audioRecord == null) {
            str = "mRecorder is null";
        } else {
            if (this.f33536d != null) {
                byte[] bArr = this.f33534b;
                int i = audioRecord.read(bArr, 0, bArr.length);
                if (i > 0 && (oviVar = this.f33536d) != null) {
                    oviVar.onBuffer(this.f33534b, 0, i);
                    this.f33536d.onDecibel(calculateVolume(this.f33534b));
                } else if (i < 0) {
                    sui.m22258b(f33519Z, "Record read data error: " + i);
                    ovi oviVar2 = this.f33536d;
                    if (oviVar2 != null) {
                        oviVar2.onError(new vxf(x45.f96562k4));
                    }
                    throw new vxf(x45.f96562k4);
                }
                return i;
            }
            str = "mOutListener is null";
        }
        sui.m22258b(f33519Z, str);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        synchronized (this) {
            try {
                try {
                    if (this.f33535c != null) {
                        sui.m22256a(f33519Z, "release record begin");
                        this.f33535c.release();
                        this.f33535c = null;
                        ovi oviVar = this.f33536d;
                        if (oviVar != null) {
                            oviVar.onRelease();
                            this.f33536d = null;
                        }
                        sui.m22256a(f33519Z, "release record over");
                    }
                } catch (Exception e) {
                    sui.m22258b(f33519Z, "Exception：" + e.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRecord() throws vxf, InterruptedException {
        ovi oviVar = this.f33536d;
        boolean z = true;
        if (oviVar != null) {
            oviVar.onStart(true);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!this.f33537e.get()) {
            int recordData = readRecordData();
            if (z) {
                this.f33538f += (double) recordData;
                double d = this.f33539m;
                byte[] bArr = this.f33534b;
                this.f33539m = d + checkAudio(bArr, bArr.length);
                if (System.currentTimeMillis() - jCurrentTimeMillis >= 1000) {
                    if (this.f33538f == 0.0d || this.f33539m == 0.0d) {
                        sui.m22258b(f33519Z, "checkDataSum=" + this.f33538f + ",checkStandDev=" + this.f33539m);
                        sui.m22258b(f33519Z, "cannot get record permission, get invalid audio data.");
                        throw new vxf(x45.f96562k4);
                    }
                    z = false;
                }
            }
            if (this.f33534b.length > recordData) {
                sui.m22259c(f33519Z, "current record read size is less than buffer size: " + recordData);
                Thread.sleep((long) this.f33526H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRetry() throws InterruptedException, vxf {
        int i = 0;
        while (!this.f33537e.get()) {
            try {
                this.f33535c.startRecording();
                if (this.f33535c.getRecordingState() == 3) {
                    return;
                }
                sui.m22258b(f33519Z, "recorder state is not recoding");
                throw new vxf(x45.f96562k4);
            } catch (Exception unused) {
                i++;
                if (i >= 10) {
                    sui.m22258b(f33519Z, "recoder start failed");
                    throw new vxf(x45.f96562k4);
                }
                Thread.sleep(40L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop(boolean z) {
        if (z) {
            synchronized (this) {
                try {
                    sui.m22256a(f33519Z, "stopRecord...release");
                    AudioRecord audioRecord = this.f33535c;
                    if (audioRecord != null) {
                        if (3 == audioRecord.getRecordingState() && 1 == this.f33535c.getState()) {
                            sui.m22256a(f33519Z, "stopRecord releaseRecording ing...");
                            this.f33535c.release();
                            sui.m22256a(f33519Z, "stopRecord releaseRecording end...");
                            this.f33535c = null;
                        }
                        ovi oviVar = this.f33536d;
                        if (oviVar != null) {
                            oviVar.onRelease();
                            this.f33536d = null;
                        }
                    }
                } catch (Exception e) {
                    sui.m22258b(f33519Z, "Exception: " + e.toString());
                } finally {
                }
            }
        }
        sui.m22256a(f33519Z, "stop record");
    }

    public void finalize() throws Throwable {
        sui.m22256a(f33519Z, "[finalize] release recoder");
        releaseRecord();
        super.finalize();
    }

    /* JADX INFO: renamed from: i */
    public void m10143i(short s, int i, int i2, int i3, int i4) throws vxf {
        if (this.f33535c != null) {
            sui.m22256a(f33519Z, "[initRecord] recoder release first");
            release();
        }
        int i5 = (i2 * i) / 1000;
        int i6 = ((i5 * 64) * s) / 8;
        int i7 = s == 1 ? 2 : 3;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i7, i3);
        AudioRecord audioRecord = new AudioRecord(this.f33529N, i, i7, i3, i6 < minBufferSize ? minBufferSize : i6);
        this.f33535c = audioRecord;
        if (i4 == 0) {
            i4 = ((i5 * s) * 16) / 8;
        }
        this.f33534b = new byte[i4];
        if (audioRecord.getState() != 1) {
            sui.m22258b(f33519Z, "create Audio Record error! Recorder state" + this.f33535c.getState());
            ovi oviVar = this.f33536d;
            if (oviVar != null) {
                oviVar.onError(new vxf(x45.f96562k4));
            }
            throw new vxf(x45.f96562k4);
        }
    }

    public void releaseRecord() {
        if (this.f33532Y == null) {
            sui.m22258b(f33519Z, "mRecordHandle is NULL");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        this.f33532Y.sendMessage(messageObtain);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        sui.m22259c("PcmRecord", "run....");
        try {
            initRetry();
            startRetry();
            Looper.prepare();
            this.f33532Y = new HandlerC5393c();
            this.f33531X.onFinish();
            Looper.loop();
        } catch (Exception e) {
            sui.m22258b("PcmRecord", "Exception：" + e.getMessage());
            ovi oviVar = this.f33536d;
            if (oviVar != null) {
                oviVar.onError(new vxf(x45.f96562k4));
            }
        }
    }

    public void setFinishListener(InterfaceC5395e interfaceC5395e) {
        this.f33531X = interfaceC5395e;
    }

    public void setListener(fmc.InterfaceC5891a interfaceC5891a) {
        this.f33536d = new C5392b(interfaceC5891a);
    }

    public void startRecording() {
        if (this.f33532Y == null) {
            sui.m22258b(f33519Z, "mRecordHandle is NULL");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        this.f33532Y.sendMessage(messageObtain);
    }

    public void stopRecord(boolean z) {
        if (this.f33532Y == null) {
            sui.m22258b(f33519Z, "mRecordHandle is NULL");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = Boolean.valueOf(z);
        sui.m22259c("mRecordHandle: ", "stopRecord " + messageObtain.what);
        this.f33537e.set(true);
        this.f33532Y.sendMessage(messageObtain);
    }

    public emc(iud.C7630d c7630d, ovi oviVar) {
        setListener(oviVar);
        init(c7630d.getSource(), c7630d.getRate(), c7630d.getChannel(), c7630d.getFormat(), c7630d.getSize());
    }

    public void setListener(ovi oviVar) {
        this.f33536d = oviVar;
    }
}
