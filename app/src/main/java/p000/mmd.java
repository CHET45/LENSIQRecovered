package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p000.uae;

/* JADX INFO: loaded from: classes3.dex */
public final class mmd implements bgg {

    /* JADX INFO: renamed from: a */
    @yfb
    public final bgg f61509a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f61510b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Executor f61511c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final uae.InterfaceC13438g f61512d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<Object> f61513e;

    public mmd(@yfb bgg bggVar, @yfb String str, @yfb Executor executor, @yfb uae.InterfaceC13438g interfaceC13438g) {
        md8.checkNotNullParameter(bggVar, "delegate");
        md8.checkNotNullParameter(str, "sqlStatement");
        md8.checkNotNullParameter(executor, "queryCallbackExecutor");
        md8.checkNotNullParameter(interfaceC13438g, "queryCallback");
        this.f61509a = bggVar;
        this.f61510b = str;
        this.f61511c = executor;
        this.f61512d = interfaceC13438g;
        this.f61513e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(mmd mmdVar) {
        md8.checkNotNullParameter(mmdVar, "this$0");
        mmdVar.f61512d.onQuery(mmdVar.f61510b, mmdVar.f61513e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeInsert$lambda$2(mmd mmdVar) {
        md8.checkNotNullParameter(mmdVar, "this$0");
        mmdVar.f61512d.onQuery(mmdVar.f61510b, mmdVar.f61513e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeUpdateDelete$lambda$1(mmd mmdVar) {
        md8.checkNotNullParameter(mmdVar, "this$0");
        mmdVar.f61512d.onQuery(mmdVar.f61510b, mmdVar.f61513e);
    }

    private final void saveArgsToCache(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.f61513e.size()) {
            int size = (i2 - this.f61513e.size()) + 1;
            for (int i3 = 0; i3 < size; i3++) {
                this.f61513e.add(null);
            }
        }
        this.f61513e.set(i2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForLong$lambda$3(mmd mmdVar) {
        md8.checkNotNullParameter(mmdVar, "this$0");
        mmdVar.f61512d.onQuery(mmdVar.f61510b, mmdVar.f61513e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForString$lambda$4(mmd mmdVar) {
        md8.checkNotNullParameter(mmdVar, "this$0");
        mmdVar.f61512d.onQuery(mmdVar.f61510b, mmdVar.f61513e);
    }

    @Override // p000.yfg
    public void bindBlob(int i, @yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "value");
        saveArgsToCache(i, bArr);
        this.f61509a.bindBlob(i, bArr);
    }

    @Override // p000.yfg
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
        this.f61509a.bindDouble(i, d);
    }

    @Override // p000.yfg
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
        this.f61509a.bindLong(i, j);
    }

    @Override // p000.yfg
    public void bindNull(int i) {
        Object[] array = this.f61513e.toArray(new Object[0]);
        md8.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        saveArgsToCache(i, Arrays.copyOf(array, array.length));
        this.f61509a.bindNull(i);
    }

    @Override // p000.yfg
    public void bindString(int i, @yfb String str) {
        md8.checkNotNullParameter(str, "value");
        saveArgsToCache(i, str);
        this.f61509a.bindString(i, str);
    }

    @Override // p000.yfg
    public void clearBindings() {
        this.f61513e.clear();
        this.f61509a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f61509a.close();
    }

    @Override // p000.bgg
    public void execute() {
        this.f61511c.execute(new Runnable() { // from class: kmd
            @Override // java.lang.Runnable
            public final void run() {
                mmd.execute$lambda$0(this.f54744a);
            }
        });
        this.f61509a.execute();
    }

    @Override // p000.bgg
    public long executeInsert() {
        this.f61511c.execute(new Runnable() { // from class: imd
            @Override // java.lang.Runnable
            public final void run() {
                mmd.executeInsert$lambda$2(this.f47504a);
            }
        });
        return this.f61509a.executeInsert();
    }

    @Override // p000.bgg
    public int executeUpdateDelete() {
        this.f61511c.execute(new Runnable() { // from class: lmd
            @Override // java.lang.Runnable
            public final void run() {
                mmd.executeUpdateDelete$lambda$1(this.f58268a);
            }
        });
        return this.f61509a.executeUpdateDelete();
    }

    @Override // p000.bgg
    public long simpleQueryForLong() {
        this.f61511c.execute(new Runnable() { // from class: hmd
            @Override // java.lang.Runnable
            public final void run() {
                mmd.simpleQueryForLong$lambda$3(this.f44141a);
            }
        });
        return this.f61509a.simpleQueryForLong();
    }

    @Override // p000.bgg
    @gib
    public String simpleQueryForString() {
        this.f61511c.execute(new Runnable() { // from class: jmd
            @Override // java.lang.Runnable
            public final void run() {
                mmd.simpleQueryForString$lambda$4(this.f51257a);
            }
        });
        return this.f61509a.simpleQueryForString();
    }
}
