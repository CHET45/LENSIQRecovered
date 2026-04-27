package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.library.C1008R;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.AbstractC1158q;
import androidx.lifecycle.InterfaceC1159r;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p000.drb;
import p000.frb;
import p000.jo1;
import p000.p7e;
import p000.tkb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y8i extends rs0 implements j8i {

    /* JADX INFO: renamed from: V1 */
    public static final int f100766V1 = 1;

    /* JADX INFO: renamed from: Z1 */
    public static final int f100767Z1 = 2;

    /* JADX INFO: renamed from: a2 */
    public static final int f100768a2 = 3;

    /* JADX INFO: renamed from: b2 */
    public static final String f100769b2 = "binding_";

    /* JADX INFO: renamed from: c2 */
    public static final int f100770c2 = 8;

    /* JADX INFO: renamed from: C */
    public boolean f100779C;

    /* JADX INFO: renamed from: F */
    public Choreographer f100780F;

    /* JADX INFO: renamed from: H */
    public final Choreographer.FrameCallback f100781H;

    /* JADX INFO: renamed from: L */
    public Handler f100782L;

    /* JADX INFO: renamed from: M */
    public final DataBindingComponent f100783M;

    /* JADX INFO: renamed from: N */
    public y8i f100784N;

    /* JADX INFO: renamed from: Q */
    public g59 f100785Q;

    /* JADX INFO: renamed from: X */
    public C15562k f100786X;

    /* JADX INFO: renamed from: Y */
    public boolean f100787Y;

    /* JADX INFO: renamed from: Z */
    @p7e({p7e.EnumC10826a.f69935b})
    public boolean f100788Z;

    /* JADX INFO: renamed from: b */
    public final Runnable f100789b;

    /* JADX INFO: renamed from: c */
    public boolean f100790c;

    /* JADX INFO: renamed from: d */
    public boolean f100791d;

    /* JADX INFO: renamed from: e */
    public bii[] f100792e;

    /* JADX INFO: renamed from: f */
    public final View f100793f;

    /* JADX INFO: renamed from: m */
    public jo1<i4c, y8i, Void> f100794m;

    /* JADX INFO: renamed from: M1 */
    public static int f100765M1 = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: d2 */
    public static final boolean f100771d2 = true;

    /* JADX INFO: renamed from: e2 */
    public static final f63 f100772e2 = new C15552a();

    /* JADX INFO: renamed from: f2 */
    public static final f63 f100773f2 = new C15553b();

    /* JADX INFO: renamed from: g2 */
    public static final f63 f100774g2 = new C15554c();

    /* JADX INFO: renamed from: h2 */
    public static final f63 f100775h2 = new C15555d();

    /* JADX INFO: renamed from: i2 */
    public static final jo1.AbstractC7989a<i4c, y8i, Void> f100776i2 = new C15556e();

    /* JADX INFO: renamed from: j2 */
    public static final ReferenceQueue<y8i> f100777j2 = new ReferenceQueue<>();

    /* JADX INFO: renamed from: k2 */
    public static final View.OnAttachStateChangeListener f100778k2 = new ViewOnAttachStateChangeListenerC15557f();

    /* JADX INFO: renamed from: y8i$a */
    public class C15552a implements f63 {
        @Override // p000.f63
        public bii create(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            return new C15566o(y8iVar, i, referenceQueue).getListener();
        }
    }

    /* JADX INFO: renamed from: y8i$b */
    public class C15553b implements f63 {
        @Override // p000.f63
        public bii create(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            return new C15564m(y8iVar, i, referenceQueue).getListener();
        }
    }

    /* JADX INFO: renamed from: y8i$c */
    public class C15554c implements f63 {
        @Override // p000.f63
        public bii create(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            return new C15565n(y8iVar, i, referenceQueue).getListener();
        }
    }

    /* JADX INFO: renamed from: y8i$d */
    public class C15555d implements f63 {
        @Override // p000.f63
        public bii create(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            return new C15561j(y8iVar, i, referenceQueue).getListener();
        }
    }

    /* JADX INFO: renamed from: y8i$e */
    public class C15556e extends jo1.AbstractC7989a<i4c, y8i, Void> {
        @Override // p000.jo1.AbstractC7989a
        public void onNotifyCallback(i4c i4cVar, y8i y8iVar, int i, Void r4) {
            if (i == 1) {
                if (i4cVar.onPreBind(y8iVar)) {
                    return;
                }
                y8iVar.f100791d = true;
            } else if (i == 2) {
                i4cVar.onCanceled(y8iVar);
            } else {
                if (i != 3) {
                    return;
                }
                i4cVar.onBound(y8iVar);
            }
        }
    }

    /* JADX INFO: renamed from: y8i$f */
    public class ViewOnAttachStateChangeListenerC15557f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @omg(19)
        public void onViewAttachedToWindow(View view) {
            y8i.m25744m(view).f100789b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: y8i$g */
    public class RunnableC15558g implements Runnable {
        public RunnableC15558g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                y8i.this.f100790c = false;
            }
            y8i.processReferenceQueue();
            if (y8i.this.f100793f.isAttachedToWindow()) {
                y8i.this.executePendingBindings();
            } else {
                y8i.this.f100793f.removeOnAttachStateChangeListener(y8i.f100778k2);
                y8i.this.f100793f.addOnAttachStateChangeListener(y8i.f100778k2);
            }
        }
    }

    /* JADX INFO: renamed from: y8i$h */
    public class ChoreographerFrameCallbackC15559h implements Choreographer.FrameCallback {
        public ChoreographerFrameCallbackC15559h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            y8i.this.f100789b.run();
        }
    }

    /* JADX INFO: renamed from: y8i$i */
    public static class C15560i {

        /* JADX INFO: renamed from: a */
        public final String[][] f100797a;

        /* JADX INFO: renamed from: b */
        public final int[][] f100798b;

        /* JADX INFO: renamed from: c */
        public final int[][] f100799c;

        public C15560i(int i) {
            this.f100797a = new String[i][];
            this.f100798b = new int[i][];
            this.f100799c = new int[i][];
        }

        public void setIncludes(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f100797a[i] = strArr;
            this.f100798b[i] = iArr;
            this.f100799c[i] = iArr2;
        }
    }

    /* JADX INFO: renamed from: y8i$j */
    public static class C15561j implements qxb, btb<AbstractC1158q<?>> {

        /* JADX INFO: renamed from: a */
        public final bii<AbstractC1158q<?>> f100800a;

        /* JADX INFO: renamed from: b */
        @hib
        public WeakReference<g59> f100801b = null;

        public C15561j(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            this.f100800a = new bii<>(y8iVar, i, this, referenceQueue);
        }

        @hib
        private g59 getLifecycleOwner() {
            WeakReference<g59> weakReference = this.f100801b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // p000.btb
        public bii<AbstractC1158q<?>> getListener() {
            return this.f100800a;
        }

        @Override // p000.qxb
        public void onChanged(@hib Object obj) {
            y8i y8iVarM3191a = this.f100800a.m3191a();
            if (y8iVarM3191a != null) {
                bii<AbstractC1158q<?>> biiVar = this.f100800a;
                y8iVarM3191a.m25779I(biiVar.f13838b, biiVar.getTarget(), 0);
            }
        }

        @Override // p000.btb
        public void setLifecycleOwner(@hib g59 g59Var) {
            g59 lifecycleOwner = getLifecycleOwner();
            AbstractC1158q<?> target = this.f100800a.getTarget();
            if (target != null) {
                if (lifecycleOwner != null) {
                    target.removeObserver(this);
                }
                if (g59Var != null) {
                    target.observe(g59Var, this);
                }
            }
            if (g59Var != null) {
                this.f100801b = new WeakReference<>(g59Var);
            }
        }

        @Override // p000.btb
        public void addListener(AbstractC1158q<?> abstractC1158q) {
            g59 lifecycleOwner = getLifecycleOwner();
            if (lifecycleOwner != null) {
                abstractC1158q.observe(lifecycleOwner, this);
            }
        }

        @Override // p000.btb
        public void removeListener(AbstractC1158q<?> abstractC1158q) {
            abstractC1158q.removeObserver(this);
        }
    }

    /* JADX INFO: renamed from: y8i$k */
    public static class C15562k implements f59 {

        /* JADX INFO: renamed from: a */
        public final WeakReference<y8i> f100802a;

        public /* synthetic */ C15562k(y8i y8iVar, C15552a c15552a) {
            this(y8iVar);
        }

        @InterfaceC1159r(AbstractC1143j.a.ON_START)
        public void onStart() {
            y8i y8iVar = this.f100802a.get();
            if (y8iVar != null) {
                y8iVar.executePendingBindings();
            }
        }

        private C15562k(y8i y8iVar) {
            this.f100802a = new WeakReference<>(y8iVar);
        }
    }

    /* JADX INFO: renamed from: y8i$l */
    public static abstract class AbstractC15563l extends tkb.AbstractC13084a implements me8 {

        /* JADX INFO: renamed from: a */
        public final int f100803a;

        public AbstractC15563l(int i) {
            this.f100803a = i;
        }

        @Override // p000.tkb.AbstractC13084a
        public void onPropertyChanged(tkb tkbVar, int i) {
            if (i == this.f100803a || i == 0) {
                onChange();
            }
        }
    }

    /* JADX INFO: renamed from: y8i$m */
    public static class C15564m extends drb.AbstractC4925a implements btb<drb> {

        /* JADX INFO: renamed from: a */
        public final bii<drb> f100804a;

        public C15564m(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            this.f100804a = new bii<>(y8iVar, i, this, referenceQueue);
        }

        @Override // p000.btb
        public bii<drb> getListener() {
            return this.f100804a;
        }

        @Override // p000.drb.AbstractC4925a
        public void onChanged(drb drbVar) {
            drb target;
            y8i y8iVarM3191a = this.f100804a.m3191a();
            if (y8iVarM3191a != null && (target = this.f100804a.getTarget()) == drbVar) {
                y8iVarM3191a.m25779I(this.f100804a.f13838b, target, 0);
            }
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeChanged(drb drbVar, int i, int i2) {
            onChanged(drbVar);
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeInserted(drb drbVar, int i, int i2) {
            onChanged(drbVar);
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeMoved(drb drbVar, int i, int i2, int i3) {
            onChanged(drbVar);
        }

        @Override // p000.drb.AbstractC4925a
        public void onItemRangeRemoved(drb drbVar, int i, int i2) {
            onChanged(drbVar);
        }

        @Override // p000.btb
        public void setLifecycleOwner(g59 g59Var) {
        }

        @Override // p000.btb
        public void addListener(drb drbVar) {
            drbVar.addOnListChangedCallback(this);
        }

        @Override // p000.btb
        public void removeListener(drb drbVar) {
            drbVar.removeOnListChangedCallback(this);
        }
    }

    /* JADX INFO: renamed from: y8i$n */
    public static class C15565n extends frb.AbstractC5941a implements btb<frb> {

        /* JADX INFO: renamed from: a */
        public final bii<frb> f100805a;

        public C15565n(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            this.f100805a = new bii<>(y8iVar, i, this, referenceQueue);
        }

        @Override // p000.btb
        public bii<frb> getListener() {
            return this.f100805a;
        }

        @Override // p000.frb.AbstractC5941a
        public void onMapChanged(frb frbVar, Object obj) {
            y8i y8iVarM3191a = this.f100805a.m3191a();
            if (y8iVarM3191a == null || frbVar != this.f100805a.getTarget()) {
                return;
            }
            y8iVarM3191a.m25779I(this.f100805a.f13838b, frbVar, 0);
        }

        @Override // p000.btb
        public void setLifecycleOwner(g59 g59Var) {
        }

        @Override // p000.btb
        public void addListener(frb frbVar) {
            frbVar.addOnMapChangedCallback(this);
        }

        @Override // p000.btb
        public void removeListener(frb frbVar) {
            frbVar.removeOnMapChangedCallback(this);
        }
    }

    /* JADX INFO: renamed from: y8i$o */
    public static class C15566o extends tkb.AbstractC13084a implements btb<tkb> {

        /* JADX INFO: renamed from: a */
        public final bii<tkb> f100806a;

        public C15566o(y8i y8iVar, int i, ReferenceQueue<y8i> referenceQueue) {
            this.f100806a = new bii<>(y8iVar, i, this, referenceQueue);
        }

        @Override // p000.btb
        public bii<tkb> getListener() {
            return this.f100806a;
        }

        @Override // p000.tkb.AbstractC13084a
        public void onPropertyChanged(tkb tkbVar, int i) {
            y8i y8iVarM3191a = this.f100806a.m3191a();
            if (y8iVarM3191a != null && this.f100806a.getTarget() == tkbVar) {
                y8iVarM3191a.m25779I(this.f100806a.f13838b, tkbVar, i);
            }
        }

        @Override // p000.btb
        public void setLifecycleOwner(g59 g59Var) {
        }

        @Override // p000.btb
        public void addListener(tkb tkbVar) {
            tkbVar.addOnPropertyChangedCallback(this);
        }

        @Override // p000.btb
        public void removeListener(tkb tkbVar) {
            tkbVar.removeOnPropertyChangedCallback(this);
        }
    }

    public y8i(DataBindingComponent dataBindingComponent, View view, int i) {
        this.f100789b = new RunnableC15558g();
        this.f100790c = false;
        this.f100791d = false;
        this.f100783M = dataBindingComponent;
        this.f100792e = new bii[i];
        this.f100793f = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f100771d2) {
            this.f100780F = Choreographer.getInstance();
            this.f100781H = new ChoreographerFrameCallbackC15559h();
        } else {
            this.f100781H = null;
            this.f100782L = new Handler(Looper.myLooper());
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m25706A(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    @omg(18)
    /* JADX INFO: renamed from: B */
    public static long m25707B(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0L;
        }
        return sparseLongArray.get(i);
    }

    /* JADX INFO: renamed from: C */
    public static <T> T m25708C(zl9<T> zl9Var, int i) {
        if (zl9Var == null || i < 0) {
            return null;
        }
        return zl9Var.get(i);
    }

    @omg(16)
    /* JADX INFO: renamed from: D */
    public static <T> T m25709D(LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    /* JADX INFO: renamed from: E */
    public static <T> T m25710E(SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    /* JADX INFO: renamed from: F */
    public static <T> T m25711F(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m25712G(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: J */
    public static <T extends y8i> T m25713J(@efb LayoutInflater layoutInflater, int i, @hib ViewGroup viewGroup, boolean z, @hib Object obj) {
        return (T) kf3.inflate(layoutInflater, i, viewGroup, z, checkAndCastToBindingComponent(obj));
    }

    /* JADX INFO: renamed from: K */
    public static Object[] m25714K(DataBindingComponent dataBindingComponent, View view, int i, C15560i c15560i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        mapBindings(dataBindingComponent, view, objArr, c15560i, sparseIntArray, true);
        return objArr;
    }

    /* JADX INFO: renamed from: L */
    public static Object[] m25715L(DataBindingComponent dataBindingComponent, View[] viewArr, int i, C15560i c15560i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View view : viewArr) {
            mapBindings(dataBindingComponent, view, objArr, c15560i, sparseIntArray, true);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: N */
    public static byte m25716N(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    /* JADX INFO: renamed from: O */
    public static char m25717O(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    /* JADX INFO: renamed from: P */
    public static double m25718P(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static float m25719Q(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    /* JADX INFO: renamed from: R */
    public static int m25720R(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: S */
    public static long m25721S(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* JADX INFO: renamed from: T */
    public static short m25722T(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    /* JADX INFO: renamed from: U */
    public static boolean m25723U(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    /* JADX INFO: renamed from: X */
    public static byte m25724X(Byte b) {
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    /* JADX INFO: renamed from: Y */
    public static char m25725Y(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    /* JADX INFO: renamed from: Z */
    public static double m25726Z(Double d) {
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* JADX INFO: renamed from: a0 */
    public static float m25727a0(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: b0 */
    public static int m25729b0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: c0 */
    public static long m25731c0(Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX INFO: renamed from: d0 */
    public static short m25733d0(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m25735e0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private void executeBindingsInternal() {
        if (this.f100779C) {
            m25782W();
            return;
        }
        if (hasPendingBindings()) {
            this.f100779C = true;
            this.f100791d = false;
            jo1<i4c, y8i, Void> jo1Var = this.f100794m;
            if (jo1Var != null) {
                jo1Var.notifyCallbacks(this, 1, null);
                if (this.f100791d) {
                    this.f100794m.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.f100791d) {
                m25787j();
                jo1<i4c, y8i, Void> jo1Var2 = this.f100794m;
                if (jo1Var2 != null) {
                    jo1Var2.notifyCallbacks(this, 3, null);
                }
            }
            this.f100779C = false;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m25737f0(y8i y8iVar, me8 me8Var, AbstractC15563l abstractC15563l) {
        if (me8Var != abstractC15563l) {
            if (me8Var != null) {
                y8iVar.removeOnPropertyChangedCallback((AbstractC15563l) me8Var);
            }
            if (abstractC15563l != null) {
                y8iVar.addOnPropertyChangedCallback(abstractC15563l);
            }
        }
    }

    private static int findIncludeIndex(String str, int i, C15560i c15560i, int i2) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = c15560i.f100797a[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (isNumeric(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public static int getBuildSdkInt() {
        return f100765M1;
    }

    /* JADX INFO: renamed from: h */
    public static y8i m25739h(Object obj, View view, int i) {
        return kf3.m14706a(checkAndCastToBindingComponent(obj), view, i);
    }

    private static boolean isNumeric(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public static <T> void m25740j0(zl9<T> zl9Var, int i, T t) {
        if (zl9Var == null || i < 0 || i >= zl9Var.size()) {
            return;
        }
        zl9Var.put(i, t);
    }

    /* JADX INFO: renamed from: k */
    public static void m25741k(y8i y8iVar) {
        y8iVar.executeBindingsInternal();
    }

    @omg(16)
    /* JADX INFO: renamed from: k0 */
    public static <T> void m25742k0(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray == null || i < 0 || i >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i, t);
    }

    /* JADX INFO: renamed from: l0 */
    public static <T> void m25743l0(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray == null || i < 0 || i >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i, t);
    }

    /* JADX INFO: renamed from: m */
    public static y8i m25744m(View view) {
        if (view != null) {
            return (y8i) view.getTag(C1008R.id.dataBinding);
        }
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public static void m25745m0(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray == null || i < 0 || i >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void mapBindings(androidx.databinding.DataBindingComponent r17, android.view.View r18, java.lang.Object[] r19, p000.y8i.C15560i r20, android.util.SparseIntArray r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y8i.mapBindings(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], y8i$i, android.util.SparseIntArray, boolean):void");
    }

    /* JADX INFO: renamed from: n */
    public static int m25746n(View view, int i) {
        return view.getContext().getColor(i);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m25747n0(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray == null || i < 0 || i >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public static ColorStateList m25748o(View view, int i) {
        return view.getContext().getColorStateList(i);
    }

    @omg(18)
    /* JADX INFO: renamed from: o0 */
    public static void m25749o0(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray == null || i < 0 || i >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i, j);
    }

    /* JADX INFO: renamed from: p */
    public static Drawable m25750p(View view, int i) {
        return view.getContext().getDrawable(i);
    }

    /* JADX INFO: renamed from: p0 */
    public static <T> void m25751p0(List<T> list, int i, T t) {
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        list.set(i, t);
    }

    private static int parseTagInt(String str, int i) {
        int iCharAt = 0;
        while (i < str.length()) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        return iCharAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            Reference<? extends y8i> referencePoll = f100777j2.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof bii) {
                ((bii) referencePoll).unregister();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static <K, T> T m25752q(Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    /* JADX INFO: renamed from: q0 */
    public static <K, T> void m25753q0(Map<K, T> map, K k, T t) {
        if (map == null) {
            return;
        }
        map.put(k, t);
    }

    /* JADX INFO: renamed from: r */
    public static byte m25754r(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i];
    }

    /* JADX INFO: renamed from: r0 */
    public static void m25755r0(byte[] bArr, int i, byte b) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return;
        }
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: s */
    public static char m25756s(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    /* JADX INFO: renamed from: s0 */
    public static void m25757s0(char[] cArr, int i, char c) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return;
        }
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: t */
    public static double m25758t(double[] dArr, int i) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return 0.0d;
        }
        return dArr[i];
    }

    /* JADX INFO: renamed from: t0 */
    public static void m25759t0(double[] dArr, int i, double d) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return;
        }
        dArr[i] = d;
    }

    /* JADX INFO: renamed from: u */
    public static float m25760u(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    /* JADX INFO: renamed from: u0 */
    public static void m25761u0(float[] fArr, int i, float f) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return;
        }
        fArr[i] = f;
    }

    /* JADX INFO: renamed from: v */
    public static int m25762v(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: v0 */
    public static void m25763v0(int[] iArr, int i, int i2) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return;
        }
        iArr[i] = i2;
    }

    /* JADX INFO: renamed from: w */
    public static long m25764w(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0L;
        }
        return jArr[i];
    }

    /* JADX INFO: renamed from: w0 */
    public static void m25765w0(long[] jArr, int i, long j) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return;
        }
        jArr[i] = j;
    }

    /* JADX INFO: renamed from: x */
    public static <T> T m25766x(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    /* JADX INFO: renamed from: x0 */
    public static <T> void m25767x0(T[] tArr, int i, T t) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return;
        }
        tArr[i] = t;
    }

    /* JADX INFO: renamed from: y */
    public static short m25768y(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return (short) 0;
        }
        return sArr[i];
    }

    /* JADX INFO: renamed from: y0 */
    public static void m25769y0(short[] sArr, int i, short s) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return;
        }
        sArr[i] = s;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m25770z(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    /* JADX INFO: renamed from: z0 */
    public static void m25771z0(boolean[] zArr, int i, boolean z) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return;
        }
        zArr[i] = z;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m25772A0(int i) {
        bii biiVar = this.f100792e[i];
        if (biiVar != null) {
            return biiVar.unregister();
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m25773B0(int i, AbstractC1158q<?> abstractC1158q) {
        this.f100787Y = true;
        try {
            return m25777F0(i, abstractC1158q, f100775h2);
        } finally {
            this.f100787Y = false;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m25774C0(int i, tkb tkbVar) {
        return m25777F0(i, tkbVar, f100772e2);
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m25775D0(int i, drb drbVar) {
        return m25777F0(i, drbVar, f100773f2);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m25776E0(int i, frb frbVar) {
        return m25777F0(i, frbVar, f100774g2);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: F0 */
    public boolean m25777F0(int i, Object obj, f63 f63Var) {
        if (obj == null) {
            return m25772A0(i);
        }
        bii biiVar = this.f100792e[i];
        if (biiVar == null) {
            m25781V(i, obj, f63Var);
            return true;
        }
        if (biiVar.getTarget() == obj) {
            return false;
        }
        m25772A0(i);
        m25781V(i, obj, f63Var);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public Object m25778H(int i) {
        bii biiVar = this.f100792e[i];
        if (biiVar == null) {
            return null;
        }
        return biiVar.getTarget();
    }

    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: I */
    public void m25779I(int i, Object obj, int i2) {
        if (this.f100787Y || this.f100788Z || !m25780M(i, obj, i2)) {
            return;
        }
        m25782W();
    }

    /* JADX INFO: renamed from: M */
    public abstract boolean m25780M(int i, Object obj, int i2);

    /* JADX INFO: renamed from: V */
    public void m25781V(int i, Object obj, f63 f63Var) {
        if (obj == null) {
            return;
        }
        bii biiVarCreate = this.f100792e[i];
        if (biiVarCreate == null) {
            biiVarCreate = f63Var.create(this, i, f100777j2);
            this.f100792e[i] = biiVarCreate;
            g59 g59Var = this.f100785Q;
            if (g59Var != null) {
                biiVarCreate.setLifecycleOwner(g59Var);
            }
        }
        biiVarCreate.setTarget(obj);
    }

    /* JADX INFO: renamed from: W */
    public void m25782W() {
        y8i y8iVar = this.f100784N;
        if (y8iVar != null) {
            y8iVar.m25782W();
            return;
        }
        g59 g59Var = this.f100785Q;
        if (g59Var == null || g59Var.getLifecycle().getCurrentState().isAtLeast(AbstractC1143j.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f100790c) {
                        return;
                    }
                    this.f100790c = true;
                    if (f100771d2) {
                        this.f100780F.postFrameCallback(this.f100781H);
                    } else {
                        this.f100782L.post(this.f100789b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void addOnRebindCallback(@efb i4c i4cVar) {
        if (this.f100794m == null) {
            this.f100794m = new jo1<>(f100776i2);
        }
        this.f100794m.add(i4cVar);
    }

    public void executePendingBindings() {
        y8i y8iVar = this.f100784N;
        if (y8iVar == null) {
            executeBindingsInternal();
        } else {
            y8iVar.executePendingBindings();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m25783g0(y8i y8iVar) {
        if (y8iVar != null) {
            y8iVar.f100784N = this;
        }
    }

    @hib
    public g59 getLifecycleOwner() {
        return this.f100785Q;
    }

    @Override // p000.j8i
    @efb
    public View getRoot() {
        return this.f100793f;
    }

    /* JADX INFO: renamed from: h0 */
    public void m25784h0(View view) {
        view.setTag(C1008R.id.dataBinding, this);
    }

    public abstract boolean hasPendingBindings();

    /* JADX INFO: renamed from: i */
    public void m25785i(Class<?> cls) {
        if (this.f100783M != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    /* JADX INFO: renamed from: i0 */
    public void m25786i0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(C1008R.id.dataBinding, this);
        }
    }

    public abstract void invalidateAll();

    /* JADX INFO: renamed from: j */
    public abstract void m25787j();

    /* JADX INFO: renamed from: l */
    public void m25788l() {
        m25787j();
    }

    public void removeOnRebindCallback(@efb i4c i4cVar) {
        jo1<i4c, y8i, Void> jo1Var = this.f100794m;
        if (jo1Var != null) {
            jo1Var.remove(i4cVar);
        }
    }

    @ir9
    public void setLifecycleOwner(@hib g59 g59Var) {
        if (g59Var instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        g59 g59Var2 = this.f100785Q;
        if (g59Var2 == g59Var) {
            return;
        }
        if (g59Var2 != null) {
            g59Var2.getLifecycle().removeObserver(this.f100786X);
        }
        this.f100785Q = g59Var;
        if (g59Var != null) {
            if (this.f100786X == null) {
                this.f100786X = new C15562k(this, null);
            }
            g59Var.getLifecycle().addObserver(this.f100786X);
        }
        for (bii biiVar : this.f100792e) {
            if (biiVar != null) {
                biiVar.setLifecycleOwner(g59Var);
            }
        }
    }

    public abstract boolean setVariable(int i, @hib Object obj);

    public void unbind() {
        for (bii biiVar : this.f100792e) {
            if (biiVar != null) {
                biiVar.unregister();
            }
        }
    }

    public y8i(Object obj, View view, int i) {
        this(checkAndCastToBindingComponent(obj), view, i);
    }
}
