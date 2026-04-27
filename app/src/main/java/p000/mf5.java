package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mf5 extends RuntimeException {

    /* JADX INFO: renamed from: b */
    public static final int f60879b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f60880c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f60881d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f60882e = 3;

    /* JADX INFO: renamed from: a */
    public final int f60883a;

    /* JADX INFO: renamed from: mf5$a */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9344a {
    }

    public mf5(int i) {
        super(getErrorMessage(i));
        this.f60883a = i;
    }

    private static String getErrorMessage(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
