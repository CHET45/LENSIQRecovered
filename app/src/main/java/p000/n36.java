package p000;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class n36 {

    /* JADX INFO: renamed from: A */
    public static final int f63116A = 26;

    /* JADX INFO: renamed from: B */
    public static final int f63117B = 36;

    /* JADX INFO: renamed from: C */
    public static final rqd f63118C = new c70(new byte[]{0}, 1);

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ boolean f63119D = false;

    /* JADX INFO: renamed from: a */
    public static final int f63120a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f63121b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f63122c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f63123d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f63124e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f63125f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f63126g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f63127h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f63128i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f63129j = 9;

    /* JADX INFO: renamed from: k */
    public static final int f63130k = 10;

    /* JADX INFO: renamed from: l */
    public static final int f63131l = 11;

    /* JADX INFO: renamed from: m */
    public static final int f63132m = 12;

    /* JADX INFO: renamed from: n */
    public static final int f63133n = 13;

    /* JADX INFO: renamed from: o */
    public static final int f63134o = 14;

    /* JADX INFO: renamed from: p */
    public static final int f63135p = 15;

    /* JADX INFO: renamed from: q */
    public static final int f63136q = 16;

    /* JADX INFO: renamed from: r */
    public static final int f63137r = 17;

    /* JADX INFO: renamed from: s */
    public static final int f63138s = 18;

    /* JADX INFO: renamed from: t */
    public static final int f63139t = 19;

    /* JADX INFO: renamed from: u */
    public static final int f63140u = 20;

    /* JADX INFO: renamed from: v */
    public static final int f63141v = 21;

    /* JADX INFO: renamed from: w */
    public static final int f63142w = 22;

    /* JADX INFO: renamed from: x */
    public static final int f63143x = 23;

    /* JADX INFO: renamed from: y */
    public static final int f63144y = 24;

    /* JADX INFO: renamed from: z */
    public static final int f63145z = 25;

    /* JADX INFO: renamed from: n36$a */
    public static class C9668a extends AbstractC9675h {

        /* JADX INFO: renamed from: e */
        public static final C9668a f63146e = new C9668a(n36.f63118C, 1, 1);

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ boolean f63147f = false;

        public C9668a(rqd rqdVar, int i, int i2) {
            super(rqdVar, i, i2);
        }

        public static C9668a empty() {
            return f63146e;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f63151a.data());
            byteBufferWrap.position(this.f63152b);
            byteBufferWrap.limit(this.f63152b + size());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            return this.f63151a.get(this.f63152b + i);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f63151a.get(this.f63152b + i);
            }
            return bArr;
        }

        @Override // p000.n36.AbstractC9675h
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // p000.n36.AbstractC9673f
        public String toString() {
            return this.f63151a.getString(this.f63152b, size());
        }

        @Override // p000.n36.AbstractC9673f
        public StringBuilder toString(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f63151a.getString(this.f63152b, size()));
            sb.append('\"');
            return sb;
        }
    }

    /* JADX INFO: renamed from: n36$b */
    public static class C9669b extends RuntimeException {
        public C9669b(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: n36$c */
    public static class C9670c extends AbstractC9673f {

        /* JADX INFO: renamed from: d */
        public static final C9670c f63148d = new C9670c(n36.f63118C, 0, 0);

        public C9670c(rqd rqdVar, int i, int i2) {
            super(rqdVar, i, i2);
        }

        public static C9670c empty() {
            return f63148d;
        }

        /* JADX INFO: renamed from: b */
        public int m17756b(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.f63152b;
            int i2 = 0;
            do {
                b = this.f63151a.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9670c)) {
                return false;
            }
            C9670c c9670c = (C9670c) obj;
            return c9670c.f63152b == this.f63152b && c9670c.f63153c == this.f63153c;
        }

        public int hashCode() {
            return this.f63152b ^ this.f63153c;
        }

        @Override // p000.n36.AbstractC9673f
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // p000.n36.AbstractC9673f
        public String toString() {
            int i = this.f63152b;
            while (this.f63151a.get(i) != 0) {
                i++;
            }
            int i2 = this.f63152b;
            return this.f63151a.getString(i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: n36$d */
    public static class C9671d {

        /* JADX INFO: renamed from: a */
        public final C9676i f63149a;

        public C9671d(C9676i c9676i) {
            this.f63149a = c9676i;
        }

        public C9670c get(int i) {
            if (i >= size()) {
                return C9670c.f63148d;
            }
            C9676i c9676i = this.f63149a;
            int i2 = c9676i.f63152b + (i * c9676i.f63153c);
            C9676i c9676i2 = this.f63149a;
            rqd rqdVar = c9676i2.f63151a;
            return new C9670c(rqdVar, n36.indirect(rqdVar, i2, c9676i2.f63153c), 1);
        }

        public int size() {
            return this.f63149a.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C4584d2.f28242k);
            for (int i = 0; i < this.f63149a.size(); i++) {
                this.f63149a.get(i).m17758b(sb);
                if (i != this.f63149a.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: n36$e */
    public static class C9672e extends C9678k {

        /* JADX INFO: renamed from: f */
        public static final C9672e f63150f = new C9672e(n36.f63118C, 1, 1);

        public C9672e(rqd rqdVar, int i, int i2) {
            super(rqdVar, i, i2);
        }

        private int binarySearch(C9671d c9671d, byte[] bArr) {
            int size = c9671d.size() - 1;
            int i = 0;
            while (i <= size) {
                int i2 = (i + size) >>> 1;
                int iM17756b = c9671d.get(i2).m17756b(bArr);
                if (iM17756b < 0) {
                    i = i2 + 1;
                } else {
                    if (iM17756b <= 0) {
                        return i2;
                    }
                    size = i2 - 1;
                }
            }
            return -(i + 1);
        }

        public static C9672e empty() {
            return f63150f;
        }

        public C9674g get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public C9671d keys() {
            int i = this.f63152b - (this.f63153c * 3);
            rqd rqdVar = this.f63151a;
            int iIndirect = n36.indirect(rqdVar, i, this.f63153c);
            rqd rqdVar2 = this.f63151a;
            int i2 = this.f63153c;
            return new C9671d(new C9676i(rqdVar, iIndirect, n36.readInt(rqdVar2, i + i2, i2), 4));
        }

        @Override // p000.n36.C9678k, p000.n36.AbstractC9673f
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            C9671d c9671dKeys = keys();
            int size = size();
            C9678k c9678kValues = values();
            for (int i = 0; i < size; i++) {
                sb.append('\"');
                sb.append(c9671dKeys.get(i).toString());
                sb.append("\" : ");
                sb.append(c9678kValues.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public C9678k values() {
            return new C9678k(this.f63151a, this.f63152b, this.f63153c);
        }

        public C9674g get(byte[] bArr) {
            C9671d c9671dKeys = keys();
            int size = c9671dKeys.size();
            int iBinarySearch = binarySearch(c9671dKeys, bArr);
            return (iBinarySearch < 0 || iBinarySearch >= size) ? C9674g.f63154f : get(iBinarySearch);
        }
    }

    /* JADX INFO: renamed from: n36$f */
    public static abstract class AbstractC9673f {

        /* JADX INFO: renamed from: a */
        public rqd f63151a;

        /* JADX INFO: renamed from: b */
        public int f63152b;

        /* JADX INFO: renamed from: c */
        public int f63153c;

        public AbstractC9673f(rqd rqdVar, int i, int i2) {
            this.f63151a = rqdVar;
            this.f63152b = i;
            this.f63153c = i2;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* JADX INFO: renamed from: n36$g */
    public static class C9674g {

        /* JADX INFO: renamed from: f */
        public static final C9674g f63154f = new C9674g(n36.f63118C, 0, 1, 0);

        /* JADX INFO: renamed from: a */
        public rqd f63155a;

        /* JADX INFO: renamed from: b */
        public int f63156b;

        /* JADX INFO: renamed from: c */
        public int f63157c;

        /* JADX INFO: renamed from: d */
        public int f63158d;

        /* JADX INFO: renamed from: e */
        public int f63159e;

        public C9674g(rqd rqdVar, int i, int i2, int i3) {
            this(rqdVar, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public C9668a asBlob() {
            if (!isBlob() && !isString()) {
                return C9668a.empty();
            }
            rqd rqdVar = this.f63155a;
            return new C9668a(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f63155a.get(this.f63156b) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i = this.f63159e;
            if (i == 3) {
                return n36.readDouble(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 1) {
                return n36.readInt(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(asString());
                }
                if (i == 6) {
                    rqd rqdVar = this.f63155a;
                    return n36.readInt(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
                }
                if (i == 7) {
                    rqd rqdVar2 = this.f63155a;
                    return n36.readUInt(rqdVar2, n36.indirect(rqdVar2, this.f63156b, this.f63157c), this.f63158d);
                }
                if (i == 8) {
                    rqd rqdVar3 = this.f63155a;
                    return n36.readDouble(rqdVar3, n36.indirect(rqdVar3, this.f63156b, this.f63157c), this.f63158d);
                }
                if (i == 10) {
                    return asVector().size();
                }
                if (i != 26) {
                    return 0.0d;
                }
            }
            return n36.readUInt(this.f63155a, this.f63156b, this.f63157c);
        }

        public int asInt() {
            int i = this.f63159e;
            if (i == 1) {
                return n36.readInt(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 2) {
                return (int) n36.readUInt(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 3) {
                return (int) n36.readDouble(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 5) {
                return Integer.parseInt(asString());
            }
            if (i == 6) {
                rqd rqdVar = this.f63155a;
                return n36.readInt(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
            }
            if (i == 7) {
                rqd rqdVar2 = this.f63155a;
                return (int) n36.readUInt(rqdVar2, n36.indirect(rqdVar2, this.f63156b, this.f63157c), this.f63157c);
            }
            if (i == 8) {
                rqd rqdVar3 = this.f63155a;
                return (int) n36.readDouble(rqdVar3, n36.indirect(rqdVar3, this.f63156b, this.f63157c), this.f63158d);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0;
            }
            return n36.readInt(this.f63155a, this.f63156b, this.f63157c);
        }

        public C9670c asKey() {
            if (!isKey()) {
                return C9670c.empty();
            }
            rqd rqdVar = this.f63155a;
            return new C9670c(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
        }

        public long asLong() {
            int i = this.f63159e;
            if (i == 1) {
                return n36.readLong(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 2) {
                return n36.readUInt(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 3) {
                return (long) n36.readDouble(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                rqd rqdVar = this.f63155a;
                return n36.readLong(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
            }
            if (i == 7) {
                rqd rqdVar2 = this.f63155a;
                return n36.readUInt(rqdVar2, n36.indirect(rqdVar2, this.f63156b, this.f63157c), this.f63157c);
            }
            if (i == 8) {
                rqd rqdVar3 = this.f63155a;
                return (long) n36.readDouble(rqdVar3, n36.indirect(rqdVar3, this.f63156b, this.f63157c), this.f63158d);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return n36.readInt(this.f63155a, this.f63156b, this.f63157c);
        }

        public C9672e asMap() {
            if (!isMap()) {
                return C9672e.empty();
            }
            rqd rqdVar = this.f63155a;
            return new C9672e(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
        }

        public String asString() {
            if (isString()) {
                int iIndirect = n36.indirect(this.f63155a, this.f63156b, this.f63157c);
                rqd rqdVar = this.f63155a;
                int i = this.f63158d;
                return this.f63155a.getString(iIndirect, (int) n36.readUInt(rqdVar, iIndirect - i, i));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = n36.indirect(this.f63155a, this.f63156b, this.f63158d);
            int i2 = iIndirect2;
            while (this.f63155a.get(i2) != 0) {
                i2++;
            }
            return this.f63155a.getString(iIndirect2, i2 - iIndirect2);
        }

        public long asUInt() {
            int i = this.f63159e;
            if (i == 2) {
                return n36.readUInt(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 1) {
                return n36.readLong(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 3) {
                return (long) n36.readDouble(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return n36.readInt(this.f63155a, this.f63156b, this.f63157c);
            }
            if (i == 5) {
                return Long.parseLong(asString());
            }
            if (i == 6) {
                rqd rqdVar = this.f63155a;
                return n36.readLong(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
            }
            if (i == 7) {
                rqd rqdVar2 = this.f63155a;
                return n36.readUInt(rqdVar2, n36.indirect(rqdVar2, this.f63156b, this.f63157c), this.f63158d);
            }
            if (i != 8) {
                return 0L;
            }
            rqd rqdVar3 = this.f63155a;
            return (long) n36.readDouble(rqdVar3, n36.indirect(rqdVar3, this.f63156b, this.f63157c), this.f63157c);
        }

        public C9678k asVector() {
            if (isVector()) {
                rqd rqdVar = this.f63155a;
                return new C9678k(rqdVar, n36.indirect(rqdVar, this.f63156b, this.f63157c), this.f63158d);
            }
            int i = this.f63159e;
            if (i == 15) {
                rqd rqdVar2 = this.f63155a;
                return new C9676i(rqdVar2, n36.indirect(rqdVar2, this.f63156b, this.f63157c), this.f63158d, 4);
            }
            if (!n36.m17751h(i)) {
                return C9678k.empty();
            }
            rqd rqdVar3 = this.f63155a;
            return new C9676i(rqdVar3, n36.indirect(rqdVar3, this.f63156b, this.f63157c), this.f63158d, n36.m17754k(this.f63159e));
        }

        /* JADX INFO: renamed from: b */
        public StringBuilder m17758b(StringBuilder sb) {
            int i = this.f63159e;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        C9670c c9670cAsKey = asKey();
                        sb.append('\"');
                        StringBuilder string = c9670cAsKey.toString(sb);
                        string.append('\"');
                        return string;
                    case 5:
                        sb.append('\"');
                        sb.append(asString());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new C9669b("not_implemented:" + this.f63159e);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }

        public int getType() {
            return this.f63159e;
        }

        public boolean isBlob() {
            return this.f63159e == 25;
        }

        public boolean isBoolean() {
            return this.f63159e == 26;
        }

        public boolean isFloat() {
            int i = this.f63159e;
            return i == 3 || i == 8;
        }

        public boolean isInt() {
            int i = this.f63159e;
            return i == 1 || i == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.f63159e == 4;
        }

        public boolean isMap() {
            return this.f63159e == 9;
        }

        public boolean isNull() {
            return this.f63159e == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.f63159e == 5;
        }

        public boolean isTypedVector() {
            return n36.m17751h(this.f63159e);
        }

        public boolean isUInt() {
            int i = this.f63159e;
            return i == 2 || i == 7;
        }

        public boolean isVector() {
            int i = this.f63159e;
            return i == 10 || i == 9;
        }

        public String toString() {
            return m17758b(new StringBuilder(128)).toString();
        }

        public C9674g(rqd rqdVar, int i, int i2, int i3, int i4) {
            this.f63155a = rqdVar;
            this.f63156b = i;
            this.f63157c = i2;
            this.f63158d = i3;
            this.f63159e = i4;
        }
    }

    /* JADX INFO: renamed from: n36$h */
    public static abstract class AbstractC9675h extends AbstractC9673f {

        /* JADX INFO: renamed from: d */
        public final int f63160d;

        public AbstractC9675h(rqd rqdVar, int i, int i2) {
            super(rqdVar, i, i2);
            this.f63160d = n36.readInt(this.f63151a, i - i2, i2);
        }

        public int size() {
            return this.f63160d;
        }
    }

    /* JADX INFO: renamed from: n36$i */
    public static class C9676i extends C9678k {

        /* JADX INFO: renamed from: g */
        public static final C9676i f63161g = new C9676i(n36.f63118C, 1, 1, 1);

        /* JADX INFO: renamed from: f */
        public final int f63162f;

        public C9676i(rqd rqdVar, int i, int i2, int i3) {
            super(rqdVar, i, i2);
            this.f63162f = i3;
        }

        public static C9676i empty() {
            return f63161g;
        }

        @Override // p000.n36.C9678k
        public C9674g get(int i) {
            if (i >= size()) {
                return C9674g.f63154f;
            }
            return new C9674g(this.f63151a, this.f63152b + (i * this.f63153c), this.f63153c, 1, this.f63162f);
        }

        public int getElemType() {
            return this.f63162f;
        }

        public boolean isEmptyVector() {
            return this == f63161g;
        }
    }

    /* JADX INFO: renamed from: n36$j */
    public static class C9677j {
        /* JADX INFO: renamed from: a */
        public static int m17759a(byte b) {
            return b & 255;
        }

        /* JADX INFO: renamed from: b */
        public static long m17760b(int i) {
            return ((long) i) & 4294967295L;
        }

        /* JADX INFO: renamed from: c */
        public static int m17761c(short s) {
            return s & iqh.f48007d;
        }
    }

    /* JADX INFO: renamed from: n36$k */
    public static class C9678k extends AbstractC9675h {

        /* JADX INFO: renamed from: e */
        public static final C9678k f63163e = new C9678k(n36.f63118C, 1, 1);

        public C9678k(rqd rqdVar, int i, int i2) {
            super(rqdVar, i, i2);
        }

        public static C9678k empty() {
            return f63163e;
        }

        public C9674g get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return C9674g.f63154f;
            }
            return new C9674g(this.f63151a, this.f63152b + (i * this.f63153c), this.f63153c, C9677j.m17759a(this.f63151a.get((int) (((long) this.f63152b) + (size * ((long) this.f63153c)) + j))));
        }

        public boolean isEmpty() {
            return this == f63163e;
        }

        @Override // p000.n36.AbstractC9675h
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // p000.n36.AbstractC9673f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // p000.n36.AbstractC9673f
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).m17758b(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17750g(int i) {
        return i <= 3 || i == 26;
    }

    @Deprecated
    public static C9674g getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new c70(byteBuffer.array(), byteBuffer.limit()) : new cj1(byteBuffer));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17751h(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17752i(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(rqd rqdVar, int i, int i2) {
        return (int) (((long) i) - readUInt(rqdVar, i, i2));
    }

    /* JADX INFO: renamed from: j */
    public static int m17753j(int i, int i2) {
        if (i2 == 0) {
            return i + 10;
        }
        if (i2 == 2) {
            return i + 15;
        }
        if (i2 == 3) {
            return i + 18;
        }
        if (i2 != 4) {
            return 0;
        }
        return i + 21;
    }

    /* JADX INFO: renamed from: k */
    public static int m17754k(int i) {
        return i - 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(rqd rqdVar, int i, int i2) {
        if (i2 == 4) {
            return rqdVar.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return rqdVar.getDouble(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(rqd rqdVar, int i, int i2) {
        return (int) readLong(rqdVar, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(rqd rqdVar, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = rqdVar.get(i);
        } else if (i2 == 2) {
            i3 = rqdVar.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return rqdVar.getLong(i);
            }
            i3 = rqdVar.getInt(i);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(rqd rqdVar, int i, int i2) {
        if (i2 == 1) {
            return C9677j.m17759a(rqdVar.get(i));
        }
        if (i2 == 2) {
            return C9677j.m17761c(rqdVar.getShort(i));
        }
        if (i2 == 4) {
            return C9677j.m17760b(rqdVar.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return rqdVar.getLong(i);
    }

    public static C9674g getRoot(rqd rqdVar) {
        int iLimit = rqdVar.limit();
        byte b = rqdVar.get(iLimit - 1);
        int i = iLimit - 2;
        return new C9674g(rqdVar, i - b, b, C9677j.m17759a(rqdVar.get(i)));
    }
}
