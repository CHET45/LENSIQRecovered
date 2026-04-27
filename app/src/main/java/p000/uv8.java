package p000;

import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.C0878b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class uv8 {

    /* JADX INFO: renamed from: a */
    @efb
    public final Deque<WeakReference<XmlPullParser>> f89229a = new ArrayDeque();

    private static boolean isParserOutdated(@hib XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() != 3) {
                return xmlPullParser.getEventType() == 1;
            }
            return true;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    @hib
    private static XmlPullParser popOutdatedAttrHolders(@efb Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!isParserOutdated(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean shouldInheritContext(@efb XmlPullParser xmlPullParser, @hib XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return C0878b.f6271M.equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m23604a(@efb AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserPopOutdatedAttrHolders = popOutdatedAttrHolders(this.f89229a);
        this.f89229a.push(new WeakReference<>(xmlPullParser));
        return shouldInheritContext(xmlPullParser, xmlPullParserPopOutdatedAttrHolders);
    }
}
