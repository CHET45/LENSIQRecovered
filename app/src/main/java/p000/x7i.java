package p000;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.C1213a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface x7i {

    /* JADX INFO: renamed from: a */
    public static final int f97117a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f97118b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f97119c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f97120d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f97121e = 2;

    /* JADX INFO: renamed from: x7i$a */
    @Target({ElementType.TYPE_USE})
    @ovh
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC14972a {
    }

    /* JADX INFO: renamed from: x7i$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC14973b {
    }

    /* JADX INFO: renamed from: x7i$c */
    public interface InterfaceC14974c {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC14974c f97122a = new a();

        /* JADX INFO: renamed from: x7i$c$a */
        public class a implements InterfaceC14974c {
        }

        default void onError(C14976e c14976e) {
        }

        default void onFirstFrameRendered() {
        }

        default void onFrameAvailableForRendering() {
        }

        default void onFrameDropped() {
        }

        default void onVideoSizeChanged(a8i a8iVar) {
        }
    }

    /* JADX INFO: renamed from: x7i$d */
    public interface InterfaceC14975d {
        void render(long j);

        void skip();
    }

    /* JADX INFO: renamed from: x7i$e */
    public static final class C14976e extends Exception {

        /* JADX INFO: renamed from: a */
        public final C1213a f97123a;

        public C14976e(Throwable th, C1213a c1213a) {
            super(th);
            this.f97123a = c1213a;
        }
    }

    void allowReleaseFirstFrameBeforeStarted();

    void clearOutputSurfaceInfo();

    void flush(boolean z);

    Surface getInputSurface();

    boolean handleInputBitmap(Bitmap bitmap, j2h j2hVar);

    boolean handleInputFrame(long j, InterfaceC14975d interfaceC14975d);

    boolean initialize(C1213a c1213a) throws C14976e;

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z);

    void join(boolean z);

    void onInputStreamChanged(int i, C1213a c1213a, long j, int i2, List<ix4> list);

    void redraw();

    void release();

    void render(long j, long j2) throws C14976e;

    void setBufferTimestampAdjustmentUs(long j);

    void setChangeFrameRateStrategy(int i);

    void setListener(InterfaceC14974c interfaceC14974c, Executor executor);

    void setOutputSurfaceInfo(Surface surface, xpf xpfVar);

    void setPlaybackSpeed(@y46(from = 0.0d, fromInclusive = false) float f);

    void setVideoEffects(List<ix4> list);

    void setVideoFrameMetadataListener(o6i o6iVar);

    void signalEndOfCurrentInputStream();

    void signalEndOfInput();

    void startRendering();

    void stopRendering();
}
