package p000;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class qd2 {

    /* JADX INFO: renamed from: qd2$a */
    @c5e(15)
    public static class C11435a {
        private C11435a() {
        }

        @ih4
        public static void getValueForDensity(@efb Resources resources, int i, int i2, @efb TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
    }

    /* JADX INFO: renamed from: qd2$b */
    @c5e(18)
    public static class C11436b {
        private C11436b() {
        }

        @ih4
        public static void setAutoCancel(@efb ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* JADX INFO: renamed from: qd2$c */
    @c5e(21)
    public static class C11437c {
        private C11437c() {
        }

        @efb
        @ih4
        public static Drawable createFromXmlInner(@efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @ih4
        public static int getChangingConfigurations(@efb TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @ih4
        public static void inflate(@efb Drawable drawable, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private qd2() {
    }
}
