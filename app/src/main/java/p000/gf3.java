package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p000.yh3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gf3 {
    private gf3() {
    }

    public static yh3 buildDataSpec(n3e n3eVar, String str, hpd hpdVar, int i, Map<String, String> map) {
        return new yh3.C15662b().setUri(hpdVar.resolveUri(str)).setPosition(hpdVar.f44441a).setLength(hpdVar.f44442b).setKey(resolveCacheKey(n3eVar, hpdVar)).setFlags(i).setHttpRequestHeaders(map).build();
    }

    @hib
    private static n3e getFirstRepresentation(vnc vncVar, int i) {
        int adaptationSetIndex = vncVar.getAdaptationSetIndex(i);
        if (adaptationSetIndex == -1) {
            return null;
        }
        List<n3e> list = vncVar.f91794c.get(adaptationSetIndex).f54058c;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @hib
    public static lz1 loadChunkIndex(ih3 ih3Var, int i, n3e n3eVar, int i2) throws IOException {
        if (n3eVar.getInitializationUri() == null) {
            return null;
        }
        iz1 iz1VarNewChunkExtractor = newChunkExtractor(i, n3eVar.f63195c);
        try {
            loadInitializationData(iz1VarNewChunkExtractor, ih3Var, n3eVar, i2, true);
            iz1VarNewChunkExtractor.release();
            return iz1VarNewChunkExtractor.getChunkIndex();
        } catch (Throwable th) {
            iz1VarNewChunkExtractor.release();
            throw th;
        }
    }

    @hib
    public static kq6 loadFormatWithDrmInitData(ih3 ih3Var, vnc vncVar) throws IOException {
        int i = 2;
        n3e firstRepresentation = getFirstRepresentation(vncVar, 2);
        if (firstRepresentation == null) {
            i = 1;
            firstRepresentation = getFirstRepresentation(vncVar, 1);
            if (firstRepresentation == null) {
                return null;
            }
        }
        kq6 kq6Var = firstRepresentation.f63195c;
        kq6 kq6VarLoadSampleFormat = loadSampleFormat(ih3Var, i, firstRepresentation);
        return kq6VarLoadSampleFormat == null ? kq6Var : kq6VarLoadSampleFormat.withManifestFormatInfo(kq6Var);
    }

    private static void loadInitializationData(iz1 iz1Var, ih3 ih3Var, n3e n3eVar, int i, boolean z) throws IOException {
        hpd hpdVar = (hpd) u80.checkNotNull(n3eVar.getInitializationUri());
        if (z) {
            hpd indexUri = n3eVar.getIndexUri();
            if (indexUri == null) {
                return;
            }
            hpd hpdVarAttemptMerge = hpdVar.attemptMerge(indexUri, n3eVar.f63196d.get(i).f79575a);
            if (hpdVarAttemptMerge == null) {
                loadInitializationData(ih3Var, n3eVar, i, iz1Var, hpdVar);
                hpdVar = indexUri;
            } else {
                hpdVar = hpdVarAttemptMerge;
            }
        }
        loadInitializationData(ih3Var, n3eVar, i, iz1Var, hpdVar);
    }

    public static af3 loadManifest(ih3 ih3Var, Uri uri) throws IOException {
        return (af3) dic.load(ih3Var, new bf3(), uri, 4);
    }

    @hib
    public static kq6 loadSampleFormat(ih3 ih3Var, int i, n3e n3eVar, int i2) throws IOException {
        if (n3eVar.getInitializationUri() == null) {
            return null;
        }
        iz1 iz1VarNewChunkExtractor = newChunkExtractor(i, n3eVar.f63195c);
        try {
            loadInitializationData(iz1VarNewChunkExtractor, ih3Var, n3eVar, i2, false);
            iz1VarNewChunkExtractor.release();
            return ((kq6[]) u80.checkStateNotNull(iz1VarNewChunkExtractor.getSampleFormats()))[0];
        } catch (Throwable th) {
            iz1VarNewChunkExtractor.release();
            throw th;
        }
    }

    private static iz1 newChunkExtractor(int i, kq6 kq6Var) {
        String str = kq6Var.f54988L;
        return new lh1((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new cv6() : new g4a(), i, kq6Var);
    }

    public static String resolveCacheKey(n3e n3eVar, hpd hpdVar) {
        String cacheKey = n3eVar.getCacheKey();
        return cacheKey != null ? cacheKey : hpdVar.resolveUri(n3eVar.f63196d.get(0).f79575a).toString();
    }

    public static void loadInitializationData(iz1 iz1Var, ih3 ih3Var, n3e n3eVar, boolean z) throws IOException {
        loadInitializationData(iz1Var, ih3Var, n3eVar, 0, z);
    }

    @hib
    public static lz1 loadChunkIndex(ih3 ih3Var, int i, n3e n3eVar) throws IOException {
        return loadChunkIndex(ih3Var, i, n3eVar, 0);
    }

    private static void loadInitializationData(ih3 ih3Var, n3e n3eVar, int i, iz1 iz1Var, hpd hpdVar) throws IOException {
        new m18(ih3Var, buildDataSpec(n3eVar, n3eVar.f63196d.get(i).f79575a, hpdVar, 0, ox7.m19076of()), n3eVar.f63195c, 0, null, iz1Var).load();
    }

    @hib
    public static kq6 loadSampleFormat(ih3 ih3Var, int i, n3e n3eVar) throws IOException {
        return loadSampleFormat(ih3Var, i, n3eVar, 0);
    }

    @Deprecated
    public static yh3 buildDataSpec(n3e n3eVar, String str, hpd hpdVar, int i) {
        return buildDataSpec(n3eVar, str, hpdVar, i, ox7.m19076of());
    }

    @Deprecated
    public static yh3 buildDataSpec(n3e n3eVar, hpd hpdVar, int i) {
        return buildDataSpec(n3eVar, n3eVar.f63196d.get(0).f79575a, hpdVar, i, ox7.m19076of());
    }
}
