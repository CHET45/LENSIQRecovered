package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface oog {

    /* JADX INFO: renamed from: oog$a */
    public static class C10486a extends Throwable {
        private static final long serialVersionUID = 1;

        private C10486a() {
        }
    }

    Class<? extends Throwable> expected() default C10486a.class;

    long timeout() default 0;
}
