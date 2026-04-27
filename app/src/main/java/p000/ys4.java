package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ys4 {

    /* JADX INFO: renamed from: ys4$a */
    public class C15795a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C15796b f102887a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StringBuilder f102888b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC15797c f102889c;

        public C15795a(C15796b c15796b, StringBuilder sb, InterfaceC15797c interfaceC15797c) {
            this.f102887a = c15796b;
            this.f102888b = sb;
            this.f102889c = interfaceC15797c;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            deb debVar = (deb) objArr[0];
            this.f102887a.m26345a(this.f102888b);
            this.f102888b.append(this.f102889c.process(debVar));
            if (debVar.getFirstChild() == null) {
                this.f102888b.append("\n");
                return null;
            }
            this.f102888b.append(" [\n");
            this.f102887a.m26347c();
            ys4.visitChildren((idi) obj, debVar);
            this.f102887a.m26346b();
            this.f102887a.m26345a(this.f102888b);
            this.f102888b.append("]\n");
            return null;
        }
    }

    /* JADX INFO: renamed from: ys4$b */
    public static class C15796b {

        /* JADX INFO: renamed from: a */
        public int f102890a;

        private C15796b() {
        }

        /* JADX INFO: renamed from: a */
        public void m26345a(@efb StringBuilder sb) {
            for (int i = 0; i < this.f102890a; i++) {
                sb.append(' ');
                sb.append(' ');
            }
        }

        /* JADX INFO: renamed from: b */
        public void m26346b() {
            this.f102890a--;
        }

        /* JADX INFO: renamed from: c */
        public void m26347c() {
            this.f102890a++;
        }

        public /* synthetic */ C15796b(C15795a c15795a) {
            this();
        }
    }

    /* JADX INFO: renamed from: ys4$c */
    public interface InterfaceC15797c {
        @efb
        String process(@efb deb debVar);
    }

    /* JADX INFO: renamed from: ys4$d */
    public static class C15798d implements InterfaceC15797c {
        private C15798d() {
        }

        @Override // p000.ys4.InterfaceC15797c
        @efb
        public String process(@efb deb debVar) {
            return debVar.toString();
        }

        public /* synthetic */ C15798d(C15795a c15795a) {
            this();
        }
    }

    private ys4() {
    }

    @efb
    @yx1
    public static String dump(@efb deb debVar) {
        return dump(debVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void visitChildren(@efb idi idiVar, @efb deb debVar) {
        deb firstChild = debVar.getFirstChild();
        while (firstChild != null) {
            deb next = firstChild.getNext();
            firstChild.accept(idiVar);
            firstChild = next;
        }
    }

    @efb
    @yx1
    public static String dump(@efb deb debVar, @hib InterfaceC15797c interfaceC15797c) {
        C15795a c15795a = null;
        if (interfaceC15797c == null) {
            interfaceC15797c = new C15798d(c15795a);
        }
        C15796b c15796b = new C15796b(c15795a);
        StringBuilder sb = new StringBuilder();
        debVar.accept((idi) Proxy.newProxyInstance(idi.class.getClassLoader(), new Class[]{idi.class}, new C15795a(c15796b, sb, interfaceC15797c)));
        return sb.toString();
    }
}
