package p000;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface mle {

    /* JADX INFO: renamed from: V0 */
    public static final int f61431V0 = 1;

    /* JADX INFO: renamed from: W0 */
    public static final int f61432W0 = 2;

    /* JADX INFO: renamed from: X0 */
    public static final int f61433X0 = 4;

    /* JADX INFO: renamed from: mle$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9405a {
    }

    /* JADX INFO: renamed from: mle$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9406b {
    }

    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(oq6 oq6Var, rl3 rl3Var, int i);

    int skipData(long j);
}
