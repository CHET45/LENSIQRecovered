package p000;

import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@by4
public abstract class os1 {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ os1[] f68522C;

    /* JADX INFO: renamed from: c */
    public static final os1 f68523c = new C10622a("LOWER_HYPHEN", 0, yv1.m26360is('-'), "-");

    /* JADX INFO: renamed from: d */
    public static final os1 f68524d;

    /* JADX INFO: renamed from: e */
    public static final os1 f68525e;

    /* JADX INFO: renamed from: f */
    public static final os1 f68526f;

    /* JADX INFO: renamed from: m */
    public static final os1 f68527m;

    /* JADX INFO: renamed from: a */
    public final yv1 f68528a;

    /* JADX INFO: renamed from: b */
    public final String f68529b;

    /* JADX INFO: renamed from: os1$a */
    public enum C10622a extends os1 {
        public C10622a(String $enum$name, int $enum$ordinal, yv1 wordBoundary, String wordSeparator) {
            super($enum$name, $enum$ordinal, wordBoundary, wordSeparator, null);
        }

        @Override // p000.os1
        /* JADX INFO: renamed from: b */
        public String mo18961b(os1 format, String s) {
            return format == os1.f68524d ? s.replace('-', '_') : format == os1.f68527m ? i80.toUpperCase(s.replace('-', '_')) : super.mo18961b(format, s);
        }

        @Override // p000.os1
        /* JADX INFO: renamed from: d */
        public String mo18963d(String word) {
            return i80.toLowerCase(word);
        }
    }

    /* JADX INFO: renamed from: os1$f */
    public static final class C10627f extends wz2<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c */
        public final os1 f68530c;

        /* JADX INFO: renamed from: d */
        public final os1 f68531d;

        public C10627f(os1 sourceFormat, os1 targetFormat) {
            this.f68530c = (os1) v7d.checkNotNull(sourceFormat);
            this.f68531d = (os1) v7d.checkNotNull(targetFormat);
        }

        @Override // p000.wz2, p000.lz6
        public boolean equals(@wx1 Object object) {
            if (!(object instanceof C10627f)) {
                return false;
            }
            C10627f c10627f = (C10627f) object;
            return this.f68530c.equals(c10627f.f68530c) && this.f68531d.equals(c10627f.f68531d);
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo13178d(String s) {
            return this.f68531d.m18964to(this.f68530c, s);
        }

        @Override // p000.wz2
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public String mo13179e(String s) {
            return this.f68530c.m18964to(this.f68531d, s);
        }

        public int hashCode() {
            return this.f68530c.hashCode() ^ this.f68531d.hashCode();
        }

        public String toString() {
            return this.f68530c + ".converterTo(" + this.f68531d + c0b.f15434d;
        }
    }

    private static /* synthetic */ os1[] $values() {
        return new os1[]{f68523c, f68524d, f68525e, f68526f, f68527m};
    }

    static {
        yv1 yv1VarM26360is = yv1.m26360is('_');
        String str = p43.f69617m;
        f68524d = new os1("LOWER_UNDERSCORE", 1, yv1VarM26360is, str) { // from class: os1.b
            {
                C10622a c10622a = null;
            }

            @Override // p000.os1
            /* JADX INFO: renamed from: b */
            public String mo18961b(os1 format, String s) {
                return format == os1.f68523c ? s.replace('_', '-') : format == os1.f68527m ? i80.toUpperCase(s) : super.mo18961b(format, s);
            }

            @Override // p000.os1
            /* JADX INFO: renamed from: d */
            public String mo18963d(String word) {
                return i80.toLowerCase(word);
            }
        };
        String str2 = "";
        f68525e = new os1("LOWER_CAMEL", 2, yv1.inRange(sjc.f82030t, sjc.f82012b), str2) { // from class: os1.c
            {
                C10622a c10622a = null;
            }

            @Override // p000.os1
            /* JADX INFO: renamed from: c */
            public String mo18962c(String word) {
                return i80.toLowerCase(word);
            }

            @Override // p000.os1
            /* JADX INFO: renamed from: d */
            public String mo18963d(String word) {
                return os1.firstCharOnlyToUpper(word);
            }
        };
        f68526f = new os1("UPPER_CAMEL", 3, yv1.inRange(sjc.f82030t, sjc.f82012b), str2) { // from class: os1.d
            {
                C10622a c10622a = null;
            }

            @Override // p000.os1
            /* JADX INFO: renamed from: d */
            public String mo18963d(String word) {
                return os1.firstCharOnlyToUpper(word);
            }
        };
        f68527m = new os1("UPPER_UNDERSCORE", 4, yv1.m26360is('_'), str) { // from class: os1.e
            {
                C10622a c10622a = null;
            }

            @Override // p000.os1
            /* JADX INFO: renamed from: b */
            public String mo18961b(os1 format, String s) {
                return format == os1.f68523c ? i80.toLowerCase(s.replace('_', '-')) : format == os1.f68524d ? i80.toLowerCase(s) : super.mo18961b(format, s);
            }

            @Override // p000.os1
            /* JADX INFO: renamed from: d */
            public String mo18963d(String word) {
                return i80.toUpperCase(word);
            }
        };
        f68522C = $values();
    }

    public /* synthetic */ os1(String str, int i, yv1 yv1Var, String str2, C10622a c10622a) {
        this(str, i, yv1Var, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String word) {
        if (word.isEmpty()) {
            return word;
        }
        return i80.toUpperCase(word.charAt(0)) + i80.toLowerCase(word.substring(1));
    }

    public static os1 valueOf(String name) {
        return (os1) Enum.valueOf(os1.class, name);
    }

    public static os1[] values() {
        return (os1[]) f68522C.clone();
    }

    /* JADX INFO: renamed from: b */
    public String mo18961b(os1 format, String s) {
        StringBuilder sb = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.f68528a.indexIn(s, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(s.length() + (format.f68529b.length() * 4));
                sb.append(format.mo18962c(s.substring(length, iIndexIn)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(format.mo18963d(s.substring(length, iIndexIn)));
            }
            sb.append(format.f68529b);
            length = this.f68529b.length() + iIndexIn;
        }
        if (length == 0) {
            return format.mo18962c(s);
        }
        Objects.requireNonNull(sb);
        sb.append(format.mo18963d(s.substring(length)));
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String mo18962c(String word) {
        return mo18963d(word);
    }

    public wz2<String, String> converterTo(os1 targetFormat) {
        return new C10627f(this, targetFormat);
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo18963d(String word);

    /* JADX INFO: renamed from: to */
    public final String m18964to(os1 format, String str) {
        v7d.checkNotNull(format);
        v7d.checkNotNull(str);
        return format == this ? str : mo18961b(format, str);
    }

    private os1(String $enum$name, int $enum$ordinal, yv1 wordBoundary, String wordSeparator) {
        this.f68528a = wordBoundary;
        this.f68529b = wordSeparator;
    }
}
