package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/4694")
@Deprecated
public final class d6g {

    /* JADX INFO: renamed from: d6g$a */
    public final class RunnableC4638a implements Runnable {

        /* JADX INFO: renamed from: a */
        public boolean f28573a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tn1 f28574b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Iterator f28575c;

        public RunnableC4638a(tn1 tn1Var, Iterator it) {
            this.f28574b = tn1Var;
            this.f28575c = it;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28573a) {
                return;
            }
            while (this.f28574b.isReady() && this.f28575c.hasNext()) {
                this.f28574b.onNext(this.f28575c.next());
            }
            if (this.f28575c.hasNext()) {
                return;
            }
            this.f28573a = true;
            this.f28574b.onCompleted();
        }
    }

    public static <V> void copyWithFlowControl(Iterator<V> it, tn1<V> tn1Var) {
        v7d.checkNotNull(it, "source");
        v7d.checkNotNull(tn1Var, "target");
        tn1Var.setOnReadyHandler(new RunnableC4638a(tn1Var, it));
    }

    public static <V> void copyWithFlowControl(Iterable<V> iterable, tn1<V> tn1Var) {
        v7d.checkNotNull(iterable, "source");
        copyWithFlowControl(iterable.iterator(), tn1Var);
    }
}
