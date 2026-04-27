package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class c2b implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<C2167a> f15577a;

    /* JADX INFO: renamed from: b */
    public final boolean f15578b;

    /* JADX INFO: renamed from: c2b$a */
    public static final class C2167a extends WeakReference<Drawable.Callback> {
        public C2167a(Drawable.Callback callback) {
            super(callback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C2167a.class == obj.getClass() && get() == ((C2167a) obj).get();
        }

        public int hashCode() {
            Drawable.Callback callback = get();
            if (callback != null) {
                return callback.hashCode();
            }
            return 0;
        }
    }

    public c2b() {
        this(false);
    }

    public void addView(Drawable.Callback callback) {
        for (int i = 0; i < this.f15577a.size(); i++) {
            C2167a c2167a = this.f15577a.get(i);
            if (c2167a.get() == null) {
                this.f15577a.remove(c2167a);
            }
        }
        this.f15577a.addIfAbsent(new C2167a(callback));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@efb Drawable drawable) {
        for (int i = 0; i < this.f15577a.size(); i++) {
            C2167a c2167a = this.f15577a.get(i);
            Drawable.Callback callback = c2167a.get();
            if (callback == null) {
                this.f15577a.remove(c2167a);
            } else if (this.f15578b && (callback instanceof View)) {
                ((View) callback).invalidate();
            } else {
                callback.invalidateDrawable(drawable);
            }
        }
    }

    public void removeView(Drawable.Callback callback) {
        for (int i = 0; i < this.f15577a.size(); i++) {
            C2167a c2167a = this.f15577a.get(i);
            Drawable.Callback callback2 = c2167a.get();
            if (callback2 == null || callback2 == callback) {
                this.f15577a.remove(c2167a);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@efb Drawable drawable, @efb Runnable runnable, long j) {
        for (int i = 0; i < this.f15577a.size(); i++) {
            C2167a c2167a = this.f15577a.get(i);
            Drawable.Callback callback = c2167a.get();
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            } else {
                this.f15577a.remove(c2167a);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@efb Drawable drawable, @efb Runnable runnable) {
        for (int i = 0; i < this.f15577a.size(); i++) {
            C2167a c2167a = this.f15577a.get(i);
            Drawable.Callback callback = c2167a.get();
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            } else {
                this.f15577a.remove(c2167a);
            }
        }
    }

    public c2b(boolean z) {
        this.f15577a = new CopyOnWriteArrayList<>();
        this.f15578b = z;
    }
}
