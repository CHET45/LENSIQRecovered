package p000;

import java.util.LinkedHashSet;
import java.util.Set;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n+ 2 Atomic.jvm.kt\nandroidx/datastore/core/okio/Synchronizer\n*L\n1#1,230:1\n49#2,2:231\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage\n*L\n64#1:231,2\n*E\n"})
public final class n1c<T> implements f5g<T> {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C9648b f62985f = new C9648b(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final Set<String> f62986g = new LinkedHashSet();

    /* JADX INFO: renamed from: h */
    @yfb
    public static final iig f62987h = new iig();

    /* JADX INFO: renamed from: a */
    @yfb
    public final FileSystem f62988a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final l1c<T> f62989b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final gz6<Path, FileSystem, m98> f62990c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ny6<Path> f62991d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final fx8 f62992e;

    /* JADX INFO: renamed from: n1c$a */
    public static final class C9647a extends tt8 implements gz6<Path, FileSystem, m98> {

        /* JADX INFO: renamed from: a */
        public static final C9647a f62993a = new C9647a();

        public C9647a() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final m98 invoke(@yfb Path path, @yfb FileSystem fileSystem) {
            md8.checkNotNullParameter(path, "path");
            md8.checkNotNullParameter(fileSystem, "<anonymous parameter 1>");
            return p1c.createSingleProcessCoordinator(path);
        }
    }

    /* JADX INFO: renamed from: n1c$b */
    public static final class C9648b {
        public /* synthetic */ C9648b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final Set<String> getActiveFiles$datastore_core_okio() {
            return n1c.f62986g;
        }

        @yfb
        public final iig getActiveFilesLock() {
            return n1c.f62987h;
        }

        private C9648b() {
        }
    }

    /* JADX INFO: renamed from: n1c$c */
    public static final class C9649c extends tt8 implements ny6<Path> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n1c<T> f62994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9649c(n1c<T> n1cVar) {
            super(0);
            this.f62994a = n1cVar;
        }

        @Override // p000.ny6
        @yfb
        public final Path invoke() {
            Path path = (Path) this.f62994a.f62991d.invoke();
            boolean zIsAbsolute = path.isAbsolute();
            n1c<T> n1cVar = this.f62994a;
            if (zIsAbsolute) {
                return path.normalized();
            }
            throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + n1cVar.f62991d + ", instead got " + path).toString());
        }
    }

    /* JADX INFO: renamed from: n1c$d */
    @dwf({"SMAP\nOkioStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage$createConnection$2\n+ 2 Atomic.jvm.kt\nandroidx/datastore/core/okio/Synchronizer\n*L\n1#1,230:1\n49#2,2:231\n*S KotlinDebug\n*F\n+ 1 OkioStorage.kt\nandroidx/datastore/core/okio/OkioStorage$createConnection$2\n*L\n80#1:231,2\n*E\n"})
    public static final class C9650d extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n1c<T> f62995a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9650d(n1c<T> n1cVar) {
            super(0);
            this.f62995a = n1cVar;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C9648b c9648b = n1c.f62985f;
            iig activeFilesLock = c9648b.getActiveFilesLock();
            n1c<T> n1cVar = this.f62995a;
            synchronized (activeFilesLock) {
                c9648b.getActiveFiles$datastore_core_okio().remove(n1cVar.getCanonicalPath().toString());
                bth bthVar = bth.f14751a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n1c(@yfb FileSystem fileSystem, @yfb l1c<T> l1cVar, @yfb gz6<? super Path, ? super FileSystem, ? extends m98> gz6Var, @yfb ny6<Path> ny6Var) {
        md8.checkNotNullParameter(fileSystem, "fileSystem");
        md8.checkNotNullParameter(l1cVar, "serializer");
        md8.checkNotNullParameter(gz6Var, "coordinatorProducer");
        md8.checkNotNullParameter(ny6Var, "producePath");
        this.f62988a = fileSystem;
        this.f62989b = l1cVar;
        this.f62990c = gz6Var;
        this.f62991d = ny6Var;
        this.f62992e = hz8.lazy(new C9649c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Path getCanonicalPath() {
        return (Path) this.f62992e.getValue();
    }

    @Override // p000.f5g
    @yfb
    public g5g<T> createConnection() {
        String string = getCanonicalPath().toString();
        synchronized (f62987h) {
            Set<String> set = f62986g;
            if (set.contains(string)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new o1c(this.f62988a, getCanonicalPath(), this.f62989b, this.f62990c.invoke(getCanonicalPath(), this.f62988a), new C9650d(this));
    }

    public /* synthetic */ n1c(FileSystem fileSystem, l1c l1cVar, gz6 gz6Var, ny6 ny6Var, int i, jt3 jt3Var) {
        this(fileSystem, l1cVar, (i & 4) != 0 ? C9647a.f62993a : gz6Var, ny6Var);
    }
}
