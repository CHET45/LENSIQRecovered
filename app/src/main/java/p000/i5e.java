package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.ANNOTATION_TYPE})
@jjf(version = "1.3")
@nmg(allowedTargets = {EnumC12373rz.f80140b})
@i8e(EnumC11189pz.f72537b)
@Retention(RetentionPolicy.CLASS)
public @interface i5e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: i5e$a */
    public static final class EnumC7153a {

        /* JADX INFO: renamed from: a */
        public static final EnumC7153a f45800a = new EnumC7153a("WARNING", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC7153a f45801b = new EnumC7153a("ERROR", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC7153a[] f45802c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ v35 f45803d;

        private static final /* synthetic */ EnumC7153a[] $values() {
            return new EnumC7153a[]{f45800a, f45801b};
        }

        static {
            EnumC7153a[] enumC7153aArr$values = $values();
            f45802c = enumC7153aArr$values;
            f45803d = x35.enumEntries(enumC7153aArr$values);
        }

        private EnumC7153a(String str, int i) {
        }

        @yfb
        public static v35<EnumC7153a> getEntries() {
            return f45803d;
        }

        public static EnumC7153a valueOf(String str) {
            return (EnumC7153a) Enum.valueOf(EnumC7153a.class, str);
        }

        public static EnumC7153a[] values() {
            return (EnumC7153a[]) f45802c.clone();
        }
    }

    EnumC7153a level() default EnumC7153a.f45801b;

    String message() default "";
}
