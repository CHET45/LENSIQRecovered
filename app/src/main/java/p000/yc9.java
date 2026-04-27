package p000;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yc9 {

    /* JADX INFO: renamed from: yc9$a */
    public interface InterfaceC15617a<D> {
        @efb
        @ir9
        tc9<D> onCreateLoader(int i, @hib Bundle bundle);

        @ir9
        void onLoadFinished(@efb tc9<D> tc9Var, D d);

        @ir9
        void onLoaderReset(@efb tc9<D> tc9Var);
    }

    public static void enableDebugLogging(boolean z) {
        zc9.f104773d = z;
    }

    @efb
    public static <T extends g59 & nai> yc9 getInstance(@efb T t) {
        return new zc9(t, t.getViewModelStore());
    }

    @ir9
    public abstract void destroyLoader(int i);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @hib
    public abstract <D> tc9<D> getLoader(int i);

    public boolean hasRunningLoaders() {
        return false;
    }

    @efb
    @ir9
    public abstract <D> tc9<D> initLoader(int i, @hib Bundle bundle, @efb InterfaceC15617a<D> interfaceC15617a);

    public abstract void markForRedelivery();

    @efb
    @ir9
    public abstract <D> tc9<D> restartLoader(int i, @hib Bundle bundle, @efb InterfaceC15617a<D> interfaceC15617a);
}
