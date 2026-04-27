package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80140b})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface h5e {

    /* JADX INFO: renamed from: h5e$a */
    public enum EnumC6714a {
        WARNING,
        ERROR
    }

    EnumC6714a level() default EnumC6714a.ERROR;
}
