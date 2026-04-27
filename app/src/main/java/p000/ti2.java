package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class ti2 {

    /* JADX INFO: renamed from: d */
    public static final String f84953d = "ComplexColorCompat";

    /* JADX INFO: renamed from: a */
    public final Shader f84954a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f84955b;

    /* JADX INFO: renamed from: c */
    public int f84956c;

    private ti2(Shader shader, ColorStateList colorStateList, @g92 int i) {
        this.f84954a = shader;
        this.f84955b = colorStateList;
        this.f84956c = i;
    }

    /* JADX INFO: renamed from: a */
    public static ti2 m22670a(@g92 int i) {
        return new ti2(null, null, i);
    }

    /* JADX INFO: renamed from: b */
    public static ti2 m22671b(@efb ColorStateList colorStateList) {
        return new ti2(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: c */
    public static ti2 m22672c(@efb Shader shader) {
        return new ti2(shader, null, 0);
    }

    @efb
    private static ti2 createFromXml(@efb Resources resources, @w92 int i, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m22672c(x87.m25043b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m22671b(sa2.createFromXmlInner(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    @hib
    public static ti2 inflate(@efb Resources resources, @w92 int i, @hib Resources.Theme theme) {
        try {
            return createFromXml(resources, i, theme);
        } catch (Exception e) {
            Log.e(f84953d, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    @g92
    public int getColor() {
        return this.f84956c;
    }

    @hib
    public Shader getShader() {
        return this.f84954a;
    }

    public boolean isGradient() {
        return this.f84954a != null;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        return this.f84954a == null && (colorStateList = this.f84955b) != null && colorStateList.isStateful();
    }

    public boolean onStateChanged(int[] iArr) {
        if (isStateful()) {
            ColorStateList colorStateList = this.f84955b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f84956c) {
                this.f84956c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void setColor(@g92 int i) {
        this.f84956c = i;
    }

    public boolean willDraw() {
        return isGradient() || this.f84956c != 0;
    }
}
