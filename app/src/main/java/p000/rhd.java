package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p000.rhd;

/* JADX INFO: loaded from: classes5.dex */
public class rhd {

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, tjb<?>> f78318a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, g2i<?>> f78319b;

    /* JADX INFO: renamed from: c */
    public final tjb<Object> f78320c;

    public rhd(Map<Class<?>, tjb<?>> map, Map<Class<?>, g2i<?>> map2, tjb<Object> tjbVar) {
        this.f78318a = map;
        this.f78319b = map2;
        this.f78320c = tjbVar;
    }

    public static C12095a builder() {
        return new C12095a();
    }

    public void encode(@efb Object obj, @efb OutputStream outputStream) throws IOException {
        new phd(outputStream, this.f78318a, this.f78319b, this.f78320c).m19502h(obj);
    }

    /* JADX INFO: renamed from: rhd$a */
    public static final class C12095a implements o15<C12095a> {

        /* JADX INFO: renamed from: d */
        public static final tjb<Object> f78321d = new tjb() { // from class: qhd
            @Override // p000.l15
            public final void encode(Object obj, ujb ujbVar) throws IOException {
                rhd.C12095a.lambda$static$0(obj, ujbVar);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Map<Class<?>, tjb<?>> f78322a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<Class<?>, g2i<?>> f78323b = new HashMap();

        /* JADX INFO: renamed from: c */
        public tjb<Object> f78324c = f78321d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$static$0(Object obj, ujb ujbVar) throws IOException {
            throw new t15("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public rhd build() {
            return new rhd(new HashMap(this.f78322a), new HashMap(this.f78323b), this.f78324c);
        }

        @efb
        public C12095a configureWith(@efb tq2 tq2Var) {
            tq2Var.configure(this);
            return this;
        }

        @efb
        public C12095a registerFallbackEncoder(@efb tjb<Object> tjbVar) {
            this.f78324c = tjbVar;
            return this;
        }

        @Override // p000.o15
        @efb
        public <U> C12095a registerEncoder(@efb Class<U> cls, @efb tjb<? super U> tjbVar) {
            this.f78322a.put(cls, tjbVar);
            this.f78323b.remove(cls);
            return this;
        }

        @Override // p000.o15
        @efb
        public <U> C12095a registerEncoder(@efb Class<U> cls, @efb g2i<? super U> g2iVar) {
            this.f78323b.put(cls, g2iVar);
            this.f78322a.remove(cls);
            return this;
        }
    }

    @efb
    public byte[] encode(@efb Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
