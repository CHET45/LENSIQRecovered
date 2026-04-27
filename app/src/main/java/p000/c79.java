package p000;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c79 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final c79 f15902a = new c79();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final LinkOption[] f15903b = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: c */
    @yfb
    public static final LinkOption[] f15904c = new LinkOption[0];

    /* JADX INFO: renamed from: d */
    @yfb
    public static final Set<FileVisitOption> f15905d = w6f.emptySet();

    /* JADX INFO: renamed from: e */
    @yfb
    public static final Set<FileVisitOption> f15906e = v6f.setOf(FileVisitOption.FOLLOW_LINKS);

    private c79() {
    }

    @yfb
    public final LinkOption[] toLinkOptions(boolean z) {
        return z ? f15904c : f15903b;
    }

    @yfb
    public final Set<FileVisitOption> toVisitOptions(boolean z) {
        return z ? f15906e : f15905d;
    }
}
