package p000;

import p000.hrg;

/* JADX INFO: loaded from: classes.dex */
public final class gwg {

    /* JADX INFO: renamed from: a */
    public static final int f41751a = 100;

    private static final boolean isNewLineInsert(hwg hwgVar) {
        return md8.areEqual(hwgVar.getPostText(), "\n") || md8.areEqual(hwgVar.getPostText(), "\r\n");
    }

    @gib
    public static final hwg merge(@yfb hwg hwgVar, @yfb hwg hwgVar2) {
        if (!hwgVar.getCanMerge() || !hwgVar2.getCanMerge() || hwgVar2.getTimeInMillis() < hwgVar.getTimeInMillis() || hwgVar2.getTimeInMillis() - hwgVar.getTimeInMillis() >= jsh.getSNAPSHOTS_INTERVAL_MILLIS() || isNewLineInsert(hwgVar) || isNewLineInsert(hwgVar2) || hwgVar.getTextEditType() != hwgVar2.getTextEditType()) {
            return null;
        }
        if (hwgVar.getTextEditType() == crg.Insert && hwgVar.getIndex() + hwgVar.getPostText().length() == hwgVar2.getIndex()) {
            return new hwg(hwgVar.getIndex(), "", hwgVar.getPostText() + hwgVar2.getPostText(), hwgVar.m30143getPreSelectiond9O1mEE(), hwgVar2.m30142getPostSelectiond9O1mEE(), hwgVar.getTimeInMillis(), false, 64, null);
        }
        if (hwgVar.getTextEditType() == crg.Delete && hwgVar.getDeletionType() == hwgVar2.getDeletionType() && (hwgVar.getDeletionType() == vqg.Start || hwgVar.getDeletionType() == vqg.End)) {
            if (hwgVar.getIndex() == hwgVar2.getIndex() + hwgVar2.getPreText().length()) {
                return new hwg(hwgVar2.getIndex(), hwgVar2.getPreText() + hwgVar.getPreText(), "", hwgVar.m30143getPreSelectiond9O1mEE(), hwgVar2.m30142getPostSelectiond9O1mEE(), hwgVar.getTimeInMillis(), false, 64, null);
            }
            if (hwgVar.getIndex() == hwgVar2.getIndex()) {
                return new hwg(hwgVar.getIndex(), hwgVar.getPreText() + hwgVar2.getPreText(), "", hwgVar.m30143getPreSelectiond9O1mEE(), hwgVar2.m30142getPostSelectiond9O1mEE(), hwgVar.getTimeInMillis(), false, 64, null);
            }
        }
        return null;
    }

    public static final void recordChanges(@yfb fwg fwgVar, @yfb jrg jrgVar, @yfb jrg jrgVar2, @yfb hrg.InterfaceC6984a interfaceC6984a, boolean z) {
        if (interfaceC6984a.getChangeCount() > 1) {
            fwgVar.record(new hwg(0, jrgVar.toString(), jrgVar2.toString(), jrgVar.m30568getSelectiond9O1mEE(), jrgVar2.m30568getSelectiond9O1mEE(), 0L, false, 32, null));
            return;
        }
        if (interfaceC6984a.getChangeCount() == 1) {
            long jMo30107getOriginalRangejx7JFs = interfaceC6984a.mo30107getOriginalRangejx7JFs(0);
            long jMo30108getRangejx7JFs = interfaceC6984a.mo30108getRangejx7JFs(0);
            if (jvg.m30587getCollapsedimpl(jMo30107getOriginalRangejx7JFs) && jvg.m30587getCollapsedimpl(jMo30108getRangejx7JFs)) {
                return;
            }
            fwgVar.record(new hwg(jvg.m30591getMinimpl(jMo30107getOriginalRangejx7JFs), kvg.m30779substringFDrldGo(jrgVar, jMo30107getOriginalRangejx7JFs), kvg.m30779substringFDrldGo(jrgVar2, jMo30108getRangejx7JFs), jrgVar.m30568getSelectiond9O1mEE(), jrgVar2.m30568getSelectiond9O1mEE(), 0L, z, 32, null));
        }
    }

    public static /* synthetic */ void recordChanges$default(fwg fwgVar, jrg jrgVar, jrg jrgVar2, hrg.InterfaceC6984a interfaceC6984a, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        recordChanges(fwgVar, jrgVar, jrgVar2, interfaceC6984a, z);
    }
}
