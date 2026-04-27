package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@bmh(applicableTo = Number.class)
public @interface nfb {

    /* JADX INFO: renamed from: nfb$a */
    public static class C9860a implements emh<nfb> {
        @Override // p000.emh
        public oki forConstantValue(nfb nfbVar, Object obj) {
            if (!(obj instanceof Number)) {
                return oki.NEVER;
            }
            Number number = (Number) obj;
            return (!(number instanceof Long) ? !(!(number instanceof Double) ? !(!(number instanceof Float) ? number.intValue() < 0 : number.floatValue() < 0.0f) : number.doubleValue() < 0.0d) : number.longValue() < 0) ? oki.ALWAYS : oki.NEVER;
        }
    }

    oki when() default oki.ALWAYS;
}
