package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.dda;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mig implements dda {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f61084a;

    /* JADX INFO: renamed from: b */
    @hib
    public final gp9 f61085b;

    /* JADX INFO: renamed from: mig$b */
    public static class C9362b implements dda.InterfaceC4752b {
        /* JADX INFO: renamed from: a */
        public MediaCodec m17333a(dda.C4751a c4751a) throws IOException {
            v80.checkNotNull(c4751a.f29420a);
            String str = c4751a.f29420a.f57252a;
            x5h.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            x5h.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [mig$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p000.dda.InterfaceC4752b
        @p000.igg({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p000.dda createAdapter(p000.dda.C4751a r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.m17333a(r7)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r2 = "configureCodec"
                p000.x5h.beginSection(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r2 = r7.f29423d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 != 0) goto L22
                lda r3 = r7.f29420a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r3 = r3.f57262k     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r3 == 0) goto L22
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r4 = 35
                if (r3 < r4) goto L22
                r3 = 8
                goto L23
            L1d:
                r7 = move-exception
            L1e:
                r0 = r1
                goto L43
            L20:
                r7 = move-exception
                goto L1e
            L22:
                r3 = 0
            L23:
                android.media.MediaFormat r4 = r7.f29421b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r5 = r7.f29424e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.configure(r4, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                p000.x5h.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r2 = "startCodec"
                p000.x5h.beginSection(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                p000.x5h.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                mig r2 = new mig     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                gp9 r7 = r7.f29425f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r2.<init>(r1, r7)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r2
            L40:
                r7 = move-exception
                goto L43
            L42:
                r7 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mig.C9362b.createAdapter(dda$a):dda");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(dda.InterfaceC4754d interfaceC4754d, MediaCodec mediaCodec, long j, long j2) {
        interfaceC4754d.onFrameRendered(this, j, j2);
    }

    @Override // p000.dda
    public int dequeueInputBufferIndex() {
        return this.f61084a.dequeueInputBuffer(0L);
    }

    @Override // p000.dda
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f61084a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p000.dda
    @c5e(35)
    public void detachOutputSurface() {
        this.f61084a.detachOutputSurface();
    }

    @Override // p000.dda
    public void flush() {
        this.f61084a.flush();
    }

    @Override // p000.dda
    @hib
    public ByteBuffer getInputBuffer(int i) {
        return this.f61084a.getInputBuffer(i);
    }

    @Override // p000.dda
    @c5e(26)
    public PersistableBundle getMetrics() {
        return this.f61084a.getMetrics();
    }

    @Override // p000.dda
    @hib
    public ByteBuffer getOutputBuffer(int i) {
        return this.f61084a.getOutputBuffer(i);
    }

    @Override // p000.dda
    public MediaFormat getOutputFormat() {
        return this.f61084a.getOutputFormat();
    }

    @Override // p000.dda
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // p000.dda
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.f61084a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // p000.dda
    public void queueSecureInputBuffer(int i, int i2, f93 f93Var, long j, int i3) {
        this.f61084a.queueSecureInputBuffer(i, i2, f93Var.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // p000.dda
    public void release() {
        gp9 gp9Var;
        gp9 gp9Var2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.f61084a.stop();
            }
            if (i >= 35 && (gp9Var2 = this.f61085b) != null) {
                gp9Var2.removeMediaCodec(this.f61084a);
            }
            this.f61084a.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (gp9Var = this.f61085b) != null) {
                gp9Var.removeMediaCodec(this.f61084a);
            }
            this.f61084a.release();
            throw th;
        }
    }

    @Override // p000.dda
    public void releaseOutputBuffer(int i, boolean z) {
        this.f61084a.releaseOutputBuffer(i, z);
    }

    @Override // p000.dda
    @c5e(23)
    public void setOnFrameRenderedListener(final dda.InterfaceC4754d interfaceC4754d, Handler handler) {
        this.f61084a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: lig
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f57714a.lambda$setOnFrameRenderedListener$0(interfaceC4754d, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // p000.dda
    @c5e(23)
    public void setOutputSurface(Surface surface) {
        this.f61084a.setOutputSurface(surface);
    }

    @Override // p000.dda
    public void setParameters(Bundle bundle) {
        this.f61084a.setParameters(bundle);
    }

    @Override // p000.dda
    public void setVideoScalingMode(int i) {
        this.f61084a.setVideoScalingMode(i);
    }

    private mig(MediaCodec mediaCodec, @hib gp9 gp9Var) {
        this.f61084a = mediaCodec;
        this.f61085b = gp9Var;
        if (Build.VERSION.SDK_INT < 35 || gp9Var == null) {
            return;
        }
        gp9Var.addMediaCodec(mediaCodec);
    }

    @Override // p000.dda
    public void releaseOutputBuffer(int i, long j) {
        this.f61084a.releaseOutputBuffer(i, j);
    }
}
