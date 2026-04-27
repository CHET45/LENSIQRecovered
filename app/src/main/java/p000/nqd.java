package p000;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class nqd {

    /* JADX INFO: renamed from: nqd$a */
    public interface InterfaceC10003a {
        void installLibrary(Context context, String[] abis, String mappedLibraryName, File destination, oqd logger);
    }

    /* JADX INFO: renamed from: nqd$b */
    public interface InterfaceC10004b {
        void loadLibrary(String libraryName);

        void loadPath(String libraryPath);

        String mapLibraryName(String libraryName);

        String[] supportedAbis();

        String unmapLibraryName(String mappedLibraryName);
    }

    /* JADX INFO: renamed from: nqd$c */
    public interface InterfaceC10005c {
        void failure(Throwable t);

        void success();
    }

    /* JADX INFO: renamed from: nqd$d */
    public interface InterfaceC10006d {
        void log(String message);
    }

    private nqd() {
    }

    public static oqd force() {
        return new oqd().force();
    }

    public static void loadLibrary(final Context context, final String library) {
        loadLibrary(context, library, null, null);
    }

    public static oqd log(final InterfaceC10006d logger) {
        return new oqd().log(logger);
    }

    public static oqd recursively() {
        return new oqd().recursively();
    }

    public static void loadLibrary(final Context context, final String library, final String version) {
        loadLibrary(context, library, version, null);
    }

    public static void loadLibrary(final Context context, final String library, final InterfaceC10005c listener) {
        loadLibrary(context, library, null, listener);
    }

    public static void loadLibrary(final Context context, final String library, final String version, final InterfaceC10005c listener) {
        new oqd().loadLibrary(context, library, version, listener);
    }
}
