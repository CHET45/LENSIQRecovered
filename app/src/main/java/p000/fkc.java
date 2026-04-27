package p000;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class fkc implements vye<Path> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Path f36952a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final jkc[] f36953b;

    /* JADX INFO: renamed from: fkc$a */
    @ck3(m4009c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", m4010f = "PathTreeWalk.kt", m4011i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, m4012l = {191, 197}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @dwf({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n101#1:181,19\n*E\n"})
    public static final class C5866a extends t7e implements gz6<xye<? super Path>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36955a;

        /* JADX INFO: renamed from: b */
        public Object f36956b;

        /* JADX INFO: renamed from: c */
        public Object f36957c;

        /* JADX INFO: renamed from: d */
        public Object f36958d;

        /* JADX INFO: renamed from: e */
        public Object f36959e;

        /* JADX INFO: renamed from: f */
        public int f36960f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f36961m;

        public C5866a(zy2<? super C5866a> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C5866a c5866a = fkc.this.new C5866a(zy2Var);
            c5866a.f36961m = obj;
            return c5866a;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super Path> xyeVar, zy2<? super bth> zy2Var) {
            return ((C5866a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f5 -> B:11:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f7 -> B:11:0x007d). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.nio.file.FileSystemLoopException {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fkc.C5866a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fkc$b */
    @ck3(m4009c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", m4010f = "PathTreeWalk.kt", m4011i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, m4012l = {191, 197, 210, 216}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, m4015s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @dwf({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n44#2,19:200\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n70#1:181,19\n81#1:200,19\n*E\n"})
    public static final class C5867b extends t7e implements gz6<xye<? super Path>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f36963a;

        /* JADX INFO: renamed from: b */
        public Object f36964b;

        /* JADX INFO: renamed from: c */
        public Object f36965c;

        /* JADX INFO: renamed from: d */
        public Object f36966d;

        /* JADX INFO: renamed from: e */
        public Object f36967e;

        /* JADX INFO: renamed from: f */
        public int f36968f;

        /* JADX INFO: renamed from: m */
        public /* synthetic */ Object f36969m;

        public C5867b(zy2<? super C5867b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C5867b c5867b = fkc.this.new C5867b(zy2Var);
            c5867b.f36969m = obj;
            return c5867b;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super Path> xyeVar, zy2<? super bth> zy2Var) {
            return ((C5867b) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01d0 -> B:39:0x0145). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01d2 -> B:39:0x0145). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.nio.file.FileSystemLoopException {
            /*
                Method dump skipped, instruction units count: 539
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.fkc.C5867b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fkc(@yfb Path path, @yfb jkc[] jkcVarArr) {
        md8.checkNotNullParameter(path, "start");
        md8.checkNotNullParameter(jkcVarArr, "options");
        this.f36952a = path;
        this.f36953b = jkcVarArr;
    }

    private final Iterator<Path> bfsIterator() {
        return bze.iterator(new C5866a(null));
    }

    private final Iterator<Path> dfsIterator() {
        return bze.iterator(new C5867b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFollowLinks() {
        return e80.contains(this.f36953b, jkc.f51030c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getIncludeDirectories() {
        return e80.contains(this.f36953b, jkc.f51028a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] getLinkOptions() {
        return c79.f15902a.toLinkOptions(getFollowLinks());
    }

    private final boolean isBFS() {
        return e80.contains(this.f36953b, jkc.f51029b);
    }

    private final Object yieldIfNeeded(xye<? super Path> xyeVar, rjc rjcVar, td4 td4Var, qy6<? super List<rjc>, bth> qy6Var, zy2<? super bth> zy2Var) throws FileSystemLoopException {
        Path path = rjcVar.getPath();
        if (rjcVar.getParent() != null) {
            rkc.checkFileName(path);
        }
        LinkOption[] linkOptions = getLinkOptions();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (gkc.createsCycle(rjcVar)) {
                throw new FileSystemLoopException(path.toString());
            }
            if (getIncludeDirectories()) {
                o28.mark(0);
                xyeVar.yield(path, zy2Var);
                o28.mark(1);
            }
            LinkOption[] linkOptions2 = getLinkOptions();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptions2, linkOptions2.length);
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                qy6Var.invoke(td4Var.readEntries(rjcVar));
            }
        } else if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            o28.mark(0);
            xyeVar.yield(path, zy2Var);
            o28.mark(1);
            return bth.f14751a;
        }
        return bth.f14751a;
    }

    @Override // p000.vye
    @yfb
    public Iterator<Path> iterator() {
        return isBFS() ? bfsIterator() : dfsIterator();
    }
}
