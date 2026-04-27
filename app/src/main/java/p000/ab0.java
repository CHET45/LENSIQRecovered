package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import p000.ab0;
import p000.eda;

/* JADX INFO: loaded from: classes4.dex */
@c5e(23)
@Deprecated
public final class ab0 implements eda {

    /* JADX INFO: renamed from: g */
    public static final int f881g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f882h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f883i = 2;

    /* JADX INFO: renamed from: a */
    public final MediaCodec f884a;

    /* JADX INFO: renamed from: b */
    public final fb0 f885b;

    /* JADX INFO: renamed from: c */
    public final bb0 f886c;

    /* JADX INFO: renamed from: d */
    public final boolean f887d;

    /* JADX INFO: renamed from: e */
    public boolean f888e;

    /* JADX INFO: renamed from: f */
    public int f889f;

    /* JADX INFO: renamed from: ab0$b */
    public static final class C0138b implements eda.InterfaceC5266b {

        /* JADX INFO: renamed from: b */
        public final lfg<HandlerThread> f890b;

        /* JADX INFO: renamed from: c */
        public final lfg<HandlerThread> f891c;

        /* JADX INFO: renamed from: d */
        public final boolean f892d;

        public C0138b(final int i, boolean z) {
            this(new lfg() { // from class: wa0
                @Override // p000.lfg
                public final Object get() {
                    return ab0.C0138b.lambda$new$0(i);
                }
            }, new lfg() { // from class: ya0
                @Override // p000.lfg
                public final Object get() {
                    return ab0.C0138b.lambda$new$1(i);
                }
            }, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread lambda$new$0(int i) {
            return new HandlerThread(ab0.createCallbackThreadLabel(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread lambda$new$1(int i) {
            return new HandlerThread(ab0.createQueueingThreadLabel(i));
        }

        @fdi
        public C0138b(lfg<HandlerThread> lfgVar, lfg<HandlerThread> lfgVar2, boolean z) {
            this.f890b = lfgVar;
            this.f891c = lfgVar2;
            this.f892d = z;
        }

        @Override // p000.eda.InterfaceC5266b
        public ab0 createAdapter(eda.C5265a c5265a) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = c5265a.f32700a.f53649a;
            ab0 ab0Var = null;
            try {
                w5h.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    ab0 ab0Var2 = new ab0(mediaCodecCreateByCodecName, this.f890b.get(), this.f891c.get(), this.f892d);
                    try {
                        w5h.endSection();
                        ab0Var2.initialize(c5265a.f32701b, c5265a.f32703d, c5265a.f32704e, c5265a.f32705f);
                        return ab0Var2;
                    } catch (Exception e) {
                        e = e;
                        ab0Var = ab0Var2;
                        if (ab0Var != null) {
                            ab0Var.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createCallbackThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createQueueingThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String createThreadLabel(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(c0b.f15434d);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize(@hib MediaFormat mediaFormat, @hib Surface surface, @hib MediaCrypto mediaCrypto, int i) {
        this.f885b.initialize(this.f884a);
        w5h.beginSection("configureCodec");
        this.f884a.configure(mediaFormat, surface, mediaCrypto, i);
        w5h.endSection();
        this.f886c.start();
        w5h.beginSection("startCodec");
        this.f884a.start();
        w5h.endSection();
        this.f889f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(eda.InterfaceC5267c interfaceC5267c, MediaCodec mediaCodec, long j, long j2) {
        interfaceC5267c.onFrameRendered(this, j, j2);
    }

    private void maybeBlockOnQueueing() {
        if (this.f887d) {
            try {
                this.f886c.waitUntilQueueingComplete();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p000.eda
    public int dequeueInputBufferIndex() {
        this.f886c.maybeThrowException();
        return this.f885b.dequeueInputBufferIndex();
    }

    @Override // p000.eda
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.f886c.maybeThrowException();
        return this.f885b.dequeueOutputBufferIndex(bufferInfo);
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public void m282e(MediaCodec.CodecException codecException) {
        this.f885b.onError(this.f884a, codecException);
    }

    @fdi
    /* JADX INFO: renamed from: f */
    public void m283f(MediaFormat mediaFormat) {
        this.f885b.onOutputFormatChanged(this.f884a, mediaFormat);
    }

    @Override // p000.eda
    public void flush() {
        this.f886c.flush();
        this.f884a.flush();
        this.f885b.flush();
        this.f884a.start();
    }

    @Override // p000.eda
    @hib
    public ByteBuffer getInputBuffer(int i) {
        return this.f884a.getInputBuffer(i);
    }

    @Override // p000.eda
    @c5e(26)
    public PersistableBundle getMetrics() {
        maybeBlockOnQueueing();
        return this.f884a.getMetrics();
    }

    @Override // p000.eda
    @hib
    public ByteBuffer getOutputBuffer(int i) {
        return this.f884a.getOutputBuffer(i);
    }

    @Override // p000.eda
    public MediaFormat getOutputFormat() {
        return this.f885b.getOutputFormat();
    }

    @Override // p000.eda
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // p000.eda
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f886c.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p000.eda
    public void queueSecureInputBuffer(int i, int i2, g93 g93Var, long j, int i3) {
        this.f886c.queueSecureInputBuffer(i, i2, g93Var, j, i3);
    }

    @Override // p000.eda
    public void release() {
        try {
            if (this.f889f == 1) {
                this.f886c.shutdown();
                this.f885b.shutdown();
            }
            this.f889f = 2;
            if (this.f888e) {
                return;
            }
            this.f884a.release();
            this.f888e = true;
        } catch (Throwable th) {
            if (!this.f888e) {
                this.f884a.release();
                this.f888e = true;
            }
            throw th;
        }
    }

    @Override // p000.eda
    public void releaseOutputBuffer(int i, boolean z) {
        this.f884a.releaseOutputBuffer(i, z);
    }

    @Override // p000.eda
    public void setOnFrameRenderedListener(final eda.InterfaceC5267c interfaceC5267c, Handler handler) {
        maybeBlockOnQueueing();
        this.f884a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: ta0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f84068a.lambda$setOnFrameRenderedListener$0(interfaceC5267c, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p000.eda
    public void setOutputSurface(Surface surface) {
        maybeBlockOnQueueing();
        this.f884a.setOutputSurface(surface);
    }

    @Override // p000.eda
    public void setParameters(Bundle bundle) {
        maybeBlockOnQueueing();
        this.f884a.setParameters(bundle);
    }

    @Override // p000.eda
    public void setVideoScalingMode(int i) {
        maybeBlockOnQueueing();
        this.f884a.setVideoScalingMode(i);
    }

    private ab0(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f884a = mediaCodec;
        this.f885b = new fb0(handlerThread);
        this.f886c = new bb0(mediaCodec, handlerThread2);
        this.f887d = z;
        this.f889f = 0;
    }

    @Override // p000.eda
    public void releaseOutputBuffer(int i, long j) {
        this.f884a.releaseOutputBuffer(i, j);
    }
}
