package p000;

import android.content.Context;
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
public interface r6i {

    /* JADX INFO: renamed from: a */
    public static final int f77151a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f77152b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f77153c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f77154d = 4;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final long f77155e = -1;

    /* JADX INFO: renamed from: f */
    public static final long f77156f = -2;

    /* JADX INFO: renamed from: g */
    public static final long f77157g = -3;

    /* JADX INFO: renamed from: h */
    public static final kx7<ix4> f77158h = kx7.m15111of(new C11908a());

    /* JADX INFO: renamed from: r6i$a */
    public class C11908a implements ix4 {
    }

    /* JADX INFO: renamed from: r6i$b */
    public interface InterfaceC11909b {
        r6i create(Context context, sk3 sk3Var, e92 e92Var, boolean z, Executor executor, InterfaceC11911d interfaceC11911d) throws q6i;
    }

    /* JADX INFO: renamed from: r6i$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC11910c {
    }

    /* JADX INFO: renamed from: r6i$d */
    public interface InterfaceC11911d {
        default void onEnded() {
        }

        default void onError(q6i q6iVar) {
        }

        default void onInputStreamRegistered(int i, C1213a c1213a, List<ix4> list) {
        }

        default void onOutputFrameAvailableForRendering(long j, boolean z) {
        }

        default void onOutputFrameRateChanged(float f) {
        }

        default void onOutputSizeChanged(int i, int i2) {
        }
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean queueInputBitmap(Bitmap bitmap, j2h j2hVar);

    boolean queueInputTexture(int i, long j);

    void redraw();

    boolean registerInputFrame();

    void registerInputStream(int i, C1213a c1213a, List<ix4> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setOnInputFrameProcessedListener(c3c c3cVar);

    void setOnInputSurfaceReadyListener(Runnable runnable);

    void setOutputSurfaceInfo(@hib ngg nggVar);

    void signalEndOfInput();
}
