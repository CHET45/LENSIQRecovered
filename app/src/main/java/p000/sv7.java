package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2491a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2495c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface sv7 {

    /* JADX INFO: renamed from: sv7$a */
    public static final class C12800a implements sv7 {

        /* JADX INFO: renamed from: a */
        public final byte[] f82952a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f82953b;

        /* JADX INFO: renamed from: c */
        public final z60 f82954c;

        public C12800a(byte[] bArr, List<ImageHeaderParser> list, z60 z60Var) {
            this.f82952a = bArr;
            this.f82953b = list;
            this.f82954c = z60Var;
        }

        @Override // p000.sv7
        @hib
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            byte[] bArr = this.f82952a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // p000.sv7
        public int getImageOrientation() throws IOException {
            return C2491a.getOrientation(this.f82953b, ByteBuffer.wrap(this.f82952a), this.f82954c);
        }

        @Override // p000.sv7
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return C2491a.getType(this.f82953b, ByteBuffer.wrap(this.f82952a));
        }

        @Override // p000.sv7
        public void stopGrowingBuffers() {
        }
    }

    /* JADX INFO: renamed from: sv7$b */
    public static final class C12801b implements sv7 {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f82955a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f82956b;

        /* JADX INFO: renamed from: c */
        public final z60 f82957c;

        public C12801b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, z60 z60Var) {
            this.f82955a = byteBuffer;
            this.f82956b = list;
            this.f82957c = z60Var;
        }

        private InputStream stream() {
            return ej1.toStream(ej1.rewind(this.f82955a));
        }

        @Override // p000.sv7
        @hib
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(stream(), null, options);
        }

        @Override // p000.sv7
        public int getImageOrientation() throws IOException {
            return C2491a.getOrientation(this.f82956b, ej1.rewind(this.f82955a), this.f82957c);
        }

        @Override // p000.sv7
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return C2491a.getType(this.f82956b, ej1.rewind(this.f82955a));
        }

        @Override // p000.sv7
        public void stopGrowingBuffers() {
        }
    }

    /* JADX INFO: renamed from: sv7$c */
    public static final class C12802c implements sv7 {

        /* JADX INFO: renamed from: a */
        public final File f82958a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f82959b;

        /* JADX INFO: renamed from: c */
        public final z60 f82960c;

        public C12802c(File file, List<ImageHeaderParser> list, z60 z60Var) {
            this.f82958a = file;
            this.f82959b = list;
            this.f82960c = z60Var;
        }

        @Override // p000.sv7
        @hib
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws Throwable {
            evd evdVar;
            evd evdVar2 = null;
            try {
                evdVar = new evd(new FileInputStream(this.f82958a), this.f82960c);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(evdVar, null, options);
                try {
                    evdVar.close();
                } catch (IOException unused) {
                }
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                th = th2;
                evdVar2 = evdVar;
                if (evdVar2 != null) {
                    try {
                        evdVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // p000.sv7
        public int getImageOrientation() throws Throwable {
            evd evdVar;
            Throwable th;
            try {
                evdVar = new evd(new FileInputStream(this.f82958a), this.f82960c);
            } catch (Throwable th2) {
                evdVar = null;
                th = th2;
            }
            try {
                int orientation = C2491a.getOrientation(this.f82959b, evdVar, this.f82960c);
                try {
                    evdVar.close();
                } catch (IOException unused) {
                }
                return orientation;
            } catch (Throwable th3) {
                th = th3;
                if (evdVar != null) {
                    try {
                        evdVar.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // p000.sv7
        public ImageHeaderParser.ImageType getImageType() throws Throwable {
            evd evdVar;
            Throwable th;
            try {
                evdVar = new evd(new FileInputStream(this.f82958a), this.f82960c);
            } catch (Throwable th2) {
                evdVar = null;
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType type = C2491a.getType(this.f82959b, evdVar, this.f82960c);
                try {
                    evdVar.close();
                } catch (IOException unused) {
                }
                return type;
            } catch (Throwable th3) {
                th = th3;
                if (evdVar != null) {
                    try {
                        evdVar.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // p000.sv7
        public void stopGrowingBuffers() {
        }
    }

    /* JADX INFO: renamed from: sv7$d */
    public static final class C12803d implements sv7 {

        /* JADX INFO: renamed from: a */
        public final C2495c f82961a;

        /* JADX INFO: renamed from: b */
        public final z60 f82962b;

        /* JADX INFO: renamed from: c */
        public final List<ImageHeaderParser> f82963c;

        public C12803d(InputStream inputStream, List<ImageHeaderParser> list, z60 z60Var) {
            this.f82962b = (z60) t7d.checkNotNull(z60Var);
            this.f82963c = (List) t7d.checkNotNull(list);
            this.f82961a = new C2495c(inputStream, z60Var);
        }

        @Override // p000.sv7
        @hib
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f82961a.rewindAndGet(), null, options);
        }

        @Override // p000.sv7
        public int getImageOrientation() throws IOException {
            return C2491a.getOrientation(this.f82963c, this.f82961a.rewindAndGet(), this.f82962b);
        }

        @Override // p000.sv7
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return C2491a.getType(this.f82963c, this.f82961a.rewindAndGet(), this.f82962b);
        }

        @Override // p000.sv7
        public void stopGrowingBuffers() {
            this.f82961a.fixMarkLimits();
        }
    }

    /* JADX INFO: renamed from: sv7$e */
    @c5e(21)
    public static final class C12804e implements sv7 {

        /* JADX INFO: renamed from: a */
        public final z60 f82964a;

        /* JADX INFO: renamed from: b */
        public final List<ImageHeaderParser> f82965b;

        /* JADX INFO: renamed from: c */
        public final ParcelFileDescriptorRewinder f82966c;

        public C12804e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, z60 z60Var) {
            this.f82964a = (z60) t7d.checkNotNull(z60Var);
            this.f82965b = (List) t7d.checkNotNull(list);
            this.f82966c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p000.sv7
        @hib
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f82966c.rewindAndGet().getFileDescriptor(), null, options);
        }

        @Override // p000.sv7
        public int getImageOrientation() throws IOException {
            return C2491a.getOrientation(this.f82965b, this.f82966c, this.f82964a);
        }

        @Override // p000.sv7
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return C2491a.getType(this.f82965b, this.f82966c, this.f82964a);
        }

        @Override // p000.sv7
        public void stopGrowingBuffers() {
        }
    }

    @hib
    Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException;

    int getImageOrientation() throws IOException;

    ImageHeaderParser.ImageType getImageType() throws IOException;

    void stopGrowingBuffers();
}
