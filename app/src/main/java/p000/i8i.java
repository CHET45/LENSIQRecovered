package p000;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import p000.ybi;

/* JADX INFO: loaded from: classes4.dex */
public class i8i<R> implements efh<R> {

    /* JADX INFO: renamed from: a */
    public final ybi.InterfaceC15606a f46076a;

    /* JADX INFO: renamed from: b */
    public afh<R> f46077b;

    /* JADX INFO: renamed from: i8i$a */
    public static class C7189a implements ybi.InterfaceC15606a {

        /* JADX INFO: renamed from: a */
        public final Animation f46078a;

        public C7189a(Animation animation) {
            this.f46078a = animation;
        }

        @Override // p000.ybi.InterfaceC15606a
        public Animation build(Context context) {
            return this.f46078a;
        }
    }

    /* JADX INFO: renamed from: i8i$b */
    public static class C7190b implements ybi.InterfaceC15606a {

        /* JADX INFO: renamed from: a */
        public final int f46079a;

        public C7190b(int i) {
            this.f46079a = i;
        }

        @Override // p000.ybi.InterfaceC15606a
        public Animation build(Context context) {
            return AnimationUtils.loadAnimation(context, this.f46079a);
        }
    }

    public i8i(Animation animation) {
        this(new C7189a(animation));
    }

    @Override // p000.efh
    public afh<R> build(hh3 hh3Var, boolean z) {
        if (hh3Var == hh3.MEMORY_CACHE || !z) {
            return beb.get();
        }
        if (this.f46077b == null) {
            this.f46077b = new ybi(this.f46076a);
        }
        return this.f46077b;
    }

    public i8i(int i) {
        this(new C7190b(i));
    }

    public i8i(ybi.InterfaceC15606a interfaceC15606a) {
        this.f46076a = interfaceC15606a;
    }
}
