package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@j4b
@Target({})
@ph5
@nmg(allowedTargets = {EnumC12373rz.f80142d})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface d15 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: d15$a */
    @ph5
    public static final class EnumC4580a {

        /* JADX INFO: renamed from: a */
        public static final EnumC4580a f28211a = new EnumC4580a("ALWAYS", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC4580a f28212b = new EnumC4580a("NEVER", 1);

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumC4580a[] f28213c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ v35 f28214d;

        private static final /* synthetic */ EnumC4580a[] $values() {
            return new EnumC4580a[]{f28211a, f28212b};
        }

        static {
            EnumC4580a[] enumC4580aArr$values = $values();
            f28213c = enumC4580aArr$values;
            f28214d = x35.enumEntries(enumC4580aArr$values);
        }

        private EnumC4580a(String str, int i) {
        }

        @yfb
        public static v35<EnumC4580a> getEntries() {
            return f28214d;
        }

        public static EnumC4580a valueOf(String str) {
            return (EnumC4580a) Enum.valueOf(EnumC4580a.class, str);
        }

        public static EnumC4580a[] values() {
            return (EnumC4580a[]) f28213c.clone();
        }
    }

    EnumC4580a mode() default EnumC4580a.f28211a;
}
