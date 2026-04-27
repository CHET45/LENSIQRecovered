package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface p1e {

    /* JADX INFO: renamed from: A0 */
    @Deprecated
    public static final int f69432A0 = 3;

    /* JADX INFO: renamed from: B0 */
    @Deprecated
    public static final int f69433B0 = 2;

    /* JADX INFO: renamed from: C0 */
    @Deprecated
    public static final int f69434C0 = 1;

    /* JADX INFO: renamed from: D0 */
    @Deprecated
    public static final int f69435D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public static final int f69436E0 = 24;

    /* JADX INFO: renamed from: F0 */
    public static final int f69437F0 = 16;

    /* JADX INFO: renamed from: G0 */
    public static final int f69438G0 = 8;

    /* JADX INFO: renamed from: H0 */
    public static final int f69439H0 = 0;

    /* JADX INFO: renamed from: I0 */
    public static final int f69440I0 = 32;

    /* JADX INFO: renamed from: J0 */
    public static final int f69441J0 = 32;

    /* JADX INFO: renamed from: K0 */
    public static final int f69442K0 = 0;

    /* JADX INFO: renamed from: L0 */
    public static final int f69443L0 = 64;

    /* JADX INFO: renamed from: M0 */
    public static final int f69444M0 = 64;

    /* JADX INFO: renamed from: N0 */
    public static final int f69445N0 = 0;

    /* JADX INFO: renamed from: O0 */
    public static final int f69446O0 = 384;

    /* JADX INFO: renamed from: P0 */
    public static final int f69447P0 = 256;

    /* JADX INFO: renamed from: Q0 */
    public static final int f69448Q0 = 128;

    /* JADX INFO: renamed from: R0 */
    public static final int f69449R0 = 0;

    /* JADX INFO: renamed from: y0 */
    public static final int f69450y0 = 7;

    /* JADX INFO: renamed from: z0 */
    @Deprecated
    public static final int f69451z0 = 4;

    /* JADX INFO: renamed from: p1e$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10753a {
    }

    /* JADX INFO: renamed from: p1e$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10754b {
    }

    /* JADX INFO: renamed from: p1e$c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10755c {
    }

    /* JADX INFO: renamed from: p1e$d */
    @Target({ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10756d {
    }

    /* JADX INFO: renamed from: p1e$e */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10757e {
    }

    /* JADX INFO: renamed from: p1e$f */
    public interface InterfaceC10758f {
        void onRendererCapabilitiesChanged(n1e n1eVar);
    }

    /* JADX INFO: renamed from: p1e$g */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10759g {
    }

    static int create(int i) {
        return create(i, 0, 0);
    }

    @igg({"WrongConstant"})
    static int getAdaptiveSupport(int i) {
        return i & 24;
    }

    @igg({"WrongConstant"})
    static int getDecoderSupport(int i) {
        return i & 384;
    }

    @igg({"WrongConstant"})
    static int getFormatSupport(int i) {
        return i & 7;
    }

    @igg({"WrongConstant"})
    static int getHardwareAccelerationSupport(int i) {
        return i & 64;
    }

    @igg({"WrongConstant"})
    static int getTunnelingSupport(int i) {
        return i & 32;
    }

    default void clearListener() {
    }

    String getName();

    int getTrackType();

    default void setListener(InterfaceC10758f interfaceC10758f) {
    }

    int supportsFormat(kq6 kq6Var) throws ba5;

    int supportsMixedMimeTypeAdaptation() throws ba5;

    static int create(int i, int i2, int i3) {
        return create(i, i2, i3, 0, 128);
    }

    @igg({"WrongConstant"})
    static int create(int i, int i2, int i3, int i4, int i5) {
        return i | i2 | i3 | i4 | i5;
    }
}
