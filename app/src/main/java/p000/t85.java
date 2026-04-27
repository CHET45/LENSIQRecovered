package p000;

import java.io.Closeable;
import java.util.concurrent.Executor;
import p000.e13;
import p000.t85;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t85 extends m13 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C12947a f83962c = new C12947a(null);

    /* JADX INFO: renamed from: t85$a */
    @rh5
    public static final class C12947a extends AbstractC13806v0<m13, t85> {
        public /* synthetic */ C12947a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t85 _init_$lambda$0(e13.InterfaceC5040b interfaceC5040b) {
            if (interfaceC5040b instanceof t85) {
                return (t85) interfaceC5040b;
            }
            return null;
        }

        private C12947a() {
            super(m13.f59565b, new qy6() { // from class: s85
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return t85.C12947a._init_$lambda$0((e13.InterfaceC5040b) obj);
                }
            });
        }
    }

    public abstract void close();

    @yfb
    public abstract Executor getExecutor();
}
