package p000;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
public class cb0 implements hda {

    /* JADX INFO: renamed from: g */
    public static final int f16149g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f16150h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f16151i = 3;

    /* JADX INFO: renamed from: j */
    public static final int f16152j = 4;

    /* JADX INFO: renamed from: k */
    @xc7("MESSAGE_PARAMS_INSTANCE_POOL")
    public static final ArrayDeque<C2259b> f16153k = new ArrayDeque<>();

    /* JADX INFO: renamed from: l */
    public static final Object f16154l = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f16155a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f16156b;

    /* JADX INFO: renamed from: c */
    public Handler f16157c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<RuntimeException> f16158d;

    /* JADX INFO: renamed from: e */
    public final yp2 f16159e;

    /* JADX INFO: renamed from: f */
    public boolean f16160f;

    /* JADX INFO: renamed from: cb0$a */
    public class HandlerC2258a extends Handler {
        public HandlerC2258a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            cb0.this.doHandleMessage(message);
        }
    }

    /* JADX INFO: renamed from: cb0$b */
    public static class C2259b {

        /* JADX INFO: renamed from: a */
        public int f16162a;

        /* JADX INFO: renamed from: b */
        public int f16163b;

        /* JADX INFO: renamed from: c */
        public int f16164c;

        /* JADX INFO: renamed from: d */
        public final MediaCodec.CryptoInfo f16165d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e */
        public long f16166e;

        /* JADX INFO: renamed from: f */
        public int f16167f;

        public void setQueueParams(int i, int i2, int i3, long j, int i4) {
            this.f16162a = i;
            this.f16163b = i2;
            this.f16164c = i3;
            this.f16166e = j;
            this.f16167f = i4;
        }
    }

    public cb0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new yp2());
    }

    private void blockUntilHandlerThreadIsIdle() throws InterruptedException {
        this.f16159e.close();
        ((Handler) v80.checkNotNull(this.f16157c)).obtainMessage(3).sendToTarget();
        this.f16159e.block();
    }

    private static void copy(f93 f93Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = f93Var.f35751f;
        cryptoInfo.numBytesOfClearData = copy(f93Var.f35749d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = copy(f93Var.f35750e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) v80.checkNotNull(copy(f93Var.f35747b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) v80.checkNotNull(copy(f93Var.f35746a, cryptoInfo.iv));
        cryptoInfo.mode = f93Var.f35748c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(f93Var.f35752g, f93Var.f35753h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doHandleMessage(Message message) {
        C2259b c2259b;
        int i = message.what;
        if (i == 1) {
            c2259b = (C2259b) message.obj;
            doQueueInputBuffer(c2259b.f16162a, c2259b.f16163b, c2259b.f16164c, c2259b.f16166e, c2259b.f16167f);
        } else if (i != 2) {
            c2259b = null;
            if (i == 3) {
                this.f16159e.open();
            } else if (i != 4) {
                v7b.m23844a(this.f16158d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                doSetParameters((Bundle) message.obj);
            }
        } else {
            c2259b = (C2259b) message.obj;
            doQueueSecureInputBuffer(c2259b.f16162a, c2259b.f16163b, c2259b.f16165d, c2259b.f16166e, c2259b.f16167f);
        }
        if (c2259b != null) {
            recycleMessageParams(c2259b);
        }
    }

    private void doQueueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.f16155a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            v7b.m23844a(this.f16158d, null, e);
        }
    }

    private void doQueueSecureInputBuffer(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f16154l) {
                this.f16155a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            v7b.m23844a(this.f16158d, null, e);
        }
    }

    private void doSetParameters(Bundle bundle) {
        try {
            this.f16155a.setParameters(bundle);
        } catch (RuntimeException e) {
            v7b.m23844a(this.f16158d, null, e);
        }
    }

    private void flushHandlerThread() throws InterruptedException {
        ((Handler) v80.checkNotNull(this.f16157c)).removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static C2259b getMessageParams() {
        ArrayDeque<C2259b> arrayDeque = f16153k;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C2259b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void recycleMessageParams(C2259b c2259b) {
        ArrayDeque<C2259b> arrayDeque = f16153k;
        synchronized (arrayDeque) {
            arrayDeque.add(c2259b);
        }
    }

    @fdi(otherwise = 5)
    /* JADX INFO: renamed from: b */
    public void m3884b(RuntimeException runtimeException) {
        this.f16158d.set(runtimeException);
    }

    @Override // p000.hda
    public void flush() {
        if (this.f16160f) {
            try {
                flushHandlerThread();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p000.hda
    public void maybeThrowException() {
        RuntimeException andSet = this.f16158d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // p000.hda
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        maybeThrowException();
        C2259b messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, i3, j, i4);
        ((Handler) t0i.castNonNull(this.f16157c)).obtainMessage(1, messageParams).sendToTarget();
    }

    @Override // p000.hda
    public void queueSecureInputBuffer(int i, int i2, f93 f93Var, long j, int i3) {
        maybeThrowException();
        C2259b messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, 0, j, i3);
        copy(f93Var, messageParams.f16165d);
        ((Handler) t0i.castNonNull(this.f16157c)).obtainMessage(2, messageParams).sendToTarget();
    }

    @Override // p000.hda
    public void setParameters(Bundle bundle) {
        maybeThrowException();
        ((Handler) t0i.castNonNull(this.f16157c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p000.hda
    public void shutdown() {
        if (this.f16160f) {
            flush();
            this.f16156b.quit();
        }
        this.f16160f = false;
    }

    @Override // p000.hda
    public void start() {
        if (this.f16160f) {
            return;
        }
        this.f16156b.start();
        this.f16157c = new HandlerC2258a(this.f16156b.getLooper());
        this.f16160f = true;
    }

    @Override // p000.hda
    public void waitUntilQueueingComplete() throws InterruptedException {
        blockUntilHandlerThreadIsIdle();
    }

    @fdi
    public cb0(MediaCodec mediaCodec, HandlerThread handlerThread, yp2 yp2Var) {
        this.f16155a = mediaCodec;
        this.f16156b = handlerThread;
        this.f16159e = yp2Var;
        this.f16158d = new AtomicReference<>();
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
