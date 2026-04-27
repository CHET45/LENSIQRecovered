package p000;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({})
@nmg(allowedTargets = {})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface fq6 {

    /* JADX INFO: renamed from: F */
    @yfb
    public static final C5928b f37412F = C5928b.f37418a;

    /* JADX INFO: renamed from: G */
    public static final int f37413G = 1;

    /* JADX INFO: renamed from: H */
    public static final int f37414H = 2;

    /* JADX INFO: renamed from: I */
    public static final int f37415I = 3;

    /* JADX INFO: renamed from: J */
    public static final int f37416J = 4;

    /* JADX INFO: renamed from: K */
    public static final int f37417K = 5;

    /* JADX INFO: renamed from: fq6$a */
    @i8e(EnumC11189pz.f72537b)
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC5927a {
    }

    /* JADX INFO: renamed from: fq6$b */
    public static final class C5928b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C5928b f37418a = new C5928b();

        /* JADX INFO: renamed from: b */
        public static final int f37419b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f37420c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f37421d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f37422e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f37423f = 5;

        private C5928b() {
        }
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @InterfaceC5927a
    int onDelete() default 1;

    @InterfaceC5927a
    int onUpdate() default 1;

    String[] parentColumns();
}
