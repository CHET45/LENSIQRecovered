package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p000.hn4;
import p000.sv7;

/* JADX INFO: loaded from: classes3.dex */
public final class in4 {

    /* JADX INFO: renamed from: f */
    public static final String f47579f = "Downsampler";

    /* JADX INFO: renamed from: g */
    public static final v6c<bl3> f47580g = v6c.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", bl3.f14051c);

    /* JADX INFO: renamed from: h */
    public static final v6c<n9d> f47581h = v6c.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final v6c<hn4> f47582i = hn4.f44199h;

    /* JADX INFO: renamed from: j */
    public static final v6c<Boolean> f47583j;

    /* JADX INFO: renamed from: k */
    public static final v6c<Boolean> f47584k;

    /* JADX INFO: renamed from: l */
    public static final String f47585l = "image/vnd.wap.wbmp";

    /* JADX INFO: renamed from: m */
    public static final String f47586m = "image/x-ico";

    /* JADX INFO: renamed from: n */
    public static final Set<String> f47587n;

    /* JADX INFO: renamed from: o */
    public static final InterfaceC7518b f47588o;

    /* JADX INFO: renamed from: p */
    public static final Set<ImageHeaderParser.ImageType> f47589p;

    /* JADX INFO: renamed from: q */
    public static final Queue<BitmapFactory.Options> f47590q;

    /* JADX INFO: renamed from: a */
    public final e41 f47591a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f47592b;

    /* JADX INFO: renamed from: c */
    public final z60 f47593c;

    /* JADX INFO: renamed from: d */
    public final List<ImageHeaderParser> f47594d;

    /* JADX INFO: renamed from: e */
    public final pg7 f47595e = pg7.getInstance();

    /* JADX INFO: renamed from: in4$a */
    public class C7517a implements InterfaceC7518b {
        @Override // p000.in4.InterfaceC7518b
        public void onDecodeComplete(e41 e41Var, Bitmap bitmap) {
        }

        @Override // p000.in4.InterfaceC7518b
        public void onObtainBounds() {
        }
    }

    /* JADX INFO: renamed from: in4$b */
    public interface InterfaceC7518b {
        void onDecodeComplete(e41 e41Var, Bitmap bitmap) throws IOException;

        void onObtainBounds();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f47583j = v6c.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f47584k = v6c.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f47587n = Collections.unmodifiableSet(new HashSet(Arrays.asList(f47585l, f47586m)));
        f47588o = new C7517a();
        f47589p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f47590q = v0i.createQueue(0);
    }

    public in4(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, e41 e41Var, z60 z60Var) {
        this.f47594d = list;
        this.f47592b = (DisplayMetrics) t7d.checkNotNull(displayMetrics);
        this.f47591a = (e41) t7d.checkNotNull(e41Var);
        this.f47593c = (z60) t7d.checkNotNull(z60Var);
    }

    private static int adjustTargetDensityForError(double d) {
        int densityMultiplier = getDensityMultiplier(d);
        int iRound = round(((double) densityMultiplier) * d);
        return round((d / ((double) (iRound / densityMultiplier))) * ((double) iRound));
    }

    private void calculateConfig(sv7 sv7Var, bl3 bl3Var, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean zHasAlpha;
        if (this.f47595e.m19481a(i, i2, options, z, z2)) {
            return;
        }
        if (bl3Var == bl3.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = sv7Var.getImageType().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable(f47579f, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot determine whether the image has alpha or not from header, format ");
                sb.append(bl3Var);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void calculateScaling(ImageHeaderParser.ImageType imageType, sv7 sv7Var, InterfaceC7518b interfaceC7518b, e41 e41Var, hn4 hn4Var, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int iFloor;
        int iFloor2;
        if (i2 <= 0 || i3 <= 0) {
            if (Log.isLoggable(f47579f, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType);
                sb.append(" with target [");
                sb.append(i4);
                sb.append("x");
                sb.append(i5);
                sb.append("]");
                return;
            }
            return;
        }
        if (isRotationRequired(i)) {
            i7 = i2;
            i6 = i3;
        } else {
            i6 = i2;
            i7 = i3;
        }
        float scaleFactor = hn4Var.getScaleFactor(i6, i7, i4, i5);
        if (scaleFactor <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + scaleFactor + " from: " + hn4Var + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        }
        hn4.EnumC6920g sampleSizeRounding = hn4Var.getSampleSizeRounding(i6, i7, i4, i5);
        if (sampleSizeRounding == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f = i6;
        float f2 = i7;
        int iRound = i6 / round(scaleFactor * f);
        int iRound2 = i7 / round(scaleFactor * f2);
        hn4.EnumC6920g enumC6920g = hn4.EnumC6920g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRounding == enumC6920g ? Math.max(iRound, iRound2) : Math.min(iRound, iRound2)));
        if (sampleSizeRounding == enumC6920g && iMax < 1.0f / scaleFactor) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f / fMin);
            iFloor2 = (int) Math.ceil(f2 / fMin);
            int i8 = iMax / 8;
            if (i8 > 0) {
                iFloor /= i8;
                iFloor2 /= i8;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f3 = iMax;
            iFloor = (int) Math.floor(f / f3);
            iFloor2 = (int) Math.floor(f2 / f3);
        } else if (imageType.isWebp()) {
            float f4 = iMax;
            iFloor = Math.round(f / f4);
            iFloor2 = Math.round(f2 / f4);
        } else if (i6 % iMax == 0 && i7 % iMax == 0) {
            iFloor = i6 / iMax;
            iFloor2 = i7 / iMax;
        } else {
            int[] dimensions = getDimensions(sv7Var, options, interfaceC7518b, e41Var);
            iFloor = dimensions[0];
            iFloor2 = dimensions[1];
        }
        double scaleFactor2 = hn4Var.getScaleFactor(iFloor, iFloor2, i4, i5);
        options.inTargetDensity = adjustTargetDensityForError(scaleFactor2);
        options.inDensity = getDensityMultiplier(scaleFactor2);
        if (isScaling(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable(f47579f, 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculate scaling, source: [");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(i3);
            sb2.append("], degreesToRotate: ");
            sb2.append(i);
            sb2.append(", target: [");
            sb2.append(i4);
            sb2.append("x");
            sb2.append(i5);
            sb2.append("], power of two scaled: [");
            sb2.append(iFloor);
            sb2.append("x");
            sb2.append(iFloor2);
            sb2.append("], exact scale factor: ");
            sb2.append(scaleFactor);
            sb2.append(", power of 2 sample size: ");
            sb2.append(iMax);
            sb2.append(", adjusted scale factor: ");
            sb2.append(scaleFactor2);
            sb2.append(", target density: ");
            sb2.append(options.inTargetDensity);
            sb2.append(", density: ");
            sb2.append(options.inDensity);
        }
    }

    private Bitmap decodeFromWrappedStreams(sv7 sv7Var, BitmapFactory.Options options, hn4 hn4Var, bl3 bl3Var, n9d n9dVar, boolean z, int i, int i2, boolean z2, InterfaceC7518b interfaceC7518b) throws IOException {
        int i3;
        int i4;
        String str;
        int i5;
        ColorSpace colorSpace;
        int iRound;
        int i6;
        int i7;
        long logTime = si9.getLogTime();
        int[] dimensions = getDimensions(sv7Var, options, interfaceC7518b, this.f47591a);
        int i8 = dimensions[0];
        int i9 = dimensions[1];
        String str2 = options.outMimeType;
        boolean z3 = (i8 == -1 || i9 == -1) ? false : z;
        int imageOrientation = sv7Var.getImageOrientation();
        int exifOrientationDegrees = eeh.getExifOrientationDegrees(imageOrientation);
        boolean zIsExifOrientationRequired = eeh.isExifOrientationRequired(imageOrientation);
        if (i == Integer.MIN_VALUE) {
            i3 = i2;
            i4 = isRotationRequired(exifOrientationDegrees) ? i9 : i8;
        } else {
            i3 = i2;
            i4 = i;
        }
        int i10 = i3 == Integer.MIN_VALUE ? isRotationRequired(exifOrientationDegrees) ? i8 : i9 : i3;
        ImageHeaderParser.ImageType imageType = sv7Var.getImageType();
        calculateScaling(imageType, sv7Var, interfaceC7518b, this.f47591a, hn4Var, exifOrientationDegrees, i8, i9, i4, i10, options);
        calculateConfig(sv7Var, bl3Var, z3, zIsExifOrientationRequired, options, i4, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (shouldUsePool(imageType)) {
            if (i8 < 0 || i9 < 0 || !z2) {
                float f = isScaling(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i12 = options.inSampleSize;
                float f2 = i12;
                int iCeil = (int) Math.ceil(i8 / f2);
                int iCeil2 = (int) Math.ceil(i9 / f2);
                int iRound2 = Math.round(iCeil * f);
                iRound = Math.round(iCeil2 * f);
                str = f47579f;
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(iRound2);
                    sb.append("x");
                    sb.append(iRound);
                    i6 = iRound2;
                    sb.append("] for source [");
                    sb.append(i8);
                    sb.append("x");
                    sb.append(i9);
                    sb.append("], sampleSize: ");
                    sb.append(i12);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f);
                } else {
                    i6 = iRound2;
                }
                i7 = i6;
            } else {
                str = f47579f;
                i7 = i4;
                iRound = i10;
            }
            if (i7 > 0 && iRound > 0) {
                setInBitmap(options, this.f47591a, i7, iRound);
            }
        } else {
            str = f47579f;
        }
        if (n9dVar != null) {
            if (i11 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((n9dVar == n9d.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapDecodeStream = decodeStream(sv7Var, options, interfaceC7518b, this.f47591a);
        interfaceC7518b.onDecodeComplete(this.f47591a, bitmapDecodeStream);
        if (Log.isLoggable(str, 2)) {
            i5 = imageOrientation;
            logDecode(i8, i9, str2, options, bitmapDecodeStream, i, i2, logTime);
        } else {
            i5 = imageOrientation;
        }
        if (bitmapDecodeStream == null) {
            return null;
        }
        bitmapDecodeStream.setDensity(this.f47592b.densityDpi);
        Bitmap bitmapRotateImageExif = eeh.rotateImageExif(this.f47591a, bitmapDecodeStream, i5);
        if (bitmapDecodeStream.equals(bitmapRotateImageExif)) {
            return bitmapRotateImageExif;
        }
        this.f47591a.put(bitmapDecodeStream);
        return bitmapRotateImageExif;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap decodeStream(p000.sv7 r4, android.graphics.BitmapFactory.Options r5, p000.in4.InterfaceC7518b r6, p000.e41 r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.onObtainBounds()
            r4.stopGrowingBuffers()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p000.eeh.getBitmapDrawableLock()
            r3.lock()
            android.graphics.Bitmap r4 = r4.decodeBitmap(r5)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L25
            java.util.concurrent.locks.Lock r5 = p000.eeh.getBitmapDrawableLock()
            r5.unlock()
            return r4
        L23:
            r4 = move-exception
            goto L48
        L25:
            r3 = move-exception
            java.io.IOException r0 = newIoExceptionForInBitmapAssertion(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L47
            r7.put(r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L46
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L46
            android.graphics.Bitmap r4 = decodeStream(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L46
            java.util.concurrent.locks.Lock r5 = p000.eeh.getBitmapDrawableLock()
            r5.unlock()
            return r4
        L46:
            throw r0     // Catch: java.lang.Throwable -> L23
        L47:
            throw r0     // Catch: java.lang.Throwable -> L23
        L48:
            java.util.concurrent.locks.Lock r5 = p000.eeh.getBitmapDrawableLock()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.in4.decodeStream(sv7, android.graphics.BitmapFactory$Options, in4$b, e41):android.graphics.Bitmap");
    }

    @hib
    @omg(19)
    private static String getBitmapString(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + c0b.f15434d);
    }

    private static synchronized BitmapFactory.Options getDefaultOptions() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f47590q;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            resetOptions(optionsPoll);
        }
        return optionsPoll;
    }

    private static int getDensityMultiplier(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private static int[] getDimensions(sv7 sv7Var, BitmapFactory.Options options, InterfaceC7518b interfaceC7518b, e41 e41Var) throws IOException {
        options.inJustDecodeBounds = true;
        decodeStream(sv7Var, options, interfaceC7518b, e41Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String getInBitmapString(BitmapFactory.Options options) {
        return getBitmapString(options.inBitmap);
    }

    private static boolean isRotationRequired(int i) {
        return i == 90 || i == 270;
    }

    private static boolean isScaling(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    private static void logDecode(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(getBitmapString(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(getInBitmapString(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(si9.getElapsedMillis(j));
    }

    private static IOException newIoExceptionForInBitmapAssertion(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + getInBitmapString(options), illegalArgumentException);
    }

    private static void releaseOptions(BitmapFactory.Options options) {
        resetOptions(options);
        Queue<BitmapFactory.Options> queue = f47590q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void resetOptions(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int round(double d) {
        return (int) (d + 0.5d);
    }

    @omg(26)
    private static void setInBitmap(BitmapFactory.Options options, e41 e41Var, int i, int i2) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = e41Var.getDirty(i, i2, config);
    }

    private boolean shouldUsePool(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public void m13213a(File file, int i, int i2, i7c i7cVar) throws IOException {
        decode(new sv7.C12802c(file, this.f47594d, this.f47593c), i, i2, i7cVar, f47588o);
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public void m13214b(byte[] bArr, int i, int i2, i7c i7cVar) throws IOException {
        decode(new sv7.C12800a(bArr, this.f47594d, this.f47593c), i, i2, i7cVar, f47588o);
    }

    public t5e<Bitmap> decode(InputStream inputStream, int i, int i2, i7c i7cVar) throws IOException {
        return decode(inputStream, i, i2, i7cVar, f47588o);
    }

    public boolean handles(InputStream inputStream) {
        return true;
    }

    public t5e<Bitmap> decode(ByteBuffer byteBuffer, int i, int i2, i7c i7cVar) throws IOException {
        return decode(new sv7.C12801b(byteBuffer, this.f47594d, this.f47593c), i, i2, i7cVar, f47588o);
    }

    public boolean handles(ByteBuffer byteBuffer) {
        return true;
    }

    public t5e<Bitmap> decode(InputStream inputStream, int i, int i2, i7c i7cVar, InterfaceC7518b interfaceC7518b) throws IOException {
        return decode(new sv7.C12803d(inputStream, this.f47594d, this.f47593c), i, i2, i7cVar, interfaceC7518b);
    }

    public boolean handles(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.isSupported();
    }

    @c5e(21)
    public t5e<Bitmap> decode(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, i7c i7cVar) throws IOException {
        return decode(new sv7.C12804e(parcelFileDescriptor, this.f47594d, this.f47593c), i, i2, i7cVar, f47588o);
    }

    private t5e<Bitmap> decode(sv7 sv7Var, int i, int i2, i7c i7cVar, InterfaceC7518b interfaceC7518b) throws IOException {
        byte[] bArr = (byte[]) this.f47593c.get(65536, byte[].class);
        BitmapFactory.Options defaultOptions = getDefaultOptions();
        defaultOptions.inTempStorage = bArr;
        bl3 bl3Var = (bl3) i7cVar.get(f47580g);
        n9d n9dVar = (n9d) i7cVar.get(f47581h);
        hn4 hn4Var = (hn4) i7cVar.get(hn4.f44199h);
        boolean zBooleanValue = ((Boolean) i7cVar.get(f47583j)).booleanValue();
        v6c<Boolean> v6cVar = f47584k;
        try {
            return i41.obtain(decodeFromWrappedStreams(sv7Var, defaultOptions, hn4Var, bl3Var, n9dVar, i7cVar.get(v6cVar) != null && ((Boolean) i7cVar.get(v6cVar)).booleanValue(), i, i2, zBooleanValue, interfaceC7518b), this.f47591a);
        } finally {
            releaseOptions(defaultOptions);
            this.f47593c.put(bArr);
        }
    }
}
