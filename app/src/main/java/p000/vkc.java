package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class vkc implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final Pattern f91527a;

    public vkc(String patternStr) {
        this(Pattern.compile(patternStr));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File dir, String fileName) {
        return this.f91527a.matcher(fileName).matches();
    }

    public vkc(Pattern pattern) {
        this.f91527a = (Pattern) v7d.checkNotNull(pattern);
    }
}
