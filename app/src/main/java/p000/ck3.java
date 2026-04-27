package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@jjf(version = "1.3")
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@Retention(RetentionPolicy.RUNTIME)
public @interface ck3 {
    @xn8(name = "c")
    /* JADX INFO: renamed from: c */
    String m4009c() default "";

    @xn8(name = "f")
    /* JADX INFO: renamed from: f */
    String m4010f() default "";

    @xn8(name = "i")
    /* JADX INFO: renamed from: i */
    int[] m4011i() default {};

    @xn8(name = "l")
    /* JADX INFO: renamed from: l */
    int[] m4012l() default {};

    @xn8(name = "m")
    /* JADX INFO: renamed from: m */
    String m4013m() default "";

    @xn8(name = "n")
    /* JADX INFO: renamed from: n */
    String[] m4014n() default {};

    @xn8(name = "s")
    /* JADX INFO: renamed from: s */
    String[] m4015s() default {};

    @xn8(name = "v")
    /* JADX INFO: renamed from: v */
    int m4016v() default 1;
}
