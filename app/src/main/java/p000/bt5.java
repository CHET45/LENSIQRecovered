package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class bt5 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final File f14716a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<File> f14717b;

    /* JADX WARN: Multi-variable type inference failed */
    public bt5(@yfb File file, @yfb List<? extends File> list) {
        md8.checkNotNullParameter(file, "root");
        md8.checkNotNullParameter(list, "segments");
        this.f14716a = file;
        this.f14717b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bt5 copy$kotlin_stdlib$default(bt5 bt5Var, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = bt5Var.f14716a;
        }
        if ((i & 2) != 0) {
            list = bt5Var.f14717b;
        }
        return bt5Var.copy$kotlin_stdlib(file, list);
    }

    @yfb
    public final File component1() {
        return this.f14716a;
    }

    @yfb
    public final List<File> component2() {
        return this.f14717b;
    }

    @yfb
    public final bt5 copy$kotlin_stdlib(@yfb File file, @yfb List<? extends File> list) {
        md8.checkNotNullParameter(file, "root");
        md8.checkNotNullParameter(list, "segments");
        return new bt5(file, list);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt5)) {
            return false;
        }
        bt5 bt5Var = (bt5) obj;
        return md8.areEqual(this.f14716a, bt5Var.f14716a) && md8.areEqual(this.f14717b, bt5Var.f14717b);
    }

    @yfb
    public final File getRoot() {
        return this.f14716a;
    }

    @yfb
    public final String getRootName() {
        String path = this.f14716a.getPath();
        md8.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @yfb
    public final List<File> getSegments() {
        return this.f14717b;
    }

    public final int getSize() {
        return this.f14717b.size();
    }

    public int hashCode() {
        return (this.f14716a.hashCode() * 31) + this.f14717b.hashCode();
    }

    public final boolean isRooted() {
        String path = this.f14716a.getPath();
        md8.checkNotNullExpressionValue(path, "getPath(...)");
        return path.length() > 0;
    }

    @yfb
    public final File subPath(int i, int i2) {
        if (i < 0 || i > i2 || i2 > getSize()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.f14717b.subList(i, i2);
        String str = File.separator;
        md8.checkNotNullExpressionValue(str, "separator");
        return new File(v82.joinToString$default(listSubList, str, null, null, 0, null, null, 62, null));
    }

    @yfb
    public String toString() {
        return "FilePathComponents(root=" + this.f14716a + ", segments=" + this.f14717b + ')';
    }
}
