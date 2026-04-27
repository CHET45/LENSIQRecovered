package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public final class am7 {

    /* JADX INFO: renamed from: a */
    public static final int f2045a = 15;

    /* JADX INFO: renamed from: b */
    public static final int f2046b = 31;

    /* JADX INFO: renamed from: c */
    public static final int f2047c = 63;

    /* JADX INFO: renamed from: d */
    public static final int f2048d = 127;

    /* JADX INFO: renamed from: e */
    public static final ByteString f2049e = ByteString.encodeUtf8(g1i.f38277c);

    /* JADX INFO: renamed from: f */
    public static final int f2050f = 4096;

    /* JADX INFO: renamed from: g */
    public static final int f2051g = 16384;

    /* JADX INFO: renamed from: h */
    public static final ei7[] f2052h;

    /* JADX INFO: renamed from: i */
    public static final Map<ByteString, Integer> f2053i;

    /* JADX INFO: renamed from: am7$a */
    public static final class C0322a {

        /* JADX INFO: renamed from: a */
        public final List<ei7> f2054a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f2055b;

        /* JADX INFO: renamed from: c */
        public int f2056c;

        /* JADX INFO: renamed from: d */
        public int f2057d;

        /* JADX INFO: renamed from: e */
        public ei7[] f2058e;

        /* JADX INFO: renamed from: f */
        public int f2059f;

        /* JADX INFO: renamed from: g */
        public int f2060g;

        /* JADX INFO: renamed from: h */
        public int f2061h;

        public C0322a(int i, Source source) {
            this(i, i, source);
        }

        private void adjustDynamicTableByteCount() {
            int i = this.f2057d;
            int i2 = this.f2061h;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.f2058e, (Object) null);
            this.f2059f = this.f2058e.length - 1;
            this.f2060g = 0;
            this.f2061h = 0;
        }

        private int dynamicTableIndex(int i) {
            return this.f2059f + 1 + i;
        }

        private int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f2058e.length;
                while (true) {
                    length--;
                    i2 = this.f2059f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f2058e[length].f33076c;
                    i -= i4;
                    this.f2061h -= i4;
                    this.f2060g--;
                    i3++;
                }
                ei7[] ei7VarArr = this.f2058e;
                System.arraycopy(ei7VarArr, i2 + 1, ei7VarArr, i2 + 1 + i3, this.f2060g);
                this.f2059f += i3;
            }
            return i3;
        }

        private ByteString getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return am7.f2052h[i].f33074a;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - am7.f2052h.length);
            if (iDynamicTableIndex >= 0) {
                ei7[] ei7VarArr = this.f2058e;
                if (iDynamicTableIndex < ei7VarArr.length) {
                    return ei7VarArr[iDynamicTableIndex].f33074a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void insertIntoDynamicTable(int i, ei7 ei7Var) {
            this.f2054a.add(ei7Var);
            int i2 = ei7Var.f33076c;
            if (i != -1) {
                i2 -= this.f2058e[dynamicTableIndex(i)].f33076c;
            }
            int i3 = this.f2057d;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.f2061h + i2) - i3);
            if (i == -1) {
                int i4 = this.f2060g + 1;
                ei7[] ei7VarArr = this.f2058e;
                if (i4 > ei7VarArr.length) {
                    ei7[] ei7VarArr2 = new ei7[ei7VarArr.length * 2];
                    System.arraycopy(ei7VarArr, 0, ei7VarArr2, ei7VarArr.length, ei7VarArr.length);
                    this.f2059f = this.f2058e.length - 1;
                    this.f2058e = ei7VarArr2;
                }
                int i5 = this.f2059f;
                this.f2059f = i5 - 1;
                this.f2058e[i5] = ei7Var;
                this.f2060g++;
            } else {
                this.f2058e[i + dynamicTableIndex(i) + iEvictToRecoverBytes] = ei7Var;
            }
            this.f2061h += i2;
        }

        private boolean isStaticHeader(int i) {
            return i >= 0 && i <= am7.f2052h.length - 1;
        }

        private int readByte() throws IOException {
            return this.f2055b.readByte() & 255;
        }

        private void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.f2054a.add(am7.f2052h[i]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - am7.f2052h.length);
            if (iDynamicTableIndex >= 0) {
                ei7[] ei7VarArr = this.f2058e;
                if (iDynamicTableIndex <= ei7VarArr.length - 1) {
                    this.f2054a.add(ei7VarArr[iDynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
            insertIntoDynamicTable(-1, new ei7(getName(i), m903c()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new ei7(am7.checkLowercase(m903c()), m903c()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.f2054a.add(new ei7(getName(i), m903c()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.f2054a.add(new ei7(am7.checkLowercase(m903c()), m903c()));
        }

        /* JADX INFO: renamed from: a */
        public void m901a(int i) {
            this.f2056c = i;
            this.f2057d = i;
            adjustDynamicTableByteCount();
        }

        /* JADX INFO: renamed from: b */
        public int m902b() {
            return this.f2057d;
        }

        /* JADX INFO: renamed from: c */
        public ByteString m903c() throws IOException {
            int i = readByte();
            boolean z = (i & 128) == 128;
            int iM905e = m905e(i, 127);
            return z ? ByteString.m18742of(zo7.get().m26916a(this.f2055b.readByteArray(iM905e))) : this.f2055b.readByteString(iM905e);
        }

        /* JADX INFO: renamed from: d */
        public void m904d() throws IOException {
            while (!this.f2055b.exhausted()) {
                byte b = this.f2055b.readByte();
                int i = b & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & 128) == 128) {
                    readIndexedHeader(m905e(i, 127) - 1);
                } else if (i == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((b & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(m905e(i, 63) - 1);
                } else if ((b & 32) == 32) {
                    int iM905e = m905e(i, 31);
                    this.f2057d = iM905e;
                    if (iM905e < 0 || iM905e > this.f2056c) {
                        throw new IOException("Invalid dynamic table size update " + this.f2057d);
                    }
                    adjustDynamicTableByteCount();
                } else if (i == 16 || i == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(m905e(i, 15) - 1);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public int m905e(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = readByte();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public List<ei7> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.f2054a);
            this.f2054a.clear();
            return arrayList;
        }

        public C0322a(int i, int i2, Source source) {
            this.f2054a = new ArrayList();
            this.f2058e = new ei7[8];
            this.f2059f = r0.length - 1;
            this.f2060g = 0;
            this.f2061h = 0;
            this.f2056c = i;
            this.f2057d = i2;
            this.f2055b = Okio.buffer(source);
        }
    }

    /* JADX INFO: renamed from: am7$b */
    public static final class C0323b {

        /* JADX INFO: renamed from: a */
        public final Buffer f2062a;

        /* JADX INFO: renamed from: b */
        public boolean f2063b;

        /* JADX INFO: renamed from: c */
        public int f2064c;

        /* JADX INFO: renamed from: d */
        public int f2065d;

        /* JADX INFO: renamed from: e */
        public boolean f2066e;

        /* JADX INFO: renamed from: f */
        public int f2067f;

        /* JADX INFO: renamed from: g */
        public ei7[] f2068g;

        /* JADX INFO: renamed from: h */
        public int f2069h;

        /* JADX INFO: renamed from: i */
        public int f2070i;

        /* JADX INFO: renamed from: j */
        public int f2071j;

        public C0323b(Buffer buffer) {
            this(4096, false, buffer);
        }

        private void adjustDynamicTableByteCount() {
            int i = this.f2067f;
            int i2 = this.f2071j;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.f2068g, (Object) null);
            this.f2070i = this.f2068g.length - 1;
            this.f2069h = 0;
            this.f2071j = 0;
        }

        private int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f2068g.length;
                while (true) {
                    length--;
                    i2 = this.f2070i;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.f2068g[length].f33076c;
                    i -= i4;
                    this.f2071j -= i4;
                    this.f2069h--;
                    i3++;
                }
                ei7[] ei7VarArr = this.f2068g;
                System.arraycopy(ei7VarArr, i2 + 1, ei7VarArr, i2 + 1 + i3, this.f2069h);
                this.f2070i += i3;
            }
            return i3;
        }

        private void insertIntoDynamicTable(ei7 ei7Var) {
            int i = ei7Var.f33076c;
            int i2 = this.f2067f;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.f2071j + i) - i2);
            int i3 = this.f2069h + 1;
            ei7[] ei7VarArr = this.f2068g;
            if (i3 > ei7VarArr.length) {
                ei7[] ei7VarArr2 = new ei7[ei7VarArr.length * 2];
                System.arraycopy(ei7VarArr, 0, ei7VarArr2, ei7VarArr.length, ei7VarArr.length);
                this.f2070i = this.f2068g.length - 1;
                this.f2068g = ei7VarArr2;
            }
            int i4 = this.f2070i;
            this.f2070i = i4 - 1;
            this.f2068g[i4] = ei7Var;
            this.f2069h++;
            this.f2071j += i;
        }

        /* JADX INFO: renamed from: a */
        public int m906a() {
            return this.f2067f;
        }

        /* JADX INFO: renamed from: b */
        public void m907b(int i) {
            this.f2064c = i;
            int iMin = Math.min(i, 16384);
            int i2 = this.f2067f;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f2065d = Math.min(this.f2065d, iMin);
            }
            this.f2066e = true;
            this.f2067f = iMin;
            adjustDynamicTableByteCount();
        }

        /* JADX INFO: renamed from: c */
        public void m908c(ByteString byteString) throws IOException {
            if (!this.f2063b || zo7.get().m26918c(byteString.toByteArray()) >= byteString.size()) {
                m910e(byteString.size(), 127, 0);
                this.f2062a.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            zo7.get().m26917b(byteString.toByteArray(), buffer.outputStream());
            ByteString byteString2 = buffer.readByteString();
            m910e(byteString2.size(), 127, 128);
            this.f2062a.write(byteString2);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m909d(java.util.List<p000.ei7> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.am7.C0323b.m909d(java.util.List):void");
        }

        /* JADX INFO: renamed from: e */
        public void m910e(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.f2062a.writeByte(i | i3);
                return;
            }
            this.f2062a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f2062a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f2062a.writeByte(i4);
        }

        public C0323b(int i, boolean z, Buffer buffer) {
            this.f2065d = Integer.MAX_VALUE;
            this.f2068g = new ei7[8];
            this.f2070i = r0.length - 1;
            this.f2064c = i;
            this.f2067f = i;
            this.f2063b = z;
            this.f2062a = buffer;
        }
    }

    static {
        ei7 ei7Var = new ei7(ei7.f33071h, "");
        ByteString byteString = ei7.f33068e;
        ei7 ei7Var2 = new ei7(byteString, "GET");
        ei7 ei7Var3 = new ei7(byteString, "POST");
        ByteString byteString2 = ei7.f33069f;
        ei7 ei7Var4 = new ei7(byteString2, pj4.f71071b);
        ei7 ei7Var5 = new ei7(byteString2, "/index.html");
        ByteString byteString3 = ei7.f33070g;
        ei7 ei7Var6 = new ei7(byteString3, "http");
        ei7 ei7Var7 = new ei7(byteString3, "https");
        ByteString byteString4 = ei7.f33067d;
        f2052h = new ei7[]{ei7Var, ei7Var2, ei7Var3, ei7Var4, ei7Var5, ei7Var6, ei7Var7, new ei7(byteString4, "200"), new ei7(byteString4, "204"), new ei7(byteString4, "206"), new ei7(byteString4, "304"), new ei7(byteString4, "400"), new ei7(byteString4, yab.f100987b), new ei7(byteString4, "500"), new ei7("accept-charset", ""), new ei7(oc7.f67153v, "gzip, deflate"), new ei7("accept-language", ""), new ei7("accept-ranges", ""), new ei7("accept", ""), new ei7("access-control-allow-origin", ""), new ei7("age", ""), new ei7("allow", ""), new ei7("authorization", ""), new ei7("cache-control", ""), new ei7("content-disposition", ""), new ei7(oc7.f67152u, ""), new ei7("content-language", ""), new ei7("content-length", ""), new ei7("content-location", ""), new ei7("content-range", ""), new ei7("content-type", ""), new ei7("cookie", ""), new ei7("date", ""), new ei7("etag", ""), new ei7("expect", ""), new ei7("expires", ""), new ei7(ymh.InterfaceC15729h.f102263c, ""), new ei7("host", ""), new ei7("if-match", ""), new ei7("if-modified-since", ""), new ei7("if-none-match", ""), new ei7("if-range", ""), new ei7("if-unmodified-since", ""), new ei7("last-modified", ""), new ei7("link", ""), new ei7(FirebaseAnalytics.C3552d.f23227s, ""), new ei7("max-forwards", ""), new ei7("proxy-authenticate", ""), new ei7("proxy-authorization", ""), new ei7("range", ""), new ei7("referer", ""), new ei7("refresh", ""), new ei7("retry-after", ""), new ei7("server", ""), new ei7("set-cookie", ""), new ei7("strict-transport-security", ""), new ei7("transfer-encoding", ""), new ei7("user-agent", ""), new ei7("vary", ""), new ei7("via", ""), new ei7("www-authenticate", "")};
        f2053i = nameToFirstIndex();
    }

    private am7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString checkLowercase(ByteString byteString) throws IOException {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b = byteString.getByte(i);
            if (b >= 65 && b <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    private static Map<ByteString, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f2052h.length);
        int i = 0;
        while (true) {
            ei7[] ei7VarArr = f2052h;
            if (i >= ei7VarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(ei7VarArr[i].f33074a)) {
                linkedHashMap.put(ei7VarArr[i].f33074a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
