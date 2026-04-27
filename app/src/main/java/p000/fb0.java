package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
@c5e(23)
@Deprecated
public final class fb0 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b */
    public final HandlerThread f35971b;

    /* JADX INFO: renamed from: c */
    public Handler f35972c;

    /* JADX INFO: renamed from: h */
    @xc7("lock")
    @hib
    public MediaFormat f35977h;

    /* JADX INFO: renamed from: i */
    @xc7("lock")
    @hib
    public MediaFormat f35978i;

    /* JADX INFO: renamed from: j */
    @xc7("lock")
    @hib
    public MediaCodec.CodecException f35979j;

    /* JADX INFO: renamed from: k */
    @xc7("lock")
    public long f35980k;

    /* JADX INFO: renamed from: l */
    @xc7("lock")
    public boolean f35981l;

    /* JADX INFO: renamed from: m */
    @xc7("lock")
    @hib
    public IllegalStateException f35982m;

    /* JADX INFO: renamed from: a */
    public final Object f35970a = new Object();

    /* JADX INFO: renamed from: d */
    @xc7("lock")
    public final d68 f35973d = new d68();

    /* JADX INFO: renamed from: e */
    @xc7("lock")
    public final d68 f35974e = new d68();

    /* JADX INFO: renamed from: f */
    @xc7("lock")
    public final ArrayDeque<MediaCodec.BufferInfo> f35975f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g */
    @xc7("lock")
    public final ArrayDeque<MediaFormat> f35976g = new ArrayDeque<>();

    public fb0(HandlerThread handlerThread) {
        this.f35971b = handlerThread;
    }

    @xc7("lock")
    private void addOutputFormat(MediaFormat mediaFormat) {
        this.f35974e.add(-2);
        this.f35976g.add(mediaFormat);
    }

    @xc7("lock")
    private void flushInternal() {
        if (!this.f35976g.isEmpty()) {
            this.f35978i = this.f35976g.getLast();
        }
        this.f35973d.clear();
        this.f35974e.clear();
        this.f35975f.clear();
        this.f35976g.clear();
    }

    @xc7("lock")
    private boolean isFlushingOrShutdown() {
        return this.f35980k > 0 || this.f35981l;
    }

    @xc7("lock")
    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
    }

    @xc7("lock")
    private void maybeThrowInternalException() {
        IllegalStateException illegalStateException = this.f35982m;
        if (illegalStateException == null) {
            return;
        }
        this.f35982m = null;
        throw illegalStateException;
    }

    @xc7("lock")
    private void maybeThrowMediaCodecException() {
        MediaCodec.CodecException codecException = this.f35979j;
        if (codecException == null) {
            return;
        }
        this.f35979j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFlushCompleted() {
        synchronized (this.f35970a) {
            try {
                if (this.f35981l) {
                    return;
                }
                long j = this.f35980k - 1;
                this.f35980k = j;
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
        synchronized (this.f35970a) {
            this.f35982m = illegalStateException;
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.f35970a) {
            try {
                maybeThrowException();
                int iRemove = -1;
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (!this.f35973d.isEmpty()) {
                    iRemove = this.f35973d.remove();
                }
                return iRemove;
            } finally {
            }
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f35970a) {
            try {
                maybeThrowException();
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (this.f35974e.isEmpty()) {
                    return -1;
                }
                int iRemove = this.f35974e.remove();
                if (iRemove >= 0) {
                    u80.checkStateNotNull(this.f35977h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f35975f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iRemove == -2) {
                    this.f35977h = this.f35976g.remove();
                }
                return iRemove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void flush() {
        synchronized (this.f35970a) {
            this.f35980k++;
            ((Handler) x0i.castNonNull(this.f35972c)).post(new Runnable() { // from class: db0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29170a.onFlushCompleted();
                }
            });
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.f35970a) {
            try {
                mediaFormat = this.f35977h;
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
        u80.checkState(this.f35972c == null);
        this.f35971b.start();
        Handler handler = new Handler(this.f35971b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f35972c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f35970a) {
            this.f35979j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f35970a) {
            this.f35973d.add(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f35970a) {
            try {
                MediaFormat mediaFormat = this.f35978i;
                if (mediaFormat != null) {
                    addOutputFormat(mediaFormat);
                    this.f35978i = null;
                }
                this.f35974e.add(i);
                this.f35975f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f35970a) {
            addOutputFormat(mediaFormat);
            this.f35978i = null;
        }
    }

    public void shutdown() {
        synchronized (this.f35970a) {
            this.f35981l = true;
            this.f35971b.quit();
            flushInternal();
        }
    }
}
