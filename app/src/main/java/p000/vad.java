package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@a2e
@nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80130F})
@i8e(EnumC11189pz.f72537b)
@Documented
@Repeatable(InterfaceC13967a.class)
public @interface vad {

    /* JADX INFO: renamed from: vad$a */
    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80130F})
    @b2e
    @i8e(EnumC11189pz.f72537b)
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC13967a {
        vad[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int wallpaper() default -1;

    int widthDp() default -1;
}
