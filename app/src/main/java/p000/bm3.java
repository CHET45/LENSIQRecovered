package p000;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p000.b72;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1704")
@kyg
public final class bm3 {

    /* JADX INFO: renamed from: c */
    public static final xj8 f14120c = xj8.m25234on(C4584d2.f28238g);

    /* JADX INFO: renamed from: d */
    public static final bm3 f14121d = emptyInstance().with(new b72.C1760a(), true).with(b72.C1761b.f12832a, false);

    /* JADX INFO: renamed from: a */
    public final Map<String, C1942a> f14122a;

    /* JADX INFO: renamed from: b */
    public final byte[] f14123b;

    /* JADX INFO: renamed from: bm3$a */
    public static final class C1942a {

        /* JADX INFO: renamed from: a */
        public final am3 f14124a;

        /* JADX INFO: renamed from: b */
        public final boolean f14125b;

        public C1942a(am3 am3Var, boolean z) {
            this.f14124a = (am3) v7d.checkNotNull(am3Var, "decompressor");
            this.f14125b = z;
        }
    }

    private bm3(am3 am3Var, boolean z, bm3 bm3Var) {
        String messageEncoding = am3Var.getMessageEncoding();
        v7d.checkArgument(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        int size = bm3Var.f14122a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm3Var.f14122a.containsKey(am3Var.getMessageEncoding()) ? size : size + 1);
        for (C1942a c1942a : bm3Var.f14122a.values()) {
            String messageEncoding2 = c1942a.f14124a.getMessageEncoding();
            if (!messageEncoding2.equals(messageEncoding)) {
                linkedHashMap.put(messageEncoding2, new C1942a(c1942a.f14124a, c1942a.f14125b));
            }
        }
        linkedHashMap.put(messageEncoding, new C1942a(am3Var, z));
        this.f14122a = Collections.unmodifiableMap(linkedHashMap);
        this.f14123b = f14120c.join(getAdvertisedMessageEncodings()).getBytes(Charset.forName("US-ASCII"));
    }

    public static bm3 emptyInstance() {
        return new bm3();
    }

    public static bm3 getDefaultInstance() {
        return f14121d;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m3247a() {
        return this.f14123b;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1704")
    public Set<String> getAdvertisedMessageEncodings() {
        HashSet hashSet = new HashSet(this.f14122a.size());
        for (Map.Entry<String, C1942a> entry : this.f14122a.entrySet()) {
            if (entry.getValue().f14125b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Set<String> getKnownMessageEncodings() {
        return this.f14122a.keySet();
    }

    @eib
    public am3 lookupDecompressor(String str) {
        C1942a c1942a = this.f14122a.get(str);
        if (c1942a != null) {
            return c1942a.f14124a;
        }
        return null;
    }

    public bm3 with(am3 am3Var, boolean z) {
        return new bm3(am3Var, z, this);
    }

    private bm3() {
        this.f14122a = new LinkedHashMap(0);
        this.f14123b = new byte[0];
    }
}
