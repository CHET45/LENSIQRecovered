package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class l35<T> extends caf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l35(@yfb uae uaeVar) {
        super(uaeVar);
        md8.checkNotNullParameter(uaeVar, "database");
    }

    public abstract void bind(@gib bgg bggVar, T t);

    public final void insert(T t) {
        bgg bggVarAcquire = acquire();
        try {
            bind(bggVarAcquire, t);
            bggVarAcquire.executeInsert();
        } finally {
            release(bggVarAcquire);
        }
    }

    public final long insertAndReturnId(T t) {
        bgg bggVarAcquire = acquire();
        try {
            bind(bggVarAcquire, t);
            return bggVarAcquire.executeInsert();
        } finally {
            release(bggVarAcquire);
        }
    }

    @yfb
    public final long[] insertAndReturnIdsArray(@yfb Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "entities");
        bgg bggVarAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (T t : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    l82.throwIndexOverflow();
                }
                bind(bggVarAcquire, t);
                jArr[i] = bggVarAcquire.executeInsert();
                i = i2;
            }
            release(bggVarAcquire);
            return jArr;
        } catch (Throwable th) {
            release(bggVarAcquire);
            throw th;
        }
    }

    @yfb
    public final Long[] insertAndReturnIdsArrayBox(@yfb Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "entities");
        bgg bggVarAcquire = acquire();
        Iterator<? extends T> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(bggVarAcquire, it.next());
                lArr[i] = Long.valueOf(bggVarAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(bggVarAcquire);
        }
    }

    @yfb
    public final List<Long> insertAndReturnIdsList(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entities");
        bgg bggVarAcquire = acquire();
        try {
            List listCreateListBuilder = k82.createListBuilder();
            for (T t : tArr) {
                bind(bggVarAcquire, t);
                listCreateListBuilder.add(Long.valueOf(bggVarAcquire.executeInsert()));
            }
            List<Long> listBuild = k82.build(listCreateListBuilder);
            release(bggVarAcquire);
            return listBuild;
        } catch (Throwable th) {
            release(bggVarAcquire);
            throw th;
        }
    }

    public final void insert(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entities");
        bgg bggVarAcquire = acquire();
        try {
            for (T t : tArr) {
                bind(bggVarAcquire, t);
                bggVarAcquire.executeInsert();
            }
        } finally {
            release(bggVarAcquire);
        }
    }

    @yfb
    public final long[] insertAndReturnIdsArray(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entities");
        bgg bggVarAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int length = tArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bind(bggVarAcquire, tArr[i]);
                jArr[i2] = bggVarAcquire.executeInsert();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            release(bggVarAcquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final Long[] insertAndReturnIdsArrayBox(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entities");
        bgg bggVarAcquire = acquire();
        Iterator it = l60.iterator(tArr);
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                bind(bggVarAcquire, it.next());
                lArr[i] = Long.valueOf(bggVarAcquire.executeInsert());
            }
            return lArr;
        } finally {
            release(bggVarAcquire);
        }
    }

    @yfb
    public final List<Long> insertAndReturnIdsList(@yfb Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "entities");
        bgg bggVarAcquire = acquire();
        try {
            List listCreateListBuilder = k82.createListBuilder();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bind(bggVarAcquire, it.next());
                listCreateListBuilder.add(Long.valueOf(bggVarAcquire.executeInsert()));
            }
            List<Long> listBuild = k82.build(listCreateListBuilder);
            release(bggVarAcquire);
            return listBuild;
        } catch (Throwable th) {
            release(bggVarAcquire);
            throw th;
        }
    }

    public final void insert(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "entities");
        bgg bggVarAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(bggVarAcquire, it.next());
                bggVarAcquire.executeInsert();
            }
        } finally {
            release(bggVarAcquire);
        }
    }
}
