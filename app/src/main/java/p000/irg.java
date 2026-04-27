package p000;

import p000.hrg;

/* JADX INFO: loaded from: classes.dex */
public final class irg {
    public static final void delete(@yfb hrg hrgVar, int i, int i2) {
        hrgVar.replace(i, i2, "");
    }

    public static final void findCommonPrefixAndSuffix(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb oz6<? super Integer, ? super Integer, ? super Integer, ? super Integer, bth> oz6Var) {
        int i;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i = 0;
        } else {
            int i3 = 0;
            i = 0;
            boolean z = false;
            while (true) {
                if (i2 == 0) {
                    if (charSequence.charAt(i3) == charSequence2.charAt(i)) {
                        i3++;
                        i++;
                    } else {
                        i2 = 1;
                    }
                }
                if (!z) {
                    if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z = true;
                    }
                }
                if (i3 >= length || i >= length2 || (i2 != 0 && z)) {
                    break;
                }
            }
            i2 = i3;
        }
        if (i2 < length || i < length2) {
            oz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(length2));
        }
    }

    @ah5
    public static final void forEachChange(@yfb hrg.InterfaceC6984a interfaceC6984a, @yfb gz6<? super jvg, ? super jvg, bth> gz6Var) {
        for (int i = 0; i < interfaceC6984a.getChangeCount(); i++) {
            gz6Var.invoke(jvg.m30581boximpl(interfaceC6984a.mo30108getRangejx7JFs(i)), jvg.m30581boximpl(interfaceC6984a.mo30107getOriginalRangejx7JFs(i)));
        }
    }

    @ah5
    public static final void forEachChangeReversed(@yfb hrg.InterfaceC6984a interfaceC6984a, @yfb gz6<? super jvg, ? super jvg, bth> gz6Var) {
        for (int changeCount = interfaceC6984a.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            gz6Var.invoke(jvg.m30581boximpl(interfaceC6984a.mo30108getRangejx7JFs(changeCount)), jvg.m30581boximpl(interfaceC6984a.mo30107getOriginalRangejx7JFs(changeCount)));
        }
    }

    public static final void insert(@yfb hrg hrgVar, int i, @yfb String str) {
        hrgVar.replace(i, i, str);
    }

    public static final void placeCursorAtEnd(@yfb hrg hrgVar) {
        hrgVar.placeCursorBeforeCharAt(hrgVar.getLength());
    }

    public static final void selectAll(@yfb hrg hrgVar) {
        hrgVar.m30105setSelection5zctL8(kvg.TextRange(0, hrgVar.getLength()));
    }
}
