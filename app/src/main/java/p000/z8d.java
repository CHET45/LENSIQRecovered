package p000;

import java.io.File;
import java.util.List;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class z8d {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final z8d f104380a = new z8d();

    /* JADX INFO: renamed from: z8d$a */
    public static final class C16033a extends tt8 implements ny6<File> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<File> f104381a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16033a(ny6<? extends File> ny6Var) {
            super(0);
            this.f104381a = ny6Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final File invoke() {
            File fileInvoke = this.f104381a.invoke();
            if (md8.areEqual(mu5.getExtension(fileInvoke), "preferences_pb")) {
                File absoluteFile = fileInvoke.getAbsoluteFile();
                md8.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    /* JADX INFO: renamed from: z8d$b */
    public static final class C16034b extends tt8 implements ny6<File> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<Path> f104382a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16034b(ny6<Path> ny6Var) {
            super(0);
            this.f104382a = ny6Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final File invoke() {
            return this.f104382a.invoke().toFile();
        }
    }

    private z8d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ai3 create$default(z8d z8dVar, f5g f5gVar, h2e h2eVar, List list, x13 x13Var, int i, Object obj) {
        if ((i & 2) != 0) {
            h2eVar = null;
        }
        if ((i & 4) != 0) {
            list = l82.emptyList();
        }
        if ((i & 8) != 0) {
            x13Var = y13.CoroutineScope(C6812he.ioDispatcher().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
        }
        return z8dVar.create((f5g<d9d>) f5gVar, (h2e<d9d>) h2eVar, (List<? extends ug3<d9d>>) list, x13Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ai3 createWithPath$default(z8d z8dVar, h2e h2eVar, List list, x13 x13Var, ny6 ny6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            h2eVar = null;
        }
        if ((i & 2) != 0) {
            list = l82.emptyList();
        }
        if ((i & 4) != 0) {
            x13Var = y13.CoroutineScope(C6812he.ioDispatcher().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
        }
        return z8dVar.createWithPath(h2eVar, list, x13Var, ny6Var);
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return create$default(this, (h2e) null, (List) null, (x13) null, ny6Var, 7, (Object) null);
    }

    @yfb
    @yn8
    public final ai3<d9d> createWithPath(@yfb ny6<Path> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return createWithPath$default(this, null, null, null, ny6Var, 7, null);
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@gib h2e<d9d> h2eVar, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return create$default(this, h2eVar, (List) null, (x13) null, ny6Var, 6, (Object) null);
    }

    @yfb
    @yn8
    public final ai3<d9d> createWithPath(@gib h2e<d9d> h2eVar, @yfb ny6<Path> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return createWithPath$default(this, h2eVar, null, null, ny6Var, 6, null);
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@gib h2e<d9d> h2eVar, @yfb List<? extends ug3<d9d>> list, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return create$default(this, h2eVar, list, (x13) null, ny6Var, 4, (Object) null);
    }

    @yfb
    @yn8
    public final ai3<d9d> createWithPath(@gib h2e<d9d> h2eVar, @yfb List<? extends ug3<d9d>> list, @yfb ny6<Path> ny6Var) {
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return createWithPath$default(this, h2eVar, list, null, ny6Var, 4, null);
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@yfb f5g<d9d> f5gVar) {
        md8.checkNotNullParameter(f5gVar, "storage");
        return create$default(this, f5gVar, (h2e) null, (List) null, (x13) null, 14, (Object) null);
    }

    @yfb
    @yn8
    public final ai3<d9d> createWithPath(@gib h2e<d9d> h2eVar, @yfb List<? extends ug3<d9d>> list, @yfb x13 x13Var, @yfb ny6<Path> ny6Var) {
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(x13Var, "scope");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return create(h2eVar, list, x13Var, new C16034b(ny6Var));
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@yfb f5g<d9d> f5gVar, @gib h2e<d9d> h2eVar) {
        md8.checkNotNullParameter(f5gVar, "storage");
        return create$default(this, f5gVar, h2eVar, (List) null, (x13) null, 12, (Object) null);
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@yfb f5g<d9d> f5gVar, @gib h2e<d9d> h2eVar, @yfb List<? extends ug3<d9d>> list) {
        md8.checkNotNullParameter(f5gVar, "storage");
        md8.checkNotNullParameter(list, "migrations");
        return create$default(this, f5gVar, h2eVar, list, (x13) null, 8, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ai3 create$default(z8d z8dVar, h2e h2eVar, List list, x13 x13Var, ny6 ny6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            h2eVar = null;
        }
        if ((i & 2) != 0) {
            list = l82.emptyList();
        }
        if ((i & 4) != 0) {
            x13Var = y13.CoroutineScope(df4.getIO().plus(kfg.SupervisorJob$default((jj8) null, 1, (Object) null)));
        }
        return z8dVar.create((h2e<d9d>) h2eVar, (List<? extends ug3<d9d>>) list, x13Var, (ny6<? extends File>) ny6Var);
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@gib h2e<d9d> h2eVar, @yfb List<? extends ug3<d9d>> list, @yfb x13 x13Var, @yfb ny6<? extends File> ny6Var) {
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(x13Var, "scope");
        md8.checkNotNullParameter(ny6Var, "produceFile");
        return new x8d(create(new ht5(g9d.f39058a, null, new C16033a(ny6Var), 2, null), h2eVar, list, x13Var));
    }

    @yfb
    @yn8
    public final ai3<d9d> create(@yfb f5g<d9d> f5gVar, @gib h2e<d9d> h2eVar, @yfb List<? extends ug3<d9d>> list, @yfb x13 x13Var) {
        md8.checkNotNullParameter(f5gVar, "storage");
        md8.checkNotNullParameter(list, "migrations");
        md8.checkNotNullParameter(x13Var, "scope");
        return new x8d(di3.f29691a.create(f5gVar, h2eVar, list, x13Var));
    }
}
