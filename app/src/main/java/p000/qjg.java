package p000;

import android.os.Build;
import p000.nqd;

/* JADX INFO: loaded from: classes4.dex */
public final class qjg implements nqd.InterfaceC10004b {
    @Override // p000.nqd.InterfaceC10004b
    public void loadLibrary(final String libraryName) {
        System.loadLibrary(libraryName);
    }

    @Override // p000.nqd.InterfaceC10004b
    @igg({"UnsafeDynamicallyLoadedCode"})
    public void loadPath(final String libraryPath) {
        System.load(libraryPath);
    }

    @Override // p000.nqd.InterfaceC10004b
    public String mapLibraryName(final String libraryName) {
        return (libraryName.startsWith(oqd.f68307g) && libraryName.endsWith(".so")) ? libraryName : System.mapLibraryName(libraryName);
    }

    @Override // p000.nqd.InterfaceC10004b
    public String[] supportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !mwg.isEmpty(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // p000.nqd.InterfaceC10004b
    public String unmapLibraryName(String mappedLibraryName) {
        return mappedLibraryName.substring(3, mappedLibraryName.length() - 3);
    }
}
