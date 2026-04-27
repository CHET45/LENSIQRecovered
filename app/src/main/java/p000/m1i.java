package p000;

import com.iflytek.aikit.core.AiHelper;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = AiHelper.f24011i)
@zh5
public final class m1i implements Serializable {

    /* JADX INFO: renamed from: e */
    public static final int f59666e = 16;

    /* JADX INFO: renamed from: f */
    public static final int f59667f = 128;

    /* JADX INFO: renamed from: a */
    public final long f59669a;

    /* JADX INFO: renamed from: b */
    public final long f59670b;

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C9095a f59664c = new C9095a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final m1i f59665d = new m1i(0, 0);

    /* JADX INFO: renamed from: m */
    @yfb
    public static final Comparator<m1i> f59668m = new Comparator() { // from class: l1i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m1i.LEXICAL_ORDER$lambda$0((m1i) obj, (m1i) obj2);
        }
    };

    /* JADX INFO: renamed from: m1i$a */
    @dwf({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/Uuid$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n1#2:453\n*E\n"})
    public static final class C9095a {
        public /* synthetic */ C9095a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final m1i fromByteArray(@yfb byte[] bArr) {
            md8.checkNotNullParameter(bArr, "byteArray");
            if (bArr.length == 16) {
                return fromLongs(r1i.toLong$UuidKt__UuidKt(bArr, 0), r1i.toLong$UuidKt__UuidKt(bArr, 8));
            }
            throw new IllegalArgumentException("Expected exactly 16 bytes");
        }

        @yfb
        public final m1i fromLongs(long j, long j2) {
            return (j == 0 && j2 == 0) ? getNIL() : new m1i(j, j2);
        }

        @yfb
        /* JADX INFO: renamed from: fromULongs-eb3DHEI, reason: not valid java name */
        public final m1i m30929fromULongseb3DHEI(long j, long j2) {
            return fromLongs(j, j2);
        }

        @yfb
        public final Comparator<m1i> getLEXICAL_ORDER() {
            return m1i.f59668m;
        }

        @yfb
        public final m1i getNIL() {
            return m1i.f59665d;
        }

        @yfb
        public final m1i parse(@yfb String str) {
            md8.checkNotNullParameter(str, "uuidString");
            if (str.length() != 36) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
            }
            long jHexToLong$default = tj7.hexToLong$default(str, 0, 8, null, 4, null);
            r1i.checkHyphenAt$UuidKt__UuidKt(str, 8);
            long jHexToLong$default2 = tj7.hexToLong$default(str, 9, 13, null, 4, null);
            r1i.checkHyphenAt$UuidKt__UuidKt(str, 13);
            long jHexToLong$default3 = tj7.hexToLong$default(str, 14, 18, null, 4, null);
            r1i.checkHyphenAt$UuidKt__UuidKt(str, 18);
            long jHexToLong$default4 = tj7.hexToLong$default(str, 19, 23, null, 4, null);
            r1i.checkHyphenAt$UuidKt__UuidKt(str, 23);
            return fromLongs((jHexToLong$default << 32) | (jHexToLong$default2 << 16) | jHexToLong$default3, tj7.hexToLong$default(str, 24, 36, null, 4, null) | (jHexToLong$default4 << 48));
        }

        @yfb
        public final m1i parseHex(@yfb String str) {
            md8.checkNotNullParameter(str, "hexString");
            if (str.length() == 32) {
                return fromLongs(tj7.hexToLong$default(str, 0, 16, null, 4, null), tj7.hexToLong$default(str, 16, 32, null, 4, null));
            }
            throw new IllegalArgumentException("Expected a 32-char hexadecimal string.");
        }

        @yfb
        public final m1i random() {
            return q1i.secureRandomUuid();
        }

        private C9095a() {
        }
    }

    public m1i(long j, long j2) {
        this.f59669a = j;
        this.f59670b = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LEXICAL_ORDER$lambda$0(m1i m1iVar, m1i m1iVar2) {
        md8.checkNotNullParameter(m1iVar, "a");
        md8.checkNotNullParameter(m1iVar2, "b");
        long j = m1iVar.f59669a;
        return j != m1iVar2.f59669a ? Long.compareUnsigned(oph.m31533constructorimpl(j), oph.m31533constructorimpl(m1iVar2.f59669a)) : Long.compareUnsigned(oph.m31533constructorimpl(m1iVar.f59670b), oph.m31533constructorimpl(m1iVar2.f59670b));
    }

    @yjd
    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    @yjd
    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    @t28
    private final <T> T toLongs(gz6<? super Long, ? super Long, ? extends T> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "action");
        return gz6Var.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    @t28
    private final <T> T toULongs(gz6<? super oph, ? super oph, ? extends T> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "action");
        return gz6Var.invoke(oph.m31527boximpl(oph.m31533constructorimpl(getMostSignificantBits())), oph.m31527boximpl(oph.m31533constructorimpl(getLeastSignificantBits())));
    }

    private final Object writeReplace() {
        return q1i.serializedUuid(this);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1i)) {
            return false;
        }
        m1i m1iVar = (m1i) obj;
        return this.f59669a == m1iVar.f59669a && this.f59670b == m1iVar.f59670b;
    }

    public final long getLeastSignificantBits() {
        return this.f59670b;
    }

    public final long getMostSignificantBits() {
        return this.f59669a;
    }

    public int hashCode() {
        long j = this.f59669a ^ this.f59670b;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @yfb
    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        r1i.toByteArray$UuidKt__UuidKt(this.f59669a, bArr, 0);
        r1i.toByteArray$UuidKt__UuidKt(this.f59670b, bArr, 8);
        return bArr;
    }

    @yfb
    public final String toHexString() {
        byte[] bArr = new byte[32];
        r1i.formatBytesInto$UuidKt__UuidKt(this.f59670b, bArr, 16, 8);
        r1i.formatBytesInto$UuidKt__UuidKt(this.f59669a, bArr, 0, 8);
        return h9g.decodeToString(bArr);
    }

    @yfb
    public String toString() {
        byte[] bArr = new byte[36];
        r1i.formatBytesInto$UuidKt__UuidKt(this.f59670b, bArr, 24, 6);
        bArr[23] = 45;
        r1i.formatBytesInto$UuidKt__UuidKt(this.f59670b >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        r1i.formatBytesInto$UuidKt__UuidKt(this.f59669a, bArr, 14, 2);
        bArr[13] = 45;
        r1i.formatBytesInto$UuidKt__UuidKt(this.f59669a >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        r1i.formatBytesInto$UuidKt__UuidKt(this.f59669a >>> 32, bArr, 0, 4);
        return h9g.decodeToString(bArr);
    }
}
