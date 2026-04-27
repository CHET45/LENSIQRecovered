package p000;

import com.google.auto.value.AutoValue;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p000.khi;

/* JADX INFO: loaded from: classes5.dex */
@fdi
@igg({"SupportAnnotationUsage"})
public final class xpg {

    /* JADX INFO: renamed from: b */
    public static final xpg f98884b = new xpg();

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<AtomicReference<InterfaceC15247c>> f98885a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: xpg$a */
    @AutoValue
    public static abstract class AbstractC15245a {
        /* JADX INFO: renamed from: d */
        public static AbstractC15245a m25381d(@hib q81 q81Var, boolean z, int i, int i2, int i3) {
            return new am0(q81Var, z, i, i2, i3);
        }

        @hib
        /* JADX INFO: renamed from: e */
        public static AbstractC15245a m25382e(@hib q81 q81Var, khi.EnumC8369b enumC8369b, p95 p95Var) {
            r81 unchangedNames = p95Var.getUnchangedNames();
            if (unchangedNames == null) {
                return null;
            }
            return m25381d(q81Var, enumC8369b == khi.EnumC8369b.SUCCESS, unchangedNames.getHashCount(), unchangedNames.getBits().getBitmap().size(), unchangedNames.getBits().getPadding());
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo887a();

        /* JADX INFO: renamed from: b */
        public abstract int mo888b();

        @hib
        /* JADX INFO: renamed from: c */
        public abstract q81 mo889c();

        /* JADX INFO: renamed from: f */
        public abstract int mo890f();

        /* JADX INFO: renamed from: g */
        public abstract int mo891g();
    }

    /* JADX INFO: renamed from: xpg$b */
    @AutoValue
    public static abstract class AbstractC15246b {
        /* JADX INFO: renamed from: b */
        public static AbstractC15246b m25383b(int i, int i2, String str, String str2, @hib AbstractC15245a abstractC15245a) {
            return new bm0(i, i2, str, str2, abstractC15245a);
        }

        /* JADX INFO: renamed from: e */
        public static AbstractC15246b m25384e(int i, p95 p95Var, qi3 qi3Var, @hib q81 q81Var, khi.EnumC8369b enumC8369b) {
            return m25383b(i, p95Var.getCount(), qi3Var.getProjectId(), qi3Var.getDatabaseId(), AbstractC15245a.m25382e(q81Var, enumC8369b, p95Var));
        }

        @hib
        /* JADX INFO: renamed from: a */
        public abstract AbstractC15245a mo3240a();

        /* JADX INFO: renamed from: c */
        public abstract String mo3241c();

        /* JADX INFO: renamed from: d */
        public abstract int mo3242d();

        /* JADX INFO: renamed from: f */
        public abstract int mo3243f();

        /* JADX INFO: renamed from: g */
        public abstract String mo3244g();
    }

    /* JADX INFO: renamed from: xpg$c */
    public interface InterfaceC15247c {
        @f00
        void onExistenceFilterMismatch(@efb AbstractC15246b abstractC15246b);
    }

    private xpg() {
    }

    @efb
    /* JADX INFO: renamed from: c */
    public static xpg m25378c() {
        return f98884b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addExistenceFilterMismatchListener$0(AtomicReference atomicReference) {
        atomicReference.set(null);
        this.f98885a.remove(atomicReference);
    }

    /* JADX INFO: renamed from: b */
    public ta9 m25379b(@efb InterfaceC15247c interfaceC15247c) {
        x7d.checkNotNull(interfaceC15247c, "a null listener is not allowed");
        final AtomicReference<InterfaceC15247c> atomicReference = new AtomicReference<>(interfaceC15247c);
        this.f98885a.add(atomicReference);
        return new ta9() { // from class: wpg
            @Override // p000.ta9
            public final void remove() {
                this.f95050a.lambda$addExistenceFilterMismatchListener$0(atomicReference);
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public void m25380d(@efb AbstractC15246b abstractC15246b) {
        Iterator<AtomicReference<InterfaceC15247c>> it = this.f98885a.iterator();
        while (it.hasNext()) {
            InterfaceC15247c interfaceC15247c = it.next().get();
            if (interfaceC15247c != null) {
                interfaceC15247c.onExistenceFilterMismatch(abstractC15246b);
            }
        }
    }
}
