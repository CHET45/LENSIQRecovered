package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.p017ws.WebSocketProtocol;
import p000.jvd;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class us1 {

    /* JADX INFO: renamed from: a */
    public final int f88894a;

    /* JADX INFO: renamed from: b */
    public final int f88895b = 1;

    /* JADX INFO: renamed from: c */
    public final int f88896c = 2;

    /* JADX INFO: renamed from: d */
    public final int f88897d = 3;

    /* JADX INFO: renamed from: e */
    public final int f88898e = 4;

    /* JADX INFO: renamed from: f */
    public final int f88899f = 5;

    /* JADX INFO: renamed from: g */
    public final int f88900g = 6;

    /* JADX INFO: renamed from: h */
    public final int f88901h = 7;

    /* JADX INFO: renamed from: us1$a */
    public static final class C13672a {

        /* JADX INFO: renamed from: a */
        public final long f88902a;

        /* JADX INFO: renamed from: b */
        public final int f88903b;

        public C13672a(long j, int i) {
            this.f88902a = j;
            this.f88903b = i;
        }

        public static /* synthetic */ C13672a copy$default(C13672a c13672a, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = c13672a.f88902a;
            }
            if ((i2 & 2) != 0) {
                i = c13672a.f88903b;
            }
            return c13672a.copy(j, i);
        }

        public final long component1() {
            return this.f88902a;
        }

        public final int component2() {
            return this.f88903b;
        }

        @yfb
        public final C13672a copy(long j, int i) {
            return new C13672a(j, i);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13672a)) {
                return false;
            }
            C13672a c13672a = (C13672a) obj;
            return this.f88902a == c13672a.f88902a && this.f88903b == c13672a.f88903b;
        }

        public final long getArg() {
            return this.f88902a;
        }

        public final int getLen() {
            return this.f88903b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f88902a) * 31) + Integer.hashCode(this.f88903b);
        }

        @yfb
        public String toString() {
            return "Arg(arg=" + this.f88902a + ", len=" + this.f88903b + ')';
        }
    }

    /* JADX INFO: renamed from: us1$b */
    public static final class C13673b {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Object f88904a;

        /* JADX INFO: renamed from: b */
        public final int f88905b;

        public C13673b(@yfb Object obj, int i) {
            md8.checkNotNullParameter(obj, "item");
            this.f88904a = obj;
            this.f88905b = i;
        }

        public static /* synthetic */ C13673b copy$default(C13673b c13673b, Object obj, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = c13673b.f88904a;
            }
            if ((i2 & 2) != 0) {
                i = c13673b.f88905b;
            }
            return c13673b.copy(obj, i);
        }

        @yfb
        public final Object component1() {
            return this.f88904a;
        }

        public final int component2() {
            return this.f88905b;
        }

        @yfb
        public final C13673b copy(@yfb Object obj, int i) {
            md8.checkNotNullParameter(obj, "item");
            return new C13673b(obj, i);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13673b)) {
                return false;
            }
            C13673b c13673b = (C13673b) obj;
            return md8.areEqual(this.f88904a, c13673b.f88904a) && this.f88905b == c13673b.f88905b;
        }

        @yfb
        public final Object getItem() {
            return this.f88904a;
        }

        public final int getLen() {
            return this.f88905b;
        }

        public int hashCode() {
            return (this.f88904a.hashCode() * 31) + Integer.hashCode(this.f88905b);
        }

        @yfb
        public String toString() {
            return "Item(item=" + this.f88904a + ", len=" + this.f88905b + ')';
        }
    }

    private final byte[] createArg(int i, long j) {
        int i2 = i << 5;
        int i3 = (int) j;
        if (j < 24) {
            return new byte[]{(byte) ((i2 | i3) & 255)};
        }
        if (j <= 255) {
            return new byte[]{(byte) ((i2 | 24) & 255), (byte) (i3 & 255)};
        }
        if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return new byte[]{(byte) ((i2 | 25) & 255), (byte) ((i3 >> 8) & 255), (byte) (i3 & 255)};
        }
        if (j <= 4294967295L) {
            return new byte[]{(byte) ((i2 | 26) & 255), (byte) ((i3 >> 24) & 255), (byte) ((i3 >> 16) & 255), (byte) ((i3 >> 8) & 255), (byte) (i3 & 255)};
        }
        throw new IllegalArgumentException("bad Arg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int encode$lambda$0(jvd.C8121h c8121h, byte[] bArr, byte[] bArr2) {
        md8.checkNotNullParameter(c8121h, "$byteMap");
        Object obj = ((Map) c8121h.f52110a).get(bArr);
        md8.checkNotNull(obj);
        byte[] bArr3 = (byte[]) obj;
        Object obj2 = ((Map) c8121h.f52110a).get(bArr2);
        md8.checkNotNull(obj2);
        byte[] bArr4 = (byte[]) obj2;
        if (bArr.length > bArr2.length) {
            return 1;
        }
        if (bArr.length >= bArr2.length) {
            if (bArr3.length > bArr4.length) {
                return 1;
            }
            if (bArr3.length >= bArr4.length) {
                return 0;
            }
        }
        return -1;
    }

    private final C13672a getArg(byte[] bArr, int i) {
        long j = ((long) bArr[i]) & 31;
        if (j < 24) {
            return new C13672a(j, 1);
        }
        if (j == 24) {
            return new C13672a(((long) bArr[i + 1]) & 255, 2);
        }
        if (j == 25) {
            return new C13672a((((long) bArr[i + 2]) & 255) | ((((long) bArr[i + 1]) & 255) << 8), 3);
        }
        if (j != 26) {
            throw new IllegalArgumentException("Bad arg");
        }
        return new C13672a((((long) bArr[i + 4]) & 255) | ((((long) bArr[i + 1]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 8), 5);
    }

    private final int getType(byte[] bArr, int i) {
        return (bArr[i] & 255) >> 5;
    }

    private final C13673b parseItem(byte[] bArr, int i) {
        int type = getType(bArr, i);
        C13672a arg = getArg(bArr, i);
        System.out.println((Object) ("Type " + type + ' ' + arg.getArg() + ' ' + arg.getLen()));
        if (type == this.f88894a) {
            return new C13673b(Long.valueOf(arg.getArg()), arg.getLen());
        }
        if (type == this.f88895b) {
            return new C13673b(Long.valueOf(((long) (-1)) - arg.getArg()), arg.getLen());
        }
        if (type == this.f88896c) {
            return new C13673b(e80.sliceArray(bArr, kpd.until(arg.getLen() + i, i + arg.getLen() + ((int) arg.getArg()))), arg.getLen() + ((int) arg.getArg()));
        }
        if (type == this.f88897d) {
            return new C13673b(new String(e80.sliceArray(bArr, kpd.until(arg.getLen() + i, i + arg.getLen() + ((int) arg.getArg()))), xw1.f99524b), arg.getLen() + ((int) arg.getArg()));
        }
        int i2 = 0;
        if (type == this.f88898e) {
            ArrayList arrayList = new ArrayList();
            int len = arg.getLen();
            int arg2 = (int) arg.getArg();
            while (i2 < arg2) {
                C13673b item = parseItem(bArr, i + len);
                arrayList.add(item.getItem());
                len += item.getLen();
                i2++;
            }
            return new C13673b(v82.toList(arrayList), len);
        }
        if (type != this.f88899f) {
            throw new IllegalArgumentException("Bad type");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int len2 = arg.getLen();
        int arg3 = (int) arg.getArg();
        while (i2 < arg3) {
            C13673b item2 = parseItem(bArr, i + len2);
            int len3 = len2 + item2.getLen();
            C13673b item3 = parseItem(bArr, i + len3);
            len2 = len3 + item3.getLen();
            linkedHashMap.put(item2.getItem(), item3.getItem());
            i2++;
        }
        return new C13673b(xt9.toMap(linkedHashMap), len2);
    }

    @yfb
    public final Object decode(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "data");
        return parseItem(bArr, 0).getItem();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.LinkedHashMap] */
    @yfb
    public final byte[] encode(@yfb Object obj) {
        md8.checkNotNullParameter(obj, "data");
        if (obj instanceof Number) {
            if (obj instanceof Double) {
                throw new IllegalArgumentException("Don't support doubles yet");
            }
            long jLongValue = ((Number) obj).longValue();
            return jLongValue >= 0 ? createArg(this.f88894a, jLongValue) : createArg(this.f88895b, ((long) (-1)) - jLongValue);
        }
        if (obj instanceof byte[]) {
            return u70.plus(createArg(this.f88896c, r6.length), (byte[]) obj);
        }
        if (obj instanceof String) {
            return u70.plus(createArg(this.f88897d, r6.length()), h9g.encodeToByteArray((String) obj));
        }
        if (obj instanceof List) {
            byte[] bArrCreateArg = createArg(this.f88898e, r6.size());
            for (Object obj2 : (List) obj) {
                md8.checkNotNull(obj2);
                bArrCreateArg = u70.plus(bArrCreateArg, encode(obj2));
            }
            return bArrCreateArg;
        }
        if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Bad type");
        }
        byte[] bArrCreateArg2 = createArg(this.f88899f, r6.size());
        final jvd.C8121h c8121h = new jvd.C8121h();
        c8121h.f52110a = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Map map = (Map) c8121h.f52110a;
            Object key = entry.getKey();
            md8.checkNotNull(key);
            byte[] bArrEncode = encode(key);
            Object value = entry.getValue();
            md8.checkNotNull(value);
            map.put(bArrEncode, encode(value));
        }
        ArrayList<byte[]> arrayList = new ArrayList(((Map) c8121h.f52110a).keySet());
        v82.sortedWith(arrayList, new Comparator() { // from class: ts1
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return us1.encode$lambda$0(c8121h, (byte[]) obj3, (byte[]) obj4);
            }
        });
        for (byte[] bArr : arrayList) {
            md8.checkNotNullExpressionValue(bArr, "key");
            byte[] bArrPlus = u70.plus(bArrCreateArg2, bArr);
            Object obj3 = ((Map) c8121h.f52110a).get(bArr);
            md8.checkNotNull(obj3);
            bArrCreateArg2 = u70.plus(bArrPlus, (byte[]) obj3);
        }
        return bArrCreateArg2;
    }

    public final int getTYPE_ARRAY() {
        return this.f88898e;
    }

    public final int getTYPE_BYTE_STRING() {
        return this.f88896c;
    }

    public final int getTYPE_FLOAT() {
        return this.f88901h;
    }

    public final int getTYPE_MAP() {
        return this.f88899f;
    }

    public final int getTYPE_NEGATIVE_INT() {
        return this.f88895b;
    }

    public final int getTYPE_TAG() {
        return this.f88900g;
    }

    public final int getTYPE_TEXT_STRING() {
        return this.f88897d;
    }

    public final int getTYPE_UNSIGNED_INT() {
        return this.f88894a;
    }
}
