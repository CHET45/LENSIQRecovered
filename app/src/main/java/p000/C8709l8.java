package p000;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l8 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class C8709l8 implements DrawerLayout.InterfaceC1023e {

    /* JADX INFO: renamed from: m */
    public static final String f56718m = "ActionBarDrawerToggle";

    /* JADX INFO: renamed from: n */
    public static final int[] f56719n = {R.attr.homeAsUpIndicator};

    /* JADX INFO: renamed from: o */
    public static final float f56720o = 0.33333334f;

    /* JADX INFO: renamed from: p */
    public static final int f56721p = 16908332;

    /* JADX INFO: renamed from: a */
    public final Activity f56722a;

    /* JADX INFO: renamed from: b */
    public final a f56723b;

    /* JADX INFO: renamed from: c */
    public final DrawerLayout f56724c;

    /* JADX INFO: renamed from: d */
    public boolean f56725d;

    /* JADX INFO: renamed from: e */
    public boolean f56726e;

    /* JADX INFO: renamed from: f */
    public Drawable f56727f;

    /* JADX INFO: renamed from: g */
    public Drawable f56728g;

    /* JADX INFO: renamed from: h */
    public d f56729h;

    /* JADX INFO: renamed from: i */
    public final int f56730i;

    /* JADX INFO: renamed from: j */
    public final int f56731j;

    /* JADX INFO: renamed from: k */
    public final int f56732k;

    /* JADX INFO: renamed from: l */
    public c f56733l;

    /* JADX INFO: renamed from: l8$a */
    @Deprecated
    public interface a {
        @hib
        Drawable getThemeUpIndicator();

        void setActionBarDescription(@g8g int i);

        void setActionBarUpIndicator(Drawable drawable, @g8g int i);
    }

    /* JADX INFO: renamed from: l8$b */
    @Deprecated
    public interface b {
        @hib
        a getDrawerToggleDelegate();
    }

    /* JADX INFO: renamed from: l8$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public Method f56734a;

        /* JADX INFO: renamed from: b */
        public Method f56735b;

        /* JADX INFO: renamed from: c */
        public ImageView f56736c;

        public c(Activity activity) {
            try {
                this.f56734a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f56735b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(16908332);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f56736c = (ImageView) childAt;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l8$d */
    public class d extends InsetDrawable implements Drawable.Callback {

        /* JADX INFO: renamed from: a */
        public final boolean f56737a;

        /* JADX INFO: renamed from: b */
        public final Rect f56738b;

        /* JADX INFO: renamed from: c */
        public float f56739c;

        /* JADX INFO: renamed from: d */
        public float f56740d;

        public d(Drawable drawable) {
            super(drawable, 0);
            this.f56737a = true;
            this.f56738b = new Rect();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@efb Canvas canvas) {
            copyBounds(this.f56738b);
            canvas.save();
            boolean z = o8i.getLayoutDirection(C8709l8.this.f56722a.getWindow().getDecorView()) == 1;
            int i = z ? -1 : 1;
            float fWidth = this.f56738b.width();
            canvas.translate((-this.f56740d) * fWidth * this.f56739c * i, 0.0f);
            if (z && !this.f56737a) {
                canvas.translate(fWidth, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }

        public float getPosition() {
            return this.f56739c;
        }

        public void setOffset(float f) {
            this.f56740d = f;
            invalidateSelf();
        }

        public void setPosition(float f) {
            this.f56739c = f;
            invalidateSelf();
        }
    }

    public C8709l8(Activity activity, DrawerLayout drawerLayout, @gq4 int i, @g8g int i2, @g8g int i3) {
        this(activity, drawerLayout, !assumeMaterial(activity), i, i2, i3);
    }

    private static boolean assumeMaterial(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    private Drawable getThemeUpIndicator() {
        a aVar = this.f56723b;
        if (aVar != null) {
            return aVar.getThemeUpIndicator();
        }
        ActionBar actionBar = this.f56722a.getActionBar();
        TypedArray typedArrayObtainStyledAttributes = (actionBar != null ? actionBar.getThemedContext() : this.f56722a).obtainStyledAttributes(null, f56719n, R.attr.actionBarStyle, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    private void setActionBarDescription(int i) {
        a aVar = this.f56723b;
        if (aVar != null) {
            aVar.setActionBarDescription(i);
            return;
        }
        ActionBar actionBar = this.f56722a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    private void setActionBarUpIndicator(Drawable drawable, int i) {
        a aVar = this.f56723b;
        if (aVar != null) {
            aVar.setActionBarUpIndicator(drawable, i);
            return;
        }
        ActionBar actionBar = this.f56722a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.f56725d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f56726e) {
            this.f56727f = getThemeUpIndicator();
        }
        this.f56728g = lx2.getDrawable(this.f56722a, this.f56730i);
        syncState();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1023e
    public void onDrawerClosed(View view) {
        this.f56729h.setPosition(0.0f);
        if (this.f56725d) {
            setActionBarDescription(this.f56731j);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1023e
    public void onDrawerOpened(View view) {
        this.f56729h.setPosition(1.0f);
        if (this.f56725d) {
            setActionBarDescription(this.f56732k);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1023e
    public void onDrawerSlide(View view, float f) {
        float position = this.f56729h.getPosition();
        this.f56729h.setPosition(f > 0.5f ? Math.max(position, Math.max(0.0f, f - 0.5f) * 2.0f) : Math.min(position, f * 2.0f));
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1023e
    public void onDrawerStateChanged(int i) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f56725d) {
            return false;
        }
        if (this.f56724c.isDrawerVisible(8388611)) {
            this.f56724c.closeDrawer(8388611);
            return true;
        }
        this.f56724c.openDrawer(8388611);
        return true;
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        if (z != this.f56725d) {
            if (z) {
                setActionBarUpIndicator(this.f56729h, this.f56724c.isDrawerOpen(8388611) ? this.f56732k : this.f56731j);
            } else {
                setActionBarUpIndicator(this.f56727f, 0);
            }
            this.f56725d = z;
        }
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.f56727f = getThemeUpIndicator();
            this.f56726e = false;
        } else {
            this.f56727f = drawable;
            this.f56726e = true;
        }
        if (this.f56725d) {
            return;
        }
        setActionBarUpIndicator(this.f56727f, 0);
    }

    public void syncState() {
        if (this.f56724c.isDrawerOpen(8388611)) {
            this.f56729h.setPosition(1.0f);
        } else {
            this.f56729h.setPosition(0.0f);
        }
        if (this.f56725d) {
            setActionBarUpIndicator(this.f56729h, this.f56724c.isDrawerOpen(8388611) ? this.f56732k : this.f56731j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8709l8(Activity activity, DrawerLayout drawerLayout, boolean z, @gq4 int i, @g8g int i2, @g8g int i3) {
        this.f56725d = true;
        this.f56722a = activity;
        if (activity instanceof b) {
            this.f56723b = ((b) activity).getDrawerToggleDelegate();
        } else {
            this.f56723b = null;
        }
        this.f56724c = drawerLayout;
        this.f56730i = i;
        this.f56731j = i2;
        this.f56732k = i3;
        this.f56727f = getThemeUpIndicator();
        this.f56728g = lx2.getDrawable(activity, i);
        d dVar = new d(this.f56728g);
        this.f56729h = dVar;
        dVar.setOffset(z ? 0.33333334f : 0.0f);
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? lx2.getDrawable(this.f56722a, i) : null);
    }
}
