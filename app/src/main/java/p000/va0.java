package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.media3.common.C1213a;
import java.nio.ByteBuffer;
import p000.dda;
import p000.va0;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
public final class va0 implements dda {

    /* JADX INFO: renamed from: g */
    public static final int f90426g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f90427h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f90428i = 2;

    /* JADX INFO: renamed from: a */
    public final MediaCodec f90429a;

    /* JADX INFO: renamed from: b */
    public final gb0 f90430b;

    /* JADX INFO: renamed from: c */
    public final hda f90431c;

    /* JADX INFO: renamed from: d */
    @hib
    public final gp9 f90432d;

    /* JADX INFO: renamed from: e */
    public boolean f90433e;

    /* JADX INFO: renamed from: f */
    public int f90434f;

    /* JADX INFO: renamed from: va0$b */
    public static final class C13960b implements dda.InterfaceC4752b {

        /* JADX INFO: renamed from: b */
        public final lfg<HandlerThread> f90435b;

        /* JADX INFO: renamed from: c */
        public final lfg<HandlerThread> f90436c;

        /* JADX INFO: renamed from: d */
        public boolean f90437d;

        public C13960b(final int i) {
            this(new lfg() { // from class: xa0
                @Override // p000.lfg
                public final Object get() {
                    return va0.C13960b.lambda$new$0(i);
                }
            }, new lfg() { // from class: za0
                @Override // p000.lfg
                public final Object get() {
                    return va0.C13960b.lambda$new$1(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread lambda$new$0(int i) {
            return new HandlerThread(va0.createCallbackThreadLabel(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread lambda$new$1(int i) {
            return new HandlerThread(va0.createQueueingThreadLabel(i));
        }

        @sy1(api = 34)
        private static boolean useSynchronousBufferQueueingWithAsyncCryptoFlag(C1213a c1213a) {
            int i = Build.VERSION.SDK_INT;
            if (i < 34) {
                return false;
            }
            return i >= 35 || rva.isVideo(c1213a.f8291o);
        }

        public void experimentalSetAsyncCryptoFlagEnabled(boolean z) {
            this.f90437d = z;
        }

        public C13960b(lfg<HandlerThread> lfgVar, lfg<HandlerThread> lfgVar2) {
            this.f90435b = lfgVar;
            this.f90436c = lfgVar2;
            this.f90437d = false;
        }

        @Override // p000.dda.InterfaceC4752b
        public va0 createAdapter(dda.C4751a c4751a) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            hda cb0Var;
            int i;
            int i2;
            va0 va0Var;
            String str = c4751a.f29420a.f57252a;
            va0 va0Var2 = null;
            try {
                x5h.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f90437d && useSynchronousBufferQueueingWithAsyncCryptoFlag(c4751a.f29422c)) {
                        cb0Var = new oig(mediaCodecCreateByCodecName);
                        i = 4;
                    } else {
                        cb0Var = new cb0(mediaCodecCreateByCodecName, this.f90436c.get());
                        i = 0;
                    }
                    hda hdaVar = cb0Var;
                    i2 = i;
                    va0Var = new va0(mediaCodecCreateByCodecName, this.f90435b.get(), hdaVar, c4751a.f29425f);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodecCreateByCodecName = null;
            }
            try {
                x5h.endSection();
                Surface surface = c4751a.f29423d;
                if (surface == null && c4751a.f29420a.f57262k && Build.VERSION.SDK_INT >= 35) {
                    i2 |= 8;
                }
                va0Var.initialize(c4751a.f29421b, surface, c4751a.f29424e, i2);
                return va0Var;
            } catch (Exception e3) {
                e = e3;
                va0Var2 = va0Var;
                if (va0Var2 != null) {
                    va0Var2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
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
        gp9 gp9Var;
        this.f90430b.initialize(this.f90429a);
        x5h.beginSection("configureCodec");
        this.f90429a.configure(mediaFormat, surface, mediaCrypto, i);
        x5h.endSection();
        this.f90431c.start();
        x5h.beginSection("startCodec");
        this.f90429a.start();
        x5h.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (gp9Var = this.f90432d) != null) {
            gp9Var.addMediaCodec(this.f90429a);
        }
        this.f90434f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(dda.InterfaceC4754d interfaceC4754d, MediaCodec mediaCodec, long j, long j2) {
        interfaceC4754d.onFrameRendered(this, j, j2);
    }

    @Override // p000.dda
    public int dequeueInputBufferIndex() {
        this.f90431c.maybeThrowException();
        return this.f90430b.dequeueInputBufferIndex();
    }

    @Override // p000.dda
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.f90431c.maybeThrowException();
        return this.f90430b.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // p000.dda
    @c5e(35)
    public void detachOutputSurface() {
        this.f90429a.detachOutputSurface();
    }

    @fdi
    /* JADX INFO: renamed from: e */
    public void m23893e(MediaCodec.CodecException codecException) {
        this.f90430b.onError(this.f90429a, codecException);
    }

    @fdi
    /* JADX INFO: renamed from: f */
    public void m23894f(MediaFormat mediaFormat) {
        this.f90430b.onOutputFormatChanged(this.f90429a, mediaFormat);
    }

    @Override // p000.dda
    public void flush() {
        this.f90431c.flush();
        this.f90429a.flush();
        this.f90430b.flush();
        this.f90429a.start();
    }

    @Override // p000.dda
    @hib
    public ByteBuffer getInputBuffer(int i) {
        return this.f90429a.getInputBuffer(i);
    }

    @Override // p000.dda
    @c5e(26)
    public PersistableBundle getMetrics() {
        return this.f90429a.getMetrics();
    }

    @Override // p000.dda
    @hib
    public ByteBuffer getOutputBuffer(int i) {
        return this.f90429a.getOutputBuffer(i);
    }

    @Override // p000.dda
    public MediaFormat getOutputFormat() {
        return this.f90430b.getOutputFormat();
    }

    @Override // p000.dda
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // p000.dda
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f90431c.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p000.dda
    public void queueSecureInputBuffer(int i, int i2, f93 f93Var, long j, int i3) {
        this.f90431c.queueSecureInputBuffer(i, i2, f93Var, j, i3);
    }

    @Override // p000.dda
    public boolean registerOnBufferAvailableListener(dda.InterfaceC4753c interfaceC4753c) {
        this.f90430b.setOnBufferAvailableListener(interfaceC4753c);
        return true;
    }

    @Override // p000.dda
    public void release() {
        gp9 gp9Var;
        gp9 gp9Var2;
        try {
            if (this.f90434f == 1) {
                this.f90431c.shutdown();
                this.f90430b.shutdown();
            }
            this.f90434f = 2;
            if (this.f90433e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f90429a.stop();
                }
                if (i >= 35 && (gp9Var2 = this.f90432d) != null) {
                    gp9Var2.removeMediaCodec(this.f90429a);
                }
                this.f90429a.release();
                this.f90433e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f90433e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.f90429a.stop();
                    }
                    if (i2 >= 35 && (gp9Var = this.f90432d) != null) {
                        gp9Var.removeMediaCodec(this.f90429a);
                    }
                    this.f90429a.release();
                    this.f90433e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // p000.dda
    public void releaseOutputBuffer(int i, boolean z) {
        this.f90429a.releaseOutputBuffer(i, z);
    }

    @Override // p000.dda
    public void setOnFrameRenderedListener(final dda.InterfaceC4754d interfaceC4754d, Handler handler) {
        this.f90429a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: ua0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f87247a.lambda$setOnFrameRenderedListener$0(interfaceC4754d, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p000.dda
    public void setOutputSurface(Surface surface) {
        this.f90429a.setOutputSurface(surface);
    }

    @Override // p000.dda
    public void setParameters(Bundle bundle) {
        this.f90431c.setParameters(bundle);
    }

    @Override // p000.dda
    public void setVideoScalingMode(int i) {
        this.f90429a.setVideoScalingMode(i);
    }

    private va0(MediaCodec mediaCodec, HandlerThread handlerThread, hda hdaVar, @hib gp9 gp9Var) {
        this.f90429a = mediaCodec;
        this.f90430b = new gb0(handlerThread);
        this.f90431c = hdaVar;
        this.f90432d = gp9Var;
        this.f90434f = 0;
    }

    @Override // p000.dda
    public void releaseOutputBuffer(int i, long j) {
        this.f90429a.releaseOutputBuffer(i, j);
    }
}
