package p000;

import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public class i1c implements uri {

    /* JADX INFO: renamed from: a */
    public static final int f45433a = 4096;

    /* JADX INFO: renamed from: b */
    public static final int f45434b = 1048576;

    @Override // p000.uri
    public tri allocate(int i) {
        return new h1c(new Buffer(), Math.min(1048576, Math.max(4096, i)));
    }
}
