package p000;

import androidx.lifecycle.AbstractC1158q;

/* JADX INFO: loaded from: classes3.dex */
public final class kb9 {

    /* JADX INFO: renamed from: kb9$a */
    @dwf({"SMAP\nLiveData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveData.kt\nandroidx/lifecycle/LiveDataKt$observe$wrappedObserver$1\n*L\n1#1,56:1\n*E\n"})
    public static final class C8277a<T> implements qxb {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<T, bth> f53540a;

        /* JADX WARN: Multi-variable type inference failed */
        public C8277a(qy6<? super T, bth> qy6Var) {
            this.f53540a = qy6Var;
        }

        @Override // p000.qxb
        public final void onChanged(T t) {
            this.f53540a.invoke(t);
        }
    }

    @yfb
    @ir9
    @q64(message = "This extension method is not required when using Kotlin 1.4. You should remove \"import androidx.lifecycle.observe\"")
    public static final <T> qxb<T> observe(@yfb AbstractC1158q<T> abstractC1158q, @yfb g59 g59Var, @yfb qy6<? super T, bth> qy6Var) {
        md8.checkNotNullParameter(abstractC1158q, "<this>");
        md8.checkNotNullParameter(g59Var, "owner");
        md8.checkNotNullParameter(qy6Var, "onChanged");
        C8277a c8277a = new C8277a(qy6Var);
        abstractC1158q.observe(g59Var, c8277a);
        return c8277a;
    }
}
