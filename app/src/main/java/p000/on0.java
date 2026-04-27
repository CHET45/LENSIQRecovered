package p000;

import android.os.Build;
import android.window.BackEvent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class on0 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C10472a f68158e = new C10472a(null);

    /* JADX INFO: renamed from: f */
    public static final int f68159f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f68160g = 1;

    /* JADX INFO: renamed from: a */
    public final float f68161a;

    /* JADX INFO: renamed from: b */
    public final float f68162b;

    /* JADX INFO: renamed from: c */
    public final float f68163c;

    /* JADX INFO: renamed from: d */
    public final int f68164d;

    /* JADX INFO: renamed from: on0$a */
    public static final class C10472a {
        public /* synthetic */ C10472a(jt3 jt3Var) {
            this();
        }

        private C10472a() {
        }
    }

    /* JADX INFO: renamed from: on0$b */
    @Target({ElementType.TYPE_USE})
    @p7e({p7e.EnumC10826a.f69934a})
    @nmg(allowedTargets = {EnumC12373rz.f80133M})
    @i8e(EnumC11189pz.f72536a)
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10473b {
    }

    @fdi
    public on0(float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, int i) {
        this.f68161a = f;
        this.f68162b = f2;
        this.f68163c = f3;
        this.f68164d = i;
    }

    public final float getProgress() {
        return this.f68163c;
    }

    public final int getSwipeEdge() {
        return this.f68164d;
    }

    public final float getTouchX() {
        return this.f68161a;
    }

    public final float getTouchY() {
        return this.f68162b;
    }

    @c5e(34)
    @yfb
    public final BackEvent toBackEvent() {
        if (Build.VERSION.SDK_INT >= 34) {
            return w00.f93031a.createOnBackEvent(this.f68161a, this.f68162b, this.f68163c, this.f68164d);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 34+");
    }

    @yfb
    public String toString() {
        return "BackEventCompat{touchX=" + this.f68161a + ", touchY=" + this.f68162b + ", progress=" + this.f68163c + ", swipeEdge=" + this.f68164d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @c5e(34)
    public on0(@yfb BackEvent backEvent) {
        md8.checkNotNullParameter(backEvent, "backEvent");
        w00 w00Var = w00.f93031a;
        this(w00Var.touchX(backEvent), w00Var.touchY(backEvent), w00Var.progress(backEvent), w00Var.swipeEdge(backEvent));
    }
}
