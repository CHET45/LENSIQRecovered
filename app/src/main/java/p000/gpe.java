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
public @interface gpe {

    /* JADX INFO: renamed from: Z */
    public static final String f40716Z = "none";

    /* JADX INFO: renamed from: a0 */
    public static final String f40717a0 = "custom";

    /* JADX INFO: renamed from: b0 */
    public static final String f40718b0 = "io.reactivex:computation";

    /* JADX INFO: renamed from: c0 */
    public static final String f40719c0 = "io.reactivex:io";

    /* JADX INFO: renamed from: d0 */
    public static final String f40720d0 = "io.reactivex:new-thread";

    /* JADX INFO: renamed from: e0 */
    public static final String f40721e0 = "io.reactivex:trampoline";

    /* JADX INFO: renamed from: f0 */
    public static final String f40722f0 = "io.reactivex:single";

    String value();
}
