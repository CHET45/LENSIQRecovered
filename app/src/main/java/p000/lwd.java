package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes7.dex */
@rig("RegEx")
@dmh
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface lwd {

    /* JADX INFO: renamed from: lwd$a */
    public static class C9013a implements emh<lwd> {
        @Override // p000.emh
        public oki forConstantValue(lwd lwdVar, Object obj) {
            if (!(obj instanceof String)) {
                return oki.NEVER;
            }
            try {
                Pattern.compile((String) obj);
                return oki.ALWAYS;
            } catch (PatternSyntaxException unused) {
                return oki.NEVER;
            }
        }
    }

    oki when() default oki.ALWAYS;
}
