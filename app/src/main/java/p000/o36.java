package p000;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes5.dex */
public class o36 {

    /* JADX INFO: renamed from: A */
    public static final int f66363A = 26;

    /* JADX INFO: renamed from: B */
    public static final int f66364B = 36;

    /* JADX INFO: renamed from: C */
    public static final qqd f66365C = new b70(new byte[]{0}, 1);

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ boolean f66366D = false;

    /* JADX INFO: renamed from: a */
    public static final int f66367a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f66368b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f66369c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f66370d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f66371e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f66372f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f66373g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f66374h = 7;

    /* JADX INFO: renamed from: i */
    public static final int f66375i = 8;

    /* JADX INFO: renamed from: j */
    public static final int f66376j = 9;

    /* JADX INFO: renamed from: k */
    public static final int f66377k = 10;

    /* JADX INFO: renamed from: l */
    public static final int f66378l = 11;

    /* JADX INFO: renamed from: m */
    public static final int f66379m = 12;

    /* JADX INFO: renamed from: n */
    public static final int f66380n = 13;

    /* JADX INFO: renamed from: o */
    public static final int f66381o = 14;

    /* JADX INFO: renamed from: p */
    public static final int f66382p = 15;

    /* JADX INFO: renamed from: q */
    public static final int f66383q = 16;

    /* JADX INFO: renamed from: r */
    public static final int f66384r = 17;

    /* JADX INFO: renamed from: s */
    public static final int f66385s = 18;

    /* JADX INFO: renamed from: t */
    public static final int f66386t = 19;

    /* JADX INFO: renamed from: u */
    public static final int f66387u = 20;

    /* JADX INFO: renamed from: v */
    public static final int f66388v = 21;

    /* JADX INFO: renamed from: w */
    public static final int f66389w = 22;

    /* JADX INFO: renamed from: x */
    public static final int f66390x = 23;

    /* JADX INFO: renamed from: y */
    public static final int f66391y = 24;

    /* JADX INFO: renamed from: z */
    public static final int f66392z = 25;

    /* JADX INFO: renamed from: o36$a */
    public static class C10167a extends AbstractC10174h {

        /* JADX INFO: renamed from: e */
        public static final C10167a f66393e = new C10167a(o36.f66365C, 1, 1);

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ boolean f66394f = false;

        public C10167a(qqd qqdVar, int i, int i2) {
            super(qqdVar, i, i2);
        }

        public static C10167a empty() {
            return f66393e;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f66398a.data());
            byteBufferWrap.position(this.f66399b);
            byteBufferWrap.limit(this.f66399b + size());
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            return this.f66398a.get(this.f66399b + i);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f66398a.get(this.f66399b + i);
            }
            return bArr;
        }

        @Override // p000.o36.AbstractC10174h
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // p000.o36.AbstractC10172f
        public String toString() {
            return this.f66398a.getString(this.f66399b, size());
        }

        @Override // p000.o36.AbstractC10172f
        public StringBuilder toString(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f66398a.getString(this.f66399b, size()));
            sb.append('\"');
            return sb;
        }
    }

    /* JADX INFO: renamed from: o36$b */
    public static class C10168b extends RuntimeException {
        public C10168b(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: o36$c */
    public static class C10169c extends AbstractC10172f {

        /* JADX INFO: renamed from: d */
        public static final C10169c f66395d = new C10169c(o36.f66365C, 0, 0);

        public C10169c(qqd qqdVar, int i, int i2) {
            super(qqdVar, i, i2);
        }

        public static C10169c empty() {
            return f66395d;
        }

        /* JADX INFO: renamed from: b */
        public int m18329b(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.f66399b;
            int i2 = 0;
            do {
                b = this.f66398a.get(i);
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
            if (!(obj instanceof C10169c)) {
                return false;
            }
            C10169c c10169c = (C10169c) obj;
            return c10169c.f66399b == this.f66399b && c10169c.f66400c == this.f66400c;
        }

        public int hashCode() {
            return this.f66399b ^ this.f66400c;
        }

        @Override // p000.o36.AbstractC10172f
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // p000.o36.AbstractC10172f
        public String toString() {
            int i = this.f66399b;
            while (this.f66398a.get(i) != 0) {
                i++;
            }
            int i2 = this.f66399b;
            return this.f66398a.getString(i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: o36$d */
    public static class C10170d {

        /* JADX INFO: renamed from: a */
        public final C10175i f66396a;

        public C10170d(C10175i c10175i) {
            this.f66396a = c10175i;
        }

        public C10169c get(int i) {
            if (i >= size()) {
                return C10169c.f66395d;
            }
            C10175i c10175i = this.f66396a;
            int i2 = c10175i.f66399b + (i * c10175i.f66400c);
            C10175i c10175i2 = this.f66396a;
            qqd qqdVar = c10175i2.f66398a;
            return new C10169c(qqdVar, o36.indirect(qqdVar, i2, c10175i2.f66400c), 1);
        }

        public int size() {
            return this.f66396a.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C4584d2.f28242k);
            for (int i = 0; i < this.f66396a.size(); i++) {
                this.f66396a.get(i).m18331b(sb);
                if (i != this.f66396a.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o36$e */
    public static class C10171e extends C10177k {

        /* JADX INFO: renamed from: f */
        public static final C10171e f66397f = new C10171e(o36.f66365C, 1, 1);

        public C10171e(qqd qqdVar, int i, int i2) {
            super(qqdVar, i, i2);
        }

        private int binarySearch(C10170d c10170d, byte[] bArr) {
            int size = c10170d.size() - 1;
            int i = 0;
            while (i <= size) {
                int i2 = (i + size) >>> 1;
                int iM18329b = c10170d.get(i2).m18329b(bArr);
                if (iM18329b < 0) {
                    i = i2 + 1;
                } else {
                    if (iM18329b <= 0) {
                        return i2;
                    }
                    size = i2 - 1;
                }
            }
            return -(i + 1);
        }

        public static C10171e empty() {
            return f66397f;
        }

        public C10173g get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public C10170d keys() {
            int i = this.f66399b - (this.f66400c * 3);
            qqd qqdVar = this.f66398a;
            int iIndirect = o36.indirect(qqdVar, i, this.f66400c);
            qqd qqdVar2 = this.f66398a;
            int i2 = this.f66400c;
            return new C10170d(new C10175i(qqdVar, iIndirect, o36.readInt(qqdVar2, i + i2, i2), 4));
        }

        @Override // p000.o36.C10177k, p000.o36.AbstractC10172f
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            C10170d c10170dKeys = keys();
            int size = size();
            C10177k c10177kValues = values();
            for (int i = 0; i < size; i++) {
                sb.append('\"');
                sb.append(c10170dKeys.get(i).toString());
                sb.append("\" : ");
                sb.append(c10177kValues.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public C10177k values() {
            return new C10177k(this.f66398a, this.f66399b, this.f66400c);
        }

        public C10173g get(byte[] bArr) {
            C10170d c10170dKeys = keys();
            int size = c10170dKeys.size();
            int iBinarySearch = binarySearch(c10170dKeys, bArr);
            return (iBinarySearch < 0 || iBinarySearch >= size) ? C10173g.f66401f : get(iBinarySearch);
        }
    }

    /* JADX INFO: renamed from: o36$f */
    public static abstract class AbstractC10172f {

        /* JADX INFO: renamed from: a */
        public qqd f66398a;

        /* JADX INFO: renamed from: b */
        public int f66399b;

        /* JADX INFO: renamed from: c */
        public int f66400c;

        public AbstractC10172f(qqd qqdVar, int i, int i2) {
            this.f66398a = qqdVar;
            this.f66399b = i;
            this.f66400c = i2;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* JADX INFO: renamed from: o36$g */
    public static class C10173g {

        /* JADX INFO: renamed from: f */
        public static final C10173g f66401f = new C10173g(o36.f66365C, 0, 1, 0);

        /* JADX INFO: renamed from: a */
        public qqd f66402a;

        /* JADX INFO: renamed from: b */
        public int f66403b;

        /* JADX INFO: renamed from: c */
        public int f66404c;

        /* JADX INFO: renamed from: d */
        public int f66405d;

        /* JADX INFO: renamed from: e */
        public int f66406e;

        public C10173g(qqd qqdVar, int i, int i2, int i3) {
            this(qqdVar, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public C10167a asBlob() {
            if (!isBlob() && !isString()) {
                return C10167a.empty();
            }
            qqd qqdVar = this.f66402a;
            return new C10167a(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
        }

        public boolean asBoolean() {
            return isBoolean() ? this.f66402a.get(this.f66403b) != 0 : asUInt() != 0;
        }

        public double asFloat() {
            int i = this.f66406e;
            if (i == 3) {
                return o36.readDouble(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 1) {
                return o36.readInt(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i != 2) {
                if (i == 5) {
                    return Double.parseDouble(asString());
                }
                if (i == 6) {
                    qqd qqdVar = this.f66402a;
                    return o36.readInt(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
                }
                if (i == 7) {
                    qqd qqdVar2 = this.f66402a;
                    return o36.readUInt(qqdVar2, o36.indirect(qqdVar2, this.f66403b, this.f66404c), this.f66405d);
                }
                if (i == 8) {
                    qqd qqdVar3 = this.f66402a;
                    return o36.readDouble(qqdVar3, o36.indirect(qqdVar3, this.f66403b, this.f66404c), this.f66405d);
                }
                if (i == 10) {
                    return asVector().size();
                }
                if (i != 26) {
                    return 0.0d;
                }
            }
            return o36.readUInt(this.f66402a, this.f66403b, this.f66404c);
        }

        public int asInt() {
            int i = this.f66406e;
            if (i == 1) {
                return o36.readInt(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 2) {
                return (int) o36.readUInt(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 3) {
                return (int) o36.readDouble(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 5) {
                return Integer.parseInt(asString());
            }
            if (i == 6) {
                qqd qqdVar = this.f66402a;
                return o36.readInt(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
            }
            if (i == 7) {
                qqd qqdVar2 = this.f66402a;
                return (int) o36.readUInt(qqdVar2, o36.indirect(qqdVar2, this.f66403b, this.f66404c), this.f66404c);
            }
            if (i == 8) {
                qqd qqdVar3 = this.f66402a;
                return (int) o36.readDouble(qqdVar3, o36.indirect(qqdVar3, this.f66403b, this.f66404c), this.f66405d);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0;
            }
            return o36.readInt(this.f66402a, this.f66403b, this.f66404c);
        }

        public C10169c asKey() {
            if (!isKey()) {
                return C10169c.empty();
            }
            qqd qqdVar = this.f66402a;
            return new C10169c(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
        }

        public long asLong() {
            int i = this.f66406e;
            if (i == 1) {
                return o36.readLong(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 2) {
                return o36.readUInt(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 3) {
                return (long) o36.readDouble(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            if (i == 6) {
                qqd qqdVar = this.f66402a;
                return o36.readLong(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
            }
            if (i == 7) {
                qqd qqdVar2 = this.f66402a;
                return o36.readUInt(qqdVar2, o36.indirect(qqdVar2, this.f66403b, this.f66404c), this.f66404c);
            }
            if (i == 8) {
                qqd qqdVar3 = this.f66402a;
                return (long) o36.readDouble(qqdVar3, o36.indirect(qqdVar3, this.f66403b, this.f66404c), this.f66405d);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i != 26) {
                return 0L;
            }
            return o36.readInt(this.f66402a, this.f66403b, this.f66404c);
        }

        public C10171e asMap() {
            if (!isMap()) {
                return C10171e.empty();
            }
            qqd qqdVar = this.f66402a;
            return new C10171e(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
        }

        public String asString() {
            if (isString()) {
                int iIndirect = o36.indirect(this.f66402a, this.f66403b, this.f66404c);
                qqd qqdVar = this.f66402a;
                int i = this.f66405d;
                return this.f66402a.getString(iIndirect, (int) o36.readUInt(qqdVar, iIndirect - i, i));
            }
            if (!isKey()) {
                return "";
            }
            int iIndirect2 = o36.indirect(this.f66402a, this.f66403b, this.f66405d);
            int i2 = iIndirect2;
            while (this.f66402a.get(i2) != 0) {
                i2++;
            }
            return this.f66402a.getString(iIndirect2, i2 - iIndirect2);
        }

        public long asUInt() {
            int i = this.f66406e;
            if (i == 2) {
                return o36.readUInt(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 1) {
                return o36.readLong(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 3) {
                return (long) o36.readDouble(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 10) {
                return asVector().size();
            }
            if (i == 26) {
                return o36.readInt(this.f66402a, this.f66403b, this.f66404c);
            }
            if (i == 5) {
                return Long.parseLong(asString());
            }
            if (i == 6) {
                qqd qqdVar = this.f66402a;
                return o36.readLong(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
            }
            if (i == 7) {
                qqd qqdVar2 = this.f66402a;
                return o36.readUInt(qqdVar2, o36.indirect(qqdVar2, this.f66403b, this.f66404c), this.f66405d);
            }
            if (i != 8) {
                return 0L;
            }
            qqd qqdVar3 = this.f66402a;
            return (long) o36.readDouble(qqdVar3, o36.indirect(qqdVar3, this.f66403b, this.f66404c), this.f66404c);
        }

        public C10177k asVector() {
            if (isVector()) {
                qqd qqdVar = this.f66402a;
                return new C10177k(qqdVar, o36.indirect(qqdVar, this.f66403b, this.f66404c), this.f66405d);
            }
            int i = this.f66406e;
            if (i == 15) {
                qqd qqdVar2 = this.f66402a;
                return new C10175i(qqdVar2, o36.indirect(qqdVar2, this.f66403b, this.f66404c), this.f66405d, 4);
            }
            if (!o36.m18324h(i)) {
                return C10177k.empty();
            }
            qqd qqdVar3 = this.f66402a;
            return new C10175i(qqdVar3, o36.indirect(qqdVar3, this.f66403b, this.f66404c), this.f66405d, o36.m18327k(this.f66406e));
        }

        /* JADX INFO: renamed from: b */
        public StringBuilder m18331b(StringBuilder sb) {
            int i = this.f66406e;
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
                        C10169c c10169cAsKey = asKey();
                        sb.append('\"');
                        StringBuilder string = c10169cAsKey.toString(sb);
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
                        throw new C10168b("not_implemented:" + this.f66406e);
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
            return this.f66406e;
        }

        public boolean isBlob() {
            return this.f66406e == 25;
        }

        public boolean isBoolean() {
            return this.f66406e == 26;
        }

        public boolean isFloat() {
            int i = this.f66406e;
            return i == 3 || i == 8;
        }

        public boolean isInt() {
            int i = this.f66406e;
            return i == 1 || i == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.f66406e == 4;
        }

        public boolean isMap() {
            return this.f66406e == 9;
        }

        public boolean isNull() {
            return this.f66406e == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.f66406e == 5;
        }

        public boolean isTypedVector() {
            return o36.m18324h(this.f66406e);
        }

        public boolean isUInt() {
            int i = this.f66406e;
            return i == 2 || i == 7;
        }

        public boolean isVector() {
            int i = this.f66406e;
            return i == 10 || i == 9;
        }

        public String toString() {
            return m18331b(new StringBuilder(128)).toString();
        }

        public C10173g(qqd qqdVar, int i, int i2, int i3, int i4) {
            this.f66402a = qqdVar;
            this.f66403b = i;
            this.f66404c = i2;
            this.f66405d = i3;
            this.f66406e = i4;
        }
    }

    /* JADX INFO: renamed from: o36$h */
    public static abstract class AbstractC10174h extends AbstractC10172f {

        /* JADX INFO: renamed from: d */
        public final int f66407d;

        public AbstractC10174h(qqd qqdVar, int i, int i2) {
            super(qqdVar, i, i2);
            this.f66407d = o36.readInt(this.f66398a, i - i2, i2);
        }

        public int size() {
            return this.f66407d;
        }
    }

    /* JADX INFO: renamed from: o36$i */
    public static class C10175i extends C10177k {

        /* JADX INFO: renamed from: g */
        public static final C10175i f66408g = new C10175i(o36.f66365C, 1, 1, 1);

        /* JADX INFO: renamed from: f */
        public final int f66409f;

        public C10175i(qqd qqdVar, int i, int i2, int i3) {
            super(qqdVar, i, i2);
            this.f66409f = i3;
        }

        public static C10175i empty() {
            return f66408g;
        }

        @Override // p000.o36.C10177k
        public C10173g get(int i) {
            if (i >= size()) {
                return C10173g.f66401f;
            }
            return new C10173g(this.f66398a, this.f66399b + (i * this.f66400c), this.f66400c, 1, this.f66409f);
        }

        public int getElemType() {
            return this.f66409f;
        }

        public boolean isEmptyVector() {
            return this == f66408g;
        }
    }

    /* JADX INFO: renamed from: o36$j */
    public static class C10176j {
        /* JADX INFO: renamed from: a */
        public static int m18332a(byte b) {
            return b & 255;
        }

        /* JADX INFO: renamed from: b */
        public static long m18333b(int i) {
            return ((long) i) & 4294967295L;
        }

        /* JADX INFO: renamed from: c */
        public static int m18334c(short s) {
            return s & iqh.f48007d;
        }
    }

    /* JADX INFO: renamed from: o36$k */
    public static class C10177k extends AbstractC10174h {

        /* JADX INFO: renamed from: e */
        public static final C10177k f66410e = new C10177k(o36.f66365C, 1, 1);

        public C10177k(qqd qqdVar, int i, int i2) {
            super(qqdVar, i, i2);
        }

        public static C10177k empty() {
            return f66410e;
        }

        public C10173g get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return C10173g.f66401f;
            }
            return new C10173g(this.f66398a, this.f66399b + (i * this.f66400c), this.f66400c, C10176j.m18332a(this.f66398a.get((int) (((long) this.f66399b) + (size * ((long) this.f66400c)) + j))));
        }

        public boolean isEmpty() {
            return this == f66410e;
        }

        @Override // p000.o36.AbstractC10174h
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // p000.o36.AbstractC10172f
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // p000.o36.AbstractC10172f
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).m18331b(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18323g(int i) {
        return i <= 3 || i == 26;
    }

    @Deprecated
    public static C10173g getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new b70(byteBuffer.array(), byteBuffer.limit()) : new bj1(byteBuffer));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18324h(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18325i(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(qqd qqdVar, int i, int i2) {
        return (int) (((long) i) - readUInt(qqdVar, i, i2));
    }

    /* JADX INFO: renamed from: j */
    public static int m18326j(int i, int i2) {
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
    public static int m18327k(int i) {
        return i - 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(qqd qqdVar, int i, int i2) {
        if (i2 == 4) {
            return qqdVar.getFloat(i);
        }
        if (i2 != 8) {
            return -1.0d;
        }
        return qqdVar.getDouble(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(qqd qqdVar, int i, int i2) {
        return (int) readLong(qqdVar, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(qqd qqdVar, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = qqdVar.get(i);
        } else if (i2 == 2) {
            i3 = qqdVar.getShort(i);
        } else {
            if (i2 != 4) {
                if (i2 != 8) {
                    return -1L;
                }
                return qqdVar.getLong(i);
            }
            i3 = qqdVar.getInt(i);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(qqd qqdVar, int i, int i2) {
        if (i2 == 1) {
            return C10176j.m18332a(qqdVar.get(i));
        }
        if (i2 == 2) {
            return C10176j.m18334c(qqdVar.getShort(i));
        }
        if (i2 == 4) {
            return C10176j.m18333b(qqdVar.getInt(i));
        }
        if (i2 != 8) {
            return -1L;
        }
        return qqdVar.getLong(i);
    }

    public static C10173g getRoot(qqd qqdVar) {
        int iLimit = qqdVar.limit();
        byte b = qqdVar.get(iLimit - 1);
        int i = iLimit - 2;
        return new C10173g(qqdVar, i - b, b, C10176j.m18332a(qqdVar.get(i)));
    }
}
