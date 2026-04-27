package p000;

/* JADX INFO: loaded from: classes7.dex */
public interface gp8 extends mo8 {

    /* JADX INFO: renamed from: gp8$a */
    public static final class C6454a {
        @jjf(version = "1.1")
        public static /* synthetic */ void isVararg$annotations() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gp8$b */
    public static final class EnumC6455b {

        /* JADX INFO: renamed from: a */
        public static final EnumC6455b f40700a = new EnumC6455b("INSTANCE", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC6455b f40701b = new EnumC6455b("EXTENSION_RECEIVER", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC6455b f40702c = new EnumC6455b("VALUE", 2);

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC6455b[] f40703d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ v35 f40704e;

        private static final /* synthetic */ EnumC6455b[] $values() {
            return new EnumC6455b[]{f40700a, f40701b, f40702c};
        }

        static {
            EnumC6455b[] enumC6455bArr$values = $values();
            f40703d = enumC6455bArr$values;
            f40704e = x35.enumEntries(enumC6455bArr$values);
        }

        private EnumC6455b(String str, int i) {
        }

        @yfb
        public static v35<EnumC6455b> getEntries() {
            return f40704e;
        }

        public static EnumC6455b valueOf(String str) {
            return (EnumC6455b) Enum.valueOf(EnumC6455b.class, str);
        }

        public static EnumC6455b[] values() {
            return (EnumC6455b[]) f40703d.clone();
        }
    }

    int getIndex();

    @yfb
    EnumC6455b getKind();

    @gib
    String getName();

    @yfb
    mp8 getType();

    boolean isOptional();

    boolean isVararg();
}
