package p000;

/* JADX INFO: loaded from: classes8.dex */
public class vo2 {

    /* JADX INFO: renamed from: vo2$a */
    public class C14180a extends ude {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ude f91827b;

        public C14180a(ude udeVar) throws Throwable {
            this.f91827b = udeVar;
        }

        @Override // p000.ude
        public tde runnerForClass(Class<?> cls) throws Throwable {
            return vo2.this.mo19431a(this.f91827b, cls);
        }
    }

    public static vo2 serial() {
        return new vo2();
    }

    /* JADX INFO: renamed from: a */
    public tde mo19431a(ude udeVar, Class<?> cls) throws Throwable {
        return udeVar.runnerForClass(cls);
    }

    public tde getSuite(ude udeVar, Class<?>[] clsArr) throws o18 {
        return new dfg(new C14180a(udeVar), clsArr);
    }
}
