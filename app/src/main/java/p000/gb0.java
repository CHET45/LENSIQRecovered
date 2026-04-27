package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p000.dda;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
public final class gb0 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f39180b;

    /* JADX INFO: renamed from: c */
    public Handler f39181c;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    @hib
    public MediaFormat f39186h;

    /* JADX INFO: renamed from: i */
    @xc7("lock")
    @hib
    public MediaFormat f39187i;

    /* JADX INFO: renamed from: j */
    @xc7("lock")
    @hib
    public MediaCodec.CodecException f39188j;

    /* JADX INFO: renamed from: k */
    @xc7("lock")
    @hib
    public MediaCodec.CryptoException f39189k;

    /* JADX INFO: renamed from: l */
    @xc7("lock")
    public long f39190l;

    /* JADX INFO: renamed from: m */
    @xc7("lock")
    public boolean f39191m;

    /* JADX INFO: renamed from: n */
    @xc7("lock")
    @hib
    public IllegalStateException f39192n;

    /* JADX INFO: renamed from: o */
    @xc7("lock")
    @hib
    public dda.InterfaceC4753c f39193o;

    /* JADX INFO: renamed from: a */
    public final Object f39179a = new Object();

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public final k02 f39182d = new k02();

    /* JADX INFO: renamed from: e */
    @xc7("lock")
    public final k02 f39183e = new k02();

    /* JADX INFO: renamed from: f */
    @xc7("lock")
    public final ArrayDeque<MediaCodec.BufferInfo> f39184f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    @xc7("lock")
    public final ArrayDeque<MediaFormat> f39185g = new ArrayDeque<>();

    public gb0(HandlerThread handlerThread) {
        this.f39180b = handlerThread;
    }

    @xc7("lock")
    private void addOutputFormat(MediaFormat mediaFormat) {
        this.f39183e.addLast(-2);
        this.f39185g.add(mediaFormat);
    }

    @xc7("lock")
    private void flushInternal() {
        if (!this.f39185g.isEmpty()) {
            this.f39187i = this.f39185g.getLast();
        }
        this.f39182d.clear();
        this.f39183e.clear();
        this.f39184f.clear();
        this.f39185g.clear();
    }

    @xc7("lock")
    private boolean isFlushingOrShutdown() {
        return this.f39190l > 0 || this.f39191m;
    }

    @xc7("lock")
    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
        maybeThrowMediaCodecCryptoException();
    }

    @xc7("lock")
    private void maybeThrowInternalException() {
        IllegalStateException illegalStateException = this.f39192n;
        if (illegalStateException == null) {
            return;
        }
        this.f39192n = null;
        throw illegalStateException;
    }

    @xc7("lock")
    private void maybeThrowMediaCodecCryptoException() {
        MediaCodec.CryptoException cryptoException = this.f39189k;
        if (cryptoException == null) {
            return;
        }
        this.f39189k = null;
        throw cryptoException;
    }

    @xc7("lock")
    private void maybeThrowMediaCodecException() {
        MediaCodec.CodecException codecException = this.f39188j;
        if (codecException == null) {
            return;
        }
        this.f39188j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFlushCompleted() {
        synchronized (this.f39179a) {
            try {
                if (this.f39191m) {
                    return;
                }
                long j = this.f39190l - 1;
                this.f39190l = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    setInternalException(new IllegalStateException());
                } else {
                    flushInternal();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setInternalException(IllegalStateException illegalStateException) {
        synchronized (this.f39179a) {
            this.f39192n = illegalStateException;
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.f39179a) {
            try {
                maybeThrowException();
                int iPopFirst = -1;
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (!this.f39182d.isEmpty()) {
                    iPopFirst = this.f39182d.popFirst();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f39179a) {
            try {
                maybeThrowException();
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (this.f39183e.isEmpty()) {
                    return -1;
                }
                int iPopFirst = this.f39183e.popFirst();
                if (iPopFirst >= 0) {
                    v80.checkStateNotNull(this.f39186h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f39184f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iPopFirst == -2) {
                    this.f39186h = this.f39185g.remove();
                }
                return iPopFirst;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void flush() {
        synchronized (this.f39179a) {
            this.f39190l++;
            ((Handler) t0i.castNonNull(this.f39181c)).post(new Runnable() { // from class: eb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32437a.onFlushCompleted();
                }
            });
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.f39179a) {
            try {
                mediaFormat = this.f39186h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void initialize(MediaCodec mediaCodec) {
        v80.checkState(this.f39181c == null);
        this.f39180b.start();
        Handler handler = new Handler(this.f39180b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f39181c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f39179a) {
            this.f39189k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f39179a) {
            this.f39188j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f39179a) {
            try {
                this.f39182d.addLast(i);
                dda.InterfaceC4753c interfaceC4753c = this.f39193o;
                if (interfaceC4753c != null) {
                    interfaceC4753c.onInputBufferAvailable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f39179a) {
            try {
                MediaFormat mediaFormat = this.f39187i;
                if (mediaFormat != null) {
                    addOutputFormat(mediaFormat);
                    this.f39187i = null;
                }
                this.f39183e.addLast(i);
                this.f39184f.add(bufferInfo);
                dda.InterfaceC4753c interfaceC4753c = this.f39193o;
                if (interfaceC4753c != null) {
                    interfaceC4753c.onOutputBufferAvailable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f39179a) {
            addOutputFormat(mediaFormat);
            this.f39187i = null;
        }
    }

    public void setOnBufferAvailableListener(dda.InterfaceC4753c interfaceC4753c) {
        synchronized (this.f39179a) {
            this.f39193o = interfaceC4753c;
        }
    }

    public void shutdown() {
        synchronized (this.f39179a) {
            this.f39191m = true;
            this.f39180b.quit();
            flushInternal();
        }
    }
}
