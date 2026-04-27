package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gmd implements yfg {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<Object> f40229a = new ArrayList();

    private final void saveArgsToCache(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.f40229a.size() && (size = this.f40229a.size()) <= i2) {
            while (true) {
                this.f40229a.add(null);
                if (size == i2) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.f40229a.set(i2, obj);
    }

    @Override // p000.yfg
    public void bindBlob(int i, @yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "value");
        saveArgsToCache(i, bArr);
    }

    @Override // p000.yfg
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
    }

    @Override // p000.yfg
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
    }

    @Override // p000.yfg
    public void bindNull(int i) {
        saveArgsToCache(i, null);
    }

    @Override // p000.yfg
    public void bindString(int i, @yfb String str) {
        md8.checkNotNullParameter(str, "value");
        saveArgsToCache(i, str);
    }

    @Override // p000.yfg
    public void clearBindings() {
        this.f40229a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @yfb
    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.f40229a;
    }
}
