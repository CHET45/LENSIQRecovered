package p000;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@c5e(30)
public final class da2 {

    /* JADX INFO: renamed from: a */
    public static final String f28899a = "da2";

    private da2() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static ResourcesLoader m9000a(@efb Context context, @efb Map<Integer, Integer> map) throws Throwable {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrM10741h = fa2.m10741h(context, map);
            Log.i(f28899a, "Table created, length: " + bArrM10741h.length);
            if (bArrM10741h.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
            } catch (Throwable th) {
                th = th;
                fileDescriptorMemfd_create = null;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                try {
                    fileOutputStream.write(bArrM10741h);
                    ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                    try {
                        ca2.m3848a();
                        ResourcesLoader resourcesLoaderM3015a = ba2.m3015a();
                        resourcesLoaderM3015a.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                        if (parcelFileDescriptorDup != null) {
                            parcelFileDescriptorDup.close();
                        }
                        fileOutputStream.close();
                        if (fileDescriptorMemfd_create != null) {
                            Os.close(fileDescriptorMemfd_create);
                        }
                        return resourcesLoaderM3015a;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileDescriptorMemfd_create != null) {
                    Os.close(fileDescriptorMemfd_create);
                }
                throw th;
            }
        } catch (Exception e) {
            Log.e(f28899a, "Failed to create the ColorResourcesTableCreator.", e);
            return null;
        }
    }
}
