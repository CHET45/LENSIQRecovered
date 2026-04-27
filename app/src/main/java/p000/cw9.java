package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@bmh(applicableTo = String.class)
public @interface cw9 {

    /* JADX INFO: renamed from: cw9$a */
    public static class C4542a implements emh<cw9> {
        @Override // p000.emh
        public oki forConstantValue(cw9 cw9Var, Object obj) {
            return Pattern.compile(cw9Var.value(), cw9Var.flags()).matcher((String) obj).matches() ? oki.ALWAYS : oki.NEVER;
        }
    }

    int flags() default 0;

    @lwd
    String value();
}
