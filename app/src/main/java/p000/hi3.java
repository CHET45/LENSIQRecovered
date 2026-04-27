package p000;

import android.content.Context;
import java.util.List;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class hi3<T> implements yqd<Context, ai3<T>> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f43687a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final l1c<T> f43688b;

    /* JADX INFO: renamed from: c */
    @gib
    public final h2e<T> f43689c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final qy6<Context, List<ug3<T>>> f43690d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final x13 f43691e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Object f43692f;

    /* JADX INFO: renamed from: g */
    @gib
    @xc7("lock")
    public volatile ai3<T> f43693g;

    /* JADX INFO: renamed from: hi3$a */
    public static final class C6856a extends tt8 implements ny6<Path> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f43694a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ hi3<T> f43695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6856a(Context context, hi3<T> hi3Var) {
            super(0);
            this.f43694a = context;
            this.f43695b = hi3Var;
        }

        @Override // p000.ny6
        @yfb
        public final Path invoke() {
            Path.Companion companion = Path.Companion;
            Context context = this.f43694a;
            md8.checkNotNullExpressionValue(context, "applicationContext");
            String absolutePath = ei3.dataStoreFile(context, this.f43695b.f43687a).getAbsolutePath();
            md8.checkNotNullExpressionValue(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
            return Path.Companion.get$default(companion, absolutePath, false, 1, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hi3(@yfb String str, @yfb l1c<T> l1cVar, @gib h2e<T> h2eVar, @yfb qy6<? super Context, ? extends List<? extends ug3<T>>> qy6Var, @yfb x13 x13Var) {
        md8.checkNotNullParameter(str, "fileName");
        md8.checkNotNullParameter(l1cVar, "serializer");
        md8.checkNotNullParameter(qy6Var, "produceMigrations");
        md8.checkNotNullParameter(x13Var, "scope");
        this.f43687a = str;
        this.f43688b = l1cVar;
        this.f43689c = h2eVar;
        this.f43690d = qy6Var;
        this.f43691e = x13Var;
        this.f43692f = new Object();
    }

    @Override // p000.yqd
    public /* bridge */ /* synthetic */ Object getValue(Context context, hp8 hp8Var) {
        return getValue2(context, (hp8<?>) hp8Var);
    }

    @yfb
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public ai3<T> getValue2(@yfb Context context, @yfb hp8<?> hp8Var) {
        ai3<T> ai3Var;
        md8.checkNotNullParameter(context, "thisRef");
        md8.checkNotNullParameter(hp8Var, "property");
        ai3<T> ai3Var2 = this.f43693g;
        if (ai3Var2 != null) {
            return ai3Var2;
        }
        synchronized (this.f43692f) {
            try {
                if (this.f43693g == null) {
                    Context applicationContext = context.getApplicationContext();
                    di3 di3Var = di3.f29691a;
                    n1c n1cVar = new n1c(FileSystem.SYSTEM, this.f43688b, null, new C6856a(applicationContext, this), 4, null);
                    h2e<T> h2eVar = this.f43689c;
                    qy6<Context, List<ug3<T>>> qy6Var = this.f43690d;
                    md8.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f43693g = di3Var.create(n1cVar, h2eVar, qy6Var.invoke(applicationContext), this.f43691e);
                }
                ai3Var = this.f43693g;
                md8.checkNotNull(ai3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ai3Var;
    }
}
