package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.xx6;

/* JADX INFO: loaded from: classes3.dex */
@c5e(16)
@Target({ElementType.TYPE})
@nmg(allowedTargets = {EnumC12373rz.f80139a})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface wx6 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    xx6.EnumC15341a matchInfo() default xx6.EnumC15341a.FTS4;

    String[] notIndexed() default {};

    xx6.EnumC15342b order() default xx6.EnumC15342b.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
