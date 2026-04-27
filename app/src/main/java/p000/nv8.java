package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,293:1\n71#2,16:294\n71#2,16:310\n71#2,16:326\n71#2,16:342\n49#2:358\n60#2:359\n49#2:360\n60#2:361\n*S KotlinDebug\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n*L\n223#1:294,16\n224#1:310,16\n225#1:326,16\n226#1:342,16\n242#1:358\n243#1:359\n250#1:360\n251#1:361\n*E\n"})
public final class nv8 {
    @yfb
    public static final rud boundsInParent(@yfb mv8 mv8Var) {
        rud rudVarLocalBoundingBoxOf$default;
        mv8 parentLayoutCoordinates = mv8Var.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rudVarLocalBoundingBoxOf$default = mv8.localBoundingBoxOf$default(parentLayoutCoordinates, mv8Var, false, 2, null)) == null) ? new rud(0.0f, 0.0f, r78.m32087getWidthimpl(mv8Var.mo30031getSizeYbymL2g()), r78.m32086getHeightimpl(mv8Var.mo30031getSizeYbymL2g())) : rudVarLocalBoundingBoxOf$default;
    }

    @yfb
    public static final rud boundsInRoot(@yfb mv8 mv8Var) {
        return mv8.localBoundingBoxOf$default(findRootCoordinates(mv8Var), mv8Var, false, 2, null);
    }

    @yfb
    public static final rud boundsInWindow(@yfb mv8 mv8Var) {
        mv8 mv8VarFindRootCoordinates = findRootCoordinates(mv8Var);
        float fM32087getWidthimpl = r78.m32087getWidthimpl(mv8VarFindRootCoordinates.mo30031getSizeYbymL2g());
        float fM32086getHeightimpl = r78.m32086getHeightimpl(mv8VarFindRootCoordinates.mo30031getSizeYbymL2g());
        rud rudVarBoundsInRoot = boundsInRoot(mv8Var);
        float left = rudVarBoundsInRoot.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fM32087getWidthimpl) {
            left = fM32087getWidthimpl;
        }
        float top = rudVarBoundsInRoot.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fM32086getHeightimpl) {
            top = fM32086getHeightimpl;
        }
        float right = rudVarBoundsInRoot.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fM32087getWidthimpl) {
            fM32087getWidthimpl = right;
        }
        float bottom = rudVarBoundsInRoot.getBottom();
        float f = bottom >= 0.0f ? bottom : 0.0f;
        if (f <= fM32086getHeightimpl) {
            fM32086getHeightimpl = f;
        }
        if (left == fM32087getWidthimpl || top == fM32086getHeightimpl) {
            return rud.f79687e.getZero();
        }
        long jMo30038localToWindowMKHz9U = mv8VarFindRootCoordinates.mo30038localToWindowMKHz9U(mzb.Offset(left, top));
        long jMo30038localToWindowMKHz9U2 = mv8VarFindRootCoordinates.mo30038localToWindowMKHz9U(mzb.Offset(fM32087getWidthimpl, top));
        long jMo30038localToWindowMKHz9U3 = mv8VarFindRootCoordinates.mo30038localToWindowMKHz9U(mzb.Offset(fM32087getWidthimpl, fM32086getHeightimpl));
        long jMo30038localToWindowMKHz9U4 = mv8VarFindRootCoordinates.mo30038localToWindowMKHz9U(mzb.Offset(left, fM32086getHeightimpl));
        float fM30429getXimpl = izb.m30429getXimpl(jMo30038localToWindowMKHz9U);
        float fM30429getXimpl2 = izb.m30429getXimpl(jMo30038localToWindowMKHz9U2);
        float fM30429getXimpl3 = izb.m30429getXimpl(jMo30038localToWindowMKHz9U4);
        float fM30429getXimpl4 = izb.m30429getXimpl(jMo30038localToWindowMKHz9U3);
        float fMin = Math.min(fM30429getXimpl, Math.min(fM30429getXimpl2, Math.min(fM30429getXimpl3, fM30429getXimpl4)));
        float fMax = Math.max(fM30429getXimpl, Math.max(fM30429getXimpl2, Math.max(fM30429getXimpl3, fM30429getXimpl4)));
        float fM30430getYimpl = izb.m30430getYimpl(jMo30038localToWindowMKHz9U);
        float fM30430getYimpl2 = izb.m30430getYimpl(jMo30038localToWindowMKHz9U2);
        float fM30430getYimpl3 = izb.m30430getYimpl(jMo30038localToWindowMKHz9U4);
        float fM30430getYimpl4 = izb.m30430getYimpl(jMo30038localToWindowMKHz9U3);
        return new rud(fMin, Math.min(fM30430getYimpl, Math.min(fM30430getYimpl2, Math.min(fM30430getYimpl3, fM30430getYimpl4))), fMax, Math.max(fM30430getYimpl, Math.max(fM30430getYimpl2, Math.max(fM30430getYimpl3, fM30430getYimpl4))));
    }

    @yfb
    public static final mv8 findRootCoordinates(@yfb mv8 mv8Var) {
        mv8 mv8Var2;
        mv8 parentLayoutCoordinates = mv8Var.getParentLayoutCoordinates();
        while (true) {
            mv8 mv8Var3 = parentLayoutCoordinates;
            mv8Var2 = mv8Var;
            mv8Var = mv8Var3;
            if (mv8Var == null) {
                break;
            }
            parentLayoutCoordinates = mv8Var.getParentLayoutCoordinates();
        }
        heb hebVar = mv8Var2 instanceof heb ? (heb) mv8Var2 : null;
        if (hebVar == null) {
            return mv8Var2;
        }
        heb wrappedBy$ui_release = hebVar.getWrappedBy$ui_release();
        while (true) {
            heb hebVar2 = wrappedBy$ui_release;
            heb hebVar3 = hebVar;
            hebVar = hebVar2;
            if (hebVar == null) {
                return hebVar3;
            }
            wrappedBy$ui_release = hebVar.getWrappedBy$ui_release();
        }
    }

    public static final long positionInParent(@yfb mv8 mv8Var) {
        mv8 parentLayoutCoordinates = mv8Var.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo30034localPositionOfR5De75A(mv8Var, izb.f49009b.m30445getZeroF1C5BW0()) : izb.f49009b.m30445getZeroF1C5BW0();
    }

    public static final long positionInRoot(@yfb mv8 mv8Var) {
        return mv8Var.mo30036localToRootMKHz9U(izb.f49009b.m30445getZeroF1C5BW0());
    }

    public static final long positionInWindow(@yfb mv8 mv8Var) {
        return mv8Var.mo30038localToWindowMKHz9U(izb.f49009b.m30445getZeroF1C5BW0());
    }

    public static final long positionOnScreen(@yfb mv8 mv8Var) {
        return mv8Var.mo30037localToScreenMKHz9U(izb.f49009b.m30445getZeroF1C5BW0());
    }
}
