package p000;

import java.util.Iterator;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class k35<T> extends caf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k35(@yfb uae uaeVar) {
        super(uaeVar);
        md8.checkNotNullParameter(uaeVar, "database");
    }

    public abstract void bind(@yfb bgg bggVar, T t);

    @Override // p000.caf
    @yfb
    public abstract String createQuery();

    public final int handle(T t) {
        bgg bggVarAcquire = acquire();
        try {
            bind(bggVarAcquire, t);
            return bggVarAcquire.executeUpdateDelete();
        } finally {
            release(bggVarAcquire);
        }
    }

    public final int handleMultiple(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "entities");
        bgg bggVarAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            int iExecuteUpdateDelete = 0;
            while (it.hasNext()) {
                bind(bggVarAcquire, it.next());
                iExecuteUpdateDelete += bggVarAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(bggVarAcquire);
        }
    }

    public final int handleMultiple(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entities");
        bgg bggVarAcquire = acquire();
        try {
            int iExecuteUpdateDelete = 0;
            for (T t : tArr) {
                bind(bggVarAcquire, t);
                iExecuteUpdateDelete += bggVarAcquire.executeUpdateDelete();
            }
            return iExecuteUpdateDelete;
        } finally {
            release(bggVarAcquire);
        }
    }
}
