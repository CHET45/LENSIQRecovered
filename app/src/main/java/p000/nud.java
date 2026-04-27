package p000;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class nud extends Thread {

    /* JADX INFO: renamed from: L */
    public static final String f65722L = "RecordingThread";

    /* JADX INFO: renamed from: M */
    public static final int f65723M = 10;

    /* JADX INFO: renamed from: C */
    public final InterfaceC10065a f65724C;

    /* JADX INFO: renamed from: F */
    public AudioRecord f65725F;

    /* JADX INFO: renamed from: H */
    public AcousticEchoCanceler f65726H;

    /* JADX INFO: renamed from: a */
    public final int f65727a;

    /* JADX INFO: renamed from: b */
    public final int f65728b;

    /* JADX INFO: renamed from: c */
    public final int f65729c;

    /* JADX INFO: renamed from: d */
    public final LinkedBlockingQueue<byte[]> f65730d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f65731e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f65732f;

    /* JADX INFO: renamed from: m */
    public final AtomicInteger f65733m;

    /* JADX INFO: renamed from: nud$a */
    public interface InterfaceC10065a {
        void onAudioDataAvailable(byte[] bArr);
    }

    public nud(int i, InterfaceC10065a interfaceC10065a) throws Exception {
        super(f65722L);
        this.f65730d = new LinkedBlockingQueue<>();
        this.f65731e = new AtomicBoolean(true);
        this.f65732f = new AtomicBoolean(false);
        this.f65733m = new AtomicInteger(0);
        this.f65727a = i;
        this.f65724C = interfaceC10065a;
        this.f65728b = 16;
        this.f65729c = 2;
    }

    @j5e(xnc.f98582G)
    private void initAudioRecording() throws Exception {
        AudioRecord audioRecord = new AudioRecord(7, this.f65727a, this.f65728b, this.f65729c, AudioRecord.getMinBufferSize(this.f65727a, this.f65728b, this.f65729c) * 2);
        this.f65725F = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new Exception("无法初始化AudioRecord");
        }
        if (AcousticEchoCanceler.isAvailable()) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(this.f65725F.getAudioSessionId());
            this.f65726H = acousticEchoCancelerCreate;
            if (acousticEchoCancelerCreate != null) {
                acousticEchoCancelerCreate.setEnabled(true);
            }
        }
    }

    private void processAudioFrame() {
        byte[] bArr;
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4096);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            int i = this.f65725F.read(byteBufferAllocateDirect, 4096);
            if (i > 0) {
                bArr = new byte[i];
                byteBufferAllocateDirect.rewind();
                byteBufferAllocateDirect.get(bArr, 0, i);
            } else {
                if (i == -3 || i == -2 || i == -6) {
                    throw new Exception("AudioRecord error: " + i);
                }
                bArr = null;
            }
            InterfaceC10065a interfaceC10065a = this.f65724C;
            if (interfaceC10065a == null || bArr == null) {
                return;
            }
            interfaceC10065a.onAudioDataAvailable(bArr);
        } catch (Exception e) {
            ji9.m14109e(f65722L, "Error processing audio frame: " + e.getMessage());
            this.f65733m.incrementAndGet();
            throw new RuntimeException(e);
        }
    }

    private void releaseResources() {
        AudioRecord audioRecord = this.f65725F;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() == 1) {
                    this.f65725F.stop();
                    this.f65725F.release();
                }
            } catch (Exception e) {
                ji9.m14109e(f65722L, "Error releasing AudioRecord: " + e.getMessage());
            }
            this.f65725F = null;
        }
        AcousticEchoCanceler acousticEchoCanceler = this.f65726H;
        if (acousticEchoCanceler != null) {
            try {
                acousticEchoCanceler.setEnabled(false);
                this.f65726H.release();
            } catch (Exception e2) {
                ji9.m14109e(f65722L, "Error releasing AcousticEchoCanceler: " + e2.getMessage());
            }
            this.f65726H = null;
        }
    }

    private void sleepWhilePaused() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException unused) {
            this.f65731e.set(false);
        }
    }

    public void addExternalAudioData(byte[] bArr) {
        if (!this.f65731e.get() || bArr == null || bArr.length <= 0) {
            return;
        }
        this.f65730d.offer(bArr);
    }

    public void clearExternalAudioQueue() {
        this.f65730d.clear();
    }

    public int getErrorCount() {
        return this.f65733m.get();
    }

    public boolean isRecording() {
        return this.f65731e.get() && !this.f65732f.get();
    }

    public void pauseRecording() {
        this.f65732f.set(true);
        AudioRecord audioRecord = this.f65725F;
        if (audioRecord == null || audioRecord.getState() != 1) {
            return;
        }
        try {
            this.f65725F.stop();
        } catch (Exception e) {
            ji9.m14109e(f65722L, "Error pausing recording: " + e.getMessage());
        }
    }

    public void resumeRecording() {
        this.f65732f.set(false);
        AudioRecord audioRecord = this.f65725F;
        if (audioRecord == null || audioRecord.getState() != 1) {
            return;
        }
        try {
            this.f65725F.startRecording();
        } catch (Exception e) {
            ji9.m14109e(f65722L, "Error resuming recording: " + e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    @p000.j5e(p000.xnc.f98582G)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f65731e
            boolean r0 = r0.get()
            java.lang.String r1 = "RecordingThread"
            r2 = 10
            if (r0 == 0) goto L7a
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f65733m
            int r0 = r0.get()
            if (r0 >= r2) goto L7a
            r0 = 0
            r6.initAudioRecording()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            android.media.AudioRecord r3 = r6.f65725F     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r3.startRecording()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f65733m     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r3.set(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
        L22:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f65731e     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r3 == 0) goto L46
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f65733m     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r3 >= r2) goto L46
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f65732f     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            if (r3 != 0) goto L42
            r6.processAudioFrame()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            goto L22
        L3e:
            r0 = move-exception
            goto L76
        L40:
            r3 = move-exception
            goto L4a
        L42:
            r6.sleepWhilePaused()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            goto L22
        L46:
            r6.releaseResources()
            goto L0
        L4a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "Audio recording error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L3e
            r4.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            p000.ji9.m14109e(r1, r3)     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f65733m     // Catch: java.lang.Throwable -> L3e
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L3e
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L3e java.lang.InterruptedException -> L6d
            goto L46
        L6d:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f65731e     // Catch: java.lang.Throwable -> L3e
            r3.set(r0)     // Catch: java.lang.Throwable -> L3e
            r6.releaseResources()
            goto L7a
        L76:
            r6.releaseResources()
            throw r0
        L7a:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f65733m
            int r0 = r0.get()
            if (r0 < r2) goto L87
            java.lang.String r0 = "Maximum error count reached, thread will exit"
            p000.ji9.m14109e(r1, r0)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nud.run():void");
    }

    public void stopRecording() {
        this.f65731e.set(false);
        interrupt();
    }
}
