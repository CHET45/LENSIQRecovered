package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class tbe {

    /* JADX INFO: renamed from: a */
    public static final String f84178a = "RoundedBitmapDrawableFa";

    /* JADX INFO: renamed from: tbe$a */
    public static class C12970a extends sbe {
        public C12970a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // p000.sbe
        /* JADX INFO: renamed from: a */
        public void mo21113a(int i, int i2, int i3, Rect rect, Rect rect2) {
            cb7.apply(i, i2, i3, rect, rect2, 0);
        }

        @Override // p000.sbe
        public boolean hasMipMap() {
            Bitmap bitmap = this.f81153a;
            return bitmap != null && k31.hasMipMap(bitmap);
        }

        @Override // p000.sbe
        public void setMipMap(boolean z) {
            Bitmap bitmap = this.f81153a;
            if (bitmap != null) {
                k31.setHasMipMap(bitmap, z);
                invalidateSelf();
            }
        }
    }

    private tbe() {
    }

    @efb
    public static sbe create(@efb Resources resources, @hib Bitmap bitmap) {
        return new rbe(resources, bitmap);
    }

    @efb
    public static sbe create(@efb Resources resources, @efb String str) {
        sbe sbeVarCreate = create(resources, BitmapFactory.decodeFile(str));
        if (sbeVarCreate.getBitmap() == null) {
            Log.w(f84178a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return sbeVarCreate;
    }

    @efb
    public static sbe create(@efb Resources resources, @efb InputStream inputStream) {
        sbe sbeVarCreate = create(resources, BitmapFactory.decodeStream(inputStream));
        if (sbeVarCreate.getBitmap() == null) {
            Log.w(f84178a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return sbeVarCreate;
    }
}
