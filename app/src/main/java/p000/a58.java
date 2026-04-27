package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@q64(message = "Replaced by the androidx.resourceinpsection package.")
@nmg(allowedTargets = {EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L})
@i8e(EnumC11189pz.f72536a)
@Retention(RetentionPolicy.SOURCE)
public @interface a58 {

    /* JADX INFO: renamed from: a58$a */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80139a})
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0064a {
        String name();

        int value();
    }

    /* JADX INFO: renamed from: a58$b */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80139a})
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0065b {
        int mask() default 0;

        String name();

        int target();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a58$c */
    public static final class EnumC0066c {

        /* JADX INFO: renamed from: C */
        public static final /* synthetic */ EnumC0066c[] f426C;

        /* JADX INFO: renamed from: F */
        public static final /* synthetic */ v35 f427F;

        /* JADX INFO: renamed from: a */
        public static final EnumC0066c f428a = new EnumC0066c("NONE", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC0066c f429b = new EnumC0066c("INFERRED", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC0066c f430c = new EnumC0066c("INT_ENUM", 2);

        /* JADX INFO: renamed from: d */
        public static final EnumC0066c f431d = new EnumC0066c("INT_FLAG", 3);

        /* JADX INFO: renamed from: e */
        public static final EnumC0066c f432e = new EnumC0066c("COLOR", 4);

        /* JADX INFO: renamed from: f */
        public static final EnumC0066c f433f = new EnumC0066c("GRAVITY", 5);

        /* JADX INFO: renamed from: m */
        public static final EnumC0066c f434m = new EnumC0066c("RESOURCE_ID", 6);

        private static final /* synthetic */ EnumC0066c[] $values() {
            return new EnumC0066c[]{f428a, f429b, f430c, f431d, f432e, f433f, f434m};
        }

        static {
            EnumC0066c[] enumC0066cArr$values = $values();
            f426C = enumC0066cArr$values;
            f427F = x35.enumEntries(enumC0066cArr$values);
        }

        private EnumC0066c(String str, int i) {
        }

        @yfb
        public static v35<EnumC0066c> getEntries() {
            return f427F;
        }

        public static EnumC0066c valueOf(String str) {
            return (EnumC0066c) Enum.valueOf(EnumC0066c.class, str);
        }

        public static EnumC0066c[] values() {
            return (EnumC0066c[]) f426C.clone();
        }
    }

    int attributeId() default 0;

    InterfaceC0064a[] enumMapping() default {};

    InterfaceC0065b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    EnumC0066c valueType() default EnumC0066c.f429b;
}
