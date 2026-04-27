package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE})
@q64(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @i2e(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@nmg(allowedTargets = {EnumC12373rz.f80140b})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface dg5 {

    /* JADX INFO: renamed from: dg5$a */
    public enum EnumC4781a {
        WARNING,
        ERROR
    }

    EnumC4781a level() default EnumC4781a.ERROR;
}
