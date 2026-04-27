package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.l0d;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface n1e extends l0d.InterfaceC8571b {

    /* JADX INFO: renamed from: g0 */
    public static final int f62997g0 = 1;

    /* JADX INFO: renamed from: h0 */
    public static final int f62998h0 = 2;

    /* JADX INFO: renamed from: i0 */
    public static final int f62999i0 = 3;

    /* JADX INFO: renamed from: j0 */
    public static final int f63000j0 = 4;

    /* JADX INFO: renamed from: k0 */
    public static final int f63001k0 = 5;

    /* JADX INFO: renamed from: l0 */
    public static final int f63002l0 = 6;

    /* JADX INFO: renamed from: m0 */
    public static final int f63003m0 = 7;

    /* JADX INFO: renamed from: n0 */
    public static final int f63004n0 = 8;

    /* JADX INFO: renamed from: o0 */
    public static final int f63005o0 = 9;

    /* JADX INFO: renamed from: p0 */
    public static final int f63006p0 = 10;

    /* JADX INFO: renamed from: q0 */
    public static final int f63007q0 = 11;

    /* JADX INFO: renamed from: r0 */
    public static final int f63008r0 = 12;

    /* JADX INFO: renamed from: s0 */
    public static final int f63009s0 = 13;

    /* JADX INFO: renamed from: t0 */
    public static final int f63010t0 = 14;

    /* JADX INFO: renamed from: u0 */
    public static final int f63011u0 = 10000;

    /* JADX INFO: renamed from: v0 */
    public static final int f63012v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public static final int f63013w0 = 1;

    /* JADX INFO: renamed from: x0 */
    public static final int f63014x0 = 2;

    /* JADX INFO: renamed from: n1e$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9651a {
    }

    /* JADX INFO: renamed from: n1e$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9652b {
    }

    /* JADX INFO: renamed from: n1e$c */
    public interface InterfaceC9653c {
        void onSleep();

        void onWakeup();
    }

    void disable();

    void enable(r1e r1eVar, kq6[] kq6VarArr, nle nleVar, long j, boolean z, boolean z2, long j2, long j3) throws ba5;

    p1e getCapabilities();

    @hib
    bda getMediaClock();

    String getName();

    long getReadingPositionUs();

    int getState();

    @hib
    nle getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int i, k0d k0dVar);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    default void release() {
    }

    void render(long j, long j2) throws ba5;

    void replaceStream(kq6[] kq6VarArr, nle nleVar, long j, long j2) throws ba5;

    void reset();

    void resetPosition(long j) throws ba5;

    void setCurrentStreamFinal();

    default void setPlaybackSpeed(float f, float f2) throws ba5 {
    }

    void start() throws ba5;

    void stop();
}
