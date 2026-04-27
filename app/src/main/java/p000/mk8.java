package p000;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class mk8 implements o15<mk8> {

    /* JADX INFO: renamed from: e */
    public static final tjb<Object> f61250e = new tjb() { // from class: jk8
        @Override // p000.l15
        public final void encode(Object obj, ujb ujbVar) throws IOException {
            mk8.lambda$static$0(obj, ujbVar);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final g2i<String> f61251f = new g2i() { // from class: kk8
        @Override // p000.l15
        public final void encode(Object obj, h2i h2iVar) throws IOException {
            h2iVar.add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g */
    public static final g2i<Boolean> f61252g = new g2i() { // from class: lk8
        @Override // p000.l15
        public final void encode(Object obj, h2i h2iVar) throws IOException {
            mk8.lambda$static$2((Boolean) obj, h2iVar);
        }
    };

    /* JADX INFO: renamed from: h */
    public static final C9382b f61253h = new C9382b(null);

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, tjb<?>> f61254a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, g2i<?>> f61255b = new HashMap();

    /* JADX INFO: renamed from: c */
    public tjb<Object> f61256c = f61250e;

    /* JADX INFO: renamed from: d */
    public boolean f61257d = false;

    /* JADX INFO: renamed from: mk8$b */
    public static final class C9382b implements g2i<Date> {

        /* JADX INFO: renamed from: a */
        public static final DateFormat f61259a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f61259a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(jzh.f52305a));
        }

        private C9382b() {
        }

        public /* synthetic */ C9382b(C9381a c9381a) {
            this();
        }

        @Override // p000.l15
        public void encode(@efb Date date, @efb h2i h2iVar) throws IOException {
            h2iVar.add(f61259a.format(date));
        }
    }

    public mk8() {
        registerEncoder(String.class, (g2i) f61251f);
        registerEncoder(Boolean.class, (g2i) f61252g);
        registerEncoder(Date.class, (g2i) f61253h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Object obj, ujb ujbVar) throws IOException {
        throw new t15("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$2(Boolean bool, h2i h2iVar) throws IOException {
        h2iVar.add(bool.booleanValue());
    }

    @efb
    public zf3 build() {
        return new C9381a();
    }

    @efb
    public mk8 configureWith(@efb tq2 tq2Var) {
        tq2Var.configure(this);
        return this;
    }

    @efb
    public mk8 ignoreNullValues(boolean z) {
        this.f61257d = z;
        return this;
    }

    @efb
    public mk8 registerFallbackEncoder(@efb tjb<Object> tjbVar) {
        this.f61256c = tjbVar;
        return this;
    }

    @Override // p000.o15
    @efb
    public <T> mk8 registerEncoder(@efb Class<T> cls, @efb tjb<? super T> tjbVar) {
        this.f61254a.put(cls, tjbVar);
        this.f61255b.remove(cls);
        return this;
    }

    /* JADX INFO: renamed from: mk8$a */
    public class C9381a implements zf3 {
        public C9381a() {
        }

        @Override // p000.zf3
        public void encode(@efb Object obj, @efb Writer writer) throws IOException {
            bn8 bn8Var = new bn8(writer, mk8.this.f61254a, mk8.this.f61255b, mk8.this.f61256c, mk8.this.f61257d);
            bn8Var.m3253a(obj, false);
            bn8Var.m3254b();
        }

        @Override // p000.zf3
        public String encode(@efb Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                encode(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    @Override // p000.o15
    @efb
    public <T> mk8 registerEncoder(@efb Class<T> cls, @efb g2i<? super T> g2iVar) {
        this.f61255b.put(cls, g2iVar);
        this.f61254a.remove(cls);
        return this;
    }
}
