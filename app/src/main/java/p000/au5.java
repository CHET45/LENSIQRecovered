package p000;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes7.dex */
public final class au5 implements zt5 {

    /* JADX INFO: renamed from: a */
    @gib
    public gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f11882a;

    /* JADX INFO: renamed from: b */
    @gib
    public gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f11883b;

    /* JADX INFO: renamed from: c */
    @gib
    public gz6<? super Path, ? super IOException, ? extends FileVisitResult> f11884c;

    /* JADX INFO: renamed from: d */
    @gib
    public gz6<? super Path, ? super IOException, ? extends FileVisitResult> f11885d;

    /* JADX INFO: renamed from: e */
    public boolean f11886e;

    private final void checkIsNotBuilt() {
        if (this.f11886e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void checkNotDefined(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }

    @yfb
    public final FileVisitor<Path> build() {
        checkIsNotBuilt();
        this.f11886e = true;
        return new bu5(this.f11882a, this.f11883b, this.f11884c, this.f11885d);
    }

    @Override // p000.zt5
    public void onPostVisitDirectory(@yfb gz6<? super Path, ? super IOException, ? extends FileVisitResult> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "function");
        checkIsNotBuilt();
        checkNotDefined(this.f11885d, "onPostVisitDirectory");
        this.f11885d = gz6Var;
    }

    @Override // p000.zt5
    public void onPreVisitDirectory(@yfb gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "function");
        checkIsNotBuilt();
        checkNotDefined(this.f11882a, "onPreVisitDirectory");
        this.f11882a = gz6Var;
    }

    @Override // p000.zt5
    public void onVisitFile(@yfb gz6<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "function");
        checkIsNotBuilt();
        checkNotDefined(this.f11883b, "onVisitFile");
        this.f11883b = gz6Var;
    }

    @Override // p000.zt5
    public void onVisitFileFailed(@yfb gz6<? super Path, ? super IOException, ? extends FileVisitResult> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "function");
        checkIsNotBuilt();
        checkNotDefined(this.f11884c, "onVisitFileFailed");
        this.f11884c = gz6Var;
    }
}
