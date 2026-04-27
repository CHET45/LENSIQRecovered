package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class rq4 {
    private rq4() {
    }

    @hib
    public static Drawable compositeTwoLayeredDrawable(@hib Drawable drawable, @hib Drawable drawable2) {
        int intrinsicHeight;
        int intrinsicWidth;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
            intrinsicWidth = intrinsicWidth2;
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth3 = drawable2.getIntrinsicWidth() / drawable2.getIntrinsicHeight();
            if (intrinsicWidth3 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                intrinsicWidth = drawable.getIntrinsicWidth();
                intrinsicHeight = (int) (intrinsicWidth / intrinsicWidth3);
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
                intrinsicWidth = (int) (intrinsicWidth3 * intrinsicHeight);
            }
        } else {
            intrinsicWidth = drawable2.getIntrinsicWidth();
            intrinsicHeight = drawable2.getIntrinsicHeight();
        }
        layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @hib
    public static Drawable createTintableDrawableIfNeeded(@hib Drawable drawable, @hib ColorStateList colorStateList, @hib PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @hib
    public static Drawable createTintableMutatedDrawableIfNeeded(@hib Drawable drawable, @hib ColorStateList colorStateList, @hib PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @efb
    public static int[] getCheckedState(@efb int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    @efb
    public static int[] getUncheckedState(@efb int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    @efb
    public static AttributeSet parseDrawableXml(@efb Context context, @cti int i, @efb CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e) {
            e = e;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e2) {
            e = e2;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void setOutlineToPath(@efb Outline outline, @efb Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @omg(21)
    public static void setRippleDrawableRadius(@hib RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static void setTint(@efb Drawable drawable, @g92 int i) {
        if (i != 0) {
            yp4.setTint(drawable, i);
        } else {
            yp4.setTintList(drawable, null);
        }
    }

    @hib
    public static PorterDuffColorFilter updateTintFilter(@efb Drawable drawable, @hib ColorStateList colorStateList, @hib PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    @hib
    private static Drawable createTintableMutatedDrawableIfNeeded(@hib Drawable drawable, @hib ColorStateList colorStateList, @hib PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = yp4.wrap(drawable).mutate();
            if (mode != null) {
                yp4.setTintMode(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }
}
