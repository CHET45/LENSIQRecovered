package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p000.le4;
import p000.pe4;

/* JADX INFO: loaded from: classes3.dex */
public class re4 implements le4 {

    /* JADX INFO: renamed from: f */
    public static final String f77980f = "DiskLruCacheWrapper";

    /* JADX INFO: renamed from: g */
    public static final int f77981g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f77982h = 1;

    /* JADX INFO: renamed from: i */
    public static re4 f77983i;

    /* JADX INFO: renamed from: b */
    public final File f77985b;

    /* JADX INFO: renamed from: c */
    public final long f77986c;

    /* JADX INFO: renamed from: e */
    public pe4 f77988e;

    /* JADX INFO: renamed from: d */
    public final oe4 f77987d = new oe4();

    /* JADX INFO: renamed from: a */
    public final ske f77984a = new ske();

    @Deprecated
    public re4(File file, long j) {
        this.f77985b = file;
        this.f77986c = j;
    }

    public static le4 create(File file, long j) {
        return new re4(file, j);
    }

    @Deprecated
    public static synchronized le4 get(File file, long j) {
        try {
            if (f77983i == null) {
                f77983i = new re4(file, j);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f77983i;
    }

    private synchronized pe4 getDiskCache() throws IOException {
        try {
            if (this.f77988e == null) {
                this.f77988e = pe4.open(this.f77985b, 1, 1, this.f77986c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f77988e;
    }

    private synchronized void resetDiskCache() {
        this.f77988e = null;
    }

    @Override // p000.le4
    public synchronized void clear() {
        try {
            try {
                getDiskCache().delete();
            } catch (IOException e) {
                if (Log.isLoggable(f77980f, 5)) {
                    Log.w(f77980f, "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
        } finally {
            resetDiskCache();
        }
    }

    @Override // p000.le4
    public void delete(eq8 eq8Var) {
        try {
            getDiskCache().remove(this.f77984a.getSafeKey(eq8Var));
        } catch (IOException e) {
            if (Log.isLoggable(f77980f, 5)) {
                Log.w(f77980f, "Unable to delete from disk cache", e);
            }
        }
    }

    @Override // p000.le4
    public void put(eq8 eq8Var, le4.InterfaceC8784b interfaceC8784b) {
        pe4 diskCache;
        String safeKey = this.f77984a.getSafeKey(eq8Var);
        this.f77987d.m18605a(safeKey);
        try {
            if (Log.isLoggable(f77980f, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(safeKey);
                sb.append(" for for Key: ");
                sb.append(eq8Var);
            }
            try {
                diskCache = getDiskCache();
            } catch (IOException e) {
                if (Log.isLoggable(f77980f, 5)) {
                    Log.w(f77980f, "Unable to put to disk cache", e);
                }
            }
            if (diskCache.get(safeKey) != null) {
                return;
            }
            pe4.C10927c c10927cEdit = diskCache.edit(safeKey);
            if (c10927cEdit == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + safeKey);
            }
            try {
                if (interfaceC8784b.write(c10927cEdit.getFile(0))) {
                    c10927cEdit.commit();
                }
                c10927cEdit.abortUnlessCommitted();
            } catch (Throwable th) {
                c10927cEdit.abortUnlessCommitted();
                throw th;
            }
        } finally {
            this.f77987d.m18606b(safeKey);
        }
    }

    @Override // p000.le4
    public File get(eq8 eq8Var) {
        String safeKey = this.f77984a.getSafeKey(eq8Var);
        if (Log.isLoggable(f77980f, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(safeKey);
            sb.append(" for for Key: ");
            sb.append(eq8Var);
        }
        try {
            pe4.C10929e c10929e = getDiskCache().get(safeKey);
            if (c10929e != null) {
                return c10929e.getFile(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(f77980f, 5)) {
                return null;
            }
            Log.w(f77980f, "Unable to get from disk cache", e);
            return null;
        }
    }
}
