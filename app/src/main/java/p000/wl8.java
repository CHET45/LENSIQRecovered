package p000;

/* JADX INFO: loaded from: classes7.dex */
@ph5
public interface wl8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C14671a f94624a = C14671a.f94625a;

    /* JADX INFO: renamed from: wl8$a */
    @ph5
    @dwf({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1179#2:179\n1180#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
    public static final class C14671a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C14671a f94625a = new C14671a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final wl8 f94626b = new b();

        /* JADX INFO: renamed from: c */
        @yfb
        public static final wl8 f94627c = new a();

        /* JADX INFO: renamed from: wl8$a$a */
        public static final class a implements wl8 {
            @Override // p000.wl8
            public String serialNameForJson(f0f f0fVar, int i, String str) {
                md8.checkNotNullParameter(f0fVar, "descriptor");
                md8.checkNotNullParameter(str, "serialName");
                return C14671a.f94625a.convertCamelCase(str, '-');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
            }
        }

        /* JADX INFO: renamed from: wl8$a$b */
        public static final class b implements wl8 {
            @Override // p000.wl8
            public String serialNameForJson(f0f f0fVar, int i, String str) {
                md8.checkNotNullParameter(f0fVar, "descriptor");
                md8.checkNotNullParameter(str, "serialName");
                return C14671a.f94625a.convertCamelCase(str, '_');
            }

            public String toString() {
                return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
            }
        }

        private C14671a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String convertCamelCase(String str, char c) {
            StringBuilder sb = new StringBuilder(str.length() * 2);
            Character chValueOf = null;
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    if (i == 0 && sb.length() > 0 && t9g.last(sb) != c) {
                        sb.append(c);
                    }
                    if (chValueOf != null) {
                        sb.append(chValueOf.charValue());
                    }
                    i++;
                    chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
                } else {
                    if (chValueOf != null) {
                        if (i > 1 && Character.isLetter(cCharAt)) {
                            sb.append(c);
                        }
                        sb.append(chValueOf.charValue());
                        chValueOf = null;
                        i = 0;
                    }
                    sb.append(cCharAt);
                }
            }
            if (chValueOf != null) {
                sb.append(chValueOf.charValue());
            }
            String string = sb.toString();
            md8.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @ph5
        public static /* synthetic */ void getKebabCase$annotations() {
        }

        @ph5
        public static /* synthetic */ void getSnakeCase$annotations() {
        }

        @yfb
        public final wl8 getKebabCase() {
            return f94627c;
        }

        @yfb
        public final wl8 getSnakeCase() {
            return f94626b;
        }
    }

    @yfb
    String serialNameForJson(@yfb f0f f0fVar, int i, @yfb String str);
}
