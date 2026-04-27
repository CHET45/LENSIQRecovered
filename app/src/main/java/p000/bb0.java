package p000;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
@c5e(23)
@Deprecated
public class bb0 {

    /* JADX INFO: renamed from: g */
    public static final int f13203g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f13204h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f13205i = 2;

    /* JADX INFO: renamed from: j */
    @xc7("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<C1817b> f13206j = new ArrayDeque<>();

    /* JADX INFO: renamed from: k */
    public static final Object f13207k = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f13208a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f13209b;

    /* JADX INFO: renamed from: c */
    public Handler f13210c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<RuntimeException> f13211d;

    /* JADX INFO: renamed from: e */
    public final wp2 f13212e;

    /* JADX INFO: renamed from: f */
    public boolean f13213f;

    /* JADX INFO: renamed from: bb0$a */
    public class HandlerC1816a extends Handler {
        public HandlerC1816a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            bb0.this.doHandleMessage(message);
        }
    }

    /* JADX INFO: renamed from: bb0$b */
    public static class C1817b {

        /* JADX INFO: renamed from: a */
        public int f13215a;

        /* JADX INFO: renamed from: b */
        public int f13216b;

        /* JADX INFO: renamed from: c */
        public int f13217c;

        /* JADX INFO: renamed from: d */
        public final MediaCodec.CryptoInfo f13218d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e */
        public long f13219e;

        /* JADX INFO: renamed from: f */
        public int f13220f;

        public void setQueueParams(int i, int i2, int i3, long j, int i4) {
            this.f13215a = i;
            this.f13216b = i2;
            this.f13217c = i3;
            this.f13219e = j;
            this.f13220f = i4;
        }
    }

    public bb0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new wp2());
    }

    private void blockUntilHandlerThreadIsIdle() throws InterruptedException {
        this.f13212e.close();
        ((Handler) u80.checkNotNull(this.f13210c)).obtainMessage(2).sendToTarget();
        this.f13212e.block();
    }

    private static void copy(g93 g93Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = g93Var.f39033f;
        cryptoInfo.numBytesOfClearData = copy(g93Var.f39031d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = copy(g93Var.f39032e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) u80.checkNotNull(copy(g93Var.f39029b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) u80.checkNotNull(copy(g93Var.f39028a, cryptoInfo.iv));
        cryptoInfo.mode = g93Var.f39030c;
        if (x0i.f95978a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(g93Var.f39034g, g93Var.f39035h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doHandleMessage(Message message) {
        C1817b c1817b;
        int i = message.what;
        if (i == 0) {
            c1817b = (C1817b) message.obj;
            doQueueInputBuffer(c1817b.f13215a, c1817b.f13216b, c1817b.f13217c, c1817b.f13219e, c1817b.f13220f);
        } else if (i != 1) {
            c1817b = null;
            if (i != 2) {
                v7b.m23844a(this.f13211d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f13212e.open();
            }
        } else {
            c1817b = (C1817b) message.obj;
            doQueueSecureInputBuffer(c1817b.f13215a, c1817b.f13216b, c1817b.f13218d, c1817b.f13219e, c1817b.f13220f);
        }
        if (c1817b != null) {
            recycleMessageParams(c1817b);
        }
    }

    private void doQueueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.f13208a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            v7b.m23844a(this.f13211d, null, e);
        }
    }

    private void doQueueSecureInputBuffer(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f13207k) {
                this.f13208a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            v7b.m23844a(this.f13211d, null, e);
        }
    }

    private void flushHandlerThread() throws InterruptedException {
        ((Handler) u80.checkNotNull(this.f13210c)).removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static C1817b getMessageParams() {
        ArrayDeque<C1817b> arrayDeque = f13206j;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C1817b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void recycleMessageParams(C1817b c1817b) {
        ArrayDeque<C1817b> arrayDeque = f13206j;
        synchronized (arrayDeque) {
            arrayDeque.add(c1817b);
        }
    }

    @fdi(otherwise = 5)
    /* JADX INFO: renamed from: b */
    public void m3026b(RuntimeException runtimeException) {
        this.f13211d.set(runtimeException);
    }

    public void flush() {
        if (this.f13213f) {
            try {
                flushHandlerThread();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void maybeThrowException() {
        RuntimeException andSet = this.f13211d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        maybeThrowException();
        C1817b messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, i3, j, i4);
        ((Handler) x0i.castNonNull(this.f13210c)).obtainMessage(0, messageParams).sendToTarget();
    }

    public void queueSecureInputBuffer(int i, int i2, g93 g93Var, long j, int i3) {
        maybeThrowException();
        C1817b messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, 0, j, i3);
        copy(g93Var, messageParams.f13218d);
        ((Handler) x0i.castNonNull(this.f13210c)).obtainMessage(1, messageParams).sendToTarget();
    }

    public void shutdown() {
        if (this.f13213f) {
            flush();
            this.f13209b.quit();
        }
        this.f13213f = false;
    }

    public void start() {
        if (this.f13213f) {
            return;
        }
        this.f13209b.start();
        this.f13210c = new HandlerC1816a(this.f13209b.getLooper());
        this.f13213f = true;
    }

    public void waitUntilQueueingComplete() throws InterruptedException {
        blockUntilHandlerThreadIsIdle();
    }

    @fdi
    public bb0(MediaCodec mediaCodec, HandlerThread handlerThread, wp2 wp2Var) {
        this.f13208a = mediaCodec;
        this.f13209b = handlerThread;
        this.f13212e = wp2Var;
        this.f13211d = new AtomicReference<>();
    }

    @hib
    private static int[] copy(@hib int[] iArr, @hib int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @hib
    private static byte[] copy(@hib byte[] bArr, @hib byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
