package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
public final class k90 {

    /* JADX INFO: renamed from: k90$a */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC8240a {
    }

    /* JADX INFO: renamed from: k90$b */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC8241b {
    }

    private k90() {
        throw new AssertionError("Async should not be instantiated");
    }
}
