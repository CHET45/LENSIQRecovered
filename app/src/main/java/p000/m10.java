package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
public final class m10 {

    /* JADX INFO: renamed from: m10$a */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC9075a {
        String value();
    }

    /* JADX INFO: renamed from: m10$b */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC9076b {
    }

    /* JADX INFO: renamed from: m10$c */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC9077c {
    }

    /* JADX INFO: renamed from: m10$d */
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC9078d {
    }

    /* JADX INFO: renamed from: m10$e */
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC9079e {
    }

    /* JADX INFO: renamed from: m10$f */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC9080f {
        String inVersion() default "";
    }

    private m10() {
        throw new AssertionError("ApiStatus should not be instantiated");
    }
}
