package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: xq */
/* JADX INFO: loaded from: classes.dex */
public final class C15248xq {

    /* JADX INFO: renamed from: xq$a */
    public static final class a extends tt8 implements qy6<lw8, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final a f98892a = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // p000.qy6
        @p000.yfb
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(@p000.yfb p000.lw8 r3) {
            /*
                r2 = this;
                nxe r3 = r3.getCollapsedSemantics$ui_release()
                if (r3 == 0) goto L1a
                boolean r0 = r3.isMergingSemanticsOfDescendants()
                r1 = 1
                if (r0 != r1) goto L1a
                zxe r0 = p000.zxe.f106362a
                dye r0 = r0.getEditableText()
                boolean r3 = r3.contains(r0)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C15248xq.a.invoke(lw8):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(C4623d6<?> c4623d6, Object obj) {
        if (c4623d6 == obj) {
            return true;
        }
        if (!(obj instanceof C4623d6)) {
            return false;
        }
        C4623d6 c4623d62 = (C4623d6) obj;
        if (!md8.areEqual(c4623d6.getLabel(), c4623d62.getLabel())) {
            return false;
        }
        if (c4623d6.getAction() != null || c4623d62.getAction() == null) {
            return c4623d6.getAction() == null || c4623d62.getAction() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(txe txeVar) {
        return !txeVar.getConfig().contains(zxe.f106362a.getDisabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(txe txeVar) {
        nxe unmergedConfig$ui_release = txeVar.getUnmergedConfig$ui_release();
        zxe zxeVar = zxe.f106362a;
        if (unmergedConfig$ui_release.contains(zxeVar.getEditableText()) && !md8.areEqual(oxe.getOrNull(txeVar.getUnmergedConfig$ui_release(), zxeVar.getFocused()), Boolean.TRUE)) {
            return true;
        }
        lw8 lw8VarFindClosestParentNode = findClosestParentNode(txeVar.getLayoutNode$ui_release(), a.f98892a);
        if (lw8VarFindClosestParentNode != null) {
            nxe collapsedSemantics$ui_release = lw8VarFindClosestParentNode.getCollapsedSemantics$ui_release();
            if (!(collapsedSemantics$ui_release != null ? md8.areEqual(oxe.getOrNull(collapsedSemantics$ui_release, zxeVar.getFocused()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lw8 findClosestParentNode(lw8 lw8Var, qy6<? super lw8, Boolean> qy6Var) {
        for (lw8 parent$ui_release = lw8Var.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (qy6Var.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    @ug5
    public static final boolean getDisableContentCapture() {
        return hv2.f44925r.isEnabled();
    }

    @ug5
    @q64(level = u64.f86865a, message = "Use ContentCapture.isEnabled instead", replaceWith = @i2e(expression = "!ContentCaptureManager.isEnabled", imports = {"androidx.compose.ui.contentcapture.ContentCaptureManager.Companion.isEnabled"}))
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(txe txeVar) {
        return txeVar.getLayoutInfo().getLayoutDirection() == ov8.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(txe txeVar) {
        return (txeVar.isTransparent$ui_release() || txeVar.getUnmergedConfig$ui_release().contains(zxe.f106362a.getInvisibleToUser())) ? false : true;
    }

    private static /* synthetic */ void isVisible$annotations(txe txeVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(txe txeVar, nxe nxeVar) {
        Iterator<Map.Entry<? extends dye<?>, ? extends Object>> it = nxeVar.iterator();
        while (it.hasNext()) {
            if (!txeVar.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    @ug5
    public static final void setDisableContentCapture(boolean z) {
        hv2.f44925r.setEnabled(z);
    }
}
