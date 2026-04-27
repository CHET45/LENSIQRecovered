package p000;

/* JADX INFO: loaded from: classes5.dex */
public interface c6f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: c6f$a */
    public static final class EnumC2215a {

        /* JADX INFO: renamed from: a */
        public static final EnumC2215a f15860a = new EnumC2215a("CRASHLYTICS", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC2215a f15861b = new EnumC2215a("PERFORMANCE", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC2215a f15862c = new EnumC2215a("MATT_SAYS_HI", 2);

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumC2215a[] f15863d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ v35 f15864e;

        private static final /* synthetic */ EnumC2215a[] $values() {
            return new EnumC2215a[]{f15860a, f15861b, f15862c};
        }

        static {
            EnumC2215a[] enumC2215aArr$values = $values();
            f15863d = enumC2215aArr$values;
            f15864e = x35.enumEntries(enumC2215aArr$values);
        }

        private EnumC2215a(String str, int i) {
        }

        @yfb
        public static v35<EnumC2215a> getEntries() {
            return f15864e;
        }

        public static EnumC2215a valueOf(String str) {
            return (EnumC2215a) Enum.valueOf(EnumC2215a.class, str);
        }

        public static EnumC2215a[] values() {
            return (EnumC2215a[]) f15863d.clone();
        }
    }

    /* JADX INFO: renamed from: c6f$b */
    public static final class C2216b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f15865a;

        public C2216b(@yfb String str) {
            md8.checkNotNullParameter(str, "sessionId");
            this.f15865a = str;
        }

        public static /* synthetic */ C2216b copy$default(C2216b c2216b, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c2216b.f15865a;
            }
            return c2216b.copy(str);
        }

        @yfb
        public final String component1() {
            return this.f15865a;
        }

        @yfb
        public final C2216b copy(@yfb String str) {
            md8.checkNotNullParameter(str, "sessionId");
            return new C2216b(str);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2216b) && md8.areEqual(this.f15865a, ((C2216b) obj).f15865a);
        }

        @yfb
        public final String getSessionId() {
            return this.f15865a;
        }

        public int hashCode() {
            return this.f15865a.hashCode();
        }

        @yfb
        public String toString() {
            return "SessionDetails(sessionId=" + this.f15865a + ')';
        }
    }

    @yfb
    EnumC2215a getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(@yfb C2216b c2216b);
}
