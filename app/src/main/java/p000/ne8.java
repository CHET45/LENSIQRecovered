package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.ANNOTATION_TYPE})
public @interface ne8 {
    String attribute();

    String event() default "";

    String method() default "";

    Class type();
}
