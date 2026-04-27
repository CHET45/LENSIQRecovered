package p000;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import com.bumptech.glide.RequestBuilder;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class p99<T> implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final int f70083a;

    /* JADX INFO: renamed from: b */
    public final C10862d f70084b;

    /* JADX INFO: renamed from: c */
    public final g4e f70085c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10859a<T> f70086d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC10860b<T> f70087e;

    /* JADX INFO: renamed from: f */
    public int f70088f;

    /* JADX INFO: renamed from: g */
    public int f70089g;

    /* JADX INFO: renamed from: i */
    public int f70091i;

    /* JADX INFO: renamed from: h */
    public int f70090h = -1;

    /* JADX INFO: renamed from: j */
    public boolean f70092j = true;

    /* JADX INFO: renamed from: p99$a */
    public interface InterfaceC10859a<U> {
        @efb
        List<U> getPreloadItems(int i);

        @hib
        RequestBuilder<?> getPreloadRequestBuilder(@efb U u);
    }

    /* JADX INFO: renamed from: p99$b */
    public interface InterfaceC10860b<T> {
        @hib
        int[] getPreloadSize(@efb T t, int i, int i2);
    }

    /* JADX INFO: renamed from: p99$c */
    public static final class C10861c implements jmg<Object> {

        /* JADX INFO: renamed from: a */
        public int f70093a;

        /* JADX INFO: renamed from: b */
        public int f70094b;

        /* JADX INFO: renamed from: c */
        @hib
        public q3e f70095c;

        @Override // p000.jmg
        @hib
        public q3e getRequest() {
            return this.f70095c;
        }

        @Override // p000.jmg
        public void getSize(@efb gqf gqfVar) {
            gqfVar.onSizeReady(this.f70094b, this.f70093a);
        }

        @Override // p000.e59
        public void onDestroy() {
        }

        @Override // p000.jmg
        public void onLoadCleared(@hib Drawable drawable) {
        }

        @Override // p000.jmg
        public void onLoadFailed(@hib Drawable drawable) {
        }

        @Override // p000.jmg
        public void onLoadStarted(@hib Drawable drawable) {
        }

        @Override // p000.jmg
        public void onResourceReady(@efb Object obj, @hib afh<? super Object> afhVar) {
        }

        @Override // p000.e59
        public void onStart() {
        }

        @Override // p000.e59
        public void onStop() {
        }

        @Override // p000.jmg
        public void removeCallback(@efb gqf gqfVar) {
        }

        @Override // p000.jmg
        public void setRequest(@hib q3e q3eVar) {
            this.f70095c = q3eVar;
        }
    }

    /* JADX INFO: renamed from: p99$d */
    public static final class C10862d {

        /* JADX INFO: renamed from: a */
        public final Queue<C10861c> f70096a;

        public C10862d(int i) {
            this.f70096a = v0i.createQueue(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f70096a.offer(new C10861c());
            }
        }

        public C10861c next(int i, int i2) {
            C10861c c10861cPoll = this.f70096a.poll();
            this.f70096a.offer(c10861cPoll);
            c10861cPoll.f70094b = i;
            c10861cPoll.f70093a = i2;
            return c10861cPoll;
        }
    }

    public p99(@efb g4e g4eVar, @efb InterfaceC10859a<T> interfaceC10859a, @efb InterfaceC10860b<T> interfaceC10860b, int i) {
        this.f70085c = g4eVar;
        this.f70086d = interfaceC10859a;
        this.f70087e = interfaceC10860b;
        this.f70083a = i;
        this.f70084b = new C10862d(i + 1);
    }

    private void cancelAll() {
        for (int i = 0; i < this.f70084b.f70096a.size(); i++) {
            this.f70085c.clear(this.f70084b.next(0, 0));
        }
    }

    private void preload(int i, boolean z) {
        if (this.f70092j != z) {
            this.f70092j = z;
            cancelAll();
        }
        preload(i, (z ? this.f70083a : -this.f70083a) + i);
    }

    private void preloadAdapterPosition(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                preloadItem(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            preloadItem(list.get(i3), i, i3);
        }
    }

    private void preloadItem(@hib T t, int i, int i2) {
        int[] preloadSize;
        RequestBuilder<?> preloadRequestBuilder;
        if (t == null || (preloadSize = this.f70087e.getPreloadSize(t, i, i2)) == null || (preloadRequestBuilder = this.f70086d.getPreloadRequestBuilder(t)) == null) {
            return;
        }
        preloadRequestBuilder.into(this.f70084b.next(preloadSize[0], preloadSize[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f70091i = i3;
        int i4 = this.f70090h;
        if (i > i4) {
            preload(i2 + i, true);
        } else if (i < i4) {
            preload(i, false);
        }
        this.f70090h = i;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    private void preload(int i, int i2) {
        int iMin;
        int iMax;
        if (i < i2) {
            iMax = Math.max(this.f70088f, i);
            iMin = i2;
        } else {
            iMin = Math.min(this.f70089g, i);
            iMax = i2;
        }
        int iMin2 = Math.min(this.f70091i, iMin);
        int iMin3 = Math.min(this.f70091i, Math.max(0, iMax));
        if (i < i2) {
            for (int i3 = iMin3; i3 < iMin2; i3++) {
                preloadAdapterPosition(this.f70086d.getPreloadItems(i3), i3, true);
            }
        } else {
            for (int i4 = iMin2 - 1; i4 >= iMin3; i4--) {
                preloadAdapterPosition(this.f70086d.getPreloadItems(i4), i4, false);
            }
        }
        this.f70089g = iMin3;
        this.f70088f = iMin2;
    }
}
