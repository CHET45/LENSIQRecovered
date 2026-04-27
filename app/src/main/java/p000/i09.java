package p000;

import androidx.compose.foundation.lazy.layout.C0661c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@f0g
@ah5
public final class i09 {

    /* JADX INFO: renamed from: e */
    public static final int f45363e = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final s9d f45364a;

    /* JADX INFO: renamed from: b */
    @gib
    public final qy6<fab, bth> f45365b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final p9d f45366c;

    /* JADX INFO: renamed from: d */
    @gib
    public o9d f45367d;

    /* JADX INFO: renamed from: i09$a */
    public final class C7094a implements fab {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<q9d> f45368a = new ArrayList();

        public C7094a() {
        }

        @yfb
        public final List<q9d> getRequests() {
            return this.f45368a;
        }

        @Override // p000.fab
        public void schedulePrefetch(int i) {
            mo28896schedulePrefetch0kLqBqw(i, C0661c.f4909b);
        }

        @Override // p000.fab
        /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw */
        public void mo28896schedulePrefetch0kLqBqw(int i, long j) {
            o9d prefetchHandleProvider$foundation_release = i09.this.getPrefetchHandleProvider$foundation_release();
            if (prefetchHandleProvider$foundation_release == null) {
                return;
            }
            this.f45368a.add(prefetchHandleProvider$foundation_release.m31305createNestedPrefetchRequestVKLhPVY(i, j, i09.this.f45366c));
        }
    }

    /* JADX INFO: renamed from: i09$b */
    public interface InterfaceC7095b {
        void cancel();

        void markAsUrgent();
    }

    public i09() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @yfb
    public final List<q9d> collectNestedPrefetchRequests$foundation_release() {
        qy6<fab, bth> qy6Var = this.f45365b;
        if (qy6Var == null) {
            return l82.emptyList();
        }
        C7094a c7094a = new C7094a();
        qy6Var.invoke(c7094a);
        return c7094a.getRequests();
    }

    @gib
    public final o9d getPrefetchHandleProvider$foundation_release() {
        return this.f45367d;
    }

    @gib
    public final s9d getPrefetchScheduler$foundation_release() {
        return this.f45364a;
    }

    @yfb
    public final InterfaceC7095b schedulePrefetch(int i) {
        return m30145schedulePrefetch0kLqBqw(i, C0661c.f4909b);
    }

    @yfb
    /* JADX INFO: renamed from: schedulePrefetch-0kLqBqw, reason: not valid java name */
    public final InterfaceC7095b m30145schedulePrefetch0kLqBqw(int i, long j) {
        InterfaceC7095b interfaceC7095bM31306schedulePrefetchVKLhPVY;
        o9d o9dVar = this.f45367d;
        return (o9dVar == null || (interfaceC7095bM31306schedulePrefetchVKLhPVY = o9dVar.m31306schedulePrefetchVKLhPVY(i, j, this.f45366c)) == null) ? ss4.f82739a : interfaceC7095bM31306schedulePrefetchVKLhPVY;
    }

    public final void setPrefetchHandleProvider$foundation_release(@gib o9d o9dVar) {
        this.f45367d = o9dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i09(@gib s9d s9dVar, @gib qy6<? super fab, bth> qy6Var) {
        this.f45364a = s9dVar;
        this.f45365b = qy6Var;
        this.f45366c = new p9d();
    }

    public /* synthetic */ i09(s9d s9dVar, qy6 qy6Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : s9dVar, (i & 2) != 0 ? null : qy6Var);
    }
}
