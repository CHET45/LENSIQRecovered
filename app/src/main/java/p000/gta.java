package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.TYPE})
@jjf(version = "1.3")
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@i8e(EnumC11189pz.f72538c)
@Retention(RetentionPolicy.RUNTIME)
public @interface gta {

    /* JADX INFO: renamed from: gta$a */
    public static final class C6531a {
        @q64(level = u64.f86865a, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void bv$annotations() {
        }

        @jjf(version = "1.2")
        public static /* synthetic */ void pn$annotations() {
        }

        @jjf(version = "1.1")
        public static /* synthetic */ void xi$annotations() {
        }
    }

    @xn8(name = "bv")
    /* JADX INFO: renamed from: bv */
    int[] m11958bv() default {1, 0, 3};

    @xn8(name = "d1")
    /* JADX INFO: renamed from: d1 */
    String[] m11959d1() default {};

    @xn8(name = "d2")
    /* JADX INFO: renamed from: d2 */
    String[] m11960d2() default {};

    @xn8(name = "k")
    /* JADX INFO: renamed from: k */
    int m11961k() default 1;

    @xn8(name = "mv")
    /* JADX INFO: renamed from: mv */
    int[] m11962mv() default {};

    @xn8(name = "pn")
    /* JADX INFO: renamed from: pn */
    String m11963pn() default "";

    @xn8(name = "xi")
    /* JADX INFO: renamed from: xi */
    int m11964xi() default 0;

    @xn8(name = "xs")
    /* JADX INFO: renamed from: xs */
    String m11965xs() default "";
}
