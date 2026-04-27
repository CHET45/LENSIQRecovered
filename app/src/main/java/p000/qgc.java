package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p000.ju9;

/* JADX INFO: loaded from: classes3.dex */
@c5e(21)
public final class qgc implements b6e<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final int f74389b = 536870912;

    /* JADX INFO: renamed from: a */
    public final in4 f74390a;

    public qgc(in4 in4Var) {
        this.f74390a = in4Var;
    }

    private boolean isSafeToTryDecoding(@efb ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !(ju9.C8096a.f51939a.equalsIgnoreCase(str) || ju9.C8096a.f51940b.equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // p000.b6e
    @hib
    public t5e<Bitmap> decode(@efb ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @efb i7c i7cVar) throws IOException {
        return this.f74390a.decode(parcelFileDescriptor, i, i2, i7cVar);
    }

    @Override // p000.b6e
    public boolean handles(@efb ParcelFileDescriptor parcelFileDescriptor, @efb i7c i7cVar) {
        return isSafeToTryDecoding(parcelFileDescriptor) && this.f74390a.handles(parcelFileDescriptor);
    }
}
