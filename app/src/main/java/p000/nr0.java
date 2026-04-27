package p000;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nr0<K, A> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC10015d<K> f65335c;

    /* JADX INFO: renamed from: e */
    @hib
    public bp9<A> f65337e;

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC10013b> f65333a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f65334b = false;

    /* JADX INFO: renamed from: d */
    public float f65336d = 0.0f;

    /* JADX INFO: renamed from: f */
    @hib
    public A f65338f = null;

    /* JADX INFO: renamed from: g */
    public float f65339g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f65340h = -1.0f;

    /* JADX INFO: renamed from: nr0$b */
    public interface InterfaceC10013b {
        void onValueChanged();
    }

    /* JADX INFO: renamed from: nr0$c */
    public static final class C10014c<T> implements InterfaceC10015d<T> {
        private C10014c() {
        }

        @Override // p000.nr0.InterfaceC10015d
        public hs8<T> getCurrentKeyframe() {
            throw new IllegalStateException("not implemented");
        }

        @Override // p000.nr0.InterfaceC10015d
        public float getEndProgress() {
            return 1.0f;
        }

        @Override // p000.nr0.InterfaceC10015d
        public float getStartDelayProgress() {
            return 0.0f;
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isCachedValueEnabled(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isValueChanged(float f) {
            return false;
        }
    }

    /* JADX INFO: renamed from: nr0$d */
    public interface InterfaceC10015d<T> {
        hs8<T> getCurrentKeyframe();

        @y46(from = 0.0d, m25645to = 1.0d)
        float getEndProgress();

        @y46(from = 0.0d, m25645to = 1.0d)
        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f);

        boolean isEmpty();

        boolean isValueChanged(float f);
    }

    /* JADX INFO: renamed from: nr0$e */
    public static final class C10016e<T> implements InterfaceC10015d<T> {

        /* JADX INFO: renamed from: a */
        public final List<? extends hs8<T>> f65341a;

        /* JADX INFO: renamed from: c */
        public hs8<T> f65343c = null;

        /* JADX INFO: renamed from: d */
        public float f65344d = -1.0f;

        /* JADX INFO: renamed from: b */
        @efb
        public hs8<T> f65342b = findKeyframe(0.0f);

        public C10016e(List<? extends hs8<T>> list) {
            this.f65341a = list;
        }

        private hs8<T> findKeyframe(float f) {
            List<? extends hs8<T>> list = this.f65341a;
            hs8<T> hs8Var = list.get(list.size() - 1);
            if (f >= hs8Var.getStartProgress()) {
                return hs8Var;
            }
            for (int size = this.f65341a.size() - 2; size >= 1; size--) {
                hs8<T> hs8Var2 = this.f65341a.get(size);
                if (this.f65342b != hs8Var2 && hs8Var2.containsProgress(f)) {
                    return hs8Var2;
                }
            }
            return this.f65341a.get(0);
        }

        @Override // p000.nr0.InterfaceC10015d
        @efb
        public hs8<T> getCurrentKeyframe() {
            return this.f65342b;
        }

        @Override // p000.nr0.InterfaceC10015d
        public float getEndProgress() {
            return this.f65341a.get(r0.size() - 1).getEndProgress();
        }

        @Override // p000.nr0.InterfaceC10015d
        public float getStartDelayProgress() {
            return this.f65341a.get(0).getStartProgress();
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isCachedValueEnabled(float f) {
            hs8<T> hs8Var = this.f65343c;
            hs8<T> hs8Var2 = this.f65342b;
            if (hs8Var == hs8Var2 && this.f65344d == f) {
                return true;
            }
            this.f65343c = hs8Var2;
            this.f65344d = f;
            return false;
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isEmpty() {
            return false;
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isValueChanged(float f) {
            if (this.f65342b.containsProgress(f)) {
                return !this.f65342b.isStatic();
            }
            this.f65342b = findKeyframe(f);
            return true;
        }
    }

    /* JADX INFO: renamed from: nr0$f */
    public static final class C10017f<T> implements InterfaceC10015d<T> {

        /* JADX INFO: renamed from: a */
        @efb
        public final hs8<T> f65345a;

        /* JADX INFO: renamed from: b */
        public float f65346b = -1.0f;

        public C10017f(List<? extends hs8<T>> list) {
            this.f65345a = list.get(0);
        }

        @Override // p000.nr0.InterfaceC10015d
        public hs8<T> getCurrentKeyframe() {
            return this.f65345a;
        }

        @Override // p000.nr0.InterfaceC10015d
        public float getEndProgress() {
            return this.f65345a.getEndProgress();
        }

        @Override // p000.nr0.InterfaceC10015d
        public float getStartDelayProgress() {
            return this.f65345a.getStartProgress();
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isCachedValueEnabled(float f) {
            if (this.f65346b == f) {
                return true;
            }
            this.f65346b = f;
            return false;
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isEmpty() {
            return false;
        }

        @Override // p000.nr0.InterfaceC10015d
        public boolean isValueChanged(float f) {
            return !this.f65345a.isStatic();
        }
    }

    public nr0(List<? extends hs8<K>> list) {
        this.f65335c = wrap(list);
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    private float getStartDelayProgress() {
        if (this.f65339g == -1.0f) {
            this.f65339g = this.f65335c.getStartDelayProgress();
        }
        return this.f65339g;
    }

    private static <T> InterfaceC10015d<T> wrap(List<? extends hs8<T>> list) {
        return list.isEmpty() ? new C10014c() : list.size() == 1 ? new C10017f(list) : new C10016e(list);
    }

    /* JADX INFO: renamed from: a */
    public hs8<K> m18078a() {
        bt8.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        hs8<K> currentKeyframe = this.f65335c.getCurrentKeyframe();
        bt8.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return currentKeyframe;
    }

    public void addUpdateListener(InterfaceC10013b interfaceC10013b) {
        this.f65333a.add(interfaceC10013b);
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    /* JADX INFO: renamed from: b */
    public float mo8864b() {
        if (this.f65340h == -1.0f) {
            this.f65340h = this.f65335c.getEndProgress();
        }
        return this.f65340h;
    }

    /* JADX INFO: renamed from: c */
    public float m18079c() {
        hs8<K> hs8VarM18078a = m18078a();
        if (hs8VarM18078a == null || hs8VarM18078a.isStatic()) {
            return 0.0f;
        }
        return hs8VarM18078a.f44693d.getInterpolation(m18080d());
    }

    /* JADX INFO: renamed from: d */
    public float m18080d() {
        if (this.f65334b) {
            return 0.0f;
        }
        hs8<K> hs8VarM18078a = m18078a();
        if (hs8VarM18078a.isStatic()) {
            return 0.0f;
        }
        return (this.f65336d - hs8VarM18078a.getStartProgress()) / (hs8VarM18078a.getEndProgress() - hs8VarM18078a.getStartProgress());
    }

    /* JADX INFO: renamed from: e */
    public A mo17720e(hs8<K> hs8Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public float getProgress() {
        return this.f65336d;
    }

    public A getValue() {
        float fM18080d = m18080d();
        if (this.f65337e == null && this.f65335c.isCachedValueEnabled(fM18080d)) {
            return this.f65338f;
        }
        hs8<K> hs8VarM18078a = m18078a();
        Interpolator interpolator = hs8VarM18078a.f44694e;
        A value = (interpolator == null || hs8VarM18078a.f44695f == null) ? getValue(hs8VarM18078a, m18079c()) : mo17720e(hs8VarM18078a, fM18080d, interpolator.getInterpolation(fM18080d), hs8VarM18078a.f44695f.getInterpolation(fM18080d));
        this.f65338f = value;
        return value;
    }

    public abstract A getValue(hs8<K> hs8Var, float f);

    public void notifyListeners() {
        for (int i = 0; i < this.f65333a.size(); i++) {
            this.f65333a.get(i).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.f65334b = true;
    }

    public void setProgress(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        if (this.f65335c.isEmpty()) {
            return;
        }
        if (f < getStartDelayProgress()) {
            f = getStartDelayProgress();
        } else if (f > mo8864b()) {
            f = mo8864b();
        }
        if (f == this.f65336d) {
            return;
        }
        this.f65336d = f;
        if (this.f65335c.isValueChanged(f)) {
            notifyListeners();
        }
    }

    public void setValueCallback(@hib bp9<A> bp9Var) {
        bp9<A> bp9Var2 = this.f65337e;
        if (bp9Var2 != null) {
            bp9Var2.setAnimation(null);
        }
        this.f65337e = bp9Var;
        if (bp9Var != null) {
            bp9Var.setAnimation(this);
        }
    }
}
