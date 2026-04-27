package p000;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class jyh<Data> implements vwa<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f52256b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final vwa<k77, Data> f52257a;

    /* JADX INFO: renamed from: jyh$a */
    public static class C8144a implements wwa<Uri, InputStream> {
        @Override // p000.wwa
        @efb
        public vwa<Uri, InputStream> build(t2b t2bVar) {
            return new jyh(t2bVar.build(k77.class, InputStream.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public jyh(vwa<k77, Data> vwaVar) {
        this.f52257a = vwaVar;
    }

    @Override // p000.vwa
    public vwa.C14279a<Data> buildLoadData(@efb Uri uri, int i, int i2, @efb i7c i7cVar) {
        return this.f52257a.buildLoadData(new k77(uri.toString()), i, i2, i7cVar);
    }

    @Override // p000.vwa
    public boolean handles(@efb Uri uri) {
        return f52256b.contains(uri.getScheme());
    }
}
