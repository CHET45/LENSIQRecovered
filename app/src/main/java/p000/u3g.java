package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class u3g implements v3g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13352a f86736a = new C13352a(null);

    /* JADX INFO: renamed from: b */
    public static boolean f86737b;

    /* JADX INFO: renamed from: c */
    @gib
    public static Constructor<StaticLayout> f86738c;

    /* JADX INFO: renamed from: u3g$a */
    public static final class C13352a {
        public /* synthetic */ C13352a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (u3g.f86737b) {
                return u3g.f86738c;
            }
            u3g.f86737b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                u3g.f86738c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                u3g.f86738c = null;
                Log.e(w3g.f93183a, "unable to collect necessary constructor.");
            }
            return u3g.f86738c;
        }

        private C13352a() {
        }
    }

    @Override // p000.v3g
    @yfb
    @ih4
    public StaticLayout create(@yfb x3g x3gVar) {
        Constructor staticLayoutConstructor = f86736a.getStaticLayoutConstructor();
        StaticLayout staticLayout = null;
        if (staticLayoutConstructor != null) {
            try {
                staticLayout = (StaticLayout) staticLayoutConstructor.newInstance(x3gVar.getText(), Integer.valueOf(x3gVar.getStart()), Integer.valueOf(x3gVar.getEnd()), x3gVar.getPaint(), Integer.valueOf(x3gVar.getWidth()), x3gVar.getAlignment(), x3gVar.getTextDir(), Float.valueOf(x3gVar.getLineSpacingMultiplier()), Float.valueOf(x3gVar.getLineSpacingExtra()), Boolean.valueOf(x3gVar.getIncludePadding()), x3gVar.getEllipsize(), Integer.valueOf(x3gVar.getEllipsizedWidth()), Integer.valueOf(x3gVar.getMaxLines()));
            } catch (IllegalAccessException unused) {
                f86738c = null;
                Log.e(w3g.f93183a, "unable to call constructor");
            } catch (InstantiationException unused2) {
                f86738c = null;
                Log.e(w3g.f93183a, "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f86738c = null;
                Log.e(w3g.f93183a, "unable to call constructor");
            }
        }
        return staticLayout != null ? staticLayout : new StaticLayout(x3gVar.getText(), x3gVar.getStart(), x3gVar.getEnd(), x3gVar.getPaint(), x3gVar.getWidth(), x3gVar.getAlignment(), x3gVar.getLineSpacingMultiplier(), x3gVar.getLineSpacingExtra(), x3gVar.getIncludePadding(), x3gVar.getEllipsize(), x3gVar.getEllipsizedWidth());
    }

    @Override // p000.v3g
    public boolean isFallbackLineSpacingEnabled(@yfb StaticLayout staticLayout, boolean z) {
        return false;
    }
}
