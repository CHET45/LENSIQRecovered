package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class svh extends Exception {

    /* JADX INFO: renamed from: b */
    public static final int f83111b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f83112c = 2;

    /* JADX INFO: renamed from: a */
    public final int f83113a;

    /* JADX INFO: renamed from: svh$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12809a {
    }

    public svh(int i) {
        this.f83113a = i;
    }

    public svh(int i, Exception exc) {
        super(exc);
        this.f83113a = i;
    }
}
