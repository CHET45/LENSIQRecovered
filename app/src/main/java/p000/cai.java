package p000;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cai {

    @gib
    private final eai impl;

    public cai() {
        this.impl = new eai();
    }

    public final void addCloseable(@yfb String str, @yfb AutoCloseable autoCloseable) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(autoCloseable, "closeable");
        eai eaiVar = this.impl;
        if (eaiVar != null) {
            eaiVar.addCloseable(str, autoCloseable);
        }
    }

    @ir9
    public final void clear$lifecycle_viewmodel_release() {
        eai eaiVar = this.impl;
        if (eaiVar != null) {
            eaiVar.clear();
        }
        onCleared();
    }

    @gib
    public final <T extends AutoCloseable> T getCloseable(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        eai eaiVar = this.impl;
        if (eaiVar != null) {
            return (T) eaiVar.getCloseable(str);
        }
        return null;
    }

    public void onCleared() {
    }

    public void addCloseable(@yfb AutoCloseable autoCloseable) {
        md8.checkNotNullParameter(autoCloseable, "closeable");
        eai eaiVar = this.impl;
        if (eaiVar != null) {
            eaiVar.addCloseable(autoCloseable);
        }
    }

    public cai(@yfb x13 x13Var) {
        md8.checkNotNullParameter(x13Var, "viewModelScope");
        this.impl = new eai(x13Var);
    }

    @q64(level = u64.f86867c, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        md8.checkNotNullParameter(closeable, "closeable");
        eai eaiVar = this.impl;
        if (eaiVar != null) {
            eaiVar.addCloseable(closeable);
        }
    }

    public cai(@yfb AutoCloseable... autoCloseableArr) {
        md8.checkNotNullParameter(autoCloseableArr, "closeables");
        this.impl = new eai((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public cai(@yfb x13 x13Var, @yfb AutoCloseable... autoCloseableArr) {
        md8.checkNotNullParameter(x13Var, "viewModelScope");
        md8.checkNotNullParameter(autoCloseableArr, "closeables");
        this.impl = new eai(x13Var, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    @q64(level = u64.f86867c, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ cai(Closeable... closeableArr) {
        md8.checkNotNullParameter(closeableArr, "closeables");
        this.impl = new eai((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}
