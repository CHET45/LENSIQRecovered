package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qs7 {

    /* JADX INFO: renamed from: e */
    public static final Object f75484e = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f75485a;

    /* JADX INFO: renamed from: b */
    public final String f75486b;

    /* JADX INFO: renamed from: c */
    @hib
    public ps7 f75487c;

    /* JADX INFO: renamed from: d */
    public final Map<String, jo9> f75488d;

    public qs7(Drawable.Callback callback, String str, ps7 ps7Var, Map<String, jo9> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f75486b = str;
        } else {
            this.f75486b = str + '/';
        }
        if (callback instanceof View) {
            this.f75485a = ((View) callback).getContext();
            this.f75488d = map;
            setDelegate(ps7Var);
        } else {
            dj9.warning("LottieDrawable must be inside of a view for images to work.");
            this.f75488d = new HashMap();
            this.f75485a = null;
        }
    }

    private Bitmap putBitmap(String str, @hib Bitmap bitmap) {
        synchronized (f75484e) {
            this.f75488d.get(str).setBitmap(bitmap);
        }
        return bitmap;
    }

    @hib
    public Bitmap bitmapForId(String str) {
        jo9 jo9Var = this.f75488d.get(str);
        if (jo9Var == null) {
            return null;
        }
        Bitmap bitmap = jo9Var.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        ps7 ps7Var = this.f75487c;
        if (ps7Var != null) {
            Bitmap bitmapFetchBitmap = ps7Var.fetchBitmap(jo9Var);
            if (bitmapFetchBitmap != null) {
                putBitmap(str, bitmapFetchBitmap);
            }
            return bitmapFetchBitmap;
        }
        String fileName = jo9Var.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                return putBitmap(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e) {
                dj9.warning("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f75486b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return putBitmap(str, e1i.resizeBitmapIfNeeded(BitmapFactory.decodeStream(this.f75485a.getAssets().open(this.f75486b + fileName), null, options), jo9Var.getWidth(), jo9Var.getHeight()));
            } catch (IllegalArgumentException e2) {
                dj9.warning("Unable to decode image.", e2);
                return null;
            }
        } catch (IOException e3) {
            dj9.warning("Unable to open asset.", e3);
            return null;
        }
    }

    @hib
    public jo9 getImageAssetById(String str) {
        return this.f75488d.get(str);
    }

    public boolean hasSameContext(Context context) {
        return (context == null && this.f75485a == null) || this.f75485a.equals(context);
    }

    public void setDelegate(@hib ps7 ps7Var) {
        this.f75487c = ps7Var;
    }

    @hib
    public Bitmap updateBitmap(String str, @hib Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmap2 = this.f75488d.get(str).getBitmap();
            putBitmap(str, bitmap);
            return bitmap2;
        }
        jo9 jo9Var = this.f75488d.get(str);
        Bitmap bitmap3 = jo9Var.getBitmap();
        jo9Var.setBitmap(null);
        return bitmap3;
    }
}
