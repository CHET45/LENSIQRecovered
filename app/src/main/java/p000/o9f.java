package p000;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class o9f {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10274a f66946b = new C10274a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final NativeSharedCounter f66947c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a */
    public final long f66948a;

    /* JADX INFO: renamed from: o9f$a */
    public static final class C10274a {
        public /* synthetic */ C10274a(jt3 jt3Var) {
            this();
        }

        private final o9f createCounterFromFd(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd = parcelFileDescriptor.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter >= 0) {
                return new o9f(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        @yfb
        public final o9f create$datastore_core_release(@yfb ny6<? extends File> ny6Var) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            md8.checkNotNullParameter(ny6Var, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(ny6Var.invoke(), 939524096);
            } catch (Throwable th) {
                th = th;
                parcelFileDescriptorOpen = null;
            }
            try {
                o9f o9fVarCreateCounterFromFd = createCounterFromFd(parcelFileDescriptorOpen);
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                return o9fVarCreateCounterFromFd;
            } catch (Throwable th2) {
                th = th2;
                if (parcelFileDescriptorOpen != null) {
                    parcelFileDescriptorOpen.close();
                }
                throw th;
            }
        }

        @yfb
        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return o9f.f66947c;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }

        private C10274a() {
        }
    }

    public /* synthetic */ o9f(long j, jt3 jt3Var) {
        this(j);
    }

    public final int getValue() {
        return f66947c.nativeGetCounterValue(this.f66948a);
    }

    public final int incrementAndGetValue() {
        return f66947c.nativeIncrementAndGetCounterValue(this.f66948a);
    }

    private o9f(long j) {
        this.f66948a = j;
    }
}
