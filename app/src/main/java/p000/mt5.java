package p000;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class mt5 implements vye<File> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final File f62066a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final cu5 f62067b;

    /* JADX INFO: renamed from: c */
    @gib
    public final qy6<File, Boolean> f62068c;

    /* JADX INFO: renamed from: d */
    @gib
    public final qy6<File, bth> f62069d;

    /* JADX INFO: renamed from: e */
    @gib
    public final gz6<File, IOException, bth> f62070e;

    /* JADX INFO: renamed from: f */
    public final int f62071f;

    /* JADX INFO: renamed from: mt5$a */
    @dwf({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public static abstract class AbstractC9514a extends AbstractC9516c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC9514a(@yfb File file) {
            super(file);
            md8.checkNotNullParameter(file, "rootDir");
        }
    }

    /* JADX INFO: renamed from: mt5$b */
    public final class C9515b extends AbstractC1703b2<File> {

        /* JADX INFO: renamed from: c */
        @yfb
        public final ArrayDeque<AbstractC9516c> f62072c;

        /* JADX INFO: renamed from: mt5$b$a */
        public final class a extends AbstractC9514a {

            /* JADX INFO: renamed from: b */
            public boolean f62074b;

            /* JADX INFO: renamed from: c */
            @gib
            public File[] f62075c;

            /* JADX INFO: renamed from: d */
            public int f62076d;

            /* JADX INFO: renamed from: e */
            public boolean f62077e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C9515b f62078f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@yfb C9515b c9515b, File file) {
                super(file);
                md8.checkNotNullParameter(file, "rootDir");
                this.f62078f = c9515b;
            }

            @Override // p000.mt5.AbstractC9516c
            @gib
            public File step() {
                if (!this.f62077e && this.f62075c == null) {
                    qy6 qy6Var = mt5.this.f62068c;
                    if (qy6Var != null && !((Boolean) qy6Var.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.f62075c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        gz6 gz6Var = mt5.this.f62070e;
                        if (gz6Var != null) {
                            gz6Var.invoke(getRoot(), new C2207c6(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f62077e = true;
                    }
                }
                File[] fileArr = this.f62075c;
                if (fileArr != null) {
                    int i = this.f62076d;
                    md8.checkNotNull(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f62075c;
                        md8.checkNotNull(fileArr2);
                        int i2 = this.f62076d;
                        this.f62076d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f62074b) {
                    this.f62074b = true;
                    return getRoot();
                }
                qy6 qy6Var2 = mt5.this.f62069d;
                if (qy6Var2 != null) {
                    qy6Var2.invoke(getRoot());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: mt5$b$b */
        @dwf({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        public final class b extends AbstractC9516c {

            /* JADX INFO: renamed from: b */
            public boolean f62079b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C9515b f62080c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@yfb C9515b c9515b, File file) {
                super(file);
                md8.checkNotNullParameter(file, "rootFile");
                this.f62080c = c9515b;
            }

            @Override // p000.mt5.AbstractC9516c
            @gib
            public File step() {
                if (this.f62079b) {
                    return null;
                }
                this.f62079b = true;
                return getRoot();
            }
        }

        /* JADX INFO: renamed from: mt5$b$c */
        public final class c extends AbstractC9514a {

            /* JADX INFO: renamed from: b */
            public boolean f62081b;

            /* JADX INFO: renamed from: c */
            @gib
            public File[] f62082c;

            /* JADX INFO: renamed from: d */
            public int f62083d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C9515b f62084e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@yfb C9515b c9515b, File file) {
                super(file);
                md8.checkNotNullParameter(file, "rootDir");
                this.f62084e = c9515b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // p000.mt5.AbstractC9516c
            @p000.gib
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File step() {
                /*
                    r10 = this;
                    boolean r0 = r10.f62081b
                    r1 = 0
                    if (r0 != 0) goto L28
                    mt5$b r0 = r10.f62084e
                    mt5 r0 = p000.mt5.this
                    qy6 r0 = p000.mt5.access$getOnEnter$p(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f62081b = r0
                    java.io.File r0 = r10.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f62082c
                    if (r0 == 0) goto L47
                    int r2 = r10.f62083d
                    p000.md8.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    mt5$b r0 = r10.f62084e
                    mt5 r0 = p000.mt5.this
                    qy6 r0 = p000.mt5.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.f62082c
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f62082c = r0
                    if (r0 != 0) goto L77
                    mt5$b r0 = r10.f62084e
                    mt5 r0 = p000.mt5.this
                    gz6 r0 = p000.mt5.access$getOnFail$p(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.getRoot()
                    c6 r9 = new c6
                    java.io.File r4 = r10.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.f62082c
                    if (r0 == 0) goto L81
                    p000.md8.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    mt5$b r0 = r10.f62084e
                    mt5 r0 = p000.mt5.this
                    qy6 r0 = p000.mt5.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.f62082c
                    p000.md8.checkNotNull(r0)
                    int r1 = r10.f62083d
                    int r2 = r1 + 1
                    r10.f62083d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.mt5.C9515b.c.step():java.io.File");
            }
        }

        /* JADX INFO: renamed from: mt5$b$d */
        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f62085a;

            static {
                int[] iArr = new int[cu5.values().length];
                try {
                    iArr[cu5.f27617a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[cu5.f27618b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f62085a = iArr;
            }
        }

        public C9515b() {
            ArrayDeque<AbstractC9516c> arrayDeque = new ArrayDeque<>();
            this.f62072c = arrayDeque;
            if (mt5.this.f62066a.isDirectory()) {
                arrayDeque.push(directoryState(mt5.this.f62066a));
            } else if (mt5.this.f62066a.isFile()) {
                arrayDeque.push(new b(this, mt5.this.f62066a));
            } else {
                m2804b();
            }
        }

        private final AbstractC9514a directoryState(File file) {
            int i = d.f62085a[mt5.this.f62067b.ordinal()];
            if (i == 1) {
                return new c(this, file);
            }
            if (i == 2) {
                return new a(this, file);
            }
            throw new ceb();
        }

        private final File gotoNext() {
            File fileStep;
            while (true) {
                AbstractC9516c abstractC9516cPeek = this.f62072c.peek();
                if (abstractC9516cPeek == null) {
                    return null;
                }
                fileStep = abstractC9516cPeek.step();
                if (fileStep == null) {
                    this.f62072c.pop();
                } else {
                    if (md8.areEqual(fileStep, abstractC9516cPeek.getRoot()) || !fileStep.isDirectory() || this.f62072c.size() >= mt5.this.f62071f) {
                        break;
                    }
                    this.f62072c.push(directoryState(fileStep));
                }
            }
            return fileStep;
        }

        @Override // p000.AbstractC1703b2
        /* JADX INFO: renamed from: a */
        public void mo2803a() {
            File fileGotoNext = gotoNext();
            if (fileGotoNext != null) {
                m2805c(fileGotoNext);
            } else {
                m2804b();
            }
        }
    }

    /* JADX INFO: renamed from: mt5$c */
    public static abstract class AbstractC9516c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final File f62086a;

        public AbstractC9516c(@yfb File file) {
            md8.checkNotNullParameter(file, "root");
            this.f62086a = file;
        }

        @yfb
        public final File getRoot() {
            return this.f62086a;
        }

        @gib
        public abstract File step();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private mt5(File file, cu5 cu5Var, qy6<? super File, Boolean> qy6Var, qy6<? super File, bth> qy6Var2, gz6<? super File, ? super IOException, bth> gz6Var, int i) {
        this.f62066a = file;
        this.f62067b = cu5Var;
        this.f62068c = qy6Var;
        this.f62069d = qy6Var2;
        this.f62070e = gz6Var;
        this.f62071f = i;
    }

    @Override // p000.vye
    @yfb
    public Iterator<File> iterator() {
        return new C9515b();
    }

    @yfb
    public final mt5 maxDepth(int i) {
        if (i > 0) {
            return new mt5(this.f62066a, this.f62067b, this.f62068c, this.f62069d, this.f62070e, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + a18.f100c);
    }

    @yfb
    public final mt5 onEnter(@yfb qy6<? super File, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "function");
        return new mt5(this.f62066a, this.f62067b, qy6Var, this.f62069d, this.f62070e, this.f62071f);
    }

    @yfb
    public final mt5 onFail(@yfb gz6<? super File, ? super IOException, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "function");
        return new mt5(this.f62066a, this.f62067b, this.f62068c, this.f62069d, gz6Var, this.f62071f);
    }

    @yfb
    public final mt5 onLeave(@yfb qy6<? super File, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "function");
        return new mt5(this.f62066a, this.f62067b, this.f62068c, qy6Var, this.f62070e, this.f62071f);
    }

    public /* synthetic */ mt5(File file, cu5 cu5Var, qy6 qy6Var, qy6 qy6Var2, gz6 gz6Var, int i, int i2, jt3 jt3Var) {
        this(file, (i2 & 2) != 0 ? cu5.f27617a : cu5Var, qy6Var, qy6Var2, gz6Var, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mt5(@yfb File file, @yfb cu5 cu5Var) {
        this(file, cu5Var, null, null, null, 0, 32, null);
        md8.checkNotNullParameter(file, "start");
        md8.checkNotNullParameter(cu5Var, "direction");
    }

    public /* synthetic */ mt5(File file, cu5 cu5Var, int i, jt3 jt3Var) {
        this(file, (i & 2) != 0 ? cu5.f27617a : cu5Var);
    }
}
