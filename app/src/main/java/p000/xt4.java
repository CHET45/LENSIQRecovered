package p000;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import p000.C8141jy;
import p000.p7e;
import p000.xt4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xt4<T extends xt4<T>> implements C8141jy.b {

    /* JADX INFO: renamed from: A */
    public static final float f99188A = 1.0f;

    /* JADX INFO: renamed from: B */
    public static final float f99189B = 0.1f;

    /* JADX INFO: renamed from: C */
    public static final float f99190C = 0.00390625f;

    /* JADX INFO: renamed from: D */
    public static final float f99191D = 0.002f;

    /* JADX INFO: renamed from: E */
    public static final float f99192E = Float.MAX_VALUE;

    /* JADX INFO: renamed from: F */
    public static final float f99193F = 0.75f;

    /* JADX INFO: renamed from: m */
    public static final AbstractC15292s f99194m = new C15280g("translationX");

    /* JADX INFO: renamed from: n */
    public static final AbstractC15292s f99195n = new C15281h("translationY");

    /* JADX INFO: renamed from: o */
    public static final AbstractC15292s f99196o = new C15282i("translationZ");

    /* JADX INFO: renamed from: p */
    public static final AbstractC15292s f99197p = new C15283j("scaleX");

    /* JADX INFO: renamed from: q */
    public static final AbstractC15292s f99198q = new C15284k("scaleY");

    /* JADX INFO: renamed from: r */
    public static final AbstractC15292s f99199r = new C15285l(dq8.f30369i);

    /* JADX INFO: renamed from: s */
    public static final AbstractC15292s f99200s = new C15286m("rotationX");

    /* JADX INFO: renamed from: t */
    public static final AbstractC15292s f99201t = new C15287n("rotationY");

    /* JADX INFO: renamed from: u */
    public static final AbstractC15292s f99202u = new C15288o("x");

    /* JADX INFO: renamed from: v */
    public static final AbstractC15292s f99203v = new C15274a("y");

    /* JADX INFO: renamed from: w */
    public static final AbstractC15292s f99204w = new C15275b(CompressorStreamFactory.f68445Z);

    /* JADX INFO: renamed from: x */
    public static final AbstractC15292s f99205x = new C15276c("alpha");

    /* JADX INFO: renamed from: y */
    public static final AbstractC15292s f99206y = new C15277d("scrollX");

    /* JADX INFO: renamed from: z */
    public static final AbstractC15292s f99207z = new C15278e("scrollY");

    /* JADX INFO: renamed from: a */
    public float f99208a;

    /* JADX INFO: renamed from: b */
    public float f99209b;

    /* JADX INFO: renamed from: c */
    public boolean f99210c;

    /* JADX INFO: renamed from: d */
    public final Object f99211d;

    /* JADX INFO: renamed from: e */
    public final x46 f99212e;

    /* JADX INFO: renamed from: f */
    public boolean f99213f;

    /* JADX INFO: renamed from: g */
    public float f99214g;

    /* JADX INFO: renamed from: h */
    public float f99215h;

    /* JADX INFO: renamed from: i */
    public long f99216i;

    /* JADX INFO: renamed from: j */
    public float f99217j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<InterfaceC15290q> f99218k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<InterfaceC15291r> f99219l;

    /* JADX INFO: renamed from: xt4$a */
    public static class C15274a extends AbstractC15292s {
        public C15274a(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getY();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setY(f);
        }
    }

    /* JADX INFO: renamed from: xt4$b */
    public static class C15275b extends AbstractC15292s {
        public C15275b(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return o8i.getZ(view);
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            o8i.setZ(view, f);
        }
    }

    /* JADX INFO: renamed from: xt4$c */
    public static class C15276c extends AbstractC15292s {
        public C15276c(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: xt4$d */
    public static class C15277d extends AbstractC15292s {
        public C15277d(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* JADX INFO: renamed from: xt4$e */
    public static class C15278e extends AbstractC15292s {
        public C15278e(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* JADX INFO: renamed from: xt4$f */
    public class C15279f extends x46 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ k56 f99220b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15279f(String str, k56 k56Var) {
            super(str);
            this.f99220b = k56Var;
        }

        @Override // p000.x46
        public float getValue(Object obj) {
            return this.f99220b.getValue();
        }

        @Override // p000.x46
        public void setValue(Object obj, float f) {
            this.f99220b.setValue(f);
        }
    }

    /* JADX INFO: renamed from: xt4$g */
    public static class C15280g extends AbstractC15292s {
        public C15280g(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: xt4$h */
    public static class C15281h extends AbstractC15292s {
        public C15281h(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: xt4$i */
    public static class C15282i extends AbstractC15292s {
        public C15282i(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return o8i.getTranslationZ(view);
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            o8i.setTranslationZ(view, f);
        }
    }

    /* JADX INFO: renamed from: xt4$j */
    public static class C15283j extends AbstractC15292s {
        public C15283j(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* JADX INFO: renamed from: xt4$k */
    public static class C15284k extends AbstractC15292s {
        public C15284k(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: xt4$l */
    public static class C15285l extends AbstractC15292s {
        public C15285l(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setRotation(f);
        }
    }

    /* JADX INFO: renamed from: xt4$m */
    public static class C15286m extends AbstractC15292s {
        public C15286m(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* JADX INFO: renamed from: xt4$n */
    public static class C15287n extends AbstractC15292s {
        public C15287n(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* JADX INFO: renamed from: xt4$o */
    public static class C15288o extends AbstractC15292s {
        public C15288o(String str) {
            super(str, null);
        }

        @Override // p000.x46
        public float getValue(View view) {
            return view.getX();
        }

        @Override // p000.x46
        public void setValue(View view, float f) {
            view.setX(f);
        }
    }

    /* JADX INFO: renamed from: xt4$p */
    public static class C15289p {

        /* JADX INFO: renamed from: a */
        public float f99222a;

        /* JADX INFO: renamed from: b */
        public float f99223b;
    }

    /* JADX INFO: renamed from: xt4$q */
    public interface InterfaceC15290q {
        void onAnimationEnd(xt4 xt4Var, boolean z, float f, float f2);
    }

    /* JADX INFO: renamed from: xt4$r */
    public interface InterfaceC15291r {
        void onAnimationUpdate(xt4 xt4Var, float f, float f2);
    }

    /* JADX INFO: renamed from: xt4$s */
    public static abstract class AbstractC15292s extends x46<View> {
        public /* synthetic */ AbstractC15292s(String str, C15280g c15280g) {
            this(str);
        }

        private AbstractC15292s(String str) {
            super(str);
        }
    }

    public xt4(k56 k56Var) {
        this.f99208a = 0.0f;
        this.f99209b = Float.MAX_VALUE;
        this.f99210c = false;
        this.f99213f = false;
        this.f99214g = Float.MAX_VALUE;
        this.f99215h = -Float.MAX_VALUE;
        this.f99216i = 0L;
        this.f99218k = new ArrayList<>();
        this.f99219l = new ArrayList<>();
        this.f99211d = null;
        this.f99212e = new C15279f("FloatValueHolder", k56Var);
        this.f99217j = 1.0f;
    }

    private void endAnimationInternal(boolean z) {
        this.f99213f = false;
        C8141jy.getInstance().removeCallback(this);
        this.f99216i = 0L;
        this.f99210c = false;
        for (int i = 0; i < this.f99218k.size(); i++) {
            if (this.f99218k.get(i) != null) {
                this.f99218k.get(i).onAnimationEnd(this, z, this.f99209b, this.f99208a);
            }
        }
        removeNullEntries(this.f99218k);
    }

    private float getPropertyValue() {
        return this.f99212e.getValue(this.f99211d);
    }

    private static <T> void removeEntry(ArrayList<T> arrayList, T t) {
        int iIndexOf = arrayList.indexOf(t);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    private static <T> void removeNullEntries(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void startAnimationInternal() {
        if (this.f99213f) {
            return;
        }
        this.f99213f = true;
        if (!this.f99210c) {
            this.f99209b = getPropertyValue();
        }
        float f = this.f99209b;
        if (f > this.f99214g || f < this.f99215h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C8141jy.getInstance().addAnimationFrameCallback(this, 0L);
    }

    /* JADX INFO: renamed from: a */
    public abstract float mo12675a(float f, float f2);

    public T addEndListener(InterfaceC15290q interfaceC15290q) {
        if (!this.f99218k.contains(interfaceC15290q)) {
            this.f99218k.add(interfaceC15290q);
        }
        return this;
    }

    public T addUpdateListener(InterfaceC15291r interfaceC15291r) {
        if (isRunning()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f99219l.contains(interfaceC15291r)) {
            this.f99219l.add(interfaceC15291r);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public float m25444b() {
        return this.f99217j * 0.75f;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo12676c(float f, float f2);

    public void cancel() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f99213f) {
            endAnimationInternal(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m25445d(float f) {
        this.f99212e.setValue(this.f99211d, f);
        for (int i = 0; i < this.f99219l.size(); i++) {
            if (this.f99219l.get(i) != null) {
                this.f99219l.get(i).onAnimationUpdate(this, this.f99209b, this.f99208a);
            }
        }
        removeNullEntries(this.f99219l);
    }

    @Override // p000.C8141jy.b
    @p7e({p7e.EnumC10826a.f69934a})
    public boolean doAnimationFrame(long j) {
        long j2 = this.f99216i;
        if (j2 == 0) {
            this.f99216i = j;
            m25445d(this.f99209b);
            return false;
        }
        this.f99216i = j;
        boolean zMo12678f = mo12678f(j - j2);
        float fMin = Math.min(this.f99209b, this.f99214g);
        this.f99209b = fMin;
        float fMax = Math.max(fMin, this.f99215h);
        this.f99209b = fMax;
        m25445d(fMax);
        if (zMo12678f) {
            endAnimationInternal(false);
        }
        return zMo12678f;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo12677e(float f);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo12678f(long j);

    public float getMinimumVisibleChange() {
        return this.f99217j;
    }

    public boolean isRunning() {
        return this.f99213f;
    }

    public void removeEndListener(InterfaceC15290q interfaceC15290q) {
        removeEntry(this.f99218k, interfaceC15290q);
    }

    public void removeUpdateListener(InterfaceC15291r interfaceC15291r) {
        removeEntry(this.f99219l, interfaceC15291r);
    }

    public T setMaxValue(float f) {
        this.f99214g = f;
        return this;
    }

    public T setMinValue(float f) {
        this.f99215h = f;
        return this;
    }

    public T setMinimumVisibleChange(@y46(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f99217j = f;
        mo12677e(f * 0.75f);
        return this;
    }

    public T setStartValue(float f) {
        this.f99209b = f;
        this.f99210c = true;
        return this;
    }

    public T setStartVelocity(float f) {
        this.f99208a = f;
        return this;
    }

    public void start() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f99213f) {
            return;
        }
        startAnimationInternal();
    }

    public <K> xt4(K k, x46<K> x46Var) {
        this.f99208a = 0.0f;
        this.f99209b = Float.MAX_VALUE;
        this.f99210c = false;
        this.f99213f = false;
        this.f99214g = Float.MAX_VALUE;
        this.f99215h = -Float.MAX_VALUE;
        this.f99216i = 0L;
        this.f99218k = new ArrayList<>();
        this.f99219l = new ArrayList<>();
        this.f99211d = k;
        this.f99212e = x46Var;
        if (x46Var != f99199r && x46Var != f99200s && x46Var != f99201t) {
            if (x46Var == f99205x) {
                this.f99217j = 0.00390625f;
                return;
            } else if (x46Var != f99197p && x46Var != f99198q) {
                this.f99217j = 1.0f;
                return;
            } else {
                this.f99217j = 0.00390625f;
                return;
            }
        }
        this.f99217j = 0.1f;
    }
}
