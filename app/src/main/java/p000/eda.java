package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface eda {

    /* JADX INFO: renamed from: eda$a */
    public static final class C5265a {

        /* JADX INFO: renamed from: a */
        public final kda f32700a;

        /* JADX INFO: renamed from: b */
        public final MediaFormat f32701b;

        /* JADX INFO: renamed from: c */
        public final kq6 f32702c;

        /* JADX INFO: renamed from: d */
        @hib
        public final Surface f32703d;

        /* JADX INFO: renamed from: e */
        @hib
        public final MediaCrypto f32704e;

        /* JADX INFO: renamed from: f */
        public final int f32705f;

        private C5265a(kda kdaVar, MediaFormat mediaFormat, kq6 kq6Var, @hib Surface surface, @hib MediaCrypto mediaCrypto, int i) {
            this.f32700a = kdaVar;
            this.f32701b = mediaFormat;
            this.f32702c = kq6Var;
            this.f32703d = surface;
            this.f32704e = mediaCrypto;
            this.f32705f = i;
        }

        public static C5265a createForAudioDecoding(kda kdaVar, MediaFormat mediaFormat, kq6 kq6Var, @hib MediaCrypto mediaCrypto) {
            return new C5265a(kdaVar, mediaFormat, kq6Var, null, mediaCrypto, 0);
        }

        public static C5265a createForVideoDecoding(kda kdaVar, MediaFormat mediaFormat, kq6 kq6Var, @hib Surface surface, @hib MediaCrypto mediaCrypto) {
            return new C5265a(kdaVar, mediaFormat, kq6Var, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: renamed from: eda$b */
    public interface InterfaceC5266b {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC5266b f32706a = new tw3();

        eda createAdapter(C5265a c5265a) throws IOException;
    }

    /* JADX INFO: renamed from: eda$c */
    public interface InterfaceC5267c {
        void onFrameRendered(eda edaVar, long j, long j2);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void flush();

    @hib
    ByteBuffer getInputBuffer(int i);

    @c5e(26)
    PersistableBundle getMetrics();

    @hib
    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void queueSecureInputBuffer(int i, int i2, g93 g93Var, long j, int i3);

    void release();

    @c5e(21)
    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    @c5e(23)
    void setOnFrameRenderedListener(InterfaceC5267c interfaceC5267c, Handler handler);

    @c5e(23)
    void setOutputSurface(Surface surface);

    @c5e(19)
    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);
}
