package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class eeh {

    /* JADX INFO: renamed from: a */
    public static final String f32771a = "TransformationUtils";

    /* JADX INFO: renamed from: b */
    public static final int f32772b = 6;

    /* JADX INFO: renamed from: d */
    public static final int f32774d = 7;

    /* JADX INFO: renamed from: f */
    public static final Paint f32776f;

    /* JADX INFO: renamed from: g */
    public static final Set<String> f32777g;

    /* JADX INFO: renamed from: h */
    public static final Lock f32778h;

    /* JADX INFO: renamed from: c */
    public static final Paint f32773c = new Paint(6);

    /* JADX INFO: renamed from: e */
    public static final Paint f32775e = new Paint(7);

    /* JADX INFO: renamed from: eeh$a */
    public class C5274a implements InterfaceC5276c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f32779a;

        public C5274a(int i) {
            this.f32779a = i;
        }

        @Override // p000.eeh.InterfaceC5276c
        public void drawRoundedCorners(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f32779a;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    /* JADX INFO: renamed from: eeh$b */
    public class C5275b implements InterfaceC5276c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f32780a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f32781b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f32782c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f32783d;

        public C5275b(float f, float f2, float f3, float f4) {
            this.f32780a = f;
            this.f32781b = f2;
            this.f32782c = f3;
            this.f32783d = f4;
        }

        @Override // p000.eeh.InterfaceC5276c
        public void drawRoundedCorners(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.f32780a;
            float f2 = this.f32781b;
            float f3 = this.f32782c;
            float f4 = this.f32783d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: renamed from: eeh$c */
    public interface InterfaceC5276c {
        void drawRoundedCorners(Canvas canvas, Paint paint, RectF rectF);
    }

    /* JADX INFO: renamed from: eeh$d */
    public static final class LockC5277d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @efb
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @efb TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f32777g = hashSet;
        f32778h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new LockC5277d();
        Paint paint = new Paint(7);
        f32776f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private eeh() {
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static void m9908a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    private static void applyMatrix(@efb Bitmap bitmap, @efb Bitmap bitmap2, Matrix matrix) {
        Lock lock = f32778h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f32773c);
            clear(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f32778h.unlock();
            throw th;
        }
    }

    public static Bitmap centerCrop(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmap2 = e41Var.get(i, i2, getNonNullConfig(bitmap));
        setAlpha(bitmap, bitmap2);
        applyMatrix(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static Bitmap centerInside(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable(f32771a, 2);
            return fitCenter(e41Var, bitmap, i, i2);
        }
        Log.isLoggable(f32771a, 2);
        return bitmap;
    }

    public static Bitmap circleCrop(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap alphaSafeBitmap = getAlphaSafeBitmap(e41Var, bitmap);
        Bitmap bitmap2 = e41Var.get(iMin, iMin, getAlphaSafeConfig(bitmap));
        bitmap2.setHasAlpha(true);
        Lock lock = f32778h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawCircle(f2, f2, f2, f32775e);
            canvas.drawBitmap(alphaSafeBitmap, (Rect) null, rectF, f32776f);
            clear(canvas);
            lock.unlock();
            if (!alphaSafeBitmap.equals(bitmap)) {
                e41Var.put(alphaSafeBitmap);
            }
            return bitmap2;
        } catch (Throwable th) {
            f32778h.unlock();
            throw th;
        }
    }

    private static void clear(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap fitCenter(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable(f32771a, 2);
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            Log.isLoggable(f32771a, 2);
            return bitmap;
        }
        Bitmap bitmap2 = e41Var.get((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), getNonNullConfig(bitmap));
        setAlpha(bitmap, bitmap2);
        if (Log.isLoggable(f32771a, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(bitmap2.getWidth());
            sb3.append("x");
            sb3.append(bitmap2.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(fMin);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        applyMatrix(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    private static Bitmap getAlphaSafeBitmap(@efb e41 e41Var, @efb Bitmap bitmap) {
        Bitmap.Config alphaSafeConfig = getAlphaSafeConfig(bitmap);
        if (alphaSafeConfig.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmap2 = e41Var.get(bitmap.getWidth(), bitmap.getHeight(), alphaSafeConfig);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmap2;
    }

    @efb
    private static Bitmap.Config getAlphaSafeConfig(@efb Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        return config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
    }

    public static Lock getBitmapDrawableLock() {
        return f32778h;
    }

    public static int getExifOrientationDegrees(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @efb
    private static Bitmap.Config getNonNullConfig(@efb Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static boolean isExifOrientationRequired(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap rotateImage(@efb Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e) {
            if (!Log.isLoggable(f32771a, 6)) {
                return bitmap;
            }
            Log.e(f32771a, "Exception when trying to orient image", e);
            return bitmap;
        }
    }

    public static Bitmap rotateImageExif(@efb e41 e41Var, @efb Bitmap bitmap, int i) {
        if (!isExifOrientationRequired(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m9908a(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmap2 = e41Var.get(Math.round(rectF.width()), Math.round(rectF.height()), getNonNullConfig(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        applyMatrix(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    @Deprecated
    public static Bitmap roundedCorners(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2, int i3) {
        return roundedCorners(e41Var, bitmap, i3);
    }

    public static void setAlpha(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap roundedCorners(@efb e41 e41Var, @efb Bitmap bitmap, int i) {
        t7d.checkArgument(i > 0, "roundingRadius must be greater than 0.");
        return roundedCorners(e41Var, bitmap, new C5274a(i));
    }

    public static Bitmap roundedCorners(@efb e41 e41Var, @efb Bitmap bitmap, float f, float f2, float f3, float f4) {
        return roundedCorners(e41Var, bitmap, new C5275b(f, f2, f3, f4));
    }

    private static Bitmap roundedCorners(@efb e41 e41Var, @efb Bitmap bitmap, InterfaceC5276c interfaceC5276c) {
        Bitmap.Config alphaSafeConfig = getAlphaSafeConfig(bitmap);
        Bitmap alphaSafeBitmap = getAlphaSafeBitmap(e41Var, bitmap);
        Bitmap bitmap2 = e41Var.get(alphaSafeBitmap.getWidth(), alphaSafeBitmap.getHeight(), alphaSafeConfig);
        bitmap2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(alphaSafeBitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Lock lock = f32778h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            interfaceC5276c.drawRoundedCorners(canvas, paint, rectF);
            clear(canvas);
            lock.unlock();
            if (!alphaSafeBitmap.equals(bitmap)) {
                e41Var.put(alphaSafeBitmap);
            }
            return bitmap2;
        } catch (Throwable th) {
            f32778h.unlock();
            throw th;
        }
    }
}
