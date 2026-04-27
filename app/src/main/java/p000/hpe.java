package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface hpe {

    /* JADX INFO: renamed from: g0 */
    public static final String f44445g0 = "none";

    /* JADX INFO: renamed from: h0 */
    public static final String f44446h0 = "custom";

    /* JADX INFO: renamed from: i0 */
    public static final String f44447i0 = "io.reactivex:computation";

    /* JADX INFO: renamed from: j0 */
    public static final String f44448j0 = "io.reactivex:io";

    /* JADX INFO: renamed from: k0 */
    public static final String f44449k0 = "io.reactivex:new-thread";

    /* JADX INFO: renamed from: l0 */
    public static final String f44450l0 = "io.reactivex:trampoline";

    /* JADX INFO: renamed from: m0 */
    public static final String f44451m0 = "io.reactivex:single";

    String value();
}
