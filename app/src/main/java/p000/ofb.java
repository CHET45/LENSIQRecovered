package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@bmh
public @interface ofb {

    /* JADX INFO: renamed from: ofb$a */
    public static class C10358a implements emh<ofb> {
        @Override // p000.emh
        public oki forConstantValue(ofb ofbVar, Object obj) {
            return obj == null ? oki.NEVER : oki.ALWAYS;
        }
    }

    oki when() default oki.ALWAYS;
}
