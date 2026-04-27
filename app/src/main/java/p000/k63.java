package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k63 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<InterfaceC8212b<?>, Object> f52641a = new LinkedHashMap();

    /* JADX INFO: renamed from: k63$a */
    public static final class C8211a extends k63 {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final C8211a f52642b = new C8211a();

        private C8211a() {
        }

        @Override // p000.k63
        @gib
        public <T> T get(@yfb InterfaceC8212b<T> interfaceC8212b) {
            md8.checkNotNullParameter(interfaceC8212b, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: k63$b */
    public interface InterfaceC8212b<T> {
    }

    @gib
    public abstract <T> T get(@yfb InterfaceC8212b<T> interfaceC8212b);

    @yfb
    public final Map<InterfaceC8212b<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.f52641a;
    }
}
