package p000;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface dda {

    /* JADX INFO: renamed from: dda$a */
    public static final class C4751a {

        /* JADX INFO: renamed from: a */
        public final lda f29420a;

        /* JADX INFO: renamed from: b */
        public final MediaFormat f29421b;

        /* JADX INFO: renamed from: c */
        public final C1213a f29422c;

        /* JADX INFO: renamed from: d */
        @hib
        public final Surface f29423d;

        /* JADX INFO: renamed from: e */
        @hib
        public final MediaCrypto f29424e;

        /* JADX INFO: renamed from: f */
        @hib
        public final gp9 f29425f;

        private C4751a(lda ldaVar, MediaFormat mediaFormat, C1213a c1213a, @hib Surface surface, @hib MediaCrypto mediaCrypto, @hib gp9 gp9Var) {
            this.f29420a = ldaVar;
            this.f29421b = mediaFormat;
            this.f29422c = c1213a;
            this.f29423d = surface;
            this.f29424e = mediaCrypto;
            this.f29425f = gp9Var;
        }

        public static C4751a createForAudioDecoding(lda ldaVar, MediaFormat mediaFormat, C1213a c1213a, @hib MediaCrypto mediaCrypto, @hib gp9 gp9Var) {
            return new C4751a(ldaVar, mediaFormat, c1213a, null, mediaCrypto, gp9Var);
        }

        public static C4751a createForVideoDecoding(lda ldaVar, MediaFormat mediaFormat, C1213a c1213a, @hib Surface surface, @hib MediaCrypto mediaCrypto) {
            return new C4751a(ldaVar, mediaFormat, c1213a, surface, mediaCrypto, null);
        }
    }

    /* JADX INFO: renamed from: dda$b */
    public interface InterfaceC4752b {

        /* JADX INFO: renamed from: a */
        @Deprecated
        public static final InterfaceC4752b f29426a = new uw3();

        static InterfaceC4752b getDefault(Context context) {
            return new uw3(context);
        }

        dda createAdapter(C4751a c4751a) throws IOException;
    }

    /* JADX INFO: renamed from: dda$c */
    public interface InterfaceC4753c {
        default void onInputBufferAvailable() {
        }

        default void onOutputBufferAvailable() {
        }
    }

    /* JADX INFO: renamed from: dda$d */
    public interface InterfaceC4754d {
        void onFrameRendered(dda ddaVar, long j, long j2);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    @c5e(35)
    void detachOutputSurface();

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

    void queueSecureInputBuffer(int i, int i2, f93 f93Var, long j, int i3);

    default boolean registerOnBufferAvailableListener(InterfaceC4753c interfaceC4753c) {
        return false;
    }

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    @c5e(23)
    void setOnFrameRenderedListener(InterfaceC4754d interfaceC4754d, Handler handler);

    @c5e(23)
    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);
}
