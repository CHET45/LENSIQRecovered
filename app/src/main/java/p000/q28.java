package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
public @interface q28 {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
