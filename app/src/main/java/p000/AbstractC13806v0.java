package p000;

import p000.e13;
import p000.e13.InterfaceC5040b;

/* JADX INFO: renamed from: v0 */
/* JADX INFO: loaded from: classes7.dex */
@rh5
@jjf(version = "1.3")
public abstract class AbstractC13806v0<B extends e13.InterfaceC5040b, E extends B> implements e13.InterfaceC5041c<E> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<e13.InterfaceC5040b, E> f89602a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final e13.InterfaceC5041c<?> f89603b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [e13$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qy6<? super e13$b, ? extends E extends B>, qy6<e13$b, E extends B>] */
    public AbstractC13806v0(@yfb e13.InterfaceC5041c<B> interfaceC5041c, @yfb qy6<? super e13.InterfaceC5040b, ? extends E> qy6Var) {
        md8.checkNotNullParameter(interfaceC5041c, "baseKey");
        md8.checkNotNullParameter(qy6Var, "safeCast");
        this.f89602a = qy6Var;
        this.f89603b = interfaceC5041c instanceof AbstractC13806v0 ? (e13.InterfaceC5041c<B>) ((AbstractC13806v0) interfaceC5041c).f89603b : interfaceC5041c;
    }

    public final boolean isSubKey$kotlin_stdlib(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        md8.checkNotNullParameter(interfaceC5041c, "key");
        return interfaceC5041c == this || this.f89603b == interfaceC5041c;
    }

    /* JADX WARN: Incorrect return type in method signature: (Le13$b;)TE; */
    @gib
    public final e13.InterfaceC5040b tryCast$kotlin_stdlib(@yfb e13.InterfaceC5040b interfaceC5040b) {
        md8.checkNotNullParameter(interfaceC5040b, "element");
        return (e13.InterfaceC5040b) this.f89602a.invoke(interfaceC5040b);
    }
}
