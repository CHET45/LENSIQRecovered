package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@nmg(allowedTargets = {EnumC12373rz.f80143e, EnumC12373rz.f80130F})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface ab2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C0140b f893a = C0140b.f907a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f894b = "[field-name]";

    /* JADX INFO: renamed from: c */
    public static final int f895c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f896d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f897e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f898f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f899g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f900h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f901i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f902j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f903k = 4;

    /* JADX INFO: renamed from: l */
    @c5e(21)
    public static final int f904l = 5;

    /* JADX INFO: renamed from: m */
    @c5e(21)
    public static final int f905m = 6;

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f906n = "[value-unspecified]";

    /* JADX INFO: renamed from: ab2$a */
    @c5e(21)
    @i8e(EnumC11189pz.f72537b)
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC0139a {
    }

    /* JADX INFO: renamed from: ab2$b */
    public static final class C0140b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C0140b f907a = new C0140b();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f908b = "[field-name]";

        /* JADX INFO: renamed from: c */
        public static final int f909c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f910d = 2;

        /* JADX INFO: renamed from: e */
        public static final int f911e = 3;

        /* JADX INFO: renamed from: f */
        public static final int f912f = 4;

        /* JADX INFO: renamed from: g */
        public static final int f913g = 5;

        /* JADX INFO: renamed from: h */
        public static final int f914h = 1;

        /* JADX INFO: renamed from: i */
        public static final int f915i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f916j = 3;

        /* JADX INFO: renamed from: k */
        public static final int f917k = 4;

        /* JADX INFO: renamed from: l */
        @c5e(21)
        public static final int f918l = 5;

        /* JADX INFO: renamed from: m */
        @c5e(21)
        public static final int f919m = 6;

        /* JADX INFO: renamed from: n */
        @yfb
        public static final String f920n = "[value-unspecified]";

        private C0140b() {
        }
    }

    /* JADX INFO: renamed from: ab2$c */
    @i8e(EnumC11189pz.f72537b)
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC0141c {
    }

    @InterfaceC0139a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @InterfaceC0141c
    int typeAffinity() default 1;
}
