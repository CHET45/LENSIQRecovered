package p000;

/* JADX INFO: loaded from: classes6.dex */
public class vwb {

    /* JADX INFO: renamed from: a */
    public static final pwb<?, ?> f92423a = new C14280a();

    /* JADX INFO: renamed from: vwb$a */
    public class C14280a implements pwb<Object, Object> {
        @Override // p000.pwb
        /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
        public wub<Object> apply2(vkb<Object> vkbVar) {
            return vkbVar;
        }
    }

    private vwb() {
    }

    public static <T> pwb<T, T> identityTransformer() {
        return (pwb<T, T>) f92423a;
    }

    public static <T> vkb<T> justOnNext(T t) {
        return vkb.never().startWithItem(t);
    }
}
