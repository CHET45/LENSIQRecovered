package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface nle {

    /* JADX INFO: renamed from: S0 */
    public static final int f64911S0 = 1;

    /* JADX INFO: renamed from: T0 */
    public static final int f64912T0 = 2;

    /* JADX INFO: renamed from: U0 */
    public static final int f64913U0 = 4;

    /* JADX INFO: renamed from: nle$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9926a {
    }

    /* JADX INFO: renamed from: nle$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9927b {
    }

    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(nq6 nq6Var, sl3 sl3Var, int i);

    int skipData(long j);
}
