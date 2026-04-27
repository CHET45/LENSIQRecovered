package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ru6 extends RecyclerView.Adapter<uu6> implements c3g {

    /* JADX INFO: renamed from: i */
    public static final String f79613i = "f#";

    /* JADX INFO: renamed from: j */
    public static final String f79614j = "s#";

    /* JADX INFO: renamed from: k */
    public static final long f79615k = 10000;

    /* JADX INFO: renamed from: a */
    public final AbstractC1143j f79616a;

    /* JADX INFO: renamed from: b */
    public final FragmentManager f79617b;

    /* JADX INFO: renamed from: c */
    public final zl9<Fragment> f79618c;

    /* JADX INFO: renamed from: d */
    public final zl9<Fragment.SavedState> f79619d;

    /* JADX INFO: renamed from: e */
    public final zl9<Integer> f79620e;

    /* JADX INFO: renamed from: f */
    public C12299g f79621f;

    /* JADX INFO: renamed from: g */
    public boolean f79622g;

    /* JADX INFO: renamed from: h */
    public boolean f79623h;

    /* JADX INFO: renamed from: ru6$a */
    public class ViewOnLayoutChangeListenerC12293a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f79624a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ uu6 f79625b;

        public ViewOnLayoutChangeListenerC12293a(FrameLayout frameLayout, uu6 uu6Var) {
            this.f79624a = frameLayout;
            this.f79625b = uu6Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f79624a.getParent() != null) {
                this.f79624a.removeOnLayoutChangeListener(this);
                ru6.this.m21565c(this.f79625b);
            }
        }
    }

    /* JADX INFO: renamed from: ru6$b */
    public class C12294b implements InterfaceC1154n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ uu6 f79627a;

        public C12294b(uu6 uu6Var) {
            this.f79627a = uu6Var;
        }

        @Override // androidx.lifecycle.InterfaceC1154n
        public void onStateChanged(@efb g59 g59Var, @efb AbstractC1143j.a aVar) {
            if (ru6.this.m21566d()) {
                return;
            }
            g59Var.getLifecycle().removeObserver(this);
            if (o8i.isAttachedToWindow(this.f79627a.m23582b())) {
                ru6.this.m21565c(this.f79627a);
            }
        }
    }

    /* JADX INFO: renamed from: ru6$c */
    public class C12295c extends FragmentManager.FragmentLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f79629a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FrameLayout f79630b;

        public C12295c(Fragment fragment, FrameLayout frameLayout) {
            this.f79629a = fragment;
            this.f79630b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(@efb FragmentManager fragmentManager, @efb Fragment fragment, @efb View view, @hib Bundle bundle) {
            if (fragment == this.f79629a) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                ru6.this.m21563a(view, this.f79630b);
            }
        }
    }

    /* JADX INFO: renamed from: ru6$d */
    public class RunnableC12296d implements Runnable {
        public RunnableC12296d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ru6 ru6Var = ru6.this;
            ru6Var.f79622g = false;
            ru6Var.m21564b();
        }
    }

    /* JADX INFO: renamed from: ru6$e */
    public class C12297e implements InterfaceC1154n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Handler f79633a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f79634b;

        public C12297e(Handler handler, Runnable runnable) {
            this.f79633a = handler;
            this.f79634b = runnable;
        }

        @Override // androidx.lifecycle.InterfaceC1154n
        public void onStateChanged(@efb g59 g59Var, @efb AbstractC1143j.a aVar) {
            if (aVar == AbstractC1143j.a.ON_DESTROY) {
                this.f79633a.removeCallbacks(this.f79634b);
                g59Var.getLifecycle().removeObserver(this);
            }
        }
    }

    /* JADX INFO: renamed from: ru6$f */
    public static abstract class AbstractC12298f extends RecyclerView.AdapterDataObserver {
        private AbstractC12298f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ AbstractC12298f(ViewOnLayoutChangeListenerC12293a viewOnLayoutChangeListenerC12293a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, @hib Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: renamed from: ru6$g */
    public class C12299g {

        /* JADX INFO: renamed from: a */
        public ViewPager2.OnPageChangeCallback f79636a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AdapterDataObserver f79637b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1154n f79638c;

        /* JADX INFO: renamed from: d */
        public ViewPager2 f79639d;

        /* JADX INFO: renamed from: e */
        public long f79640e = -1;

        /* JADX INFO: renamed from: ru6$g$a */
        public class a extends ViewPager2.OnPageChangeCallback {
            public a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                C12299g.this.m21569c(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                C12299g.this.m21569c(false);
            }
        }

        /* JADX INFO: renamed from: ru6$g$b */
        public class b extends AbstractC12298f {
            public b() {
                super(null);
            }

            @Override // p000.ru6.AbstractC12298f, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                C12299g.this.m21569c(true);
            }
        }

        /* JADX INFO: renamed from: ru6$g$c */
        public class c implements InterfaceC1154n {
            public c() {
            }

            @Override // androidx.lifecycle.InterfaceC1154n
            public void onStateChanged(@efb g59 g59Var, @efb AbstractC1143j.a aVar) {
                C12299g.this.m21569c(false);
            }
        }

        public C12299g() {
        }

        @efb
        private ViewPager2 inferViewPager(@efb RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* JADX INFO: renamed from: a */
        public void m21567a(@efb RecyclerView recyclerView) {
            this.f79639d = inferViewPager(recyclerView);
            a aVar = new a();
            this.f79636a = aVar;
            this.f79639d.registerOnPageChangeCallback(aVar);
            b bVar = new b();
            this.f79637b = bVar;
            ru6.this.registerAdapterDataObserver(bVar);
            c cVar = new c();
            this.f79638c = cVar;
            ru6.this.f79616a.addObserver(cVar);
        }

        /* JADX INFO: renamed from: b */
        public void m21568b(@efb RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.f79636a);
            ru6.this.unregisterAdapterDataObserver(this.f79637b);
            ru6.this.f79616a.removeObserver(this.f79638c);
            this.f79639d = null;
        }

        /* JADX INFO: renamed from: c */
        public void m21569c(boolean z) {
            int currentItem;
            Fragment fragment;
            if (ru6.this.m21566d() || this.f79639d.getScrollState() != 0 || ru6.this.f79618c.isEmpty() || ru6.this.getItemCount() == 0 || (currentItem = this.f79639d.getCurrentItem()) >= ru6.this.getItemCount()) {
                return;
            }
            long itemId = ru6.this.getItemId(currentItem);
            if ((itemId != this.f79640e || z) && (fragment = ru6.this.f79618c.get(itemId)) != null && fragment.isAdded()) {
                this.f79640e = itemId;
                FragmentTransaction fragmentTransactionBeginTransaction = ru6.this.f79617b.beginTransaction();
                Fragment fragment2 = null;
                for (int i = 0; i < ru6.this.f79618c.size(); i++) {
                    long jKeyAt = ru6.this.f79618c.keyAt(i);
                    Fragment fragmentValueAt = ru6.this.f79618c.valueAt(i);
                    if (fragmentValueAt.isAdded()) {
                        if (jKeyAt != this.f79640e) {
                            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentValueAt, AbstractC1143j.b.STARTED);
                        } else {
                            fragment2 = fragmentValueAt;
                        }
                        fragmentValueAt.setMenuVisibility(jKeyAt == this.f79640e);
                    }
                }
                if (fragment2 != null) {
                    fragmentTransactionBeginTransaction.setMaxLifecycle(fragment2, AbstractC1143j.b.RESUMED);
                }
                if (fragmentTransactionBeginTransaction.isEmpty()) {
                    return;
                }
                fragmentTransactionBeginTransaction.commitNow();
            }
        }
    }

    public ru6(@efb FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    @efb
    private static String createKey(@efb String str, long j) {
        return str + j;
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        if (this.f79618c.containsKey(itemId)) {
            return;
        }
        Fragment fragmentCreateFragment = createFragment(i);
        fragmentCreateFragment.setInitialSavedState(this.f79619d.get(itemId));
        this.f79618c.put(itemId, fragmentCreateFragment);
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        if (this.f79620e.containsKey(j)) {
            return true;
        }
        Fragment fragment = this.f79618c.get(j);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(@efb String str, @efb String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.f79620e.size(); i2++) {
            if (this.f79620e.valueAt(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f79620e.keyAt(i2));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(@efb String str, @efb String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j) {
        ViewParent parent;
        Fragment fragment = this.f79618c.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.f79619d.remove(j);
        }
        if (!fragment.isAdded()) {
            this.f79618c.remove(j);
            return;
        }
        if (m21566d()) {
            this.f79623h = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j)) {
            this.f79619d.put(j, this.f79617b.saveFragmentInstanceState(fragment));
        }
        this.f79617b.beginTransaction().remove(fragment).commitNow();
        this.f79618c.remove(j);
    }

    private void scheduleGracePeriodEnd() {
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC12296d runnableC12296d = new RunnableC12296d();
        this.f79616a.addObserver(new C12297e(handler, runnableC12296d));
        handler.postDelayed(runnableC12296d, 10000L);
    }

    private void scheduleViewAttach(Fragment fragment, @efb FrameLayout frameLayout) {
        this.f79617b.registerFragmentLifecycleCallbacks(new C12295c(fragment, frameLayout), false);
    }

    /* JADX INFO: renamed from: a */
    public void m21563a(@efb View view, @efb FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public void m21564b() {
        if (!this.f79623h || m21566d()) {
            return;
        }
        g70 g70Var = new g70();
        for (int i = 0; i < this.f79618c.size(); i++) {
            long jKeyAt = this.f79618c.keyAt(i);
            if (!containsItem(jKeyAt)) {
                g70Var.add(Long.valueOf(jKeyAt));
                this.f79620e.remove(jKeyAt);
            }
        }
        if (!this.f79622g) {
            this.f79623h = false;
            for (int i2 = 0; i2 < this.f79618c.size(); i2++) {
                long jKeyAt2 = this.f79618c.keyAt(i2);
                if (!isFragmentViewBound(jKeyAt2)) {
                    g70Var.add(Long.valueOf(jKeyAt2));
                }
            }
        }
        Iterator<E> it = g70Var.iterator();
        while (it.hasNext()) {
            removeFragment(((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m21565c(@efb uu6 uu6Var) {
        Fragment fragment = this.f79618c.get(uu6Var.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutM23582b = uu6Var.m23582b();
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            scheduleViewAttach(fragment, frameLayoutM23582b);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutM23582b) {
                m21563a(view, frameLayoutM23582b);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            m21563a(view, frameLayoutM23582b);
            return;
        }
        if (m21566d()) {
            if (this.f79617b.isDestroyed()) {
                return;
            }
            this.f79616a.addObserver(new C12294b(uu6Var));
            return;
        }
        scheduleViewAttach(fragment, frameLayoutM23582b);
        this.f79617b.beginTransaction().add(fragment, "f" + uu6Var.getItemId()).setMaxLifecycle(fragment, AbstractC1143j.b.STARTED).commitNow();
        this.f79621f.m21569c(false);
    }

    public boolean containsItem(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @efb
    public abstract Fragment createFragment(int i);

    /* JADX INFO: renamed from: d */
    public boolean m21566d() {
        return this.f79617b.isStateSaved();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @un1
    public void onAttachedToRecyclerView(@efb RecyclerView recyclerView) {
        z7d.checkArgument(this.f79621f == null);
        C12299g c12299g = new C12299g();
        this.f79621f = c12299g;
        c12299g.m21567a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @un1
    public void onDetachedFromRecyclerView(@efb RecyclerView recyclerView) {
        this.f79621f.m21568b(recyclerView);
        this.f79621f = null;
    }

    @Override // p000.c3g
    public final void restoreState(@efb Parcelable parcelable) {
        if (!this.f79619d.isEmpty() || !this.f79618c.isEmpty()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, f79613i)) {
                this.f79618c.put(parseIdFromKey(str, f79613i), this.f79617b.getFragment(bundle, str));
            } else {
                if (!isValidKey(str, f79614j)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long idFromKey = parseIdFromKey(str, f79614j);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.f79619d.put(idFromKey, savedState);
                }
            }
        }
        if (this.f79618c.isEmpty()) {
            return;
        }
        this.f79623h = true;
        this.f79622g = true;
        m21564b();
        scheduleGracePeriodEnd();
    }

    @Override // p000.c3g
    @efb
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.f79618c.size() + this.f79619d.size());
        for (int i = 0; i < this.f79618c.size(); i++) {
            long jKeyAt = this.f79618c.keyAt(i);
            Fragment fragment = this.f79618c.get(jKeyAt);
            if (fragment != null && fragment.isAdded()) {
                this.f79617b.putFragment(bundle, createKey(f79613i, jKeyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f79619d.size(); i2++) {
            long jKeyAt2 = this.f79619d.keyAt(i2);
            if (containsItem(jKeyAt2)) {
                bundle.putParcelable(createKey(f79614j, jKeyAt2), this.f79619d.get(jKeyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public ru6(@efb Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@efb uu6 uu6Var, int i) {
        long itemId = uu6Var.getItemId();
        int id = uu6Var.m23582b().getId();
        Long lItemForViewHolder = itemForViewHolder(id);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.f79620e.remove(lItemForViewHolder.longValue());
        }
        this.f79620e.put(itemId, Integer.valueOf(id));
        ensureFragment(i);
        FrameLayout frameLayoutM23582b = uu6Var.m23582b();
        if (o8i.isAttachedToWindow(frameLayoutM23582b)) {
            if (frameLayoutM23582b.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutM23582b.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC12293a(frameLayoutM23582b, uu6Var));
        }
        m21564b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @efb
    public final uu6 onCreateViewHolder(@efb ViewGroup viewGroup, int i) {
        return uu6.m23581a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@efb uu6 uu6Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@efb uu6 uu6Var) {
        m21565c(uu6Var);
        m21564b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@efb uu6 uu6Var) {
        Long lItemForViewHolder = itemForViewHolder(uu6Var.m23582b().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.f79620e.remove(lItemForViewHolder.longValue());
        }
    }

    public ru6(@efb FragmentManager fragmentManager, @efb AbstractC1143j abstractC1143j) {
        this.f79618c = new zl9<>();
        this.f79619d = new zl9<>();
        this.f79620e = new zl9<>();
        this.f79622g = false;
        this.f79623h = false;
        this.f79617b = fragmentManager;
        this.f79616a = abstractC1143j;
        super.setHasStableIds(true);
    }
}
