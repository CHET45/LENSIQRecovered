package p000;

import android.content.Context;
import androidx.media3.exoplayer.InterfaceC1254q;
import androidx.media3.exoplayer.InterfaceC1255s;
import java.util.Arrays;
import p000.q1e;
import p000.vy3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class vy3 implements q1e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1254q[] f92653a;

    /* JADX INFO: renamed from: vy3$b */
    public static final class C14298b implements q1e.InterfaceC11268a {

        /* JADX INFO: renamed from: a */
        public final v1e f92654a;

        /* JADX INFO: renamed from: vy3$b$a */
        public class a implements v7i {
            public a() {
            }
        }

        /* JADX INFO: renamed from: vy3$b$b */
        public class b implements rg0 {
            public b() {
            }
        }

        public C14298b(Context context) {
            this.f92654a = new yy3(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$0(z93 z93Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$1(eta etaVar) {
        }

        @Override // p000.q1e.InterfaceC11268a
        public vy3 createRendererCapabilitiesList() {
            return new vy3(this.f92654a.createRenderers(t0i.createHandlerForCurrentOrMainLooper(), new a(), new b(), new avg() { // from class: wy3
                @Override // p000.avg
                public final void onCues(z93 z93Var) {
                    vy3.C14298b.lambda$createRendererCapabilitiesList$0(z93Var);
                }
            }, new fua() { // from class: xy3
                @Override // p000.fua
                public final void onMetadata(eta etaVar) {
                    vy3.C14298b.lambda$createRendererCapabilitiesList$1(etaVar);
                }
            }));
        }

        public C14298b(v1e v1eVar) {
            this.f92654a = v1eVar;
        }
    }

    @Override // p000.q1e
    public InterfaceC1255s[] getRendererCapabilities() {
        InterfaceC1255s[] interfaceC1255sArr = new InterfaceC1255s[this.f92653a.length];
        int i = 0;
        while (true) {
            InterfaceC1254q[] interfaceC1254qArr = this.f92653a;
            if (i >= interfaceC1254qArr.length) {
                return interfaceC1255sArr;
            }
            interfaceC1255sArr[i] = interfaceC1254qArr[i].getCapabilities();
            i++;
        }
    }

    @Override // p000.q1e
    public void release() {
        for (InterfaceC1254q interfaceC1254q : this.f92653a) {
            interfaceC1254q.release();
        }
    }

    @Override // p000.q1e
    public int size() {
        return this.f92653a.length;
    }

    private vy3(InterfaceC1254q[] interfaceC1254qArr) {
        this.f92653a = (InterfaceC1254q[]) Arrays.copyOf(interfaceC1254qArr, interfaceC1254qArr.length);
        for (int i = 0; i < interfaceC1254qArr.length; i++) {
            this.f92653a[i].init(i, j0d.f49299d, j52.f49539a);
        }
    }
}
