package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class caf {

    @yfb
    private final uae database;

    @yfb
    private final AtomicBoolean lock;

    @yfb
    private final fx8 stmt$delegate;

    /* JADX INFO: renamed from: caf$a */
    public static final class C2254a extends tt8 implements ny6<bgg> {
        public C2254a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final bgg invoke() {
            return caf.this.createNewStatement();
        }
    }

    public caf(@yfb uae uaeVar) {
        md8.checkNotNullParameter(uaeVar, "database");
        this.database = uaeVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = hz8.lazy(new C2254a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bgg createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final bgg getStmt() {
        return (bgg) this.stmt$delegate.getValue();
    }

    @yfb
    public bgg acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    @yfb
    public abstract String createQuery();

    public void release(@yfb bgg bggVar) {
        md8.checkNotNullParameter(bggVar, "statement");
        if (bggVar == getStmt()) {
            this.lock.set(false);
        }
    }

    private final bgg getStmt(boolean z) {
        return z ? getStmt() : createNewStatement();
    }
}
