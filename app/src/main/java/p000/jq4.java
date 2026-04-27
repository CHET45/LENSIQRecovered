package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class jq4 {

    /* JADX INFO: renamed from: a */
    public static final String f51443a = "DrawableToBitmap";

    /* JADX INFO: renamed from: b */
    public static final e41 f51444b = new C8011a();

    /* JADX INFO: renamed from: jq4$a */
    public class C8011a extends f41 {
        @Override // p000.f41, p000.e41
        public void put(Bitmap bitmap) {
        }
    }

    private jq4() {
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static t5e<Bitmap> m14232a(e41 e41Var, Drawable drawable, int i, int i2) {
        Bitmap bitmapDrawToBitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapDrawToBitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapDrawToBitmap = null;
        } else {
            bitmapDrawToBitmap = drawToBitmap(e41Var, current, i, i2);
            z = true;
        }
        if (!z) {
            e41Var = f51444b;
        }
        return i41.obtain(bitmapDrawToBitmap, e41Var);
    }

    @hib
    private static Bitmap drawToBitmap(e41 e41Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f51443a, 5)) {
                Log.w(f51443a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable(f51443a, 5)) {
                Log.w(f51443a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock bitmapDrawableLock = eeh.getBitmapDrawableLock();
        bitmapDrawableLock.lock();
        Bitmap bitmap = e41Var.get(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmap;
        } finally {
            bitmapDrawableLock.unlock();
        }
    }
}
