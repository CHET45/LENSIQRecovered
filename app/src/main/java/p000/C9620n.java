package p000;

import android.widget.AbsListView;
import p000.p7e;

/* JADX INFO: renamed from: n */
/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @w21(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @w21(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @w21(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class C9620n {

    /* JADX INFO: renamed from: n$a */
    public class a implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f62876a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f62877b;

        public a(c cVar, b bVar) {
            this.f62876a = cVar;
            this.f62877b = bVar;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            b bVar = this.f62877b;
            if (bVar != null) {
                bVar.onScroll(absListView, i, i2, i3);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            c cVar = this.f62876a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i);
            }
        }
    }

    /* JADX INFO: renamed from: n$b */
    public interface b {
        void onScroll(AbsListView absListView, int i, int i2, int i3);
    }

    /* JADX INFO: renamed from: n$c */
    public interface c {
        void onScrollStateChanged(AbsListView absListView, int i);
    }

    @q21(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void setOnScroll(AbsListView absListView, b bVar, c cVar) {
        absListView.setOnScrollListener(new a(cVar, bVar));
    }
}
