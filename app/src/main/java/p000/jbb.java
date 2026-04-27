package p000;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class jbb {

    /* JADX INFO: renamed from: a */
    @efb
    public final ebb f50243a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ro9 f50244b;

    public jbb(@efb ebb ebbVar, @efb ro9 ro9Var) {
        this.f50243a = ebbVar;
        this.f50244b = ro9Var;
    }

    @xqi
    @hib
    private bn9 fetchFromCache(@efb String str, @hib String str2) {
        Pair<ts5, InputStream> pairM9854a;
        if (str2 == null || (pairM9854a = this.f50243a.m9854a(str)) == null) {
            return null;
        }
        ts5 ts5Var = (ts5) pairM9854a.first;
        InputStream inputStream = (InputStream) pairM9854a.second;
        xo9<bn9> xo9VarFromZipStreamSync = ts5Var == ts5.ZIP ? on9.fromZipStreamSync(new ZipInputStream(inputStream), str) : on9.fromJsonInputStreamSync(inputStream, str);
        if (xo9VarFromZipStreamSync.getValue() != null) {
            return xo9VarFromZipStreamSync.getValue();
        }
        return null;
    }

    @efb
    @xqi
    private xo9<bn9> fetchFromNetwork(@efb String str, @hib String str2) {
        dj9.debug("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                ho9 ho9VarFetchSync = this.f50244b.fetchSync(str);
                if (!ho9VarFetchSync.isSuccessful()) {
                    xo9<bn9> xo9Var = new xo9<>(new IllegalArgumentException(ho9VarFetchSync.error()));
                    try {
                        ho9VarFetchSync.close();
                    } catch (IOException e) {
                        dj9.warning("LottieFetchResult close failed ", e);
                    }
                    return xo9Var;
                }
                xo9<bn9> xo9VarFromInputStream = fromInputStream(str, ho9VarFetchSync.bodyByteStream(), ho9VarFetchSync.contentType(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(xo9VarFromInputStream.getValue() != null);
                dj9.debug(sb.toString());
                try {
                    ho9VarFetchSync.close();
                } catch (IOException e2) {
                    dj9.warning("LottieFetchResult close failed ", e2);
                }
                return xo9VarFromInputStream;
            } catch (Exception e3) {
                xo9<bn9> xo9Var2 = new xo9<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        dj9.warning("LottieFetchResult close failed ", e4);
                    }
                }
                return xo9Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    dj9.warning("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    @efb
    private xo9<bn9> fromInputStream(@efb String str, @efb InputStream inputStream, @hib String str2, @hib String str3) throws IOException {
        ts5 ts5Var;
        xo9<bn9> xo9VarFromZipStream;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            dj9.debug("Handling zip response.");
            ts5Var = ts5.ZIP;
            xo9VarFromZipStream = fromZipStream(str, inputStream, str3);
        } else {
            dj9.debug("Received json response.");
            ts5Var = ts5.JSON;
            xo9VarFromZipStream = fromJsonStream(str, inputStream, str3);
        }
        if (str3 != null && xo9VarFromZipStream.getValue() != null) {
            this.f50243a.m9855b(str, ts5Var);
        }
        return xo9VarFromZipStream;
    }

    @efb
    private xo9<bn9> fromJsonStream(@efb String str, @efb InputStream inputStream, @hib String str2) throws IOException {
        return str2 == null ? on9.fromJsonInputStreamSync(inputStream, null) : on9.fromJsonInputStreamSync(new FileInputStream(this.f50243a.m9856c(str, inputStream, ts5.JSON).getAbsolutePath()), str);
    }

    @efb
    private xo9<bn9> fromZipStream(@efb String str, @efb InputStream inputStream, @hib String str2) throws IOException {
        return str2 == null ? on9.fromZipStreamSync(new ZipInputStream(inputStream), null) : on9.fromZipStreamSync(new ZipInputStream(new FileInputStream(this.f50243a.m9856c(str, inputStream, ts5.ZIP))), str);
    }

    @efb
    @xqi
    public xo9<bn9> fetchSync(@efb String str, @hib String str2) {
        bn9 bn9VarFetchFromCache = fetchFromCache(str, str2);
        if (bn9VarFetchFromCache != null) {
            return new xo9<>(bn9VarFetchFromCache);
        }
        dj9.debug("Animation for " + str + " not found in cache. Fetching from network.");
        return fetchFromNetwork(str, str2);
    }
}
