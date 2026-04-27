package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
public final class uj3 {

    /* JADX INFO: renamed from: uj3$a */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC13550a {
        @afb
        @au8(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        String childrenArray() default "";

        @afb
        @au8(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        String hasChildren() default "";

        @afb
        @au8(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        String text() default "";
    }

    private uj3() {
        throw new AssertionError("Debug should not be instantiated");
    }
}
