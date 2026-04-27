package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@j4b
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@nmg(allowedTargets = {EnumC12373rz.f80140b, EnumC12373rz.f80139a, EnumC12373rz.f80130F, EnumC12373rz.f80131H, EnumC12373rz.f80132L, EnumC12373rz.f80129C, EnumC12373rz.f80143e, EnumC12373rz.f80135Q})
@i8e(EnumC11189pz.f72537b)
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface p7e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: p7e$a */
    public static final class EnumC10826a {

        /* JADX INFO: renamed from: C */
        public static final /* synthetic */ v35 f69933C;

        /* JADX INFO: renamed from: a */
        public static final EnumC10826a f69934a = new EnumC10826a("LIBRARY", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC10826a f69935b = new EnumC10826a("LIBRARY_GROUP", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC10826a f69936c = new EnumC10826a("LIBRARY_GROUP_PREFIX", 2);

        /* JADX INFO: renamed from: d */
        @q64(message = "Use LIBRARY_GROUP_PREFIX instead.")
        public static final EnumC10826a f69937d = new EnumC10826a("GROUP_ID", 3);

        /* JADX INFO: renamed from: e */
        public static final EnumC10826a f69938e = new EnumC10826a("TESTS", 4);

        /* JADX INFO: renamed from: f */
        public static final EnumC10826a f69939f = new EnumC10826a("SUBCLASSES", 5);

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ EnumC10826a[] f69940m;

        private static final /* synthetic */ EnumC10826a[] $values() {
            return new EnumC10826a[]{f69934a, f69935b, f69936c, f69937d, f69938e, f69939f};
        }

        static {
            EnumC10826a[] enumC10826aArr$values = $values();
            f69940m = enumC10826aArr$values;
            f69933C = x35.enumEntries(enumC10826aArr$values);
        }

        private EnumC10826a(String str, int i) {
        }

        @yfb
        public static v35<EnumC10826a> getEntries() {
            return f69933C;
        }

        public static EnumC10826a valueOf(String str) {
            return (EnumC10826a) Enum.valueOf(EnumC10826a.class, str);
        }

        public static EnumC10826a[] values() {
            return (EnumC10826a[]) f69940m.clone();
        }
    }

    EnumC10826a[] value();
}
