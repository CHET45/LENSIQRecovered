package p000;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ht5<T> implements f5g<T> {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C7009b f44810d = new C7009b(null);

    /* JADX INFO: renamed from: e */
    @xc7("activeFilesLock")
    @yfb
    public static final Set<String> f44811e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    @yfb
    public static final Object f44812f = new Object();

    /* JADX INFO: renamed from: a */
    @yfb
    public final w1f<T> f44813a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final qy6<File, m98> f44814b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ny6<File> f44815c;

    /* JADX INFO: renamed from: ht5$a */
    public static final class C7008a extends tt8 implements qy6<File, m98> {

        /* JADX INFO: renamed from: a */
        public static final C7008a f44816a = new C7008a();

        public C7008a() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final m98 invoke(@yfb File file) {
            md8.checkNotNullParameter(file, "it");
            return o98.createSingleProcessCoordinator(file);
        }
    }

    /* JADX INFO: renamed from: ht5$b */
    public static final class C7009b {
        public /* synthetic */ C7009b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final Set<String> getActiveFiles$datastore_core_release() {
            return ht5.f44811e;
        }

        @yfb
        public final Object getActiveFilesLock$datastore_core_release() {
            return ht5.f44812f;
        }

        private C7009b() {
        }
    }

    /* JADX INFO: renamed from: ht5$c */
    public static final class C7010c extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f44817a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7010c(File file) {
            super(0);
            this.f44817a = file;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C7009b c7009b = ht5.f44810d;
            Object activeFilesLock$datastore_core_release = c7009b.getActiveFilesLock$datastore_core_release();
            File file = this.f44817a;
            synchronized (activeFilesLock$datastore_core_release) {
                c7009b.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
                bth bthVar = bth.f14751a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ht5(@yfb w1f<T> w1fVar, @yfb qy6<? super File, ? extends m98> qy6Var, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(w1fVar, "serializer");
        md8.checkNotNullParameter(qy6Var, "coordinatorProducer");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        this.f44813a = w1fVar;
        this.f44814b = qy6Var;
        this.f44815c = ny6Var;
    }

    @Override // p000.f5g
    @yfb
    public g5g<T> createConnection() throws IOException {
        File canonicalFile = this.f44815c.invoke().getCanonicalFile();
        synchronized (f44812f) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set<String> set = f44811e;
            if (set.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            md8.checkNotNullExpressionValue(absolutePath, "path");
            set.add(absolutePath);
        }
        md8.checkNotNullExpressionValue(canonicalFile, "file");
        return new it5(canonicalFile, this.f44813a, this.f44814b.invoke(canonicalFile), new C7010c(canonicalFile));
    }

    public /* synthetic */ ht5(w1f w1fVar, qy6 qy6Var, ny6 ny6Var, int i, jt3 jt3Var) {
        this(w1fVar, (i & 2) != 0 ? C7008a.f44816a : qy6Var, ny6Var);
    }
}
