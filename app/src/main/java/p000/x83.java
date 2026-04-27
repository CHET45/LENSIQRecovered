package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class x83 extends k41 {

    /* JADX INFO: renamed from: f */
    public static final int f97153f = 1;

    /* JADX INFO: renamed from: g */
    public static final String f97154g = "jp.wasabeef.glide.transformations.CropTransformation.1";

    /* JADX INFO: renamed from: c */
    public int f97155c;

    /* JADX INFO: renamed from: d */
    public int f97156d;

    /* JADX INFO: renamed from: e */
    public EnumC14982b f97157e;

    /* JADX INFO: renamed from: x83$a */
    public static /* synthetic */ class C14981a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97158a;

        static {
            int[] iArr = new int[EnumC14982b.values().length];
            f97158a = iArr;
            try {
                iArr[EnumC14982b.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97158a[EnumC14982b.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97158a[EnumC14982b.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: x83$b */
    public enum EnumC14982b {
        TOP,
        CENTER,
        BOTTOM
    }

    public x83(int width, int height) {
        this(width, height, EnumC14982b.CENTER);
    }

    private float getTop(float scaledHeight) {
        int i = C14981a.f97158a[this.f97157e.ordinal()];
        if (i == 2) {
            return (this.f97156d - scaledHeight) / 2.0f;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f97156d - scaledHeight;
    }

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        int width = this.f97155c;
        if (width == 0) {
            width = toTransform.getWidth();
        }
        this.f97155c = width;
        int height = this.f97156d;
        if (height == 0) {
            height = toTransform.getHeight();
        }
        this.f97156d = height;
        Bitmap bitmap = pool.get(this.f97155c, this.f97156d, toTransform.getConfig() != null ? toTransform.getConfig() : Bitmap.Config.ARGB_8888);
        bitmap.setHasAlpha(true);
        float fMax = Math.max(this.f97155c / toTransform.getWidth(), this.f97156d / toTransform.getHeight());
        float width2 = toTransform.getWidth() * fMax;
        float height2 = fMax * toTransform.getHeight();
        float f = (this.f97155c - width2) / 2.0f;
        float top = getTop(height2);
        RectF rectF = new RectF(f, top, width2 + f, height2 + top);
        m14491a(toTransform, bitmap);
        new Canvas(bitmap).drawBitmap(toTransform, (Rect) null, rectF, (Paint) null);
        return bitmap;
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        if (o instanceof x83) {
            x83 x83Var = (x83) o;
            if (x83Var.f97155c == this.f97155c && x83Var.f97156d == this.f97156d && x83Var.f97157e == this.f97157e) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return (-1462327117) + (this.f97155c * 100000) + (this.f97156d * 1000) + (this.f97157e.ordinal() * 10);
    }

    public String toString() {
        return "CropTransformation(width=" + this.f97155c + ", height=" + this.f97156d + ", cropType=" + this.f97157e + c0b.f15434d;
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f97154g + this.f97155c + this.f97156d + this.f97157e).getBytes(eq8.f33838b));
    }

    public x83(int width, int height, EnumC14982b cropType) {
        EnumC14982b enumC14982b = EnumC14982b.CENTER;
        this.f97155c = width;
        this.f97156d = height;
        this.f97157e = cropType;
    }
}
