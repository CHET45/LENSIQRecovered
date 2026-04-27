package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface s6i {

    /* JADX INFO: renamed from: a */
    public static final int f80858a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f80859b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f80860c = 3;

    /* JADX INFO: renamed from: d */
    public static final long f80861d = -1;

    /* JADX INFO: renamed from: e */
    public static final long f80862e = -2;

    /* JADX INFO: renamed from: s6i$a */
    public interface InterfaceC12468a {
        s6i create(Context context, List<gx4> list, rk3 rk3Var, f92 f92Var, f92 f92Var2, boolean z, Executor executor, InterfaceC12470c interfaceC12470c) throws p6i;
    }

    /* JADX INFO: renamed from: s6i$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12469b {
    }

    /* JADX INFO: renamed from: s6i$c */
    public interface InterfaceC12470c {
        void onEnded();

        void onError(p6i p6iVar);

        void onOutputFrameAvailableForRendering(long j);

        void onOutputSizeChanged(int i, int i2);
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    void queueInputBitmap(Bitmap bitmap, long j, float f);

    void queueInputTexture(int i, long j);

    void registerInputFrame();

    void registerInputStream(int i);

    void release();

    void renderOutputFrame(long j);

    void setInputFrameInfo(dv6 dv6Var);

    void setOnInputFrameProcessedListener(b3c b3cVar);

    void setOutputSurfaceInfo(@hib mgg mggVar);

    void signalEndOfInput();
}
