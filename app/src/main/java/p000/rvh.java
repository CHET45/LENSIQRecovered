package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class rvh extends Exception {

    /* JADX INFO: renamed from: b */
    public static final int f79903b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f79904c = 2;

    /* JADX INFO: renamed from: a */
    public final int f79905a;

    /* JADX INFO: renamed from: rvh$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12322a {
    }

    public rvh(int i) {
        this.f79905a = i;
    }

    public rvh(int i, Exception exc) {
        super(exc);
        this.f79905a = i;
    }
}
