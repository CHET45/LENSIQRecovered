package p000;

import androidx.media3.common.C1213a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class au6 implements of5 {

    /* JADX INFO: renamed from: c */
    public final of5 f11887c;

    public au6(of5 of5Var) {
        this.f11887c = of5Var;
    }

    @Override // p000.of5
    public void disable() {
        this.f11887c.disable();
    }

    @Override // p000.of5
    public void enable() {
        this.f11887c.enable();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof au6) {
            return this.f11887c.equals(((au6) obj).f11887c);
        }
        return false;
    }

    @Override // p000.of5
    public int evaluateQueueSize(long j, List<? extends yca> list) {
        return this.f11887c.evaluateQueueSize(j, list);
    }

    @Override // p000.of5
    public boolean excludeTrack(int i, long j) {
        return this.f11887c.excludeTrack(i, j);
    }

    @Override // p000.u6h
    public C1213a getFormat(int i) {
        return this.f11887c.getFormat(i);
    }

    @Override // p000.u6h
    public int getIndexInTrackGroup(int i) {
        return this.f11887c.getIndexInTrackGroup(i);
    }

    @Override // p000.of5
    public long getLatestBitrateEstimate() {
        return this.f11887c.getLatestBitrateEstimate();
    }

    @Override // p000.of5
    public C1213a getSelectedFormat() {
        return this.f11887c.getSelectedFormat();
    }

    @Override // p000.of5
    public int getSelectedIndex() {
        return this.f11887c.getSelectedIndex();
    }

    @Override // p000.of5
    public int getSelectedIndexInTrackGroup() {
        return this.f11887c.getSelectedIndexInTrackGroup();
    }

    @Override // p000.of5
    @hib
    public Object getSelectionData() {
        return this.f11887c.getSelectionData();
    }

    @Override // p000.of5
    public int getSelectionReason() {
        return this.f11887c.getSelectionReason();
    }

    @Override // p000.u6h
    public h6h getTrackGroup() {
        return this.f11887c.getTrackGroup();
    }

    @Override // p000.u6h
    public int getType() {
        return this.f11887c.getType();
    }

    public of5 getWrappedInstance() {
        return this.f11887c;
    }

    public int hashCode() {
        return this.f11887c.hashCode();
    }

    @Override // p000.u6h
    public int indexOf(C1213a c1213a) {
        return this.f11887c.indexOf(c1213a);
    }

    @Override // p000.of5
    public boolean isTrackExcluded(int i, long j) {
        return this.f11887c.isTrackExcluded(i, j);
    }

    @Override // p000.u6h
    public int length() {
        return this.f11887c.length();
    }

    @Override // p000.of5
    public void onDiscontinuity() {
        this.f11887c.onDiscontinuity();
    }

    @Override // p000.of5
    public void onPlayWhenReadyChanged(boolean z) {
        this.f11887c.onPlayWhenReadyChanged(z);
    }

    @Override // p000.of5
    public void onPlaybackSpeed(float f) {
        this.f11887c.onPlaybackSpeed(f);
    }

    @Override // p000.of5
    public void onRebuffer() {
        this.f11887c.onRebuffer();
    }

    @Override // p000.of5
    public boolean shouldCancelChunkLoad(long j, gz1 gz1Var, List<? extends yca> list) {
        return this.f11887c.shouldCancelChunkLoad(j, gz1Var, list);
    }

    @Override // p000.of5
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends yca> list, zca[] zcaVarArr) {
        this.f11887c.updateSelectedTrack(j, j2, j3, list, zcaVarArr);
    }

    @Override // p000.u6h
    public int indexOf(int i) {
        return this.f11887c.indexOf(i);
    }
}
