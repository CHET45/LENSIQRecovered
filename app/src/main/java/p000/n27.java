package p000;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n27 {

    /* JADX INFO: renamed from: c */
    public static final String f63050c = "com.apple.iTunes";

    /* JADX INFO: renamed from: d */
    public static final String f63051d = "iTunSMPB";

    /* JADX INFO: renamed from: e */
    public static final Pattern f63052e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f63053a = -1;

    /* JADX INFO: renamed from: b */
    public int f63054b = -1;

    private boolean setFromComment(String str) {
        Matcher matcher = f63052e.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i = Integer.parseInt((String) x0i.castNonNull(matcher.group(1)), 16);
            int i2 = Integer.parseInt((String) x0i.castNonNull(matcher.group(2)), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f63053a = i;
            this.f63054b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.f63053a == -1 || this.f63054b == -1) ? false : true;
    }

    public boolean setFromMetadata(Metadata metadata) {
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f19633c) && setFromComment(commentFrame.f19634d)) {
                    return true;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f19642b) && "iTunSMPB".equals(internalFrame.f19643c) && setFromComment(internalFrame.f19644d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean setFromXingHeaderValue(int i) {
        int i2 = i >> 12;
        int i3 = i & UnixStat.PERM_MASK;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f63053a = i2;
        this.f63054b = i3;
        return true;
    }
}
