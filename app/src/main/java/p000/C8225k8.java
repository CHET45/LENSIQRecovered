package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: loaded from: classes.dex */
public class C8225k8 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f52751a;

    /* JADX INFO: renamed from: k8$a */
    @c5e(21)
    public static class a {
        private a() {
        }

        public static void getOutline(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C8225k8(ActionBarContainer actionBarContainer) {
        this.f52751a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f52751a;
        if (actionBarContainer.f2791C) {
            Drawable drawable = actionBarContainer.f2800m;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2798e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f52751a;
        Drawable drawable3 = actionBarContainer2.f2799f;
        if (drawable3 == null || !actionBarContainer2.f2792F) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @c5e(21)
    public void getOutline(@efb Outline outline) {
        ActionBarContainer actionBarContainer = this.f52751a;
        if (actionBarContainer.f2791C) {
            if (actionBarContainer.f2800m != null) {
                a.getOutline(actionBarContainer.f2798e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f2798e;
            if (drawable != null) {
                a.getOutline(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
