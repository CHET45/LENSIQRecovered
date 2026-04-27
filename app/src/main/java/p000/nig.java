package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.eda;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class nig implements eda {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f64686a;

    /* JADX INFO: renamed from: b */
    @hib
    public ByteBuffer[] f64687b;

    /* JADX INFO: renamed from: c */
    @hib
    public ByteBuffer[] f64688c;

    /* JADX INFO: renamed from: nig$b */
    public static class C9896b implements eda.InterfaceC5266b {
        /* JADX INFO: renamed from: a */
        public MediaCodec m17971a(eda.C5265a c5265a) throws IOException {
            u80.checkNotNull(c5265a.f32700a);
            String str = c5265a.f32700a.f53649a;
            w5h.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            w5h.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [nig$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p000.eda.InterfaceC5266b
        public eda createAdapter(eda.C5265a c5265a) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecM17971a = m17971a(c5265a);
                try {
                    w5h.beginSection("configureCodec");
                    mediaCodecM17971a.configure(c5265a.f32701b, c5265a.f32703d, c5265a.f32704e, c5265a.f32705f);
                    w5h.endSection();
                    w5h.beginSection("startCodec");
                    mediaCodecM17971a.start();
                    w5h.endSection();
                    return new nig(mediaCodecM17971a);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = mediaCodecM17971a;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(eda.InterfaceC5267c interfaceC5267c, MediaCodec mediaCodec, long j, long j2) {
        interfaceC5267c.onFrameRendered(this, j, j2);
    }

    @Override // p000.eda
    public int dequeueInputBufferIndex() {
        return this.f64686a.dequeueInputBuffer(0L);
    }

    @Override // p000.eda
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f64686a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && x0i.f95978a < 21) {
                this.f64688c = this.f64686a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p000.eda
    public void flush() {
        this.f64686a.flush();
    }

    @Override // p000.eda
    @hib
    public ByteBuffer getInputBuffer(int i) {
        return x0i.f95978a >= 21 ? this.f64686a.getInputBuffer(i) : ((ByteBuffer[]) x0i.castNonNull(this.f64687b))[i];
    }

    @Override // p000.eda
    @c5e(26)
    public PersistableBundle getMetrics() {
        return this.f64686a.getMetrics();
    }

    @Override // p000.eda
    @hib
    public ByteBuffer getOutputBuffer(int i) {
        return x0i.f95978a >= 21 ? this.f64686a.getOutputBuffer(i) : ((ByteBuffer[]) x0i.castNonNull(this.f64688c))[i];
    }

    @Override // p000.eda
    public MediaFormat getOutputFormat() {
        return this.f64686a.getOutputFormat();
    }

    @Override // p000.eda
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // p000.eda
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f64686a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p000.eda
    public void queueSecureInputBuffer(int i, int i2, g93 g93Var, long j, int i3) {
        this.f64686a.queueSecureInputBuffer(i, i2, g93Var.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // p000.eda
    public void release() {
        this.f64687b = null;
        this.f64688c = null;
        this.f64686a.release();
    }

    @Override // p000.eda
    public void releaseOutputBuffer(int i, boolean z) {
        this.f64686a.releaseOutputBuffer(i, z);
    }

    @Override // p000.eda
    @c5e(23)
    public void setOnFrameRenderedListener(final eda.InterfaceC5267c interfaceC5267c, Handler handler) {
        this.f64686a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: kig
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f54234a.lambda$setOnFrameRenderedListener$0(interfaceC5267c, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p000.eda
    @c5e(23)
    public void setOutputSurface(Surface surface) {
        this.f64686a.setOutputSurface(surface);
    }

    @Override // p000.eda
    @c5e(19)
    public void setParameters(Bundle bundle) {
        this.f64686a.setParameters(bundle);
    }

    @Override // p000.eda
    public void setVideoScalingMode(int i) {
        this.f64686a.setVideoScalingMode(i);
    }

    private nig(MediaCodec mediaCodec) {
        this.f64686a = mediaCodec;
        if (x0i.f95978a < 21) {
            this.f64687b = mediaCodec.getInputBuffers();
            this.f64688c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // p000.eda
    @c5e(21)
    public void releaseOutputBuffer(int i, long j) {
        this.f64686a.releaseOutputBuffer(i, j);
    }
}
