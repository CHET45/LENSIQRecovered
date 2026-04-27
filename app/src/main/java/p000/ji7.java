package p000;

import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public class ji7 {

    /* JADX INFO: renamed from: a */
    public static final ei7 f50662a;

    /* JADX INFO: renamed from: b */
    public static final ei7 f50663b;

    /* JADX INFO: renamed from: c */
    public static final ei7 f50664c;

    /* JADX INFO: renamed from: d */
    public static final ei7 f50665d;

    /* JADX INFO: renamed from: e */
    public static final ei7 f50666e;

    /* JADX INFO: renamed from: f */
    public static final ei7 f50667f;

    static {
        ByteString byteString = ei7.f33070g;
        f50662a = new ei7(byteString, "https");
        f50663b = new ei7(byteString, "http");
        ByteString byteString2 = ei7.f33068e;
        f50664c = new ei7(byteString2, "POST");
        f50665d = new ei7(byteString2, "GET");
        f50666e = new ei7(oc7.f67141j.name(), oc7.f67146o);
        f50667f = new ei7("te", oc7.f67148q);
    }

    private static List<ei7> addMetadata(List<ei7> list, fta ftaVar) {
        byte[][] http2Headers = fhh.toHttp2Headers(ftaVar);
        for (int i = 0; i < http2Headers.length; i += 2) {
            ByteString byteStringM18742of = ByteString.m18742of(http2Headers[i]);
            if (byteStringM18742of.size() != 0 && byteStringM18742of.getByte(0) != 58) {
                list.add(new ei7(byteStringM18742of, ByteString.m18742of(http2Headers[i + 1])));
            }
        }
        return list;
    }

    public static List<ei7> createHttpResponseHeaders(int i, String str, fta ftaVar) {
        ArrayList arrayList = new ArrayList(fb8.headerCount(ftaVar) + 2);
        arrayList.add(new ei7(ei7.f33067d, "" + i));
        arrayList.add(new ei7(oc7.f67141j.name(), str));
        return addMetadata(arrayList, ftaVar);
    }

    public static List<ei7> createRequestHeaders(fta ftaVar, String str, String str2, String str3, boolean z, boolean z2) {
        v7d.checkNotNull(ftaVar, "headers");
        v7d.checkNotNull(str, "defaultPath");
        v7d.checkNotNull(str2, "authority");
        stripNonApplicationHeaders(ftaVar);
        ArrayList arrayList = new ArrayList(fb8.headerCount(ftaVar) + 7);
        if (z2) {
            arrayList.add(f50663b);
        } else {
            arrayList.add(f50662a);
        }
        if (z) {
            arrayList.add(f50665d);
        } else {
            arrayList.add(f50664c);
        }
        arrayList.add(new ei7(ei7.f33071h, str2));
        arrayList.add(new ei7(ei7.f33069f, str));
        arrayList.add(new ei7(oc7.f67143l.name(), str3));
        arrayList.add(f50666e);
        arrayList.add(f50667f);
        return addMetadata(arrayList, ftaVar);
    }

    public static List<ei7> createResponseHeaders(fta ftaVar) {
        stripNonApplicationHeaders(ftaVar);
        ArrayList arrayList = new ArrayList(fb8.headerCount(ftaVar) + 2);
        arrayList.add(new ei7(ei7.f33067d, "200"));
        arrayList.add(f50666e);
        return addMetadata(arrayList, ftaVar);
    }

    public static List<ei7> createResponseTrailers(fta ftaVar, boolean z) {
        if (!z) {
            return createResponseHeaders(ftaVar);
        }
        stripNonApplicationHeaders(ftaVar);
        return addMetadata(new ArrayList(fb8.headerCount(ftaVar)), ftaVar);
    }

    private static void stripNonApplicationHeaders(fta ftaVar) {
        ftaVar.discardAll(oc7.f67141j);
        ftaVar.discardAll(oc7.f67142k);
        ftaVar.discardAll(oc7.f67143l);
    }
}
