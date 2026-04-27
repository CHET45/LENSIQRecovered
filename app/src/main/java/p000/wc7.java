package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@hv3(typeKinds = {rlh.BOOLEAN, rlh.BYTE, rlh.CHAR, rlh.DOUBLE, rlh.FLOAT, rlh.INT, rlh.LONG, rlh.SHORT}, types = {String.class, Void.class}, value = {pmh.EXCEPTION_PARAMETER, pmh.UPPER_BOUND})
@qxh(typeKinds = {rlh.BOOLEAN, rlh.BYTE, rlh.CHAR, rlh.DOUBLE, rlh.FLOAT, rlh.INT, rlh.LONG, rlh.SHORT}, types = {String.class})
@Retention(RetentionPolicy.RUNTIME)
@afg({zc7.class})
@Documented
@ry3
public @interface wc7 {
    @vi8
    String[] value() default {};
}
