package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class h79 {

    /* JADX INFO: renamed from: d */
    public StringBuilder f42718d;

    /* JADX INFO: renamed from: e */
    public String f42719e;

    /* JADX INFO: renamed from: f */
    public String f42720f;

    /* JADX INFO: renamed from: g */
    public char f42721g;

    /* JADX INFO: renamed from: h */
    public StringBuilder f42722h;

    /* JADX INFO: renamed from: a */
    public EnumC6736b f42715a = EnumC6736b.START_DEFINITION;

    /* JADX INFO: renamed from: b */
    public final StringBuilder f42716b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public final List<g79> f42717c = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f42723i = false;

    /* JADX INFO: renamed from: h79$a */
    public static /* synthetic */ class C6735a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f42724a;

        static {
            int[] iArr = new int[EnumC6736b.values().length];
            f42724a = iArr;
            try {
                iArr[EnumC6736b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42724a[EnumC6736b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42724a[EnumC6736b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42724a[EnumC6736b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42724a[EnumC6736b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42724a[EnumC6736b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: h79$b */
    public enum EnumC6736b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private int destination(CharSequence charSequence, int i) {
        int iSkipSpaceTab = bic.skipSpaceTab(charSequence, i, charSequence.length());
        int iScanLinkDestination = k79.scanLinkDestination(charSequence, iSkipSpaceTab);
        if (iScanLinkDestination == -1) {
            return -1;
        }
        this.f42720f = charSequence.charAt(iSkipSpaceTab) == '<' ? charSequence.subSequence(iSkipSpaceTab + 1, iScanLinkDestination - 1).toString() : charSequence.subSequence(iSkipSpaceTab, iScanLinkDestination).toString();
        int iSkipSpaceTab2 = bic.skipSpaceTab(charSequence, iScanLinkDestination, charSequence.length());
        if (iSkipSpaceTab2 >= charSequence.length()) {
            this.f42723i = true;
            this.f42716b.setLength(0);
        } else if (iSkipSpaceTab2 == iScanLinkDestination) {
            return -1;
        }
        this.f42715a = EnumC6736b.START_TITLE;
        return iSkipSpaceTab2;
    }

    private void finishReference() {
        if (this.f42723i) {
            String strUnescapeString = n55.unescapeString(this.f42720f);
            StringBuilder sb = this.f42722h;
            this.f42717c.add(new g79(this.f42719e, strUnescapeString, sb != null ? n55.unescapeString(sb.toString()) : null));
            this.f42718d = null;
            this.f42723i = false;
            this.f42719e = null;
            this.f42720f = null;
            this.f42722h = null;
        }
    }

    private int label(CharSequence charSequence, int i) {
        int i2;
        int iScanLinkLabelContent = k79.scanLinkLabelContent(charSequence, i);
        if (iScanLinkLabelContent == -1) {
            return -1;
        }
        this.f42718d.append(charSequence, i, iScanLinkLabelContent);
        if (iScanLinkLabelContent >= charSequence.length()) {
            this.f42718d.append('\n');
            return iScanLinkLabelContent;
        }
        if (charSequence.charAt(iScanLinkLabelContent) != ']' || (i2 = iScanLinkLabelContent + 1) >= charSequence.length() || charSequence.charAt(i2) != ':' || this.f42718d.length() > 999) {
            return -1;
        }
        String strNormalizeLabelContent = n55.normalizeLabelContent(this.f42718d.toString());
        if (strNormalizeLabelContent.isEmpty()) {
            return -1;
        }
        this.f42719e = strNormalizeLabelContent;
        this.f42715a = EnumC6736b.DESTINATION;
        return bic.skipSpaceTab(charSequence, iScanLinkLabelContent + 2, charSequence.length());
    }

    private int startDefinition(CharSequence charSequence, int i) {
        int iSkipSpaceTab = bic.skipSpaceTab(charSequence, i, charSequence.length());
        if (iSkipSpaceTab >= charSequence.length() || charSequence.charAt(iSkipSpaceTab) != '[') {
            return -1;
        }
        this.f42715a = EnumC6736b.LABEL;
        this.f42718d = new StringBuilder();
        int i2 = iSkipSpaceTab + 1;
        if (i2 >= charSequence.length()) {
            this.f42718d.append('\n');
        }
        return i2;
    }

    private int startTitle(CharSequence charSequence, int i) {
        int iSkipSpaceTab = bic.skipSpaceTab(charSequence, i, charSequence.length());
        if (iSkipSpaceTab >= charSequence.length()) {
            this.f42715a = EnumC6736b.START_DEFINITION;
            return iSkipSpaceTab;
        }
        this.f42721g = (char) 0;
        char cCharAt = charSequence.charAt(iSkipSpaceTab);
        if (cCharAt == '\"' || cCharAt == '\'') {
            this.f42721g = cCharAt;
        } else if (cCharAt == '(') {
            this.f42721g = ')';
        }
        if (this.f42721g != 0) {
            this.f42715a = EnumC6736b.TITLE;
            this.f42722h = new StringBuilder();
            iSkipSpaceTab++;
            if (iSkipSpaceTab == charSequence.length()) {
                this.f42722h.append('\n');
            }
        } else {
            finishReference();
            this.f42715a = EnumC6736b.START_DEFINITION;
        }
        return iSkipSpaceTab;
    }

    private int title(CharSequence charSequence, int i) {
        int iScanLinkTitleContent = k79.scanLinkTitleContent(charSequence, i, this.f42721g);
        if (iScanLinkTitleContent == -1) {
            return -1;
        }
        this.f42722h.append(charSequence.subSequence(i, iScanLinkTitleContent));
        if (iScanLinkTitleContent >= charSequence.length()) {
            this.f42722h.append('\n');
            return iScanLinkTitleContent;
        }
        int iSkipSpaceTab = bic.skipSpaceTab(charSequence, iScanLinkTitleContent + 1, charSequence.length());
        if (iSkipSpaceTab != charSequence.length()) {
            return -1;
        }
        this.f42723i = true;
        finishReference();
        this.f42716b.setLength(0);
        this.f42715a = EnumC6736b.START_DEFINITION;
        return iSkipSpaceTab;
    }

    /* JADX INFO: renamed from: a */
    public List<g79> m12175a() {
        finishReference();
        return this.f42717c;
    }

    /* JADX INFO: renamed from: b */
    public CharSequence m12176b() {
        return this.f42716b;
    }

    /* JADX INFO: renamed from: c */
    public EnumC6736b m12177c() {
        return this.f42715a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:6:0x0015->B:23:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parse(java.lang.CharSequence r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = r3.f42716b
            int r0 = r0.length()
            if (r0 == 0) goto Lf
            java.lang.StringBuilder r0 = r3.f42716b
            r1 = 10
            r0.append(r1)
        Lf:
            java.lang.StringBuilder r0 = r3.f42716b
            r0.append(r4)
            r0 = 0
        L15:
            int r1 = r4.length()
            if (r0 >= r1) goto L48
            int[] r1 = p000.h79.C6735a.f42724a
            h79$b r2 = r3.f42715a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L48;
                case 2: goto L3d;
                case 3: goto L38;
                case 4: goto L33;
                case 5: goto L2e;
                case 6: goto L29;
                default: goto L28;
            }
        L28:
            goto L41
        L29:
            int r0 = r3.title(r4, r0)
            goto L41
        L2e:
            int r0 = r3.startTitle(r4, r0)
            goto L41
        L33:
            int r0 = r3.destination(r4, r0)
            goto L41
        L38:
            int r0 = r3.label(r4, r0)
            goto L41
        L3d:
            int r0 = r3.startDefinition(r4, r0)
        L41:
            r1 = -1
            if (r0 != r1) goto L15
            h79$b r4 = p000.h79.EnumC6736b.PARAGRAPH
            r3.f42715a = r4
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h79.parse(java.lang.CharSequence):void");
    }
}
