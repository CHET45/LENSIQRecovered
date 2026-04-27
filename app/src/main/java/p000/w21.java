package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.ANNOTATION_TYPE})
public @interface w21 {
    String attribute();

    String method();

    Class type();
}
