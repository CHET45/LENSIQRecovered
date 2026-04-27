package p000;

import android.database.sqlite.SQLiteConstraintException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class m35<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final l35<T> f59805a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final k35<T> f59806b;

    public m35(@yfb l35<T> l35Var, @yfb k35<T> k35Var) {
        md8.checkNotNullParameter(l35Var, "insertionAdapter");
        md8.checkNotNullParameter(k35Var, "updateAdapter");
        this.f59805a = l35Var;
        this.f59806b = k35Var;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null || !m9g.contains((CharSequence) message, (CharSequence) n35.f63114a, true)) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(T t) {
        try {
            this.f59805a.insert(t);
        } catch (SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.f59806b.handle(t);
        }
    }

    public final long upsertAndReturnId(T t) {
        try {
            return this.f59805a.insertAndReturnId(t);
        } catch (SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.f59806b.handle(t);
            return -1L;
        }
    }

    @yfb
    public final long[] upsertAndReturnIdsArray(@yfb T[] tArr) {
        long jInsertAndReturnId;
        md8.checkNotNullParameter(tArr, "entities");
        int length = tArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.f59805a.insertAndReturnId(tArr[i]);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(tArr[i]);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    @yfb
    public final Long[] upsertAndReturnIdsArrayBox(@yfb T[] tArr) {
        long jInsertAndReturnId;
        md8.checkNotNullParameter(tArr, "entities");
        int length = tArr.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                jInsertAndReturnId = this.f59805a.insertAndReturnId(tArr[i]);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(tArr[i]);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    @yfb
    public final List<Long> upsertAndReturnIdsList(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entities");
        List listCreateListBuilder = k82.createListBuilder();
        for (T t : tArr) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.f59805a.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(t);
                listCreateListBuilder.add(-1L);
            }
        }
        return k82.build(listCreateListBuilder);
    }

    public final void upsert(@yfb T[] tArr) {
        md8.checkNotNullParameter(tArr, "entities");
        for (T t : tArr) {
            try {
                this.f59805a.insert(t);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(t);
            }
        }
    }

    @yfb
    public final long[] upsertAndReturnIdsArray(@yfb Collection<? extends T> collection) {
        long jInsertAndReturnId;
        md8.checkNotNullParameter(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.f59805a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i] = jInsertAndReturnId;
        }
        return jArr;
    }

    @yfb
    public final Long[] upsertAndReturnIdsArrayBox(@yfb Collection<? extends T> collection) {
        long jInsertAndReturnId;
        md8.checkNotNullParameter(collection, "entities");
        Iterator<? extends T> it = collection.iterator();
        int size = collection.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.f59805a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final void upsert(@yfb Iterable<? extends T> iterable) {
        md8.checkNotNullParameter(iterable, "entities");
        for (T t : iterable) {
            try {
                this.f59805a.insert(t);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(t);
            }
        }
    }

    @yfb
    public final List<Long> upsertAndReturnIdsList(@yfb Collection<? extends T> collection) {
        md8.checkNotNullParameter(collection, "entities");
        List listCreateListBuilder = k82.createListBuilder();
        for (T t : collection) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.f59805a.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.f59806b.handle(t);
                listCreateListBuilder.add(-1L);
            }
        }
        return k82.build(listCreateListBuilder);
    }
}
