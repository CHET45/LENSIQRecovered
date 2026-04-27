package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class s31 implements g6e<Bitmap> {

    /* JADX INFO: renamed from: b */
    public static final v6c<Integer> f80484b = v6c.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c */
    public static final v6c<Bitmap.CompressFormat> f80485c = v6c.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: d */
    public static final String f80486d = "BitmapEncoder";

    /* JADX INFO: renamed from: a */
    @hib
    public final z60 f80487a;

    public s31(@efb z60 z60Var) {
        this.f80487a = z60Var;
    }

    private Bitmap.CompressFormat getFormat(Bitmap bitmap, i7c i7cVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) i7cVar.get(f80485c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p000.g6e
    @efb
    public g15 getEncodeStrategy(@efb i7c i7cVar) {
        return g15.TRANSFORMED;
    }

    @Override // p000.n15
    public boolean encode(@efb t5e<Bitmap> t5eVar, @efb File file, @efb i7c i7cVar) {
        boolean z;
        Bitmap bitmap = t5eVar.get();
        Bitmap.CompressFormat format = getFormat(bitmap, i7cVar);
        i77.beginSectionFormat("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), format);
        try {
            long logTime = si9.getLogTime();
            int iIntValue = ((Integer) i7cVar.get(f80484b)).intValue();
            OutputStream mf1Var = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        mf1Var = this.f80487a != null ? new mf1(fileOutputStream, this.f80487a) : fileOutputStream;
                        bitmap.compress(format, iIntValue, mf1Var);
                        mf1Var.close();
                        try {
                            mf1Var.close();
                        } catch (IOException unused) {
                        }
                        z = true;
                    } catch (IOException unused2) {
                        mf1Var = fileOutputStream;
                        Log.isLoggable(f80486d, 3);
                        if (mf1Var != null) {
                            try {
                                mf1Var.close();
                            } catch (IOException unused3) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        mf1Var = fileOutputStream;
                        if (mf1Var != null) {
                            try {
                                mf1Var.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused5) {
            }
            if (Log.isLoggable(f80486d, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Compressed with type: ");
                sb.append(format);
                sb.append(" of size ");
                sb.append(v0i.getBitmapByteSize(bitmap));
                sb.append(" in ");
                sb.append(si9.getElapsedMillis(logTime));
                sb.append(", options format: ");
                sb.append(i7cVar.get(f80485c));
                sb.append(", hasAlpha: ");
                sb.append(bitmap.hasAlpha());
            }
            return z;
        } finally {
            i77.endSection();
        }
    }

    @Deprecated
    public s31() {
        this.f80487a = null;
    }
}
