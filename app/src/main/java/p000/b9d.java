package p000;

import android.content.Context;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b9d implements yqd<Context, ai3<d9d>> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f13074a;

    /* JADX INFO: renamed from: b */
    @gib
    public final h2e<d9d> f13075b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qy6<Context, List<ug3<d9d>>> f13076c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final x13 f13077d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final Object f13078e;

    /* JADX INFO: renamed from: f */
    @gib
    @xc7("lock")
    public volatile ai3<d9d> f13079f;

    /* JADX INFO: renamed from: b9d$a */
    public static final class C1793a extends tt8 implements ny6<File> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f13080a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b9d f13081b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1793a(Context context, b9d b9dVar) {
            super(0);
            this.f13080a = context;
            this.f13081b = b9dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final File invoke() {
            Context context = this.f13080a;
            md8.checkNotNullExpressionValue(context, "applicationContext");
            return a9d.preferencesDataStoreFile(context, this.f13081b.f13074a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b9d(@yfb String str, @gib h2e<d9d> h2eVar, @yfb qy6<? super Context, ? extends List<? extends ug3<d9d>>> qy6Var, @yfb x13 x13Var) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(qy6Var, "produceMigrations");
        md8.checkNotNullParameter(x13Var, "scope");
        this.f13074a = str;
        this.f13075b = h2eVar;
        this.f13076c = qy6Var;
        this.f13077d = x13Var;
        this.f13078e = new Object();
    }

    @Override // p000.yqd
    public /* bridge */ /* synthetic */ ai3<d9d> getValue(Context context, hp8 hp8Var) {
        return getValue2(context, (hp8<?>) hp8Var);
    }

    @yfb
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public ai3<d9d> getValue2(@yfb Context context, @yfb hp8<?> hp8Var) {
        ai3<d9d> ai3Var;
        md8.checkNotNullParameter(context, "thisRef");
        md8.checkNotNullParameter(hp8Var, "property");
        ai3<d9d> ai3Var2 = this.f13079f;
        if (ai3Var2 != null) {
            return ai3Var2;
        }
        synchronized (this.f13078e) {
            try {
                if (this.f13079f == null) {
                    Context applicationContext = context.getApplicationContext();
                    z8d z8dVar = z8d.f104380a;
                    h2e<d9d> h2eVar = this.f13075b;
                    qy6<Context, List<ug3<d9d>>> qy6Var = this.f13076c;
                    md8.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f13079f = z8dVar.create(h2eVar, qy6Var.invoke(applicationContext), this.f13077d, new C1793a(applicationContext, this));
                }
                ai3Var = this.f13079f;
                md8.checkNotNull(ai3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ai3Var;
    }
}
