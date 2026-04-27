package p000;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class q75 {

    /* JADX INFO: renamed from: a */
    public final int f73374a;

    /* JADX INFO: renamed from: b */
    public int f73375b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<Exception> f73376c;

    /* JADX INFO: renamed from: d */
    @gib
    public Path f73377d;

    public q75() {
        this(0, 1, null);
    }

    public final void collect(@yfb Exception exc) {
        md8.checkNotNullParameter(exc, "exception");
        this.f73375b++;
        if (this.f73376c.size() < this.f73374a) {
            if (this.f73377d != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.f73377d)).initCause(exc);
                md8.checkNotNull(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exc = (FileSystemException) thInitCause;
            }
            this.f73376c.add(exc);
        }
    }

    public final void enterEntry(@yfb Path path) {
        md8.checkNotNullParameter(path, "name");
        Path path2 = this.f73377d;
        this.f73377d = path2 != null ? path2.resolve(path) : null;
    }

    public final void exitEntry(@yfb Path path) {
        md8.checkNotNullParameter(path, "name");
        Path path2 = this.f73377d;
        if (!md8.areEqual(path, path2 != null ? path2.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path3 = this.f73377d;
        this.f73377d = path3 != null ? path3.getParent() : null;
    }

    @yfb
    public final List<Exception> getCollectedExceptions() {
        return this.f73376c;
    }

    @gib
    public final Path getPath() {
        return this.f73377d;
    }

    public final int getTotalExceptions() {
        return this.f73375b;
    }

    public final void setPath(@gib Path path) {
        this.f73377d = path;
    }

    public q75(int i) {
        this.f73374a = i;
        this.f73376c = new ArrayList();
    }

    public /* synthetic */ q75(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 64 : i);
    }
}
