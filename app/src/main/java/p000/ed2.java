package p000;

/* JADX INFO: loaded from: classes8.dex */
public class ed2 extends AssertionError {

    /* JADX INFO: renamed from: c */
    public static final int f32668c = 20;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public String f32669a;

    /* JADX INFO: renamed from: b */
    public String f32670b;

    /* JADX INFO: renamed from: ed2$b */
    public static class C5262b {

        /* JADX INFO: renamed from: d */
        public static final String f32671d = "...";

        /* JADX INFO: renamed from: e */
        public static final String f32672e = "]";

        /* JADX INFO: renamed from: f */
        public static final String f32673f = "[";

        /* JADX INFO: renamed from: a */
        public final int f32674a;

        /* JADX INFO: renamed from: b */
        public final String f32675b;

        /* JADX INFO: renamed from: c */
        public final String f32676c;

        /* JADX INFO: renamed from: ed2$b$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public final String f32677a;

            /* JADX INFO: renamed from: b */
            public final String f32678b;

            private String extractDiff(String str) {
                return "[" + str.substring(this.f32677a.length(), str.length() - this.f32678b.length()) + "]";
            }

            public String actualDiff() {
                return extractDiff(C5262b.this.f32676c);
            }

            public String compactPrefix() {
                if (this.f32677a.length() <= C5262b.this.f32674a) {
                    return this.f32677a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("...");
                String str = this.f32677a;
                sb.append(str.substring(str.length() - C5262b.this.f32674a));
                return sb.toString();
            }

            public String compactSuffix() {
                if (this.f32678b.length() <= C5262b.this.f32674a) {
                    return this.f32678b;
                }
                return this.f32678b.substring(0, C5262b.this.f32674a) + "...";
            }

            public String expectedDiff() {
                return extractDiff(C5262b.this.f32675b);
            }

            private a() {
                String strSharedPrefix = C5262b.this.sharedPrefix();
                this.f32677a = strSharedPrefix;
                this.f32678b = C5262b.this.sharedSuffix(strSharedPrefix);
            }
        }

        public C5262b(int i, String str, String str2) {
            this.f32674a = i;
            this.f32675b = str;
            this.f32676c = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String sharedPrefix() {
            int iMin = Math.min(this.f32675b.length(), this.f32676c.length());
            for (int i = 0; i < iMin; i++) {
                if (this.f32675b.charAt(i) != this.f32676c.charAt(i)) {
                    return this.f32675b.substring(0, i);
                }
            }
            return this.f32675b.substring(0, iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String sharedSuffix(String str) {
            int iMin = Math.min(this.f32675b.length() - str.length(), this.f32676c.length() - str.length()) - 1;
            int i = 0;
            while (i <= iMin) {
                if (this.f32675b.charAt((r1.length() - 1) - i) != this.f32676c.charAt((r2.length() - 1) - i)) {
                    break;
                }
                i++;
            }
            String str2 = this.f32675b;
            return str2.substring(str2.length() - i);
        }

        public String compact(String str) {
            String str2;
            String str3 = this.f32675b;
            if (str3 == null || (str2 = this.f32676c) == null || str3.equals(str2)) {
                return q80.m20113a(str, this.f32675b, this.f32676c);
            }
            a aVar = new a();
            String strCompactPrefix = aVar.compactPrefix();
            String strCompactSuffix = aVar.compactSuffix();
            return q80.m20113a(str, strCompactPrefix + aVar.expectedDiff() + strCompactSuffix, strCompactPrefix + aVar.actualDiff() + strCompactSuffix);
        }
    }

    public ed2(String str, String str2, String str3) {
        super(str);
        this.f32669a = str2;
        this.f32670b = str3;
    }

    public String getActual() {
        return this.f32670b;
    }

    public String getExpected() {
        return this.f32669a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new C5262b(20, this.f32669a, this.f32670b).compact(super.getMessage());
    }
}
