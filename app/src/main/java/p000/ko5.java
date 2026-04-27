package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p000.p4d;

/* JADX INFO: loaded from: classes4.dex */
public final class ko5 {

    /* JADX INFO: renamed from: a */
    public static final String f54830a = "FactoryPools";

    /* JADX INFO: renamed from: b */
    public static final int f54831b = 20;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8473g<Object> f54832c = new C8467a();

    /* JADX INFO: renamed from: ko5$a */
    public class C8467a implements InterfaceC8473g<Object> {
        @Override // p000.ko5.InterfaceC8473g
        public void reset(@efb Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ko5$b */
    public class C8468b<T> implements InterfaceC8470d<List<T>> {
        @Override // p000.ko5.InterfaceC8470d
        @efb
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ko5$c */
    public class C8469c<T> implements InterfaceC8473g<List<T>> {
        @Override // p000.ko5.InterfaceC8473g
        public void reset(@efb List<T> list) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: ko5$d */
    public interface InterfaceC8470d<T> {
        T create();
    }

    /* JADX INFO: renamed from: ko5$e */
    public static final class C8471e<T> implements p4d.InterfaceC10791a<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8470d<T> f54833a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8473g<T> f54834b;

        /* JADX INFO: renamed from: c */
        public final p4d.InterfaceC10791a<T> f54835c;

        public C8471e(@efb p4d.InterfaceC10791a<T> interfaceC10791a, @efb InterfaceC8470d<T> interfaceC8470d, @efb InterfaceC8473g<T> interfaceC8473g) {
            this.f54835c = interfaceC10791a;
            this.f54833a = interfaceC8470d;
            this.f54834b = interfaceC8473g;
        }

        @Override // p000.p4d.InterfaceC10791a
        public T acquire() {
            T tAcquire = this.f54835c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f54833a.create();
                if (Log.isLoggable(ko5.f54830a, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(tAcquire.getClass());
                }
            }
            if (tAcquire instanceof InterfaceC8472f) {
                ((InterfaceC8472f) tAcquire).getVerifier().setRecycled(false);
            }
            return tAcquire;
        }

        @Override // p000.p4d.InterfaceC10791a
        public boolean release(@efb T t) {
            if (t instanceof InterfaceC8472f) {
                ((InterfaceC8472f) t).getVerifier().setRecycled(true);
            }
            this.f54834b.reset(t);
            return this.f54835c.release(t);
        }
    }

    /* JADX INFO: renamed from: ko5$f */
    public interface InterfaceC8472f {
        @efb
        b3g getVerifier();
    }

    /* JADX INFO: renamed from: ko5$g */
    public interface InterfaceC8473g<T> {
        void reset(@efb T t);
    }

    private ko5() {
    }

    @efb
    private static <T extends InterfaceC8472f> p4d.InterfaceC10791a<T> build(@efb p4d.InterfaceC10791a<T> interfaceC10791a, @efb InterfaceC8470d<T> interfaceC8470d) {
        return build(interfaceC10791a, interfaceC8470d, emptyResetter());
    }

    @efb
    private static <T> InterfaceC8473g<T> emptyResetter() {
        return (InterfaceC8473g<T>) f54832c;
    }

    @efb
    public static <T extends InterfaceC8472f> p4d.InterfaceC10791a<T> simple(int i, @efb InterfaceC8470d<T> interfaceC8470d) {
        return build(new p4d.C10792b(i), interfaceC8470d);
    }

    @efb
    public static <T extends InterfaceC8472f> p4d.InterfaceC10791a<T> threadSafe(int i, @efb InterfaceC8470d<T> interfaceC8470d) {
        return build(new p4d.C10793c(i), interfaceC8470d);
    }

    @efb
    public static <T> p4d.InterfaceC10791a<List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    @efb
    private static <T> p4d.InterfaceC10791a<T> build(@efb p4d.InterfaceC10791a<T> interfaceC10791a, @efb InterfaceC8470d<T> interfaceC8470d, @efb InterfaceC8473g<T> interfaceC8473g) {
        return new C8471e(interfaceC10791a, interfaceC8470d, interfaceC8473g);
    }

    @efb
    public static <T> p4d.InterfaceC10791a<List<T>> threadSafeList(int i) {
        return build(new p4d.C10793c(i), new C8468b(), new C8469c());
    }
}
