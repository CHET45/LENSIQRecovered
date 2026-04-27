package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface g77 {

    /* JADX INFO: renamed from: L */
    public static final int f38947L = 0;

    /* JADX INFO: renamed from: M */
    public static final int f38948M = 1;

    /* JADX INFO: renamed from: N */
    public static final int f38949N = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
