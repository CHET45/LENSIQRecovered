package p000;

import android.os.DeadObjectException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xnd<T> implements z5c<T> {

    /* JADX INFO: renamed from: xnd$a */
    public class C15214a implements csb<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ynd f98634a;

        public C15214a(ynd yndVar) {
            this.f98634a = yndVar;
        }

        @Override // p000.csb
        public void subscribe(lob<T> lobVar) {
            try {
                xnd.this.mo3260a(lobVar, this.f98634a);
            } catch (DeadObjectException e) {
                lobVar.tryOnError(xnd.this.mo3261b(e));
                kfe.m14725e(e, "QueueOperation terminated with a DeadObjectException", new Object[0]);
            } catch (Throwable th) {
                lobVar.tryOnError(th);
                kfe.m14725e(th, "QueueOperation terminated with an unexpected exception", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3260a(lob<T> lobVar, ynd yndVar) throws Throwable;

    /* JADX INFO: renamed from: b */
    public abstract c51 mo3261b(DeadObjectException deadObjectException);

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(@efb z5c<?> z5cVar) {
        return compareTo2((z5c) z5cVar);
    }

    @Override // p000.z5c
    public zbd definedPriority() {
        return zbd.f104724c;
    }

    @Override // p000.z5c
    public final vkb<T> run(ynd yndVar) {
        return vkb.create(new C15214a(yndVar));
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@efb z5c z5cVar) {
        return z5cVar.definedPriority().f104726a - definedPriority().f104726a;
    }
}
