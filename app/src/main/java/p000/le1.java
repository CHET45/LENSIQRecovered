package p000;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class le1<T> implements rc4<T> {

    /* JADX INFO: renamed from: a */
    public final ListUpdateCallback f57327a;

    /* JADX INFO: renamed from: b */
    public Executor f57328b;

    /* JADX INFO: renamed from: c */
    public final Executor f57329c;

    /* JADX INFO: renamed from: d */
    public final List<j89<T>> f57330d;

    /* JADX INFO: renamed from: e */
    public int f57331e;

    /* JADX INFO: renamed from: f */
    public final mt0<T, ?> f57332f;

    /* JADX INFO: renamed from: g */
    public final me1<T> f57333g;

    /* JADX INFO: renamed from: le1$a */
    public static final class ExecutorC8780a implements Executor {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Handler f57334a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@yfb Runnable runnable) {
            md8.checkParameterIsNotNull(runnable, "command");
            this.f57334a.post(runnable);
        }

        @yfb
        public final Handler getMHandler() {
            return this.f57334a;
        }
    }

    /* JADX INFO: renamed from: le1$b */
    public static final class RunnableC8781b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f57336b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f57337c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f57338d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Runnable f57339e;

        /* JADX INFO: renamed from: le1$b$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DiffUtil.DiffResult f57341b;

            public a(DiffUtil.DiffResult diffResult) {
                this.f57341b = diffResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i = le1.this.f57331e;
                RunnableC8781b runnableC8781b = RunnableC8781b.this;
                if (i == runnableC8781b.f57338d) {
                    le1.this.latchList(runnableC8781b.f57337c, this.f57341b, runnableC8781b.f57339e);
                }
            }
        }

        /* JADX INFO: renamed from: le1$b$b */
        public static final class b extends DiffUtil.Callback {
            public b() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i, int i2) {
                Object obj = RunnableC8781b.this.f57336b.get(i);
                Object obj2 = RunnableC8781b.this.f57337c.get(i2);
                if (obj != null && obj2 != null) {
                    return le1.this.f57333g.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i, int i2) {
                Object obj = RunnableC8781b.this.f57336b.get(i);
                Object obj2 = RunnableC8781b.this.f57337c.get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : le1.this.f57333g.getDiffCallback().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            @gib
            public Object getChangePayload(int i, int i2) {
                Object obj = RunnableC8781b.this.f57336b.get(i);
                Object obj2 = RunnableC8781b.this.f57337c.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return le1.this.f57333g.getDiffCallback().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return RunnableC8781b.this.f57337c.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return RunnableC8781b.this.f57336b.size();
            }
        }

        public RunnableC8781b(List list, List list2, int i, Runnable runnable) {
            this.f57336b = list;
            this.f57337c = list2;
            this.f57338d = i;
            this.f57339e = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new b());
            md8.checkExpressionValueIsNotNull(diffResultCalculateDiff, "DiffUtil.calculateDiff(o…         }\n            })");
            le1.this.f57328b.execute(new a(diffResultCalculateDiff));
        }
    }

    public le1(@yfb mt0<T, ?> mt0Var, @yfb me1<T> me1Var) {
        md8.checkParameterIsNotNull(mt0Var, "adapter");
        md8.checkParameterIsNotNull(me1Var, "config");
        this.f57332f = mt0Var;
        this.f57333g = me1Var;
        this.f57327a = new ne1(mt0Var);
        Executor executorC8780a = new ExecutorC8780a();
        this.f57329c = executorC8780a;
        Executor mainThreadExecutor = me1Var.getMainThreadExecutor();
        this.f57328b = mainThreadExecutor != null ? mainThreadExecutor : executorC8780a;
        this.f57330d = new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void latchList(List<T> list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List<? extends T> data = this.f57332f.getData();
        this.f57332f.setData$com_github_CymChad_brvah(list);
        diffResult.dispatchUpdatesTo(this.f57327a);
        onCurrentListChanged(data, runnable);
    }

    private final void onCurrentListChanged(List<? extends T> list, Runnable runnable) {
        Iterator<j89<T>> it = this.f57330d.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(list, this.f57332f.getData());
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void submitList$default(le1 le1Var, List list, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        le1Var.submitList(list, runnable);
    }

    public final void addData(int i, T t) {
        List<? extends T> data = this.f57332f.getData();
        this.f57332f.getData().add(i, t);
        this.f57327a.onInserted(i, 1);
        onCurrentListChanged(data, null);
    }

    public final void addList(@gib List<? extends T> list) {
        if (list == null) {
            return;
        }
        List<? extends T> data = this.f57332f.getData();
        this.f57332f.getData().addAll(list);
        this.f57327a.onInserted(data.size(), list.size());
        onCurrentListChanged(data, null);
    }

    @Override // p000.rc4
    public void addListListener(@yfb j89<T> j89Var) {
        md8.checkParameterIsNotNull(j89Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f57330d.add(j89Var);
    }

    public final void changeData(int i, T t, @gib T t2) {
        List<? extends T> data = this.f57332f.getData();
        this.f57332f.getData().set(i, t);
        this.f57327a.onChanged(i, 1, t2);
        onCurrentListChanged(data, null);
    }

    public final void clearAllListListener() {
        this.f57330d.clear();
    }

    public final void remove(T t) {
        List<? extends T> data = this.f57332f.getData();
        int iIndexOf = this.f57332f.getData().indexOf(t);
        if (iIndexOf == -1) {
            return;
        }
        this.f57332f.getData().remove(iIndexOf);
        this.f57327a.onRemoved(iIndexOf, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeAt(int i) {
        List<? extends T> data = this.f57332f.getData();
        this.f57332f.getData().remove(i);
        this.f57327a.onRemoved(i, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeListListener(@yfb j89<T> j89Var) {
        md8.checkParameterIsNotNull(j89Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f57330d.remove(j89Var);
    }

    @yn8
    public final void submitList(@gib List<T> list) {
        submitList$default(this, list, null, 2, null);
    }

    @yn8
    public final void submitList(@gib List<T> list, @gib Runnable runnable) {
        int i = this.f57331e + 1;
        this.f57331e = i;
        if (list == this.f57332f.getData()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<? extends T> data = this.f57332f.getData();
        if (list == null) {
            int size = this.f57332f.getData().size();
            this.f57332f.setData$com_github_CymChad_brvah(new ArrayList());
            this.f57327a.onRemoved(0, size);
            onCurrentListChanged(data, runnable);
            return;
        }
        if (!this.f57332f.getData().isEmpty()) {
            this.f57333g.getBackgroundThreadExecutor().execute(new RunnableC8781b(data, list, i, runnable));
            return;
        }
        this.f57332f.setData$com_github_CymChad_brvah(list);
        this.f57327a.onInserted(0, list.size());
        onCurrentListChanged(data, runnable);
    }

    public final void addData(T t) {
        List<? extends T> data = this.f57332f.getData();
        this.f57332f.getData().add(t);
        this.f57327a.onInserted(data.size(), 1);
        onCurrentListChanged(data, null);
    }
}
